package curso.java.inicio;

import java.util.Scanner;

public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expression = "";
		boolean seguir = true;
		Scanner sc = new Scanner(System.in);
		
		while(seguir != false) {
		//..............................................
				System.out.println("\n Menu: \n" );
				System.out.println("1. Pintar cuadrado");
				System.out.println("2. Validar Email");
				System.out.println("3. Serie Fibonacci");
				System.out.println("4. Insertar Nombres");
				System.out.println("5. Salir \n");
		//..............................................
		
				System.out.print("Que opcion deseas: ");
				expression = sc.nextLine();
		
				int otro = Integer.valueOf(expression);
				
				if(otro > 5) {
					System.out.println("Numero equivocado \n");
				} else { 
					System.out.println("\n");
				}
				
			switch (expression) { 
		    case "1":
		    	
		    	System.out.print("Introduce tamaño del cuadrado: ");
		    	Scanner scan = new Scanner(System.in);
		    	int tamanio = scan.nextInt();
		    	
		    	for(int fila=0; fila < tamanio ; fila++) {
		    		for(int columna=0; columna < tamanio; columna++) {
		    			if(fila==0 || fila == tamanio-1 || columna==0 || columna == tamanio-1) 
		    				System.out.print("*");
		    			else 
		    				System.out.print(" ");
		    			
		    		}
		    		System.out.println();
		    	}
		    	
		    	break;
		    case "2":
		    	
		    	boolean comprobar = true, contpunto = false;
		    	int contador, contar = 0, contfin = 0;
		    	
		    	while(comprobar !=false) {
			    	comprobar = true;
			    	contador = 0;
			    	
			    	System.out.print("introduce un email: ");
					String email = sc.nextLine();
			    	email = email.replaceAll("\\s", "");
			    	//System.out.println(email);
			    	
			    	//ENCONTRAR EL @
			    	for (var i=0; i<email.length(); i++) {
			    	    //System.out.println(email.charAt(i));
			    	    String arroba=String.valueOf(email.charAt(i));  
			    	     
			    		if(arroba.equals("@")) {
			    			contador++;
			    			contar=i;
			    			//System.out.println(contador);
			    			//System.out.println(contar);
			    			
			    			
			    		}    
			    	}
			    	
			    	//COMPROBAR QUE TIENE UN SOLO @
			    	if(contador > 1 || contador == 0) {
		    	    	System.out.println("El email tiene que tener un @ solamente");
		    	    } else {
		    	//System.out.println("funciona");
		    	    	//ENCONTRAR EL PUNTO
				    	for (var u=contar+1; u<email.length(); u++) {
	
				    		String punto=String.valueOf(email.charAt(u));
				    		contar++;
				    		//System.out.println(contar);
				    		if(punto.equals(".")) {
				    			contpunto = true;
				    			contfin = contar;
				    		}
				    	}
				    	//COMPROBAR QUE HAY UN PUNTO
				    	if (contpunto == true) {
				    		contador=0;
				    		//System.out.println(contfin);
				    		for (var i=contfin; i<email.length(); i++) {
				    			contador++;
				    			//System.out.println(contador);
					    	}
				    		//COMPROBAR QE HAY ENTRE 2 Y 6 CARACTERES
				    		if(contador > 2 && contador < 6) {
				    			System.out.println("El correo es apto");
				    			comprobar = false;
				    		}else {
				    			System.out.println("Despues del punto tiene que haber entre 2 y 6 caracteres");	
				    		}
				    	} else {
				    		System.out.println("El email tiene que contener un punto");
				    	}
		    	    }
		    	}
		    	
		    	break;
		    	
		    case "3":
		    	
		    	int f1=1, f2=1, numero2;
		    	System.out.print("Cuantos numeros de Fibonacci quieres mostrar: \n");
				String respuesta = sc.nextLine();
				int numero = Integer.valueOf(respuesta);
				System.out.print(f2 + " ");
				for(int i=2;i<=numero;i++){
		            System.out.print(f2 + " ");
		            f2 = f1 + f2;
		            f1 = f2 - f1;
		        }
		    	break;
		    	
		    case "4":

		    	int nalumnos=0;
		    	System.out.print("Cuantos alumnos hay en clase: \n");
				nalumnos = sc.nextInt();
				sc.nextLine();
				
				String [] alumnos = new String[nalumnos+1];
				
				for (int i=0; i < nalumnos; i++) {
					System.out.print("Indicame el nombre del alumno: ");
					String nomalum = sc.nextLine();
					alumnos[i] = nomalum;
				}
				
				for(int i=0;i<alumnos.length;i++)
		        {
					if(alumnos[i] != null) {
						System.out.println(alumnos[i]);
					} 
		        }
		    	break;

		    case "5":
		    	
		    	seguir = false;
		    	System.out.println("Saliste del programa");
		    	break;

			}
		}	
	}

}
