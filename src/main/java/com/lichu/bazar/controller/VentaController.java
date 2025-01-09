package com.lichu.bazar.controller;

import com.lichu.bazar.Service.VentaService;
import com.lichu.bazar.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VentaController {
    @Autowired
    private VentaService ventaServ;


    @PostMapping("/ventas/crear")
    public void createVenta(@RequestBody Venta venta){
        ventaServ.postVenta(venta);
    }
    @GetMapping("/ventas")
    public List<Venta> getVentas(){
        return ventaServ.getVentas();
    }
    @GetMapping("/ventas/{codigo_venta}")
    public Venta getVenta(@PathVariable Long codigo_venta){
        return ventaServ.getVenta(codigo_venta);
    }
    @DeleteMapping("/ventas/eliminar/{codigo_venta}")
    public void deleteVenta(@PathVariable Long codigo_venta){
        ventaServ.deleteVenta(codigo_venta);
    }

    @PutMapping("/ventas/editar/{codigo_venta}")
    public void editVenta(@PathVariable Long codigo_venta, @RequestBody Venta venta){
        ventaServ.editVenta(codigo_venta,venta);
    }





}
