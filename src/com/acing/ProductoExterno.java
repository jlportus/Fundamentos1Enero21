package com.acing;

import com.examen.Product3rdParty;

public class ProductoExterno extends Product3rdParty implements Descriptible, Preciable{

	public ProductoExterno(String description, double price) {
		super(description, price);
		
	}

	@Override
	public float getPrecio() {
		return (float) getPrice();
	}

	@Override
	public String getDescripcion() {
		return getDescription();
	}
	
	public String toString() {
		return "Sin ID" + "\t" + getDescripcion() + " - " + "Sin Marca" + "\t" + getPrecio();
	}
}
