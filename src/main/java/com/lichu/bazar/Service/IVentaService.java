package com.lichu.bazar.Service;

import com.lichu.bazar.model.Cliente;
import com.lichu.bazar.model.Venta;

import java.util.List;

public interface IVentaService {
    //TRAER TODOS
    public List<Venta> getVentas();
    //POST
    public void postVenta (Venta venta);
    //EDIT

    //TRAER ESPECIFICO
    public Venta getVenta(Long id);

    //DELETE

    public void deleteVenta(Long id);

}
