/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.epam.task03.entity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 *
 * @author Helena.Grouk
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MotoEquip_QNAME = new QName("http://epam.by/motoequip", "moto-equip");
    private final static QName _MotoEquipment_QNAME = new QName("http://epam.by/motoequip", "moto-equipment");
    private final static QName _Jacket_QNAME = new QName("http://epam.by/motoequip", "jacket");
    private final static QName _ElbowProtector_QNAME = new QName("http://epam.by/motoequip", "elbow-protector");
    private final static QName _Slicker_QNAME = new QName("http://epam.by/motoequip", "slicker");
    private final static QName _Shoes_QNAME = new QName("http://epam.by/motoequip", "shoes");
    private final static QName _ProtectorInsert_QNAME = new QName("http://epam.by/motoequip", "protector-insert");
    private final static QName _SeparateBodyProtection_QNAME = new QName("http://epam.by/motoequip", "separate-body-protection");
    private final static QName _AdditionalEquip_QNAME = new QName("http://epam.by/motoequip", "additional-equip");
    private final static QName _ArmorJacket_QNAME = new QName("http://epam.by/motoequip", "armor-jacket");
    private final static QName _Pants_QNAME = new QName("http://epam.by/motoequip", "pants");
    private final static QName _KneeProtector_QNAME = new QName("http://epam.by/motoequip", "knee-protector");
    private final static QName _Sliders_QNAME = new QName("http://epam.by/motoequip", "sliders");
    private final static QName _BaseMotoEquipment_QNAME = new QName("http://epam.by/motoequip", "base-moto-equipment");
    private final static QName _Balaclava_QNAME = new QName("http://epam.by/motoequip", "balaclava");
    private final static QName _BodyProtection_QNAME = new QName("http://epam.by/motoequip", "body-protection");
    private final static QName _SpecialMotoEquipment_QNAME = new QName("http://epam.by/motoequip", "special-moto-equipment");
    private final static QName _Gloves_QNAME = new QName("http://epam.by/motoequip", "gloves");
    private final static QName _Visor_QNAME = new QName("http://epam.by/motoequip", "visor");
    private final static QName _BuiltInBodyProtection_QNAME = new QName("http://epam.by/motoequip", "built-in-body-protection");
    private final static QName _Helmet_QNAME = new QName("http://epam.by/motoequip", "helmet");
    private final static QName _MainEquip_QNAME = new QName("http://epam.by/motoequip", "main-equip");
    private final static QName _Termolinen_QNAME = new QName("http://epam.by/motoequip", "termolinen");
    private final static QName _SpecialMotoEquipmentForWhat_QNAME = new QName("http://epam.by/motoequip", "for-what");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: newpack
     * 
     */
    public ObjectFactory() {
    }

   

    /**
     * Create an instance of {@link ArmorJacket }
     * 
     */
    public ArmorJacket createArmorJacket() {
        return new ArmorJacket();
    }

    
    /**
     * Create an instance of {@link Pants }
     * 
     */
    public Pants createPants() {
        return new Pants();
    }

    /**
     * Create an instance of {@link Jacket }
     * 
     */
    public Jacket createJacket() {
        return new Jacket();
    }

    /**
     * Create an instance of {@link ElbowProtector }
     * 
     */
    public ElbowProtector createElbowProtector() {
        return new ElbowProtector();
    }

    /**
     * Create an instance of {@link Slicker }
     * 
     */
    public Slicker createSlicker() {
        return new Slicker();
    }

    /**
     * Create an instance of {@link Shoes }
     * 
     */
    public Shoes createShoes() {
        return new Shoes();
    }

    /**
     * Create an instance of {@link ProtectorInsert }
     * 
     */
    public ProtectorInsert createProtectorInsert() {
        return new ProtectorInsert();
    }

    /**
     * Create an instance of {@link Gloves }
     * 
     */
    public Gloves createGloves() {
        return new Gloves();
    }

    /**
     * Create an instance of {@link Visor }
     * 
     */
    public Visor createVisor() {
        return new Visor();
    }

    /**
     * Create an instance of {@link Termolinen }
     * 
     */
    public Termolinen createTermolinen() {
        return new Termolinen();
    }

    /**
     * Create an instance of {@link Helmet }
     * 
     */
    public Helmet createHelmet() {
        return new Helmet();
    }

    /**
     * Create an instance of {@link MotoEquip }
     * 
     */
    public MotoEquip createMotoEquip() {
        return new MotoEquip();
    }

    /**
     * Create an instance of {@link KneeProtector }
     * 
     */
    public KneeProtector createKneeProtector() {
        return new KneeProtector();
    }

    /**
     * Create an instance of {@link Sliders }
     * 
     */
    public Sliders createSliders() {
        return new Sliders();
    }

    /**
     * Create an instance of {@link Balaclava }
     * 
     */
    public Balaclava createBalaclava() {
        return new Balaclava();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MotoEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "moto-equipment")
    public JAXBElement<MotoEquipment> createMotoEquipment(MotoEquipment value) {
        return new JAXBElement<MotoEquipment>(_MotoEquipment_QNAME, MotoEquipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Jacket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "jacket", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<Jacket> createJacket(Jacket value) {
        return new JAXBElement<Jacket>(_Jacket_QNAME, Jacket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElbowProtector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "elbow-protector", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<ElbowProtector> createElbowProtector(ElbowProtector value) {
        return new JAXBElement<ElbowProtector>(_ElbowProtector_QNAME, ElbowProtector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Slicker }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "slicker", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<Slicker> createSlicker(Slicker value) {
        return new JAXBElement<Slicker>(_Slicker_QNAME, Slicker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Shoes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "shoes", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<Shoes> createShoes(Shoes value) {
        return new JAXBElement<Shoes>(_Shoes_QNAME, Shoes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProtectorInsert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "protector-insert", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<ProtectorInsert> createProtectorInsert(ProtectorInsert value) {
        return new JAXBElement<ProtectorInsert>(_ProtectorInsert_QNAME, ProtectorInsert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeparateBodyProtection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "separate-body-protection")
    public JAXBElement<SeparateBodyProtection> createSeparateBodyProtection(SeparateBodyProtection value) {
        return new JAXBElement<SeparateBodyProtection>(_SeparateBodyProtection_QNAME, SeparateBodyProtection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalEquip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "additional-equip")
    public JAXBElement<AdditionalEquip> createAdditionalEquip(AdditionalEquip value) {
        return new JAXBElement<AdditionalEquip>(_AdditionalEquip_QNAME, AdditionalEquip.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArmorJacket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "armor-jacket", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<ArmorJacket> createArmorJacket(ArmorJacket value) {
        return new JAXBElement<ArmorJacket>(_ArmorJacket_QNAME, ArmorJacket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "pants", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<Pants> createPants(Pants value) {
        return new JAXBElement<Pants>(_Pants_QNAME, Pants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KneeProtector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "knee-protector", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<KneeProtector> createKneeProtector(KneeProtector value) {
        return new JAXBElement<KneeProtector>(_KneeProtector_QNAME, KneeProtector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sliders }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "sliders", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<Sliders> createSliders(Sliders value) {
        return new JAXBElement<Sliders>(_Sliders_QNAME, Sliders.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseMotoEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "base-moto-equipment")
    public JAXBElement<BaseMotoEquipment> createBaseMotoEquipment(BaseMotoEquipment value) {
        return new JAXBElement<BaseMotoEquipment>(_BaseMotoEquipment_QNAME, BaseMotoEquipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Balaclava }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "balaclava", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<Balaclava> createBalaclava(Balaclava value) {
        return new JAXBElement<Balaclava>(_Balaclava_QNAME, Balaclava.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BodyProtection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "body-protection")
    public JAXBElement<BodyProtection> createBodyProtection(BodyProtection value) {
        return new JAXBElement<BodyProtection>(_BodyProtection_QNAME, BodyProtection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialMotoEquipment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "special-moto-equipment")
    public JAXBElement<SpecialMotoEquipment> createSpecialMotoEquipment(SpecialMotoEquipment value) {
        return new JAXBElement<SpecialMotoEquipment>(_SpecialMotoEquipment_QNAME, SpecialMotoEquipment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Gloves }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "gloves", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<Gloves> createGloves(Gloves value) {
        return new JAXBElement<Gloves>(_Gloves_QNAME, Gloves.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Visor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "visor", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<Visor> createVisor(Visor value) {
        return new JAXBElement<Visor>(_Visor_QNAME, Visor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuiltInBodyProtection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "built-in-body-protection")
    public JAXBElement<BuiltInBodyProtection> createBuiltInBodyProtection(BuiltInBodyProtection value) {
        return new JAXBElement<BuiltInBodyProtection>(_BuiltInBodyProtection_QNAME, BuiltInBodyProtection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Helmet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "helmet", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<Helmet> createHelmet(Helmet value) {
        return new JAXBElement<Helmet>(_Helmet_QNAME, Helmet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MainEquip }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "main-equip")
    public JAXBElement<MainEquip> createMainEquip(MainEquip value) {
        return new JAXBElement<MainEquip>(_MainEquip_QNAME, MainEquip.class, null, value);
    }
    
    

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Termolinen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "termolinen", substitutionHeadNamespace = "http://epam.by/motoequip", substitutionHeadName = "moto-equipment")
    public JAXBElement<Termolinen> createTermolinen(Termolinen value) {
        return new JAXBElement<Termolinen>(_Termolinen_QNAME, Termolinen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epam.by/motoequip", name = "for-what", scope = SpecialMotoEquipment.class)
    @XmlIDREF
    public JAXBElement<Object> createSpecialMotoEquipmentForWhat(Object value) {
        return new JAXBElement<Object>(_SpecialMotoEquipmentForWhat_QNAME, Object.class, SpecialMotoEquipment.class, value);
    }

}
