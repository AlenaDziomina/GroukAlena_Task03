/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.logic;

/**
 *
 * @author Helena.Grouk
 */
public enum EquipEnum {
        ARMOR_JACKET("ArmorJacket"),
        BALACLAVA("Balaclava"), 
        ELBOW_PROTECTOR("ElbowProtector"), 
        GLOVES("Gloves"), 
        HELMET("Helmet"), 
        JACKET("Jacket"),
        KNEE_PROTECTOR("KneeProtector"),
        PANTS("Pants"), 
        PROTECTOR_INSERT("ProtectorInsert"), 
        SHOES("Shoes"),
        SLICKER("Slicker"),
        SLIDERS("Sliders"),
        TERMOLINEN("Termolinen"),
        VISOR("Visor");
        
        private final String cl;
        private EquipEnum(String cl) {
            this.cl = cl;
        }
        public String getCl() {
            return this.cl;
        }
        
    }
