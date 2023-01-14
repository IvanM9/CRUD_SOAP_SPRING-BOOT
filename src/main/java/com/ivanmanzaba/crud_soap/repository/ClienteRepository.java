package com.ivanmanzaba.crud_soap.repository;

import com.ivanmanzaba.crud_soap.cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ClienteRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final Map<Integer, Cliente> ClienteMap = new HashMap<>();

    public Cliente findById(int id) {
        return ClienteMap.get(id);
    }

    @PostConstruct
    public void init() {
        getClientes();
    }

    public List<Cliente> getClientes() {
        return jdbcTemplate.query("SELECT * FROM cliente",
                (rs, rowNum) -> mapToCliente(rs));
    }

    public String insertClient(Cliente cliente) {
        String sqlQuery = "INSERT INTO cliente (codcliente, ci, nombre, direccion, tipocliente, ccaa) " +
                "VALUES(" + cliente.getCodcliente() + ",'" + cliente.getCi() + "','" +
                cliente.getNombre() + "','" + cliente.getDireccion() + "','" + cliente.getTipocliente() +
                "','" + cliente.getCcaa() + "')";
        int respuesta = jdbcTemplate.update(sqlQuery);
        if (respuesta > 0) {
            return "Se insertó correctamente";
        }
        return "No se insertó el cliente";
    }

    public String deleteClientByID(int id) {
        int respuesta = jdbcTemplate.update("DELETE from cliente where codcliente=" + id);
        if (respuesta > 0) {
            return "Se eliminó correctamente";
        }
        return "No se eliminó la cliente";
    }


    private Cliente mapToCliente(ResultSet resultSet) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setCodcliente(resultSet.getInt("codcliente"));
        cliente.setNombre(resultSet.getString("nombre"));
        cliente.setCi(resultSet.getString("ci"));
        cliente.setDireccion(resultSet.getString("direccion"));
        cliente.setTipocliente(resultSet.getString("tipocliente"));
        cliente.setCcaa(resultSet.getString("ccaa"));

        ClienteMap.put(cliente.getCodcliente(), cliente);
        return cliente;
    }
}
