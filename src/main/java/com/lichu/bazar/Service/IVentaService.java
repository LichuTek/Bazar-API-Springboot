package com.lichu.bazar.Service;

import com.lichu.bazar.DTO.VentaDTO;
import com.lichu.bazar.model.Cliente;
import com.lichu.bazar.model.Venta;

import java.util.List;

public interface IVentaService {

    public List<Venta> getVentas();

    public void postVenta (Venta venta);

    public void editVenta(Long id, Venta venta);

    public Venta getVenta(Long id);

    public VentaDTO getVentaMayor();

    public void deleteVenta(Long id);

}
