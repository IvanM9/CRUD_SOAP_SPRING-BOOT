//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.14 a las 12:31:08 AM COT 
//


package com.ivanmanzaba.crud_soap.cliente;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ivanmanzaba.crud_soap.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ivanmanzaba.crud_soap.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteClientResponse }
     * 
     */
    public DeleteClientResponse createDeleteClientResponse() {
        return new DeleteClientResponse();
    }

    /**
     * Create an instance of {@link ServiceStatus }
     * 
     */
    public ServiceStatus createServiceStatus() {
        return new ServiceStatus();
    }

    /**
     * Create an instance of {@link AddClientResponse }
     * 
     */
    public AddClientResponse createAddClientResponse() {
        return new AddClientResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link GetClientRequest }
     * 
     */
    public GetClientRequest createGetClientRequest() {
        return new GetClientRequest();
    }

    /**
     * Create an instance of {@link GetClientesResponse }
     * 
     */
    public GetClientesResponse createGetClientesResponse() {
        return new GetClientesResponse();
    }

    /**
     * Create an instance of {@link AddClientRequest }
     * 
     */
    public AddClientRequest createAddClientRequest() {
        return new AddClientRequest();
    }

    /**
     * Create an instance of {@link GetClientesRequest }
     * 
     */
    public GetClientesRequest createGetClientesRequest() {
        return new GetClientesRequest();
    }

    /**
     * Create an instance of {@link GetClientResponse }
     * 
     */
    public GetClientResponse createGetClientResponse() {
        return new GetClientResponse();
    }

    /**
     * Create an instance of {@link DeletClientRequest }
     * 
     */
    public DeletClientRequest createDeletClientRequest() {
        return new DeletClientRequest();
    }

}
