package org.example;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class CreateJAXBContextBenchMarkTest {
    @Test
    public void testCreateJAXBContext() throws Exception {
        try {
            long start = System.currentTimeMillis();
            for (int i =0 ; i < 200; i++) {
                JAXBContext.newInstance(PurchaseOrder.class, USAddress.class, Address.class);
            }
            System.out.println("Create 200 JAXBContext takes: " + Long.toString (System.currentTimeMillis() - start) + "ms");
        } catch(JAXBException je) {
            je.printStackTrace();
        }
    }
}
