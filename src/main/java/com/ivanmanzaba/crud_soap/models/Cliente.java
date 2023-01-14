package com.ivanmanzaba.crud_soap.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
        "codcliente",
        "dni",
        "direccion",
        "tipocliente",
        "ccaa"
})
public class Cliente {

    @XmlElement(required = true)
    protected int codcliente;
    @XmlElement(required = true)
    protected String ci;

    @XmlElement(required = true)
    protected String nombre;

    @XmlElement(required = true)
    protected String direccion;
    @XmlElement(required = true)
    protected String tipocliente;
    @XmlElement(required = true)
    protected String ccaa;

    public int getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(int value) {
        this.codcliente = value;
    }

    public String getCI() {
        return ci;
    }

    public void setCI(String value) {
        this.ci = value;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String value) {
        this.nombre = value;
    }



    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String value) {
        this.direccion = value;
    }

    public String getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(String value) {
        this.tipocliente = value;
    }

    public String getCcaa() {
        return ccaa;
    }

    public void setCcaa(String value) {
        this.ccaa = value;
    }

}
