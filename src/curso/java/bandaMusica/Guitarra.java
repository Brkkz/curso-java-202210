package curso.java.bandaMusica;

public class Guitarra extends Instrumento{
	

	public Guitarra(String nombre, String tipo, String marca) {
		super(nombre, tipo, marca);
		// TODO Auto-generated constructor stub
	}

	private int numCuerdas;
	private String material;
	
	public Guitarra(String nombre, String tipo, String marca, int numCuerdas, String material) {
		super(nombre, tipo, marca);
		this.numCuerdas = numCuerdas;
		this.material = material;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		afinar();
		if(!isAfinado()) {
			System.out.println("Se esta tocando la guitarra mal");
		}else {
			System.out.println("Se esta tocando la guitarra bien");
		}
	}
	
}
