package com.lichu.bazar.controller;

import com.lichu.bazar.DTO.VentaDTO;
import com.lichu.bazar.Service.VentaService;
import com.lichu.bazar.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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

    @GetMapping ("/ventas/checkdia/{fecha_venta}")
    public String getVentasFecha(@PathVariable LocalDate fecha_venta){
        Double sumatoria = 0.0;
        int cant_ventas = 0;
        List<Venta> listaVentas = getVentas();
        for(Venta vent : listaVentas){
            if (vent.getFecha_venta().isEqual(fecha_venta)){
                sumatoria+= vent.getTotal();
                cant_ventas+= 1;
            }
        }
        return "El monto total de las ventas de ese dia es de: " + sumatoria + " La cantidad de ventas de ese dia es de: " + cant_ventas;
    }

    @GetMapping("/ventas/mayor_venta")
    public VentaDTO getMayorVenta(){
        return ventaServ.getVentaMayor();
    }





}
