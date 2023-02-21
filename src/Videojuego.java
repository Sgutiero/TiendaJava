public class Videojuego extends Producto{

	private String Compañia;

	//Constructor
	public Videojuego() { }
	public Videojuego(String nombre, double precioUnit, int cantStock, boolean disponible, String Compañia) {
		super(nombre, precioUnit, cantStock, disponible);
		this.Compañia = Compañia;
	}


	//Methods
	@Override
	public String toString() {
		return  "VIDEO JUEGO"+"\n"+
				super.toString()+
				"Compañía: "  +this.Compañia;
	}

	public String Compañia() {
		return Compañia;
	}

	public void setNombreDelJuego(String Compañia) {
		Compañia = Compañia;
	}
}
