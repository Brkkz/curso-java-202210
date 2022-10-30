package curso.java.inicio;

import java.util.Random;

import curso.java.funciones.Utils;

public class EjercicioDados {

	public static void main(String[] args) {
		
		int[] resLanzamiento = lanzamiento ();
		int contadorLanzamiento=0, lanzamientoMenor=resLanzamiento[0], 
				lanzamientoMayor=resLanzamiento[0], mediaLanzamientos=0;
		
		System.out.println("¿Cuantas veces quieres tirar el dado?");
		for (int i = 0; i < resLanzamiento.length; i++) {
			contadorLanzamiento++;
			System.out.println("La tirada nº "+contadorLanzamiento+" tiene como valor: "+resLanzamiento[i]);
			lanzamientoMenor = Math.min(lanzamientoMenor, resLanzamiento[i]);
			lanzamientoMayor = Math.max(lanzamientoMayor, resLanzamiento[i]);
			mediaLanzamientos += resLanzamiento[i];
		}
		
		System.out.println("\nEl lanzamiento con el menor numero es: "+lanzamientoMenor);
		System.out.println("El lanzamiento con el mayor numero es: "+lanzamientoMayor);
		mediaLanzamientos /= contadorLanzamiento;
		System.out.println("La media de los lanzamientos es: "+mediaLanzamientos);
	}
	
	/**
	 * Metodo para simular el lanzamiento
	 * @return
	 */
	
	static int[] lanzamiento() {
		
		int lanzamientos = Integer.parseInt(Utils.pideValor());
		int[] resultados = new int[lanzamientos]; //Se tiran tres dados
		
			for(int i=0; i<lanzamientos; i++) {
				resultados[i] = (int)(Math.random()*6 + 1); 
			} 

			return resultados;
	}

}
