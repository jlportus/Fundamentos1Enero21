package com.app;

import java.util.*;

import com.acing.*;

public class App {

	// instanciando Productos
	static Producto refresco = new Producto(1, "12 latas de refresco", new Marca("CocaCola"), 6.01f);
	static Producto leche = new Producto(2, "Leche Semidesnatada 1 litro", new Marca("President"), 0.72f);
	static Producto dentifrico = new Producto(5, "Dentífrico", new Marca("Oral B"), 1.99f);
	static Producto agua = new Producto(8, "6 botellas 1,5 litro", new Marca("Font Vella"), 2.99f);

	private final static Collection<Producto> CARRO_FINAL = Arrays.asList(refresco, leche, dentifrico, agua);

	static int[] almacen = new int[App.getMaxId(CARRO_FINAL)];
	
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

		// ejercicio 8
		System.out.println("\nEjercicio 8");
		
		System.out.println("Número de productos del almacen: " + almacen.length);
		// añado existencias
		añadirExistencias(almacen, 1, 8);
		añadirExistencias(almacen, 2, 3);
		añadirExistencias(almacen, 5, 0);
		añadirExistencias(almacen, 8, 1);
		System.out.println("Cantidad de cada producto del almacen:\n" + Arrays.toString(almacen));

		// ejercicio 9
		System.out.println("\nEjercicio 9");
		App.addToCarrito(dentifrico);
		App.addToCarrito(refresco);
		
		//añadir comentarios
	}

	private static <T extends Identificable> int getMaxId(Collection<T> coleccion) {
		int idMax = 0;
		for (T elemento : coleccion) {
			if (elemento.getId() > idMax) {
				idMax = elemento.getId();
			}
		}
		return idMax;
	}

	private static void añadirExistencias(int[] almacen, int id, int cantidad) {
		almacen[id - 1] = cantidad;
	}

	private static <T extends Identificable & Descriptible & Preciable> void addToCarrito(T producto) {
		try { //esto no tengo muy claro que sea asi
			if (almacen[producto.getId() - 1] == 0) {
				System.out.println("No hay existencias de [" + producto.getDescripcion() + "]");
			} else {
				almacen[producto.getId() - 1] -= 1;
				System.out.println("Quedan " + almacen[producto.getId() - 1] + " unidades de [" + producto.getDescripcion() + "]");
			}
			
		} catch (Exception e) {
			System.err.println("Ocurrió un error al añadir [" + producto.getDescripcion() + "]");
		}
		
	}
}
