/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.entity;

import by.epam.task01.ProjectExeptions.ProjectException;

/**
 *
 * @author Helena.Grouk
 */
public class ElbowProtector extends SeparateBodyProtection {
    
    private boolean articulated;
    
    public ElbowProtector(int id, String name) throws ProjectException {
        super(id, name);
    }
    
    public ElbowProtector(int id, String name, int price, float weight)
            throws ProjectException {
        super(id, name, price, weight);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        ElbowProtector eq = (ElbowProtector)obj;
        if (!super.equals(eq)){
            return false;
        }
        
        if(articulated != eq.articulated) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.articulated ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        String str1 = super.toString();
        int i = str1.indexOf("@");
        if (i > 0) {
            str1 = str1.substring(i+1);
        }
        StringBuilder str = new StringBuilder(getClass().getName());
        str.append('@');
        str.append(str1);
        
        str.append(", articulated: ");
        str.append(articulated);
       
        return str.toString();
    }
    
    public void setArticulated(boolean articulated) {
        this.articulated = articulated;
    }
    
    public boolean isArticulated() {
        return this.articulated;
    }
    
}
