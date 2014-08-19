/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task03.entity;

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
    "testSet"
})
@XmlRootElement(name = "for-what")
public class RefBaseEquip {
    @XmlAnyElement
    private Set<BaseMotoEquipment> testSet;

    public RefBaseEquip() {
        this.testSet = new TreeSet<>();
    }
    
    public void add(BaseMotoEquipment eq) {
        this.testSet.add(eq);
    }
}
