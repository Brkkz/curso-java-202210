package curso.java.bandaMusica;

public class GuitarraElectrica extends Guitarra{

	public GuitarraElectrica(String nombre, String tipo, String marca, int numCuerdas, String material) {
		super(nombre, tipo, marca, numCuerdas, material);
		// TODO Auto-generated constructor stub
	}


	private double potencia;


	


	public GuitarraElectrica(String nombre, String tipo, String marca, int numCuerdas, String material,
			double potencia) {
		super(nombre, tipo, marca, numCuerdas, material);
		this.potencia = potencia;
	}


	public double getPotencia() {
		return potencia;
	}


	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}


	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		super.tocar();
		
		if(!isAfinado()) {
			System.out.println("electrica mal con la potencia "+this.potencia);
		}else {
			System.out.println("electrica bien con la potencia "+this.potencia);
		}
	}
	
	
}
