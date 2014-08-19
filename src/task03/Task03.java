/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package task03;

import by.epam.task01.entity.Helmet;
import by.epam.task01.entity.MotoEquip;
import by.epam.task01.entity.RefBaseEquip;
import by.epam.task01.logic.EquipSaxBuilder;
import by.epam.task01.logic.EquipStaxBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.logging.Level;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.xml.sax.SAXException;
import static task03.HelperMagazCreator.creatingMotoMagazin;
/**
 *
 * @author Helena.Grouk
 */
public class Task03 {

    static final String LOG_PROPERTIES_FILE = "Log4J.properties";
    public static Logger localLog = Logger.getLogger("localLoger");
    
    public static void main(String[] args) {
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
//        demarsh();
//        
//        marsh();
//        unmarsh();
        
        //parsingSax();
        parsingStax();
    }
    
    private static void parsingSax(){
        EquipSaxBuilder saxBuilder = new EquipSaxBuilder();
        saxBuilder.buildSetEquip("src/task03/equip.xml");
        System.out.println(saxBuilder.getMotoEquip());
    }
    
    private static void parsingStax() {
        EquipStaxBuilder staxBuilder = new EquipStaxBuilder();
        staxBuilder.buildSetEquip("src/task03/equip.xml");
        System.out.println(staxBuilder.getMotoEquip());
    }
    
    private static void demarsh(){
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance("marh");
        
            Unmarshaller um = jc.createUnmarshaller();
            String schemaName = "src/task03/equip.xsd";
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        
            File schemaLocation = new File(schemaName);
            // создание схемы и перадача ее демарашаллизатору
            Schema schema = factory.newSchema(schemaLocation);
            um.setSchema(schema);
            marh.MotoEquip st = (marh.MotoEquip) um.unmarshal(new File("src/task03/equip.xml"));
            System.out.println(st.getMotoEquipment().toString());
            
            Marshaller m = jc.createMarshaller();
            m.setSchema(schema);
            m.marshal(st, new FileOutputStream("src/task03/equip2.xml"));
        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
        catch (SAXException e) {
            e.printStackTrace();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(Task03.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void marsh() {
        try {
            JAXBContext context = JAXBContext.newInstance(MotoEquip.class, Helmet.class, RefBaseEquip.class);
            Marshaller m = context.createMarshaller();
            
//            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//            File schemaLocation = new File("src/task03/equip.xsd");
//            Schema schema = factory.newSchema(schemaLocation);
//            m.setSchema(schema);
//            
            MotoEquip magaz = creatingMotoMagazin();
            System.out.println(magaz);
            m.marshal(magaz, new FileOutputStream("src/task03/equip_marsh.xml"));
            m.marshal(magaz, System.out); //копия на консоль
            System.out.println("XML-файл создан");
        }
        catch (FileNotFoundException e) {
            System.out.println("XML-файл не может быть создан: " + e);
        }
        catch (JAXBException e) {
            System.out.println("JAXB-контекст ошибочен " + e);
//        } catch (SAXException ex) {
//            java.util.logging.Logger.getLogger(Task03.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static void unmarsh() {
        try {
            JAXBContext jc = JAXBContext.newInstance(MotoEquip.class, Helmet.class, RefBaseEquip.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader("src/task03/equip_marsh.xml");
            MotoEquip magaz = (MotoEquip) u.unmarshal(reader);
            System.out.println(magaz);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

   
    
}
