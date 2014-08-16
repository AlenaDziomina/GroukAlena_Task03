/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package task03;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
/**
 *
 * @author Helena.Grouk
 */
public class Task03 {

    static final String LOG_PROPERTIES_FILE = "Log4J.properties";
    public static Logger localLog = Logger.getLogger("localLoger");
    
    public static void main(String[] args) {
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
        
    }
    
}
