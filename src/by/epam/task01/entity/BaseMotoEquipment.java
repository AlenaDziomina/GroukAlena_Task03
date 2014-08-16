/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.entity;

import by.epam.task01.ProjectExeptions.ProjectException;
import java.util.Objects;

/**
 *
 * @author Helena.Grouk
 */
public abstract class BaseMotoEquipment extends MotoEquipment{ //основной экип
    
    enum GenderStyle {Y, M, W, CH}
    
    private String size; //размер
    private GenderStyle gender = GenderStyle.Y; //пол-возраст для определения размерной таблицы
    
    protected BaseMotoEquipment(int id, String name) throws ProjectException {
        super(id, name);
    }
    protected BaseMotoEquipment(int id, String name, int price, float weight)
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
        
        BaseMotoEquipment eq = (BaseMotoEquipment)obj;
        if (!super.equals(eq)){
            return false;
        }
        if(size == null ? eq.size != null : !size.equals(eq.size)) {
            return false;
        }
        if(gender != eq.gender) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.size);
        hash = 29 * hash + Objects.hashCode(this.gender);
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
        str.append(", size: ");
        str.append(size);
        str.append(", gender: ");
        str.append(gender);
       
        return str.toString(); 
    }
    
    public void setSize(String size) throws ProjectException{
        if (size == null || size.isEmpty()) {
            throw new ProjectException("BaseMotoEquipment.size == null or empty.");
        }
        this.size = size;
    }
    
    public String getSize(){
        return size;
    }
    
    public void setGender(String gender) throws ProjectException{
        if (gender == null || gender.isEmpty()) {
            throw new ProjectException("BaseMotoEquipment.gender == null or empty.");
        }
        
        try {
            this.gender = GenderStyle.valueOf(gender);
        }
        catch(IllegalArgumentException e) {
            throw new ProjectException("BaseMotoEquipment: = " + gender
                    + " is unnoun.");
        }

    }
    
    public String getGender(){
        return gender.toString();
    }
    
 
}
