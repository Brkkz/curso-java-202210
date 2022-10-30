package curso.java.bandaMusica;

public class Bateria extends Instrumento{

	public Bateria(String nombre, String tipo, String marca) {
		super(nombre, tipo, marca);
		// TODO Auto-generated constructor stub
	}
	
	private int numTimbales;
	private int numPlatos;
	
	public Bateria(String nombre, String tipo, String marca, int numTimbales, int numPlatos) {
		super(nombre, tipo, marca);
		this.numTimbales = numTimbales;
		this.numPlatos = numPlatos;
	}

	public int getNumTimbales() {
		return numTimbales;
	}

	public void setNumTimbales(int numTimbales) {
		this.numTimbales = numTimbales;
	}

	public int getNumPlatos() {
		return numPlatos;
	}

	public void setNumPlatos(int numPlatos) {
		this.numPlatos = numPlatos;
	}
	
	public void aporrear(){
		System.out.println("Se esta aporreando la bateria "+this.getNombre());
	}
}
