package com.lichu.bazar.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VentaDTO {
    private Long codigo_venta;
    private Double monto;
    private String nombre;
    private String apellido;

    public VentaDTO() {
    }

    public VentaDTO(Long codigo_venta, Double monto, String nombre, String apellido) {
        this.codigo_venta = codigo_venta;
        this.monto = monto;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
