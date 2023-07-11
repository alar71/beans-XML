package com.company.beanXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiaApp {
    public static void main(String[] args){

        // Primero cargamos el applicationContext.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Llamamos al ID creado
        Documentos factura = context.getBean("miFactura", Factura.class);

        // Mostramos en este caso el metodo de ejemplo creado
        System.out.println(factura.TipoDocumento());
    }
}
