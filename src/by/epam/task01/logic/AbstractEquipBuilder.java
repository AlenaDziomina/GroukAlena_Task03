/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.logic;

import by.epam.task01.entity.MotoEquip;

/**
 *
 * @author Helena.Grouk
 */
public abstract class AbstractEquipBuilder {

    protected MotoEquip equip;
    
    public AbstractEquipBuilder() {
        equip = new MotoEquip();
    }
    public AbstractEquipBuilder(MotoEquip equip) {
        this.equip = equip;
    }
    public MotoEquip getEquip() {
        return equip;
    }
    abstract public void buildSetEquip(String fileName);
}
