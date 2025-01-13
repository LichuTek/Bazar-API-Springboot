package com.lichu.bazar.Service;

import com.lichu.bazar.model.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> getClientes();

    public void postCliente (Cliente client);

    public void editCliente (Long id, Cliente cliente);

    public Cliente getCliente(Long id);

    public void deleteCliente(Long id);


}
