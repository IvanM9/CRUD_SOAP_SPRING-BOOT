package com.ivanmanzaba.crud_soap.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClientRequest", propOrder = {
        "id"
})
public class GetClientRequest {

    @XmlElement(required = true)
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

}
