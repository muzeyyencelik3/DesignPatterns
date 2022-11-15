package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class SerializeToXML implements GenericSerialize{
    @Override
    public void serializeData(StudentInfo studentInfo) throws JAXBException {
        JAXBContext jaxbContext= JAXBContext.newInstance(StudentInfo.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter stringWriter = new StringWriter();

        jaxbMarshaller.marshal(studentInfo, stringWriter);


        String xmlContent = stringWriter.toString();
        System.out.println( xmlContent );


    }
}
