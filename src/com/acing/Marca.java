package com.acing;

public class Marca {

	private String nombreMarca;

	public String getNombreMarca() {
		return nombreMarca;
	}

	public Marca(String nombreMarca) {
		this.nombreMarca = nombreMarca;
	}

	public Marca() {
		this("Sin marca");
	}
	
	@Override
	public String toString() {
		return getNombreMarca();
	}
}
