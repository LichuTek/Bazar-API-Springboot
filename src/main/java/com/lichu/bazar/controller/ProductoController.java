package com.lichu.bazar.controller;


import com.lichu.bazar.Repository.IProductoRepository;
import com.lichu.bazar.Service.ProductoService;
import com.lichu.bazar.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private ProductoService produServ;

    @PostMapping("/productos/crear")
    public void createProduct(@RequestBody Producto product){
        produServ.postProducto(product);
    }

    @GetMapping("/productos")
    public List<Producto> getProducts(){
        return produServ.getProductos();
    }

    @GetMapping("/productos/{codigo_producto}")
    public Producto getProductById(@PathVariable Long codigo_producto){
        return produServ.getProducto(codigo_producto);
    }

    @DeleteMapping("/productos/eliminar/{codigo_producto}")
    public void deleteProduct(@PathVariable Long codigo_producto){
        produServ.deleteProducto(codigo_producto);
    }

    @PutMapping("/productos/editar/{codigo_producto}")
    public void editProduct(@PathVariable Long codigo_producto, @RequestBody Producto producto){
        produServ.editProduct(codigo_producto,producto);
    }


}
