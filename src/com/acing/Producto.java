package com.acing;

public class Producto {

	private String descripcionProducto;
	private int id;
	private String marca;
	private float precio;

	public String getNombreProducto() {
		return descripcionProducto;
	}

	public Producto(int id, String descripcionProducto, String marca, float precio) {
		this.id = id;
		this.descripcionProducto = descripcionProducto;
		this.marca = marca;
		this.precio = precio;
	}

	public Producto(String descripcionProducto, String marca, float precio) {
		this(-1, descripcionProducto, marca, precio);
	}

	public Producto(String descripcionProducto, float precio) {
		this(-1, descripcionProducto, "Sin marca", precio);
	}

	public Producto() {
		this(-1, "Sin descripcion", "Sin marca", -1);
	}

	@Override
	public String toString() {
		return id + "\t" + descripcionProducto + " - " + marca + "\t" + precio;
	}

}
