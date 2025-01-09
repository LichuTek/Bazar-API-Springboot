package com.lichu.bazar.Service;

import com.lichu.bazar.Repository.IClienteRepository;
import com.lichu.bazar.Repository.IVentaRepository;
import com.lichu.bazar.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService implements IVentaService {
    @Autowired
    private IVentaRepository ventaRepo;
    @Override
    public List<Venta> getVentas() {
        return ventaRepo.findAll();
    }

    @Override
    public void postVenta(Venta venta) {
        ventaRepo.save(venta);
    }

    @Override
    public Venta getVenta(Long id) {
        return ventaRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteVenta(Long id) {
        ventaRepo.deleteById(id);
    }
}
