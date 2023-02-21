public class Gestion {

	//Attributes
	private Producto productos[] = null;
	private double caja;

	//Constructors
	public Gestion() { }
	public Gestion(Producto[] productos) {
		this.productos = productos;
	}

	//Methods
	public Producto[] cargarProductos() {

		return productos;
	}

	public void mostrarProductos(Producto[] productos) {
		for (int i = 0; i < productos.length; i++) {
			System.out.print(productos[i]+"\n"+"-------"+"\n");
		}
	}
	public void mostrarNombreProductos(Producto[] productos) {
		for (int i = 0; i < productos.length; i++) {
			System.out.println(i+1 +" "+productos[i].getNombre());
		}
		System.out.println("------------"+"\n");
	}
	public double comprarProducto(Producto[] productos, int num, int cantidadUnidades) {
		if (productos[num-1].isDisponible()) {
			if (productos[num-1].getCantStock() >= cantidadUnidades){
				System.out.println("La compra se ha realizado con éxito!!"+"\n");
				productos[num -1].setCantStock(productos[num -1].getCantStock()-cantidadUnidades);
				return caja+=cantidadUnidades*productos[num-1].getPrecioUnit();
			} else {System.out.println("No hay productos disponibles");}
		} else {System.out.println("No hay productos disponibles");}
		return caja;
	}
	public double mostrarCaja() {
		System.out.print("El total de su orden de compra es: ");
		caja=(caja*100);
		return caja/100;
	}
}

