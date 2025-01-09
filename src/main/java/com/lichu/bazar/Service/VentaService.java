package com.lichu.bazar.Service;

import com.lichu.bazar.Repository.IClienteRepository;
import com.lichu.bazar.Repository.IVentaRepository;
import com.lichu.bazar.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void editVenta(Long id, Venta venta) {
        Optional<Venta> ventaOptional = ventaRepo.findById(id);
        if (ventaOptional.isPresent()){
            Venta vent = ventaOptional.get();
            vent.setCodigo_venta(id);
            vent.setFecha_venta(venta.getFecha_venta());
            vent.setTotal(venta.getTotal());
            vent.setUnCliente(venta.getUnCliente());
            vent.setListaProductos(venta.getListaProductos());
            ventaRepo.save(vent);
        }
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
