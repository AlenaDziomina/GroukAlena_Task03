/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.entity;

/**
 *
 * @author Helena.Grouk
 */
public enum HelmetType {
    
    INTEGRAL(true, false, false), MODULAR(true, true, true),
    JET(false, false, false), CROSS(false, true, false),
    ENDURO(true, true, false);
    
    boolean haveVisor;
    boolean havePeak;
    boolean mayTransform;
    
    HelmetType(boolean v, boolean p, boolean t){
        haveVisor = v;
        havePeak = p;
        mayTransform = t;
    }
}

