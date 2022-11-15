package com.company;

import javax.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws JAXBException {
        StudentInfo studentInfo=new StudentInfo("15","Müzeyyen","Çelik");

        FactoryClass factoryClass=new FactoryClass();

        GenericSerialize genericSerialize1=factoryClass.getType("toJson");
        genericSerialize1.serializeData(studentInfo);
        GenericSerialize genericSerialize2=factoryClass.getType("toXml");
        genericSerialize2.serializeData(studentInfo);
    }
}
