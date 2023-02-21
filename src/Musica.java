public class Musica extends Producto{

	private String artista;

	public Musica() { }
	public Musica(String nombre, double precioUnit, int cantStock, boolean disponible, String artista) {
		super(nombre, precioUnit, cantStock, disponible);
		this.artista = artista;
	}

	@Override
	public String toString() {
		return  "ARTICULO MUSICAL"+"\n"+
				super.toString()+
				"Genero: "  +this.artista;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
}
