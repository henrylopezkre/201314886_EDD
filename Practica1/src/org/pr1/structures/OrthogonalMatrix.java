/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.structures;

import java.awt.Image;

/**
 *
 * @author Sorge
 */
public class OrthogonalMatrix {
    private MatrixNode headNode = null;
    public OrthogonalMatrix(){
        this.headNode = new MatrixNode();
    }
    private void addRow(int lenght){
        MatrixNode auxNode = this.headNode;
        int row = 0, count = 0;
        while(auxNode.upNode != null){
            auxNode = auxNode.upNode;
            row++;
        }
        if(row == 0){
            while(count < lenght){
                MatrixNode newNode = new MatrixNode();
                auxNode.rightNode = newNode;
                newNode.leftNode = auxNode;
                auxNode = auxNode.rightNode;
                count++;
            }
        }else if(row > 0){
            MatrixNode newRowNode = new MatrixNode();
            auxNode.upNode = newRowNode;
            newRowNode.downNode = auxNode;
            auxNode = auxNode.rightNode;
            while(count < lenght){
                //Crear nodo
                MatrixNode newNode = new MatrixNode();
                //Asignar punteros
                newRowNode.rightNode = newNode;
                newNode.leftNode = newRowNode;
                auxNode.upNode = newRowNode;
                newRowNode.downNode = auxNode;
                //Avanzar al siguiente nodo
                auxNode = auxNode.rightNode;
                newRowNode = newRowNode.rightNode;
                count++;
            }
        }
    }
    private void addColumn(int lenght){
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
                auxNode.downNode = newNode;
                newNode.upNode = auxNode;
                auxNode = auxNode.downNode;
                count++;
            }
        }else if(column > 0){
            MatrixNode newRowNode = new MatrixNode();
            auxNode.rightNode = newRowNode;
            newRowNode.leftNode = auxNode;
            auxNode = auxNode.downNode;
            int count = 0;
            while(count < lenght){
                //Crear nodo
                MatrixNode newNode = new MatrixNode();
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
}
class MatrixNode{
    public MatrixNode upNode;
    public MatrixNode downNode;
    public MatrixNode rightNode;
    public MatrixNode leftNode;
    public Image image;
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
    public void add(Image image){
        this.image = image;
    }
}
