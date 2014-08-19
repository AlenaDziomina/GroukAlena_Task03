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
public class EquipBuilderFactory {
    
    private enum TypeParser { SAX, STAX, DOM }
    public AbstractEquipBuilder createStudentBuilder(String typeParser) {
        TypeParser type = TypeParser.valueOf(typeParser.toUpperCase());
        switch (type) {
            case DOM: return new EquipDomBuilder();
            case STAX: return new EquipStaxBuilder();
            case SAX: return new EquipSaxBuilder();
            default: throw new EnumConstantNotPresentException(type.getDeclaringClass(),type.name());
        }
}
    
}
