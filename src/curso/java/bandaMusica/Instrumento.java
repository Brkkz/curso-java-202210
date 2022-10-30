package curso.java.bandaMusica;

import curso.java.funciones.Utils;

public class Instrumento {
	private String nombre;
	private String tipo;
	private String marca;
	private boolean afinado;
	
	public Instrumento(String nombre, String tipo, String marca) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	public boolean isAfinado() {
		return afinado;
	}

	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}

	public boolean afinar() {
		if(Utils.tirarDado(10)<8) {
			System.out.println("El instrumento "+this.nombre+" no esta afinado");
			this.afinado=false;
		}else{
			System.out.println("El instrumento "+this.nombre+" esta afinado completamente");
			this.afinado=true;
		}
		return afinado;
	}
	
	public void tocar() {
		afinar();
		if(!isAfinado()) {
			System.out.println("El instrumento "+this.nombre+" esta sonando mal");
		}else {
			System.out.println("El instrumento "+this.nombre+" esta sonando perfectamente");
		}
	}
}
