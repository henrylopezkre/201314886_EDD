/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.structures;

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
    public Object getFirst() {
        return this.firstNode;
    }

    @Override
    public Object getLast() {
        return this.lastNode;
    }
    
    public Objects get(int index){
        int cont = 0;
        Objects object = null;
        ListNode elementNode = null;
        if(index >= 0 && index < size()){
            elementNode = firstNode;
            while(cont < index){
                elementNode = elementNode.nextNode;
                object = elementNode.data;
                cont++;
            }
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

    @Override
    public Object removeFirst() {
        Object object = null;
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
    public Object removeLast() {
        Object object = null;
        ListNode auxNode = null;
        if(!isEmpty()){
            object = this.lastNode.data;
            auxNode = this.lastNode;
            this.lastNode = auxNode.prevNode;
            auxNode = null;
        }
        return object;
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