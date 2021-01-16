package com.acing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Carrito {

	private Collection<Producto> listaCarrito;

	public Collection<Producto> getListaCarrito() {
		return listaCarrito;
	}

	public Carrito() {
		this.listaCarrito = new ArrayList<>();
	}

	public boolean addProducto(Producto producto) {
		return listaCarrito.add(producto);
	}

	public float getValorCarrito() {
		float valorTotalCarritoCarrito = 0f;
		for (Producto producto : listaCarrito) {
			valorTotalCarritoCarrito += producto.getPrecio();
		}
		return valorTotalCarritoCarrito;
	}

	public String getInformeCarrito() {
		String informeCarrito = "";
		for (Producto producto : listaCarrito) {
			informeCarrito += producto.toString() + "\n";
		}
		informeCarrito += "\tEl valor TOTAL del carrito es de : " + getValorCarrito() + " €";
		return informeCarrito;
		
	}
}
