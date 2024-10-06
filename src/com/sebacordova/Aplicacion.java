package com.sebacordova;

import com.sebacordova.clases.*;

public class Aplicacion {

	public static void main(String[] args) {
		tiendaElectronica tienda = new tiendaElectronica();

        // Crear y agregar productos.
        televisor tv1 = new televisor("TV Samsung 8K", 899.99, 10, 55, "8K");
        televisor tv2 = new televisor("TV XIAOMI LED", 1399.99, 5, 65, "4K");
        computadoraPortatil laptop1 = new computadoraPortatil("MacBook Pro", 1499.99, 8, "Apple", 16, "MBP2023001");
        computadoraPortatil laptop2 = new computadoraPortatil("ASUS ROG 5", 1299.99, 12, "ASUS", 32, "XPS2023001");

        tienda.agregarProducto(tv1);
        tienda.agregarProducto(tv2);
        tienda.agregarProducto(laptop1);
        tienda.agregarProducto(laptop2);

        // Mostrar productos disponibles.
        System.out.println("Inventario inicial:");
        tienda.mostrarProductosDisponibles();

        // Realizar algunas ventas.
        tienda.realizarVenta("TV Samsung 8K", 3);
        tienda.realizarVenta("MacBook Pro", 2);
        tienda.realizarVenta("ASUS ROG 5", 15); // Aquí intentamos vender más de lo disponible.
        System.out.println("-----------");

        // Mostrar productos actualizados.
        System.out.println("Inventario después de las ventas:");
        tienda.mostrarProductosDisponibles();
    }

}