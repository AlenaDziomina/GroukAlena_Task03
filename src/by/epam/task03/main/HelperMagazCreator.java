/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task03.main;

import by.epam.task03.exeption.ProjectException;
import by.epam.task03.entity.MotoEquip;
import by.epam.task03.entity.MotoEquipment;
import by.epam.task03.logic.EquipFactory;
import static by.epam.task03.main.Task03.localLog;

/**
 *
 * @author Helena.Grouk
 */
public abstract class HelperMagazCreator {
    
    
    
    public static final MotoEquip creatingMotoMagazin(){
        
        MotoEquip magaz = new MotoEquip();
        int id = 0;
        
        String[][] str1 = { {"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "520 CARBON", "String"},
                            {"price", "300", "int"},
                            {"weight", "1.210", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "Carbon", "String"},
                            {"insertMaterial", "HydraDry", "String"},
                            {"vents", "7", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "COMMON", "String"},
                            {"size", "XL", "String"},
                            {"genderStyle", "Y", "String"}
        };
        addEquip(magaz, str1);
        
        String[][] str2 = { {"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "524 FIBERGLASS", "String"},
                            {"price", "170", "int"},
                            {"weight", "1.450", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "Fiberglass", "String"},
                            {"insertMaterial", "HydraDry", "String"},
                            {"vents", "5", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "COMMON", "String"},
                            {"size", "XL", "String"},
                            {"genderStyle", "Y", "String"}
        };
        addEquip(magaz, str2);
       
        String[][] str3 = { {"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "482 COOL", "String"},
                            {"price", "160", "int"},
                            {"weight", "1.450", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "ABS", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "7", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "COMMON", "String"},
                            {"size", "XL", "String"},
                            {"genderStyle", "Y", "String"}
        };
        addEquip(magaz, str3);
       
        String[][] str4 = { {"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "550 FULL CARBON", "String"},
                            {"price", "260", "int"},
                            {"weight", "1.200", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "Carbon", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "7", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "true", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XL", "String"},
                            {"genderStyle", "Y", "String"}
        };
        addEquip(magaz, str4);
        
        String[][] str5 = { {"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "300 COMFORT", "String"},
                            {"price", "90", "int"},
                            {"weight", "1.350", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "ABS", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "4", "int"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "true", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "TURIST", "String"},
                            {"size", "L", "String"},
                            {"genderStyle", "W", "String"}
        };        
        addEquip(magaz, str5);
        
        String[][] str6 = { {"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "690 CARBON", "String"},
                            {"price", "360", "int"},
                            {"weight", "1.370", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "MODULAR", "String"},
                            {"shellMaterial", "Carbon", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "5", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "true", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "TURIST", "String"},
                            {"size", "L", "String"},
                            {"genderStyle", "Y", "String"}
        };       
        addEquip(magaz, str6);
       
        String[][] str7 = { {"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "771 STRASS", "String"},
                            {"price", "150", "int"},
                            {"weight", "1.600", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "ENDURO", "String"},
                            {"shellMaterial", "ABS", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "7", "int"},
                            {"sunVisor", "true", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "L", "String"},
                            {"genderStyle", "Y", "String"}
        };
        addEquip(magaz, str7);
        
        String[][] str8 = { {"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "170 DECOR", "String"},
                            {"price", "150", "int"},
                            {"weight", "0.950", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "JET", "String"},
                            {"shellMaterial", "Fiberglass", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "COMMON", "String"},
                            {"size", "XS", "String"},
                            {"genderStyle", "W", "String"}
        };
        addEquip(magaz, str8);
        
        String[][] str9 = { {"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "729 CollMax", "String"},
                            {"price", "230", "int"},
                            {"weight", "0.990", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "CROSS", "String"},
                            {"shellMaterial", "Carbon", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "2", "int"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "true", "boolean"},
                            {"motoType", "CROSS", "String"},
                            {"size", "L", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str9);
        
        String[][] str10 = {{"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "710 Jr", "String"},
                            {"price", "90", "int"},
                            {"weight", "1.050", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "CROSS", "String"},
                            {"shellMaterial", "ABS", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "2", "int"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "CROSS", "String"},
                            {"size", "3XS", "String"},
                            {"genderStyle", "CH", "String"}
        };
        addEquip(magaz, str10);
        
        String[][] str11 = {{"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "370 Jr", "String"},
                            {"price", "80", "int"},
                            {"weight", "1.250", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "INTEGRAL", "String"},
                            {"shellMaterial", "ABS", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"vents", "4", "int"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "TURIST", "String"},
                            {"size", "3XS", "String"},
                            {"genderStyle", "CH", "String"}
        };
        addEquip(magaz, str11);
       
        String[][] str12 = {{"class", "Helmet", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "Classic Jr", "String"},
                            {"price", "60", "int"},
                            {"weight", "0.850", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"helmetType", "JET", "String"},
                            {"shellMaterial", "Fiberglass", "String"},
                            {"insertMaterial", "Silver Cool", "String"},
                            {"sunVisor", "false", "boolean"},
                            {"headsetConnector", "false", "boolean"},
                            {"admissionGp", "false", "boolean"},
                            {"motoType", "TURIST", "String"},
                            {"size", "3XS", "String"},
                            {"genderStyle", "CH", "String"}
        };
        addEquip(magaz, str12);
        
        String[][] str13 = {{"class", "Jacket", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "JARAMA", "String"},
                            {"price", "400", "int"},
                            {"weight", "4.360", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "false", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str13);
        
        String[][] str14 = {{"class", "Jacket", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "ARAGON", "String"},
                            {"price", "330", "int"},
                            {"weight", "4.120", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str14);
        
        String[][] str15 = {{"class", "Jacket", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "RAID", "String"},
                            {"price", "570", "int"},
                            {"weight", "4.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str15);
        
        String[][] str16 = {{"class", "Jacket", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "JEREZ", "String"},
                            {"price", "400", "int"},
                            {"weight", "3.800", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "false", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "M", "String"},
                            {"genderStyle", "W", "String"}
        };
        addEquip(magaz, str16);
       
        String[][] str17 = {{"class", "Jacket", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "NOGARO", "String"},
                            {"price", "440", "int"},
                            {"weight", "4.800", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "XXL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str17);
        
        String[][] str18 = {{"class", "Jacket", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "ROADRUNNER", "String"},
                            {"price", "270", "int"},
                            {"weight", "2.700", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "false", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "XXL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str18);
        
        String[][] str19 = {{"class", "Jacket", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "LARA", "String"},
                            {"price", "230", "int"},
                            {"weight", "1.900", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "false", "boolean"},
                            {"elbowsInsert", "false", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "L", "String"},
                            {"genderStyle", "W", "String"}
        };
        addEquip(magaz, str19);
        
        String[][] str20 = {{"class", "Jacket", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "VALENCIA", "String"},
                            {"price", "200", "int"},
                            {"weight", "2.200", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Humax Z-Liner", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "L", "String"},
                            {"genderStyle", "W", "String"}
        };
        addEquip(magaz, str20);
                
        String[][] str21 = {{"class", "Jacket", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "OPEN ROAD EVO", "String"},
                            {"price", "250", "int"},
                            {"weight", "2.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "XXL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str21);
        
        String[][] str22 = {{"class", "Jacket", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "YONG RIDERS", "String"},
                            {"price", "90", "int"},
                            {"weight", "1.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backInsert", "true", "boolean"},
                            {"elbowsInsert", "true", "boolean"},
                            {"shouldersInsert", "true", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "3XS", "String"},
                            {"genderStyle", "CH", "String"}
        };
        addEquip(magaz, str22);
        
        String[][] str23 = {{"class", "Pants", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "JARAMA", "String"},
                            {"price", "300", "int"},
                            {"weight", "2.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "true", "boolean"},
                            {"baseMaterial", "Humax Z-Liner", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "false", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XXL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str23);
        
        String[][] str24 = {{"class", "Pants", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "ARAGON", "String"},
                            {"price", "270", "int"},
                            {"weight", "2.400", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "true", "boolean"},
                            {"baseMaterial", "Humax Z-Liner", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XXL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str24);
        
        String[][] str25 = {{"class", "Pants", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "RAID", "String"},
                            {"price", "570", "int"},
                            {"weight", "3.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "XL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str25);
        
        String[][] str26 = {{"class", "Pants", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "JEREZ", "String"},
                            {"price", "400", "int"},
                            {"weight", "3.200", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "true", "boolean"},
                            {"baseMaterial", "Rindleder 1.2-1.4", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "false", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "M", "String"},
                            {"genderStyle", "W", "String"}
        };
        addEquip(magaz, str26);
        
        String[][] str27 = {{"class", "Pants", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "NOGARO", "String"},
                            {"price", "350", "int"},
                            {"weight", "2.800", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "false", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "XXL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str27);
       
        String[][] str28 = {{"class", "Pants", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "VEGAS", "String"},
                            {"price", "270", "int"},
                            {"weight", "1.700", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "false", "boolean"},
                            {"kneeInsert", "false", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Rindleder 1.2", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "false", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "XXL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str28);
        
        String[][] str29 = {{"class", "Pants", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "LARA", "String"},
                            {"price", "230", "int"},
                            {"weight", "1.100", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "false", "boolean"},
                            {"kneeInsert", "false", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Rindleder 1.0", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "L", "String"},
                            {"genderStyle", "W", "String"}
        };
        addEquip(magaz, str29);
        
        String[][] str30 = {{"class", "Pants", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "VALENCIA", "String"},
                            {"price", "180", "int"},
                            {"weight", "1.200", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "false", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Humax Z-Liner", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "L", "String"},
                            {"genderStyle", "W", "String"}
        };
        addEquip(magaz, str30);
        
        String[][] str31 = {{"class", "Pants", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "OPEN ROAD EVO", "String"},
                            {"price", "170", "int"},
                            {"weight", "1.600", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "XXL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str31);
       
        String[][] str32 = {{"class", "Pants", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "YONG RIDERS", "String"},
                            {"price", "80", "int"},
                            {"weight", "0.900", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"hipInsert", "true", "boolean"},
                            {"kneeInsert", "true", "boolean"},
                            {"sliderMount", "false", "boolean"},
                            {"baseMaterial", "Cordura", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "3XS", "String"},
                            {"genderStyle", "CH", "String"}
        };
        addEquip(magaz, str32);
        
        String[][] str33 = {{"class", "Shoes", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "SBX Wasserdicht", "String"},
                            {"price", "170", "int"},
                            {"weight", "0.900", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"mountType", "Hipora zip", "String"},
                            {"protectionMaterial", "Schleifer aus Metall", "String"},
                            {"soleMaterial", "ABS", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "42", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str33);
       
        String[][] str34 = {{"class", "Shoes", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "GP-EVO Wasserdicht", "String"},
                            {"price", "160", "int"},
                            {"weight", "0.850", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"mountType", "Hipora zip", "String"},
                            {"protectionMaterial", "Schleifer aus Metall", "String"},
                            {"soleMaterial", "ABS", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "41", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str34);
        
        String[][] str35 = {{"class", "Shoes", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "TOURSPORT", "String"},
                            {"price", "140", "int"},
                            {"weight", "0.800", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"mountType", "Zip", "String"},
                            {"protectionMaterial", "Schleifer", "String"},
                            {"soleMaterial", "ABS", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "43", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str35);
        
        String[][] str36 = {{"class", "Shoes", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "B40 ENDURO", "String"},
                            {"price", "150", "int"},
                            {"weight", "0.750", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"mountType", "Hipora", "String"},
                            {"protectionMaterial", "Schleifer", "String"},
                            {"soleMaterial", "ABS", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "44", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str36);
        
        String[][] str37 = {{"class", "Shoes", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "B58", "String"},
                            {"price", "150", "int"},
                            {"weight", "0.550", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Textil-mix", "String"},
                            {"mountType", "Shoelace", "String"},
                            {"protectionMaterial", "Schleifer", "String"},
                            {"soleMaterial", "ABS", "String"},
                            {"motoType", "STUNT", "String"},
                            {"size", "44", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str37);
        
        String[][] str38 = {{"class", "Shoes", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "GAERNE SG12", "String"},
                            {"price", "530", "int"},
                            {"weight", "3.850", "float"},
                            {"manufacturer", "GAERNE", "String"},
                            {"baseMaterial", "Leader", "String"},
                            {"mountType", "clasp", "String"},
                            {"protectionMaterial", "Schleifer metal", "String"},
                            {"soleMaterial", "ABS", "String"},
                            {"motoType", "CROSS", "String"},
                            {"size", "38", "String"},
                            {"genderStyle", "W", "String"}
        };
        addEquip(magaz, str38);
        
        String[][] str39 = {{"class", "Shoes", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "JUNIOR SGJ", "String"},
                            {"price", "180", "int"},
                            {"weight", "1.850", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leader", "String"},
                            {"mountType", "clasp", "String"},
                            {"protectionMaterial", "Schleifer metal", "String"},
                            {"soleMaterial", "ABS", "String"},
                            {"motoType", "ENDURO", "String"},
                            {"size", "35", "String"},
                            {"genderStyle", "CH", "String"}
        };
        addEquip(magaz, str39);
        
        String[][] str40 = {{"class", "Shoes", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "GAERNE GP1", "String"},
                            {"price", "300", "int"},
                            {"weight", "2.400", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"mountType", "clasp", "String"},
                            {"protectionMaterial", "Schleifer", "String"},
                            {"soleMaterial", "ABS", "String"},
                            {"motoType", "SPORT", "String"},
                            {"size", "39", "String"},
                            {"genderStyle", "W", "String"}
        };
        addEquip(magaz, str40);
        
        String[][] str41 = {{"class", "Gloves", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "DONINGTON", "String"},
                            {"price", "140", "int"},
                            {"weight", "0.200", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"protectionMaterial", "Carbon", "String"},
                            {"motoType", "SPORT", "String"},
                            {"waterproof", "true", "boolean"},
                            {"perforation", "true", "boolean"},
                            {"insulation", "true", "boolean"},
                            {"palmProtect", "true", "boolean"},
                            {"fingersProtect", "true", "boolean"},
                            {"knucklesProtect", "true", "boolean"},
                            {"size", "10", "String"},
                            {"genderStyle", "Y", "String"}
        };
        addEquip(magaz, str41);
        
        String[][] str42 = {{"class", "Gloves", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "RIDER KIDS", "String"},
                            {"price", "40", "int"},
                            {"weight", "0.100", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"baseMaterial", "Leder", "String"},
                            {"protectionMaterial", "Carbon", "String"},
                            {"motoType", "SPORT", "String"},
                            {"waterproof", "false", "boolean"},
                            {"perforation", "false", "boolean"},
                            {"insulation", "false", "boolean"},
                            {"palmProtect", "false", "boolean"},
                            {"fingersProtect", "true", "boolean"},
                            {"knucklesProtect", "true", "boolean"},
                            {"size", "4", "String"},
                            {"genderStyle", "CH", "String"}
        };
        addEquip(magaz, str42);
        
        String[][] str43 = {{"class", "ArmorJacket", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "ROSSANO2", "String"},
                            {"price", "200", "int"},
                            {"weight", "1.200", "float"},
                            {"manufacturer", "BUSE", "String"},
                            {"backProtect", "true", "boolean"},
                            {"chestProtect", "true", "boolean"},
                            {"elbowsProtect", "true", "boolean"},
                            {"shouldersProtect", "true", "boolean"},
                            {"baseMaterial", "70% Poliamid, 15% Elastan, 15%Neopren", "String"},
                            {"mountType", "sewn in", "String"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"size", "2XL", "String"},
                            {"genderStyle", "M", "String"}
        };
        addEquip(magaz, str43);
        
        String[][] str44 = {{"class", "KneeProtector", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "X_STRONG", "String"},
                            {"price", "140", "int"},
                            {"weight", "0.700", "float"},
                            {"manufacturer", "ACERBID", "String"},
                            {"baseMaterial", "70% Poliamid, 15% Elastan, 15%Neopren", "String"},
                            {"mountType", "sewn in and velcro straps", "String"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"articulated", "true", "boolean"}
        };
        addEquip(magaz, str44);
        
        String[][] str45 = {{"class", "KneeProtector", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "IMPACT", "String"},
                            {"price", "50", "int"},
                            {"weight", "0.500", "float"},
                            {"manufacturer", "ACERBID", "String"},
                            {"baseMaterial", "70% Poliamid, 15% Elastan, 15%Neopren", "String"},
                            {"mountType", "velcro straps", "String"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "TURIST", "String"},
                            {"articulated", "true", "boolean"}
        };
        addEquip(magaz, str45);
        
        String[][] str46 = {{"class", "ElbowProtector", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "IMPACT", "String"},
                            {"price", "50", "int"},
                            {"weight", "0.450", "float"},
                            {"manufacturer", "ACERBID", "String"},
                            {"baseMaterial", "70% Poliamid, 15% Elastan, 15%Neopren", "String"},
                            {"mountType", "velcro straps", "String"},
                            {"protectionMaterial", "SAS-TECH Protectoren", "String"},
                            {"motoType", "STUNT", "String"},
                            {"articulated", "true", "boolean"}
        };
        addEquip(magaz, str46);
        
        String[][] str47 = {{"class", "Termolinen", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "MEGALIGHT 200", "String"},
                            {"price", "50", "int"},
                            {"weight", "0.150", "float"},
                            {"manufacturer", "KeepsFresh", "String"},
                            {"baseMaterial", "88% Poliamid, 12% Polyester", "String"},
                            {"size", "M", "String"},
                            {"genderStyle", "M", "String"},
                            {"season", "SPRING", "String"},
                            {"clothesType", "tshirt", "String"},
                            {"elastic", "true", "boolean"},
                            {"seamless", "true", "boolean"}
        };
        addEquip(magaz, str47);
        
        String[][] str48 = {{"class", "Termolinen", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "MEGALIGHT 200", "String"},
                            {"price", "50", "int"},
                            {"weight", "0.150", "float"},
                            {"manufacturer", "KeepsFresh", "String"},
                            {"baseMaterial", "88% Poliamid, 12% Polyester", "String"},
                            {"size", "M", "String"},
                            {"genderStyle", "M", "String"},
                            {"season", "SPRING", "String"},
                            {"clothesType", "pants", "String"},
                            {"elastic", "true", "boolean"},
                            {"seamless", "true", "boolean"}
        };
        addEquip(magaz, str48);
        
        String[][] str49 = {{"class", "Balaclava", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "MEGALIGHT 200", "String"},
                            {"price", "12", "int"},
                            {"weight", "0.050", "float"},
                            {"manufacturer", "CoolMax", "String"},
                            {"baseMaterial", "100% Polyester", "String"},
                            {"season", "SUMMER", "String"},
                            {"seamless", "true", "boolean"}
        };
        addEquip(magaz, str49);
        
        String[][] str50 = {{"class", "Slicker", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "REGENBEKLEIDUNG", "String"},
                            {"price", "60", "int"},
                            {"weight", "0.950", "float"},
                            {"manufacturer", "CoolMax", "String"},
                            {"baseMaterial", "100% Polyester", "String"},
                            {"season", "SUMMER", "String"},
                            {"separate", "true", "boolean"},
                            {"fluorescent", "true", "boolean"},
                            {"hood", "true", "boolean"}
        };
        addEquip(magaz, str50);
        
        String[][] str51 = {{"class", "Visor", "String"},
                            {"id", String.valueOf(++id), "int"},
                            {"name", "ROCC 550", "String"},
                            {"price", "20", "int"},
                            {"weight", "0.150", "float"},
                            {"manufacturer", "ROCC", "String"},
                            {"baseMaterial", "Plastic", "String"},
                            {"antifog", "true", "boolean"},
                            {"antiblick", "true", "boolean"},
                            {"pinlock", "true", "boolean"}
        };
        addEquip(magaz, str51);
        
//        try {
//            ((Visor)magaz.getMotoEquipment().get(id)).setForWhat((BaseMotoEquipment)magaz.getMotoEquipment().get(1));
//            ((Visor)magaz.getMotoEquipment().get(id)).setForWhat((BaseMotoEquipment)magaz.getMotoEquipment().get(2));
//        } catch (ProjectException ex) {
//            localLog.error("CANT");
//        }
        
        return magaz;
    }
        
    
    
    
    private static void addEquip(MotoEquip magaz, String[][] fields) {
        
        MotoEquipment obj;
        try {
            obj = EquipFactory.equipmentCreator(fields);
            if (obj != null) {
                magaz.add(obj);
            }
        } catch (ProjectException ex) {
            localLog.error("Creating equip failed.");
        }
        
    }

    
    
}
