package com.lichu.bazar.controller;

import com.lichu.bazar.Service.ClienteService;
import com.lichu.bazar.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteServ;

    @PostMapping("/clientes/crear")
    public void createClient(@RequestBody Cliente cliente){
        clienteServ.postCliente(cliente);
    }

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clienteServ.getClientes();
    }

    @GetMapping("/clientes/{id_cliente}")
    public Cliente getCliente(@PathVariable Long id_cliente){
        return clienteServ.getCliente(id_cliente);
    }

    @DeleteMapping("/clientes/eliminar/{id_cliente}")
    public void deleteCliente(@PathVariable Long id_cliente){
        clienteServ.deleteCliente(id_cliente);
    }

    @PutMapping("/clientes/editar/{id_cliente}")
    public void editCliente(@PathVariable Long id_cliente, @RequestBody Cliente client){
        clienteServ.editCliente(id_cliente,client);
    }



}
