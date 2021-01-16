package com.acing;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private List<Producto> listaCarrito;

	public List<Producto> getListaCarrito() {
		return listaCarrito;
	}
	
	public Carrito() {
		this.listaCarrito = new ArrayList<Producto>();
	}

	public boolean addProducto(Producto producto) {
		return listaCarrito.add(producto);
	}
	
	@Override
	public String toString() {
		
		return listaCarrito.toString();
	}

}
