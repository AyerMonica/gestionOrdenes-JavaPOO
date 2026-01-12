package org.example;

import java.util.ArrayList;
import java.util.Date;

class OrdenCompra {
    private Integer id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ArrayList<Producto> productos = new ArrayList<>();
    private static int ultimoid;

    public OrdenCompra(String descripcion) {
        ;
        this.descripcion = descripcion;
        this.id = ++ultimoid;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto producto) {
        productos.add(producto);
    }

    public Integer getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public int getGranTotal() {
        int suma = 0;
        for (Producto p: productos) {
            suma += p.getPrecio();
        }
        return suma;
    }

    public void mostrarOrden(){
        System.out.println("Id orden: " + this.getId());
        System.out.println("Descripción: " + this.getDescripcion());
        System.out.println("Fecha: " + this.getFecha());
        System.out.println("Cliente " + this.getCliente().getNombre() + " " + this.getCliente().getApellido());
        for (Producto p : productos) {
            System.out.println(" - " + p);
        }
        System.out.println("Gran total: " + this.getGranTotal() + "€");
    }
}
