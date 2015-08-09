/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.gui;

import javax.swing.table.AbstractTableModel;
import org.pr1.bean.Objects;
import org.pr1.structures.DoublyLinkedList;

/**
 *
 * @author Sorge
 */
public class ObjectsTableModel extends AbstractTableModel {
    private DoublyLinkedList dblObjects;
    private final String[] columnNames = 
            new String[]{"No. ", "Nombre", "Imagen"};
    public ObjectsTableModel(DoublyLinkedList dblObjects){
        this.dblObjects = dblObjects;
        this.fireTableDataChanged();
    }
    @Override
    public int getRowCount() {
        return this.dblObjects.size();
    }
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    @Override 
    public String getColumnName(int columnIndex) {
            return columnNames[columnIndex];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String value = "";
        Objects object = this.dblObjects.get(rowIndex);
        switch(columnIndex){
            case 0:
                value = String.valueOf(rowIndex+1);
                break;
            case 1:
                value = object.getName();
                break;
            case 2:
                value = object.getImage();
                break;
        }
        return value;
    }
}
