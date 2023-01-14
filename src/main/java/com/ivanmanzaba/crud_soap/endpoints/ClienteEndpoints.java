package com.ivanmanzaba.crud_soap.endpoints;

import com.ivanmanzaba.crud_soap.models.*;
import com.ivanmanzaba.crud_soap.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class ClienteEndpoints {
    private static final String getClientes = "http://ivanmanzaba.com/crud_soap/cliente";

    private ClienteRepository clienteRepository;

    @Autowired
    public ClienteEndpoints(ClienteRepository clienteRepository1) {
        this.clienteRepository = clienteRepository1;
    }

    /*@PayloadRoot(namespace = getClientes, localPart = "getClientRequest")
    @ResponsePayload
    public GetClientResponse getClient(@RequestPayload GetClientRequest request) {
        GetClientResponse response = new GetClientResponse();
        response.setCliente(clienteRepository.findById(request.getId()));
        return response;
    }*/

    @PayloadRoot(namespace = getClientes, localPart = "getClientesRequest")
    @ResponsePayload
    public GetClientesResponse getClientes(@RequestPayload GetClientesRequest request) {
        GetClientesResponse response = new GetClientesResponse();
        List<Cliente> clientes = clienteRepository.getClientes();
        response.setCliente(clientes);
        return response;
    }


}
