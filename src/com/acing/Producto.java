package com.acing;

public class Producto {

	private String descripcionProducto;
	private int id;
	private Marca marca;
	private float precio;

	public Producto(int id, String descripcionProducto, Marca marca, float precio) {
		this.id = id;
		this.descripcionProducto = descripcionProducto;
		this.marca = marca;
		this.precio = precio;
	}

	public Producto(String descripcionProducto, Marca marca, float precio) {
		this(-1, descripcionProducto, marca, precio);
	}

	public Producto(String descripcionProducto, float precio) {
		this(-1, descripcionProducto, new Marca(), precio);
	}

	public Producto() {
		this( "Sin descripcion", -1);
	}

	@Override
	public String toString() {
		return id + "\t" + descripcionProducto + " - " + marca + "\t" + precio;
	}

}
