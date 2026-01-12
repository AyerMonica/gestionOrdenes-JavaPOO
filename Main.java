package org.example;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("orden1");
        OrdenCompra orden2 = new OrdenCompra("orden2");
        OrdenCompra orden3 = new OrdenCompra("orden3");

        Cliente monica = new Cliente("Mónica", "Ayerbe");
        Cliente yaiza = new Cliente("Yaiza", "Simarro");
        Cliente ana = new Cliente("Ana", "Lopez");

        orden1.setCliente(monica);
        orden2.setCliente(ana);
        orden3.setCliente(yaiza);

        Calendar calendario = Calendar.getInstance();
        calendario.set(2025, Calendar.DECEMBER, 15);
        orden1.setFecha(calendario.getTime());
        Calendar calendario2 = Calendar.getInstance();
        calendario2.set(2025, Calendar.DECEMBER, 27);
        orden2.setFecha(calendario2.getTime());
        Calendar calendario3 = Calendar.getInstance();
        calendario3.set(2025, Calendar.DECEMBER, 20);
        orden3.setFecha(calendario3.getTime());

        Producto producto1 = new Producto("Mercadona", "Queso", 12);
        Producto producto2 = new Producto("Carrefour", "Lomo", 15);
        Producto producto3 = new Producto("Alcampo", "Chorizo", 14);
        Producto producto4 = new Producto("Mercadona", "Queso", 13);
        Producto producto5 = new Producto("Carrefour", "Lomo", 16);
        Producto producto6 = new Producto("Alcampo", "Chorizo", 11);
        Producto producto7 = new Producto("Mercadona", "Queso", 100);
        Producto producto8 = new Producto("Carrefour", "Lomo", 17);
        Producto producto9 = new Producto("Alcampo", "Lomo", 14);
        Producto producto10 = new Producto("Alcampo", "Chorizo", 13);
        Producto producto11 = new Producto("Alcampo", "Queso", 11);
        Producto producto12 = new Producto("Alcampo", "Lomo", 10);


        orden1.addProducto(producto1);
        orden1.addProducto(producto2);
        orden1.addProducto(producto3);
        orden1.addProducto(producto4);

        orden2.addProducto(producto5);
        orden2.addProducto(producto6);
        orden2.addProducto(producto7);
        orden2.addProducto(producto8);

        orden3.addProducto(producto9);
        orden3.addProducto(producto10);
        orden3.addProducto(producto11);
        orden3.addProducto(producto12);

        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();

    }
}
