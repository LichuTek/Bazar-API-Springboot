package com.lichu.bazar.Service;

import com.lichu.bazar.model.Producto;
import com.lichu.bazar.model.Venta;

import java.util.List;

public interface IProductoService {

    public List<Producto> getProductos();

    public void postProducto (Producto producto);

    public void editProduct(Long id, Producto producto);


    public Producto getProducto(Long id);

    public void deleteProducto(Long id);

}
