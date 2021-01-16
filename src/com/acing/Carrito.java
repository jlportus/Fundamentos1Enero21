package com.acing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Carrito<T extends Preciable & Descriptible> {

	private Collection<T> listaCarrito;

	public Collection<T> getListaCarrito() {
		return listaCarrito;
	}

	public Carrito() {
		this.listaCarrito = new ArrayList<>();
	}

	public boolean addProducto(T producto) {
		return listaCarrito.add(producto);
	}

	public float getValorCarrito() {
		float valorTotalCarritoCarrito = 0f;
		for (T producto : listaCarrito) {
			valorTotalCarritoCarrito += producto.getPrecio();
		}
		return valorTotalCarritoCarrito;
	}

	public String getInformeCarrito() {
		String informeCarrito = "";
		for (T producto : listaCarrito) {
			informeCarrito += producto.toString() + "\n";
		}
		informeCarrito += "\tEl valor TOTAL del carrito es de : " + getValorCarrito() + " €";
		return informeCarrito;
		
	}
}
