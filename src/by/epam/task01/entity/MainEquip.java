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
public abstract class MainEquip extends BaseMotoEquipment{ //основная экипировка
    
    enum MotoType {TURIST, SPORT, ENDURO, CROSS, STUNT, COMMON}
    
    private MotoType motoType = MotoType.COMMON; //тип применения экипировки
    
    protected MainEquip(int id, String name) throws ProjectException {
        super(id, name);
    }
    
    protected MainEquip(int id, String name, int price, float weight)
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
        
        MainEquip eq = (MainEquip)obj;
        if (!super.equals(eq)){
            return false;
        }
        if(motoType != eq.motoType) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.motoType);
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
        str.append(", motoType: ");
        str.append(motoType);

        return str.toString();
    }
    
    public void setMotoType(String motoType) throws ProjectException{
        if (motoType == null || motoType.isEmpty()) {
            throw new ProjectException("MainEquip.motoType == null or empty.");
        }
        
        try {
            this.motoType = MotoType.valueOf(motoType);
        }
        catch(IllegalArgumentException e) {
            throw new ProjectException("MainEquip.motoType=" + motoType 
                    + " is unnoun.");
        }
        
    }
    
    public String getMotoType(){
        return motoType.toString();
    }

}
