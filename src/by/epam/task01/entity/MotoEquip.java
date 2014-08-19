/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Helena.Grouk
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "equip"
})
@XmlRootElement(name = "moto-equip")
public class MotoEquip {

    @XmlAnyElement
    private Set<MotoEquipment> equip;

    public MotoEquip() {
        this.equip = new TreeSet<>();
    }

    
    public Set<MotoEquipment> getMotoEquipment() {
        if (equip == null) {
            equip = new TreeSet<>();
        }
        return this.equip;
    }
    
    public void setList(Set<MotoEquipment> equip) {
        this.equip = equip;
    }
    
    public void add(MotoEquipment eq) {
        this.equip.add(eq);
    }
    
    @Override 
    public String toString() {
        return "EQUIP [" + equip + "]";
    }
}
