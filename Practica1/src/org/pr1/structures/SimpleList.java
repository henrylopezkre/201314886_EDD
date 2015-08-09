/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.structures;

import org.pr1.bean.Objects;

/**
 *
 * @author Sorge
 */
public interface SimpleList {
    public boolean isEmpty();
    public int size();
    public Object getFirst();
    public Object getLast();
    public void addFirst(Objects object);
    public void addLast(Objects object);
    public Object removeFirst();
    public Object removeLast();
}
