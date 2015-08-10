/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.structures;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.pr1.bean.Objects;

public class DoublyLinkedList implements SimpleList {
    private ListNode firstNode = null;
    private ListNode lastNode = null;
    @Override
    public boolean isEmpty() {
        return this.firstNode == null;
    }
    @Override
    public int size() {
        int size = 0;
        ListNode auxNode = this.firstNode;
        while(auxNode != null){
            auxNode = auxNode.nextNode;
            size++;
        }
        return size;
    }

    @Override
    public Objects getFirst() {
        return this.firstNode.data;
    }

    @Override
    public Objects getLast() {
        return this.lastNode.data;
    }
    
    public Objects get(int index){
        int cont = 0;
        Objects object = null;
        ListNode elementNode = null;
        if(index >= 0 && index < size()){
            elementNode = this.firstNode;
            while(cont < index){
                elementNode = elementNode.nextNode;
                cont++;
            }
            object = elementNode.data;
        }
        return object;
    }
    
    public void add(Objects object){
        this.addLast(object);
    }   
    
    @Override
    public void addFirst(Objects object) {
        ListNode newNode = null;
        if(isEmpty()){
            newNode = new ListNode(object);
            this.firstNode = this.lastNode = newNode;
        }else {
            newNode = new ListNode(object);
            this.firstNode.prevNode = newNode;
            this.lastNode.nextNode = this.firstNode;
            this.firstNode = newNode;
        }
    }

    @Override
    public void addLast(Objects object) {
        ListNode newNode = null;
        if(isEmpty()){
            newNode = new ListNode(object);
            this.firstNode = this.lastNode = newNode;
        }else {
            newNode = new ListNode(object);
            this.lastNode.nextNode = newNode;
            this.lastNode.prevNode = this.lastNode;
            this.lastNode = newNode;
        }
    }
    
    public boolean remove(Object object){
        boolean resp = false;
        int cont = 0;
        ListNode elementNode = null;
        ListNode previousNode = null;
        if(!firstNode.equals(lastNode)){
            elementNode = firstNode;
            while(cont < size()){
                if(elementNode.data.equals(object)){
                    break;
                }
                previousNode = elementNode;
                elementNode = elementNode.nextNode;
                cont++;
            }
            if(cont == 0){
                firstNode = elementNode.nextNode;
                resp = elementNode.data.equals(object);
            }else if(cont > 0 && elementNode != null){
                previousNode.nextNode = elementNode.nextNode;
                resp = elementNode.data.equals(object);
            }
            elementNode = null;
        }else{
            if(firstNode.data.equals(object)){
                firstNode = lastNode = null;
                resp = true;
            }
        }       
        return resp;
    }
    public boolean set(int index, Objects object){
        boolean resp = false;
        int cont = 0;
        ListNode elementNode = null;
        if(index >= 0 && index < size()){
            elementNode = this.firstNode;
            while(cont < index){
                elementNode = elementNode.nextNode;
                cont++;
            }
            elementNode.data = object;
            resp = elementNode.data == object ? true : false;
        }
        return resp;
    }

    @Override
    public Objects removeFirst() {
        Objects object = null;
        ListNode auxNode = null;
        if(!isEmpty()){
            object = this.firstNode.data;
            auxNode = this.firstNode;
            this.firstNode = auxNode.nextNode;
            auxNode = null;
        }
        return object;
    }

    @Override
    public Objects removeLast() {
        Objects object = null;
        ListNode auxNode = null;
        if(!isEmpty()){
            object = this.lastNode.data;
            auxNode = this.lastNode;
            this.lastNode = auxNode.prevNode;
            auxNode = null;
        }
        return object;
    }
    
    private FileWriter fileWriter = null;
    private PrintWriter printWriter = null;  
    public void printGraphviz(){
        ListNode auxNode = this.firstNode;
        try {
            File directorio = new File(".\\Reportes");
            if(!directorio.exists()){
                directorio.mkdirs();
            }
            /*File file = new File(".\\Reportes\\dblObjects.txt");
            BufferedWriter bw;
            if(file.exists()) {
                    bw = new BufferedWriter(new FileWriter(file));
                    bw.write("");
              } else {
                    bw = new BufferedWriter(new FileWriter(file));
                    bw.write("");
              }
            bw.close();*/
            fileWriter = new FileWriter(".\\Reportes\\dblObjects.txt");
            printWriter = new PrintWriter(fileWriter);
                    
             printWriter.println("digraph G {");
             printWriter.println("\trankdir = LR;\n");
             printWriter.println("\tnode[shape=record]; \n");
             printWriter.println("\tsubgraph clusterDBLO {\n");
             printWriter.println("label = \"Lista de objetos\";\n");
             int intCount2 = 0;
                String chrColor2 = "skyblue";
                do{
                    if(intCount2 > 0){
                        printWriter.print("tn_dblsw" + intCount2 + "[label = \"{ <e> | Nombre. " + auxNode.data.getName() + " \n Imagen: " + auxNode.data.getImage() + " \n Tipo: " + auxNode.data.getType().toString()+ "| <p> }\", style=\"filled\", color=\"black\", fillcolor=\"" + chrColor2 + "\"]; \n");
                        if(intCount2 == 1){
                            printWriter.print("tn_dblsw0:p -> tn_dblsw1:e;\n");
                            printWriter.print("tn_dblsw1:e -> tn_dblsw0:p;\n");
                        }else{
                            printWriter.print("tn_dblsw" + (intCount2 - 1) + ":p -> tn_dblsw"+ intCount2 + ":e;\n");
                            printWriter.print("tn_dblsw" + intCount2 + ":e -> tn_dblsw" + (intCount2 - 1) + ":p;\n");
                        }
                    }else{
                        printWriter.print("tn_dblsw" + intCount2 + "[label = \"{ <e> | Nombre. " + auxNode.data.getName() + " \n Imagen: " + auxNode.data.getImage() + " \n Tipo: " + auxNode.data.getType().toString()+ "| <p> }\", style=\"filled\", color=\"black\", fillcolor=\"" + chrColor2 + "\"]; \n");
                    }
                    intCount2++;
                    auxNode = auxNode.nextNode;
                }while(auxNode != null);
                printWriter.print("\t}\n");
                printWriter.print(" }");
                printWriter.close();
                String cmd = "cmd /c C:\\Archivos de programa\\Graphviz 2.28\\bin\\dot.exe -Tjpg .\\Reportes\\dblObjects.txt -o .\\Reportes\\dblObjects.jpg";
                Process p = Runtime.getRuntime().exec(cmd);
             //File archivo = new File("HTML/estadisticas.html");
             //Desktop.getDesktop().open(archivo);
        } catch (IOException ex) {
            Logger.getLogger(DoublyLinkedList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
class ListNode{
    public Objects data;
    public ListNode nextNode;
    public ListNode prevNode;
    public ListNode(){}
    public ListNode(Objects data){
        this.nextNode = null;
        this.prevNode = null;
        this.data = data;
    }
}