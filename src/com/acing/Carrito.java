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
	


}
