/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.structures;

/**
 *
 * @author Sorge
 * @param <E>
 */
public class DoublyLinkedList <E extends Object> implements SimpleList {
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
    
    public void add(Object object){
        this.addLast(object);
    }
    
    @Override
    public void addFirst(Object object) {
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
    public void addLast(Object object) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object removeLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
class ListNode{
    public Object data;
    public ListNode nextNode;
    public ListNode prevNode;
    public ListNode(){}
    public ListNode(Object data){
        this.nextNode = null;
        this.prevNode = null;
        this.data = data;
    }
}