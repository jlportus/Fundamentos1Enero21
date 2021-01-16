package com.app;

import java.util.*;

import com.acing.*;

public class App {

	// instanciando Productos
	static Producto refresco = new Producto(1, "12 latas de refresco", new Marca("CocaCola"), 6.01f);
	static Producto leche = new Producto(2, "Leche Semidesnatada 1 litro", new Marca("President"), 0.72f);
	static Producto dentifrico = new Producto(5, "Dentífrico", new Marca("Oral B"), 1.99f);
	static Producto agua = new Producto(8, "6 botellas 1,5 litro", new Marca("Font Vella"), 2.99f);

	private final Collection<Producto> CARRO_FINAL = Arrays.asList(
			refresco, leche, dentifrico, agua);

	public static void main(String[] args) {

		// ejercicio 2
		Carrito carroCompra = new Carrito();
		System.out.println("Ejercicio 2");

		// Ejercicio 3
		System.out.println("\nEjercicio 3");

		// ejercicio 4
		System.out.println("\nEjercicio 4");
		carroCompra.addProducto(refresco);
		carroCompra.addProducto(leche);
		carroCompra.getListaCarrito().forEach(System.out::println);

		// ejercicio 5
		System.out.println("\nEjercicio 5");
		System.out.println("\nEjercicio 5.1");
		System.out.println(carroCompra.getValorCarrito());
		System.out.println("\nEjercicio 5.2");
		System.out.println(carroCompra.getInformeCarrito());
		System.out.println("\nEjercicio 5.3");
		carroCompra.addProducto(dentifrico);
		System.out.println(carroCompra.getInformeCarrito());

		// ejercicio 6
		System.out.println("\nEjercicio 6");
		carroCompra.addProducto(new ProductoExterno("Crime & Punishment", 0.46));
		System.out.println(carroCompra.getInformeCarrito());
		
		// ejercicio 7
		System.out.println("\nEjercicio 7\nAñadido antes del main la collection de productos");

				
	}

}
