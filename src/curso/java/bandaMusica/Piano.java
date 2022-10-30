package curso.java.bandaMusica;

public class Piano extends Instrumento{

	public Piano(String nombre, String tipo, String marca) {
		super(nombre, tipo, marca);
		// TODO Auto-generated constructor stub
	}

	private int numOctavas;
	private int numPedales;
	public Piano(String nombre, String tipo, String marca, int numOctavas, int numPedales) {
		super(nombre, tipo, marca);
		this.numOctavas = numOctavas;
		this.numPedales = numPedales;
	}
	public int getNumOctavas() {
		return numOctavas;
	}
	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}
	public int getNumPedales() {
		return numPedales;
	}
	public void setNumPedales(int numPedales) {
		this.numPedales = numPedales;
	}
	
}
