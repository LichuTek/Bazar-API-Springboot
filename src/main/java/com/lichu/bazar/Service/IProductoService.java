package com.lichu.bazar.Service;

import com.lichu.bazar.model.Producto;
import com.lichu.bazar.model.Venta;

import java.util.List;

public interface IProductoService {
    //TRAER TODOS
    public List<Producto> getProductos();
    //POST
    public void postProducto (Producto producto);
    //EDIT
    public void editProduct(Long id, Producto producto);

    //TRAER ESPECIFICO
    public Producto getProducto(Long id);

    //DELETE

    public void deleteProducto(Long id);
    //

}
