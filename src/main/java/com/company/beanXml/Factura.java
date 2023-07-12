package com.company.beanXml;

public class Factura implements Documentos {

    private Revisar revision;

    public Factura(Revisar revision) {
        this.revision = revision;
    }

    @Override
    public String TipoDocumento() {
        return "Datos facturación del último mes";
    }

    @Override
    public String ValidadoPor() {
        return revision.validarDocumento();
    }
}
