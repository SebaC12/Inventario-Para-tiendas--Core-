package com.sebacordova.clases;

import java.util.ArrayList;

public class tiendaElectronica {
	private ArrayList<productoElectrodomestico> listaDeProductos;
	
	public tiendaElectronica() {
		this.listaDeProductos = new ArrayList<>();
	}
	
	public void agregarProducto(productoElectrodomestico producto) {
		listaDeProductos.add(producto);
	}
	
	public void mostrarProductosDisponibles() {
		System.out.println("Productos disponibles en la tienda:");
		for (productoElectrodomestico producto : listaDeProductos) {
			producto.mostrarInformacion();
			System.out.println("-----------");
		}
	}
	
	public productoElectrodomestico buscarProductoPorNombre(String nombre) {
        for (productoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }
	
	public void realizarVenta(String nombreProducto, int cantidad) {
        productoElectrodomestico producto = buscarProductoPorNombre(nombreProducto);
        if (producto != null) {
            if (producto.getCantidadDisponible() >= cantidad) {
                producto.setCantidadDisponible(producto.getCantidadDisponible() - cantidad);
                System.out.println("Venta realizada: " + cantidad + " unidad(es) de " + nombreProducto);
            } else if (producto.getCantidadDisponible() > 0) {
                System.out.println("No hay suficiente stock. Solo se vendieron " + producto.getCantidadDisponible() + " unidad(es) de " + nombreProducto);
                producto.setCantidadDisponible(0);
            } else {
                System.out.println("Producto agotado: " + nombreProducto);
            }
        } else {
            System.out.println("Producto no encontrado: " + nombreProducto);
        }
    }
}
