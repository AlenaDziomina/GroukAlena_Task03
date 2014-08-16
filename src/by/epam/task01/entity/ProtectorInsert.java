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
public class ProtectorInsert extends SpecialMotoEquipment { //защитные вставки в мотокуртку и мотоштаны
    
    enum BodyPart {back, elbows, shoulders, chest, hip, knee}
    
    private BodyPart bodyPart;
    
    
    public ProtectorInsert(int id, String name) throws ProjectException {
        super(id, name);
    }
    
    public ProtectorInsert(int id, String name, int price, float weight)
            throws ProjectException {
        super(id, name, price, weight);
    }
    
    public void setBodyPart(String bodyPart) throws ProjectException {
        if (bodyPart == null || bodyPart.isEmpty()) {
            throw new ProjectException("Protector.bodyPart == null or empty");
        }
        
        try {
            this.bodyPart = BodyPart.valueOf(bodyPart);
        }
        catch(IllegalArgumentException e) {
            throw new ProjectException("Protector.bodyPart = " + bodyPart
                    + " is unnoun.");
        }  
    }
    
    public String getBodyPart() {
        return bodyPart.toString();
    }
    
    
}
