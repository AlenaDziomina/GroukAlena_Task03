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
public class Pants extends BuiltInBodyProtection { //мотоштаны
    
    boolean hipInsert; //наличие вставки защиты бедер
    boolean kneeInsert; //наличие вствки защиты коленей
    boolean sliderMount; //наличие возможности крепления слайдеров

    public Pants(int id, String name) throws ProjectException{
        super(id, name);
    }
    
    public Pants(int id, String name, int price, float weight)
            throws ProjectException{
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
        
        Pants eq = (Pants)obj;
        if (!super.equals(eq)){
            return false;
        }
        if(hipInsert != eq.hipInsert) {
            return false;
        }
        if(kneeInsert != eq.kneeInsert) {
            return false;
        }
        if(sliderMount != eq.sliderMount) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.hipInsert ? 1 : 0);
        hash = 59 * hash + (this.kneeInsert ? 1 : 0);
        hash = 59 * hash + (this.sliderMount ? 1 : 0);
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
        str.append(", hipInsert: ");
        str.append(hipInsert);
        str.append(", kneeInsert: ");
        str.append(kneeInsert);
        str.append(", sliderMount: ");
        str.append(sliderMount);
        
        return str.toString();
    }
    
    public void setHipInsert(Boolean hipInsert) {
        this.hipInsert = hipInsert;
    }
    
    public boolean isHipInsert() {
        return hipInsert;
    }
    
    public void setKneeInsert(Boolean kneeInsert) {
        this.kneeInsert = kneeInsert;
    }
    
    public boolean isKneeInsert() {
        return kneeInsert;
    }
    
    public void setSliderMount(Boolean sliderMount) {
        this.sliderMount = sliderMount;
    }
    
    public boolean isSliderMount() {
        return sliderMount;
    }

}
