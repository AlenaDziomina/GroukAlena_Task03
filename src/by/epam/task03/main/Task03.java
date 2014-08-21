/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task03.main;

import by.epam.task03.exeption.NullInitException;
import by.epam.task03.entity.Helmet;
import by.epam.task03.entity.MotoEquip;
import by.epam.task03.entity.RefBaseEquip;
import by.epam.task03.logic.AbstractEquipBuilder;
import by.epam.task03.logic.EquipBuilderFactory;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import static by.epam.task03.main.HelperMagazCreator.creatingMotoMagazin;
/**
 *
 * @author Helena.Grouk
 */
public class Task03 {

    static final String LOG_PROPERTIES_FILE = "Log4J.properties";
    static final String FILE_EQUIP = "equip_test.xml";
    static final String FILE_XSD = "equip.xsd";
    public static Logger localLog = Logger.getLogger("localLoger");
    
    public static void main(String[] args) {
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE); 
        
        try {
            marsh(FILE_EQUIP);
        } catch (NullInitException ex) {
            localLog.error("Marshalization failed.");
        }

        AbstractEquipBuilder builder;
        try {
            builder = EquipBuilderFactory.createStudentBuilder("sax");
            builder.buildSetEquip("equip_test.xml");
            System.out.println(builder.getEquip());
        } catch (NullInitException ex) {
            localLog.error("SAX parsin fails.");
        }

        try {
            builder = EquipBuilderFactory.createStudentBuilder("stax");
            builder.buildSetEquip("equip_test.xml");
        System.out.println(builder.getEquip());
        } catch (NullInitException ex) {
            localLog.error("StAX parsin fails.");
        }

        try {
            builder = EquipBuilderFactory.createStudentBuilder("dom");
            builder.buildSetEquip("equip_test.xml");
            System.out.println(builder.getEquip());
        } catch (NullInitException ex) {
            localLog.error("DOM parsin fails.");
        }
    }
    
    private static void marsh(String fileName) throws NullInitException {
        try {
            JAXBContext context = JAXBContext.newInstance(MotoEquip.class, Helmet.class, RefBaseEquip.class);
            Marshaller m = context.createMarshaller();
            MotoEquip equip = creatingMotoMagazin();
            System.out.println(equip);
            m.marshal(equip, new FileOutputStream(fileName));
        }
        catch (FileNotFoundException e) {
            throw new NullInitException("XML not found: " + e);
        }
        catch (JAXBException e) {
            throw new NullInitException("JAXB-content failed: " + e);
        }
    }
    
}
