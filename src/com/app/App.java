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

		/*
		 * Vamos crear algunas partes del código de una aplicación de compras.
		 * 
		 * Los productos que se usarán para las pruebas son: El usuario en la versión
		 * final podrá ir añadiéndolos de un catálogo mayor, pero para la prueba se van
		 * a instanciar estos cuatro al inicio de la ejecución en el main.
		 */

		// ejercicio 0
		// 1. hacer un fork del repositorio a repositorio propio desde github
		// 2. cambiar la visibilidad a privado
		// 3. iniciar git en la carpeta local, hacer git clone al repositorioi forkeado,
		// comprobar el gitignore(coopiar de otro repositorio si ni esta)
		// 4. importar proyecyo git con eclipse
		// -- para el control de cambios y hacer los push, se puede usar gitEclipse o
		// VSCode
		// --al abrir comprobar que estan los datos de la clase externa

		// ejercicio 1 -
		// (2 puntos) Todos los tipos que implemente pertenecerán al
		// paquete com.acing excepto el que contenga el main que estará en la clase
		// com.app.App.

		/*
		 * 1. crear paquete en src -> acing 2. crear paquete en src -> app 3. crear
		 * clase con main en src.app -> App ¿commit "Inicio examen" push? para ver que
		 * todo va
		 */

		// ejercicio 2
		// (2) Crear una clase que sirva de carrito de la compra llamada
		// Carrito donde se podrán consultar los productos cargados mediante el método
		// addProducto(T). Debe elegir y crear un tipo apropiado para T, no se pide que
		// sea genérico. Este método devolverá true si se ha cargado y false si no. App
		// debe tener una variable de instancia de tipo Carrito para controlar la
		// compra.

		/*
		 * 2.1. crear en src.acing clase Carrito - el carrito debe poder almacenar
		 * Productos -> en una variable tipo Collection<Productos>
		 */

		/*
		 * 2.2. me dara un error en los productos -> crear la clase productos
		 */
		/*
		 * 2.3. crear en carrito el metodo boolean addProducto(Producto), pide que
		 * devuelva un booleano y le paso un Producto. El metodo de Collection.add() si
		 * se ejecuta, se acepta como un booleano
		 */
		/*
		 * 2.4. en el main creo una variable de tipo carrito. debo crear el constructor
		 * en carrito que cree una nueva array lista y la asigne a mi variable de lista
		 * de compra. Si lo intento imprimir me saldra una cosa rara -> hago
		 * un @toString con listaCarrito.toString pero debo hacer tambien la clase
		 * Producto...sigo leyendo el examen
		 */

		Carrito carroCompra = new Carrito();
		System.out.println("Ejercicio 2");

		// Ejercicio 3
		/*
		 * (3 un punto cada subapartado) Crear un tipo para manejar los datos de un
		 * producto teniendo en cuenta las siguientes consideraciones:
		 * 
		 * En un futuro se quiere poder trabajar con la marca del producto para filtrar
		 * datos o hacer descuentos. El constructor de este tipo tendrá una sobrecarga
		 * con id y otra sin id, pero uno de ellos aprovechará el código del otro.
		 * También tendrá constructor por defecto y no podrán modificarse sus atributos.
		 * El método toString() devolverá un texto como el de la tabla (Descripción -
		 * Marca).
		 * 
		 */

		// 3.1. Voy a la clase Producto le pongo los atributos, id, desripcion, Marca,
		// precio
		// 3.2 creo el constructor con todos los atributos
		// -> creo el resto de constructores haciendo llamadas recursivas al que este
		// menos completo (aprovecho codigo) y
		// asignado a huevo los valores que desconozco con valores tipo "Sin precio..."
		// -> el por defecto, es el que no le paso parametros Producto()
		// 3.3 hago el @toString y le doy formato para que salga como en la pagina
		// 3.4 en el main creo los productos (los saco fuera del main luego porque el lo
		// hace en la solucion...), y los imprimo a ver que sale

		System.out.println("\nEjercicio 3");

		// ejercicio 4

		/*
		 * (1) Con la clase recién creada añada los dos primeros productos de pruebas al
		 * carrito de la compra.
		 * 
		 */

		// 4.1 pruebo el metodo addToCarrito y lo imprimo con el forEach que me va bien
		// para las listas de collections
		// para no acceder directamente a la listaCarrito me creo en Carrito un getter
		// para la lista(deberian estar en private)

		System.out.println("\nEjercicio 4");
		carroCompra.addProducto(refresco);
		carroCompra.addProducto(leche);
		carroCompra.getListaCarrito().forEach(System.out::println);

		// ejercicio 5

		/*
		 * (8 contando los 6 de los subapartados) En un futuro se incorporarán servicios
		 * de distintos proveedores de productos y sus propias librerías para incorporar
		 * los productos suministrados. Estas librerías serán fáciles de utilizar con
		 * los tipos de nuestra aplicación y todos tendrán un método getDescripcion() y
		 * getPrecio(). Cree los tipos necesarios para tener esta flexibilidad que se
		 * pide y que no haya que modificar nuestro código ya implementado.
		 * 
		 * (2) Esos métodos servirán para que se pueda conocer el valor total del
		 * carrito con los productos escogidos. El método a utilizar se llamará
		 * getValorCarrito() que pertenecerá a la clase Carrito. (3) Carrito tendrá otro
		 * método llamado getInformeCarrito() que: Devolverá un String con un listado de
		 * los productos Cada producto en una línea y con su precio Ordenados por precio
		 * de menor a mayor En la última línea el valor total con una tabulación al
		 * principio. (1) Se añadirá otro de los productos y se comprobará que los
		 * retornos se actualizaron correctamente.
		 */

		// agarrate que vienen curvas, si te dice de incoporar codigo externo, aqui hay
		// que meter interfaces.
		// mi truco es:
		// a)de la clase externa hacer una clase propia que herede de la clase externa
		// (extends)
		// y crearla para que me deje trastearla en mi codigo para que pueda hacer a mi
		// gusto el constructor y el toString. le implemento tambien las interfaces para
		// que sea compatible
		// b) hacer la interfaz que tenga los metodos que me dice que me proporciona la
		// clase externa, implementarlos en mi clase Producto ->me obliga a crear los
		// metodos y le asigno de mi clase propia los atributos que tienen informacion
		// relacionada getPriceExterno -> return getPrecioMIO
		//
		// con esto ya si creo alguna variable de Tipo Interfaz, puedo meter cualquier
		// cosa que tenga la interfaz, por ejemplo addToCarrito , lo puedo modificar
		// para que en lugar de coger un Producto, acepte algo que tenga
		// precio(Interface Preciable), mientras use los metodos que dice la interfaz no
		// me va a dar pega

		// 5.1 yo hago dos interfaces Descriptible y Preciable, él hace solo una...para
		// gustos...
		// 5.2 hago el metodo getValorCarrito para que recorra la listaDelCarrito y de
		// cada uno me haga el getPrecio y los vaya acumulando (un for mejorado). Aqui,
		// luego me paso a usar genericos que les marco que cumplan con las interfaces
		// (antes tenia Productos a secas pero para que funcione con los externos debe
		// terner las interfaces),
		// mientras, él usa variables de tipo interfaz por lo que decia antes
		// 5.3 el informe del carrito es un metodo que recorre la listaDelCarrito con un
		// for mejorado y lo imprime y en la ultima linea le mete el valor total con el
		// getValorCarrito

		// me acabo de dar cuenta que me pide que lo ordene por precio...lo hare despues
		// y lo resubire...

		// 5.4 añado otro producto con el .add y lo vuelvo a imprimir todo

		System.out.println("\nEjercicio 5");
		System.out.println("\nEjercicio 5.1");
		System.out.println(carroCompra.getValorCarrito());
		System.out.println("\nEjercicio 5.2");
		System.out.println(carroCompra.getInformeCarrito());
		System.out.println("\nEjercicio 5.3");
		carroCompra.addProducto(dentifrico);
		System.out.println(carroCompra.getInformeCarrito());

		// ejercicio 6

		/*
		 * (2) Compruebe que su diseño funciona con una librería externa incorporando la
		 * clase com.examen.Product3rdParty para añadir el producto “Crime & Punishment”
		 * con precio de 0,46€.
		 */

		// aqui hago todo el lio de los cambios para que acepte interfaces, basicamente
		// donde habia un producto, pongo algo generico que implemente las interfaces,
		// aunque se puede hacer con que sea con un Tipo que sea de interfaz como hace
		// él
		// añado el producto a la vez que lo creo y lo imprimo

		System.out.println("\nEjercicio 6");
		carroCompra.addProducto(new ProductoExterno("Crime & Punishment", 0.46));
		System.out.println(carroCompra.getInformeCarrito());

		// ejercicio 7

		/*
		 * (1) Si no lo ha hecho ya, añada en App todos los productos a una Collection
		 * en una variable de clase inmutable y que sólo se vea en la clase App.
		 */

		// aqui lo saco todo a antes del main y los pongo static y private y creo una
		// variable de tipo collection (porque él lo hace parecido)

		System.out.println("\nEjercicio 7\nAñadido antes del main la collection de productos");

		// ejercicio 8

		/*
		 * (3) App tendrá un almacén con las siguientes existencias:
		 * 
		 * ID 1: 8 ID 2: 3 ID 5: 0 ID 8: 1
		 * 
		 * El control de existencias será implementado con Arrays, pero al tamaño del
		 * array se creará con los huecos necesarios para tener desde el ID 1 hasta el
		 * mayor que haya en la colección de productos del punto anterior sin “magic
		 * numbers”. Para conseguir el máximo ID, haga un método privado, estático y
		 * genérico que devuelva el máximo ID en una Collection<T>, pasada como
		 * argumento, de un tipo T que sólo tenga un método: getId().
		 */

		// para hacer el almacen Productos[] necesito al crearlo un metodo que me diga
		// el maximo ID y que me lo cree del tamaño correcto (los arrays son inmutables
		// en tamaño al crearlos)

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

		// añadir comentarios
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
		try { // esto no tengo muy claro que sea asi
			if (almacen[producto.getId() - 1] == 0) {
				System.out.println("No hay existencias de [" + producto.getDescripcion() + "]");
			} else {
				almacen[producto.getId() - 1] -= 1;
				System.out.println(
						"Quedan " + almacen[producto.getId() - 1] + " unidades de [" + producto.getDescripcion() + "]");
			}

		} catch (Exception e) {
			System.err.println("Ocurrió un error al añadir [" + producto.getDescripcion() + "]");
		}

	}
}
