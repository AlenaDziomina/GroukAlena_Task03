/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task01.logic;

import by.epam.task01.entity.MotoEquip;
import java.io.IOException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import static task03.Task03.localLog;

/**
 *
 * @author Helena.Grouk
 */
public class EquipSaxBuilder {
    
    private MotoEquip magaz;
    private EquipHandler eqh;
    private XMLReader reader;
    
    public EquipSaxBuilder(){
        eqh = new EquipHandler();
        try {
            reader = XMLReaderFactory.createXMLReader();
            reader.setContentHandler(eqh);
        } catch (SAXException ex) {
            localLog.error("SAX Parser error.");
        }
    }
    
    public void buildSetEquip(String fileName) {
        try {
            // разбор XML-документа
            reader.parse(fileName);
        }
        catch (SAXException e) {
            System.err.print("ошибка SAX парсера: " + e);
        }
        catch (IOException e) {
            System.err.print("ошибка I/О потока: " + e);
        }
    }

    public MotoEquip getMotoEquip() {
        return eqh.getEquip();
    }
    
    
}
