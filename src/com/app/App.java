package com.app;

import com.acing.Carrito;
import com.acing.Marca;
import com.acing.Producto;

public class App {

	public static void main(String[] args) {

		//instanciando Productos
		Producto refresco = new Producto(1, "12 latas de refresco", new Marca("CocaCola"), 6.01f);
		Producto leche = new Producto(2, "Leche Semidesnatada 1 litro", new Marca("President"), 0.72f);
		Producto dentifrico = new Producto(5, "Dentífrico", new Marca("Oral B"), 1.99f);
		Producto agua = new Producto(8, "6 botellas 1,5 litro", new Marca("Font Vella"), 2.99f);
		
		//ejercicio 2
		Carrito carroCompra = new Carrito();
		System.out.println("Ejercicio 2");
		System.out.println(carroCompra);
		
		
		//Ejercicio 3
		
	}

}
