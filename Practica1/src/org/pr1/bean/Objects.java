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
    private String image;
    private String name;

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

    public Objects(String image, String name) {
        this.image = image;
        this.name = name;
    }
    
    public Objects(){
    
    }
    
}
