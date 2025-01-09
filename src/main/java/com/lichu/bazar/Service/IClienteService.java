package com.lichu.bazar.Service;

import com.lichu.bazar.model.Cliente;

import java.util.List;

public interface IClienteService {
    //TRAER TODOS
    public List<Cliente> getClientes();
    //POST
    public void postCliente (Cliente client);
    //EDIT
    public void editCliente (Long id, Cliente cliente);
    //TRAER ESPECIFICO
    public Cliente getCliente(Long id);

    //DELETE

    public void deleteCliente(Long id);


}
