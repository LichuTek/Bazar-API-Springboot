package com.lichu.bazar.Service;

import com.lichu.bazar.Repository.IClienteRepository;
import com.lichu.bazar.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository clienteRepo;


    @Override
    public List<Cliente> getClientes() {
        return clienteRepo.findAll();
    }

    @Override
    public void postCliente(Cliente client) {
        clienteRepo.save(client);
    }

    @Override
    public void editCliente(Long id, Cliente cliente) {
        Optional<Cliente> clienteOp = clienteRepo.findById(id);
        if (clienteOp.isPresent()){
            Cliente cli = clienteOp.get();
            cli.setId_cliente(id);
            cli.setApellido(cliente.getApellido());
            cli.setDni(cliente.getDni());
            cli.setListaVentas(cliente.getListaVentas());
            cli.setNombre(cliente.getNombre());
            clienteRepo.save(cli);
        }
    }

    @Override
    public Cliente getCliente(Long id) {
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepo.deleteById(id);
    }

}
