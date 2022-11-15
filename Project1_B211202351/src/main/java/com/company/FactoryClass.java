package com.company;


//Factory class.
public class FactoryClass {

    public GenericSerialize getType(String type){
        if(type==null){
            return null;
        }
        if(type.equalsIgnoreCase("toJson")){
            return new SerializeToJSON();
        }
        else if(type.equalsIgnoreCase("toXml")){
            return new SerializeToXML();
        }
        return null;
    }
}
