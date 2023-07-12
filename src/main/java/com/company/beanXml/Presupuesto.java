package com.company.beanXml;

public class Presupuesto implements Documentos{

    /***
     * A cada documento se le "inyecta" la clase que contiene todos los
     * servicios que vamos a requerir para este objeto en concreto.
     */
    private Revisar revision;
    public Presupuesto (Revisar revision){
        this.revision = revision;
    }

    @Override
    public String TipoDocumento() {
        return "Todos los presupuestos del año anterior. ";
    }

    @Override
    public String ValidadoPor() {
        return revision.validarDocumento();
    }

}
