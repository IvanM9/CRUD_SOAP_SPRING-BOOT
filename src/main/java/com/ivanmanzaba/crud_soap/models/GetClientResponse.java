package com.ivanmanzaba.crud_soap.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClientResponse", propOrder = {
        "cliente"
})
public class GetClientResponse {

    @XmlElement(required = true)
    protected Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente value) {
        this.cliente = value;
    }

}
