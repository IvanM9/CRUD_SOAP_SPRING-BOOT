//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.14 a las 12:31:08 AM COT 
//


package com.ivanmanzaba.crud_soap.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codcliente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ci" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tipocliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ccaa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "codcliente",
    "nombre",
    "ci",
    "direccion",
    "tipocliente",
    "ccaa"
})
public class Cliente {

    protected int codcliente;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String ci;
    @XmlElement(required = true)
    protected String direccion;
    @XmlElement(required = true)
    protected String tipocliente;
    @XmlElement(required = true)
    protected String ccaa;

    /**
     * Obtiene el valor de la propiedad codcliente.
     * 
     */
    public int getCodcliente() {
        return codcliente;
    }

    /**
     * Define el valor de la propiedad codcliente.
     * 
     */
    public void setCodcliente(int value) {
        this.codcliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad ci.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCi() {
        return ci;
    }

    /**
     * Define el valor de la propiedad ci.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCi(String value) {
        this.ci = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipocliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipocliente() {
        return tipocliente;
    }

    /**
     * Define el valor de la propiedad tipocliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipocliente(String value) {
        this.tipocliente = value;
    }

    /**
     * Obtiene el valor de la propiedad ccaa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcaa() {
        return ccaa;
    }

    /**
     * Define el valor de la propiedad ccaa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcaa(String value) {
        this.ccaa = value;
    }

}
