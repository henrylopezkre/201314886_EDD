/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pr1.bean;

/**
 *
 * @author Sorge
 */
public class Objects {
    public enum TYPE{
        SUELO,
        PARED,
        GOOMBA,
        KOOPA,
        FICHA,
        HONGO,
        PRINCIPAL,
        CASTILLO
    }
    private String image;
    private String name;
    private TYPE type;

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Objects(String image, String name, TYPE type) {
        this.image = image;
        this.name = name;
        this.type = type;
    }
    
    public Objects(){
    
    }
    
}
