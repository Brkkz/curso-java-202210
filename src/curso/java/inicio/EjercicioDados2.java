package curso.java.inicio;

import java.util.Arrays;

public class EjercicioDados2 {

	public static void main(String[] args) {
		
		int[] dado1 = new int[5]; //Se tira 5 veces
		int[] dado2 = new int[5]; //Se tira 5 veces
		int[] resultadoSuma = new int[5];
		int mediaTiradas=0, tiradaAlta=0, contadorPrueba=1;
		
		for(int i=0; i<5; i++) {
			dado1[i] = (int)(Math.random()*6 + 1); 
			dado2[i] = (int)(Math.random()*6 + 1);
			resultadoSuma[i] = dado1[i]+dado2[i];
			tiradaAlta = Math.max(tiradaAlta, resultadoSuma[i]);
			if(tiradaAlta < resultadoSuma[i]) {
				contadorPrueba=i;
			}else if(tiradaAlta == resultadoSuma[i]){
				contadorPrueba--;
			}
			mediaTiradas += dado1[i];
			mediaTiradas += dado2[i];
		} 
		
		mediaTiradas /= 10;
		System.out.print("El resultado de las 5 tiradas del primer dado es: "+Arrays.toString(dado1)+"\n");
		System.out.print("El resultado de las 5 tiradas del segundo dado es: "+Arrays.toString(dado2)+"\n");
		System.out.print("La suma de ambos dados en las 5 tiradas es: "+Arrays.toString(resultadoSuma)+"\n");
		System.out.print("La tirada mas alta es: "+tiradaAlta+" en la tirada: "+contadorPrueba+"\n");
		System.out.print("La media de las tiradas totales es: "+mediaTiradas);
		
	}

}
