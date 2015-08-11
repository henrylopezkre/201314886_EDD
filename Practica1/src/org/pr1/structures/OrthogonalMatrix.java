/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.structures;

import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Sorge
 */
public class OrthogonalMatrix {
    private MatrixNode headNode = null;
    public OrthogonalMatrix(){
        this.headNode = new MatrixNode();
    }
    public void addRow(int lenght){
        MatrixNode auxNode = this.headNode;
        int row = 0, count = 0;
        while(auxNode.upNode != null){
            auxNode = auxNode.upNode;
            row++;
        }
        if(row == 0){
            while(count < lenght){
                MatrixNode newNode = new MatrixNode();
                newNode.add(new ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png")), row, count);
                auxNode.rightNode = newNode;
                newNode.leftNode = auxNode;
                auxNode = auxNode.rightNode;
                count++;
            }
        }else if(row > 0){
            MatrixNode newRowNode = new MatrixNode();
            newRowNode.add(new ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png")), row, count);
            auxNode.downNode = newRowNode;
            newRowNode.upNode = auxNode;
            auxNode = auxNode.rightNode;
            while(count < lenght){
                //Crear nodo
                MatrixNode newNode = new MatrixNode();
                newNode.add(new ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png")), row, count);
                //Asignar punteros
                newRowNode.rightNode = newNode;
                newNode.leftNode = newRowNode;
                auxNode.downNode = newRowNode;
                newRowNode.upNode = auxNode;
                //Avanzar al siguiente nodo
                auxNode = auxNode.rightNode;
                newRowNode = newRowNode.rightNode;
                count++;
            }
        }
    }
    public void addColumn(int lenght){
        MatrixNode auxNode = this.headNode;
        int column = 0;
        while(auxNode.rightNode != null){
            auxNode = auxNode.rightNode;
            column++;
        }
        if(column == 0){
            int count = 0;
            while(count < lenght){
                MatrixNode newNode = new MatrixNode();
                newNode.add(new ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png")), count, column);
                auxNode.downNode = newNode;
                newNode.upNode = auxNode;
                auxNode = auxNode.downNode;
                count++;
            }
        }else if(column > 0){
            int count = 0;
            MatrixNode newRowNode = new MatrixNode();
            newRowNode.add(new ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png")), count, column);
            auxNode.rightNode = newRowNode;
            newRowNode.leftNode = auxNode;
            auxNode = auxNode.downNode;
            while(count < lenght){
                //Crear nodo
                MatrixNode newNode = new MatrixNode();
                newNode.add(new ImageIcon(getClass().getResource("/org/pr1/resources/no_image.png")), count, column);
                //Asignar punteros
                newRowNode.downNode = newNode;
                newNode.upNode = newRowNode;
                auxNode.rightNode = newRowNode;
                newRowNode.leftNode = auxNode;
                //Avanzar al siguiente nodo
                auxNode = auxNode.downNode;
                newRowNode = newRowNode.downNode;
                count++;
            }
        }
    }
    private FileWriter fileWriter = null;
    private PrintWriter printWriter = null; 
    public void printGraphviz(){
        MatrixNode auxNode = this.headNode;
        try {
            File directorio = new File(".\\Reportes");
            if(!directorio.exists()){
                directorio.mkdirs();
            }
            fileWriter = new FileWriter(".\\Reportes\\omObjects.dot");
            printWriter = new PrintWriter(fileWriter);
                    
             printWriter.println("digraph G {");
             printWriter.println("\trankdir = LR;\n");
             printWriter.println("\tnode[shape=record]; \n");
             printWriter.println("\tsubgraph clusterOMO {\n");
             printWriter.println("label = \"Matriz de objetos\";\n");
             int intCount2 = 0;
                String chrColor2 = "skyblue";
                //do{
                    //MatrixNode auxNode2 = auxNode;
                    do{
                        if(intCount2 > 0){
                            printWriter.print("tn_dblsw" + intCount2 + "[label = \"{ <e> | " + auxNode.image.getDescription() + "| <p> }\", style=\"filled\", color=\"black\", fillcolor=\"" + chrColor2 + "\"]; \n");
                            if(intCount2 == 1){
                                printWriter.print("tn_dblsw0:p -> tn_dblsw1:e;\n");
                                printWriter.print("tn_dblsw1:e -> tn_dblsw0:p;\n");
                            }else{
                                printWriter.print("tn_dblsw" + (intCount2 - 1) + ":p -> tn_dblsw"+ intCount2 + ":e;\n");
                                printWriter.print("tn_dblsw" + intCount2 + ":e -> tn_dblsw" + (intCount2 - 1) + ":p;\n");
                            }
                        }else{
                            printWriter.print("tn_dblsw" + intCount2 + "[label = \"{ <e> | " + auxNode.image.getDescription() + "| <p> }\", style=\"filled\", color=\"black\", fillcolor=\"" + chrColor2 + "\"]; \n");
                        }
                        intCount2++;
                        auxNode = auxNode.rightNode;
                    }while(auxNode != null);
                    //auxNode = auxNode2.downNode;
                //}while(auxNode != null);
                printWriter.print("\t}\n");
                printWriter.print(" }");
                printWriter.close();
                String dotPath = "C:\\Program Files (x86)\\Graphviz2.30\\bin\\dot.exe";
                String fileInputPath = ".\\Reportes\\omObjects.dot";
                String fileOutputPath = ".\\Reportes\\omObjects.jpg";
                String tParam = "-Tjpg";
                String tOParam = "-o";
                
                String[] cmd = new String[5];
                cmd[0] = dotPath;
                cmd[1] = tParam;
                cmd[2] = fileInputPath;
                cmd[3] = tOParam;
                cmd[4] = fileOutputPath;
                
                Runtime rt = Runtime.getRuntime();
                rt.exec(cmd);
        } catch (IOException ex) {
            Logger.getLogger(DoublyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
class MatrixNode{
    public MatrixNode upNode;
    public MatrixNode downNode;
    public MatrixNode rightNode;
    public MatrixNode leftNode;
    public ImageIcon image;
    public int column;
    public int row;
    public MatrixNode(){
        this.upNode = null;
        this.downNode = null;
        this.rightNode = null;
        this.leftNode = null;
        this.column = 0;
        this.row = 0;
    }
    public void add(ImageIcon image, int row, int column){
        this.image = image;
        this.row = row;
        this.column = column;
    }
}
