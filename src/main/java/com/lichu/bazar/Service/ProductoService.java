package com.lichu.bazar.Service;

import com.lichu.bazar.Repository.IProductoRepository;
import com.lichu.bazar.model.Producto;
import com.lichu.bazar.model.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    private IProductoRepository produRepo;

    @Override
    public List<Producto> getProductos() {
        return produRepo.findAll();
    }

    @Override
    public void postProducto(Producto producto) {
        produRepo.save(producto);

    }

    @Override
    public void editProduct(Long id, Producto producto) {
        Optional <Producto> prodop = produRepo.findById(id);
        if (prodop.isPresent()){
            Producto prod = prodop.get();
            prod.setCodigo_producto(id);
            prod.setCosto(producto.getCosto());
            prod.setNombre(producto.getNombre());
            prod.setCosto(producto.getCosto());
            prod.setListaVentas(producto.getListaVentas());
            prod.setCantidad_disponible(producto.getCantidad_disponible());
            produRepo.save(prod);

        }
    }

    @Override
    public Producto getProducto(Long id) {
        return produRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteProducto(Long id) {
        produRepo.deleteById(id);
    }
}
