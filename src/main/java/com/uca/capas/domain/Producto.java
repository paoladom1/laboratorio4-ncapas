package com.uca.capas.domain;

import javax.validation.constraints.*;

public class Producto {

    @Size(message = "El nombre no debe tener mas de 15 caracteres", max = 15)
    @NotEmpty(message = "Este campo no puede estar vacio")
    private String nombre;

    @Size(message = "El nombre no debe tener mas de 30 caracteres", max = 30)
    @NotEmpty(message = "Este campo no puede estar vacio")
    private String descripcion;

    @NotNull(message = "Este campo no puede estar vacio")
    @Min(value = 0, message = "El precio no debe ser negativo")
    private Double precio;

    @NotEmpty(message = "El campo no debe estar vacio")
    @Pattern(regexp = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$", message = "El formato debe ser dd/MM/aaaa")
    private String fechaVencimiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
