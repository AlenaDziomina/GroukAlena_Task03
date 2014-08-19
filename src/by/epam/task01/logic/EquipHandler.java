/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.logic;

import by.epam.task01.ProjectExeptions.ProjectException;
import by.epam.task01.entity.MotoEquip;
import by.epam.task01.entity.MotoEquipment;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.EnumUtils;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import static task03.Task03.localLog;

/**
 *
 * @author Helena.Grouk
 */
class EquipHandler extends DefaultHandler {
    
    
    
    
    
    private MotoEquip equip;
    private MotoEquipment current;
    private String[] currentProp;
    private ArrayList<String[]> atrs;
    private final static Pattern pat = Pattern.compile("-");
    
    public EquipHandler() {
        equip = new MotoEquip();
        atrs = new ArrayList<>();
    }
    
    public MotoEquip getEquip() {
        
        return equip;
    }
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        Matcher mat = pat.matcher(localName);
        String str = mat.replaceAll("_").toUpperCase();
        currentProp = null;
        if (EnumUtils.isValidEnum(EquipEnum.class, str)) {
            System.out.println(EquipEnum.valueOf(str).getCl());
            String[] atr = {"class", EquipEnum.valueOf(str).getCl(), "String"};
            atrs.add(atr);
        }
        else {
            if (EnumUtils.isValidEnum(PropEnum.class, str)) {
                currentProp = PropEnum.valueOf(str).getProp();
            }
            
        }
        
        int N = attrs.getLength();
        for (int i = 0; i < N; i++) {
            Matcher mat1 = pat.matcher(attrs.getLocalName(i));
            String str1 = mat1.replaceAll("_").toUpperCase();
            if (EnumUtils.isValidEnum(PropEnum.class, str1)) {
                currentProp = PropEnum.valueOf(str1).getProp();
                currentProp[1] = attrs.getValue(i);
                atrs.add(currentProp);
                currentProp = null;
            }
        }
            
        
    }
    
    @Override
    public void endElement(String uri, String localName, String qName) {
        Matcher mat = pat.matcher(localName);
        String str = mat.replaceAll("_").toUpperCase();
        if (EnumUtils.isValidEnum(EquipEnum.class, str) && atrs.size() > 0) {
            try {
                current = EquipFactory.equipmentCreator(atrs.toArray(new String[atrs.size()][]));
                equip.add(current);
            } catch (ProjectException ex) {
                localLog.error("Creating equip failed.");
            }
            atrs = new ArrayList<>();
        } else if (EnumUtils.isValidEnum(PropEnum.class, str)) {
            atrs.add(currentProp);
            currentProp = null;
        }
        
    }
   
    @Override
    public void characters(char[] ch, int start, int length) {
        String s = new String(ch, start, length).trim();
        if (currentProp != null && !s.isEmpty()) {
            currentProp[1] = s;
        }
        
    }
}
    

