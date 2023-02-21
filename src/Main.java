
import leer.Leer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Bienvenido a la tienda de JUEGOS, MÚSICA Y PELÍCULAS"+ "\n" +
				"El usuario puede:"+"\n"+
				"Comprar productos existentes"+"\n"+
				"Añadir nuevos productos a la cesta."+"\n"+
				"Consultar el saldo total de la cuenta.");

		boolean continuar = true;
		int lecturaProducto, lecturaCantidad; //Variables para seleccionar el producto y la cantidad que se quiere comprar

		//Se instancian y cargan los productos
		Producto disco1 = new Musica("Portishead", 22.300 , 6 , true, "Trip Hop");
		Producto disco2 = new Musica("Radiohead", 17.100 , 20 , true, "Rock");
		Producto cine1  = new Cine("Hierro 3", 15.350, 5, true, "Kim Ki Duk");
		Producto juego1 = new Videojuego("Mario Bross", 35.500, 0, false, "Nintendo");
		Producto juego2 = new Videojuego("Crash", 32.700, 4, true, "EA Sports");

		//Se crea el array "catálogo" para contener los productos. Su dimensión viene del número de veces que se
		//instancia el contructor de Producto
		Producto catalogo[] = new Producto[Producto.dimesionArray];
		//Se crea el objeto gestion para trabajar (mostrar y vender productos, y mostrar caja)
		Gestion gestion = new Gestion();

		//Se rellena el array catálogo
		catalogo[0] = disco1;
		catalogo[1] = disco2;
		catalogo[2] = cine1;
		catalogo[3] = juego1;
		catalogo[4] = juego2;

		do {
			System.out.println("Introduzca la opción que desea realizar:"+"\n"
					+"1. Productos Disponibles"+"\n"
					+"2. Comprar Producto"+"\n"
					+"3. Ver el valor total de la compra"+"\n"
					+"SALIR --> Pulse cualquier otro númeron"
			);
			switch (Leer.datoInt()) {
				case 1:
					gestion.mostrarProductos(catalogo);
					break;
				case 2:
					System.out.println("¿Que producto desea comprar?");
					gestion.mostrarNombreProductos(catalogo);

					lecturaProducto= Leer.datoInt();
					System.out.println("¿Cuánta cantidad desea comprar?");
					lecturaCantidad= leer.Leer.datoInt();
					//Se carga el producto y la cantidad solicitada por el usuario
					gestion.comprarProducto(catalogo, lecturaProducto, lecturaCantidad);
					break;
				case 3:
					System.out.println(gestion.mostrarCaja() +" $");
					break;
				default:
					//Se sale del programa
					continuar=false;
			}

		} while(continuar);

		System.out.println("---- Gracias por usar la aplicación. ----");

	}
}
