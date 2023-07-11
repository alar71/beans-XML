package com.company.beanXml;

public class Factura implements Documentos {

    @Override
    public String TipoDocumento() {
        return "Datos facturación del último mes";
    }
}
