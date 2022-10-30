package curso.java.inicio;

import java.util.Iterator;

import curso.java.funciones.Utils;

public class Ejercicio2Colegio {
	
	private static final String BUSCAR="buscar";
	private static final String BORRAR="borrar";
	private static final String MOSTRAR="mostrar";
	private static final String INSERTAR="insertar";
	private static final String ALUMNOS="alumnos";
	private static final String PLAZAS="plazas";

	public static void main(String[] args) {
		
		int numAulas = Integer.parseInt(Utils.pideValor("Introduce numero de aulas"));
		String [][] colegio = new String [numAulas][];
		for(int i=0; i<numAulas; i++) {
			int numAlumnos = Integer.parseInt(Utils.pideValor("Cuantos alumnos caben en el aula"+(i+1)+"?"));
			colegio[i] = new String [numAlumnos];
		}
			
		int opcion=0;
		do {
			String [] menu = {"1. Insertar alumno por aula","2. Buscar alumno",
					"3. Borrar Alumno","4. Mostrar Alumnos por Aula","5. Mostrar Alumnos", 
					"6. Mostrar plazas libres de todas las aulas", "7. Salir"};
			Utils.pintaMenu(menu);
			
			opcion = Integer.parseInt(Utils.pideValor("Introduce una opcion:"));
			
			switch(opcion) {
			//INSERTAR ALUMNO POR AULA
			case 1:
				gestionAlumnos(colegio, INSERTAR);
				break;
			case 2:
				operarSobreAlumno(colegio, BUSCAR);
				break;
			case 3:
				operarSobreAlumno(colegio, BORRAR);
				break;
			case 4:
				gestionAlumnos(colegio, MOSTRAR);
				break;
			case 5:
				mostrarColegio(colegio, ALUMNOS);
				break;
			case 6:
				mostrarColegio(colegio, PLAZAS);
				break;
			case 7:
				System.out.println("Adios");
				break;
			}
		} while(opcion!=7);
	}
	
	static void mostrarColegio(String [][] colegio, String accion) {
		int contadorAula=0;
		for (String[] aula: colegio) {
			contadorAula++;
			System.out.println("Aula "+contadorAula);
			int contadorAlumnos=0;
			for(String alumno : aula) {
				if(accion.equals(ALUMNOS)) {
					System.out.println("\tAlumno: "+alumno!=null?alumno:"");
				}else if(accion.equals(PLAZAS)) {
					contadorAlumnos++;
					if(alumno==null) {
						System.out.println("Plaza "+contadorAlumnos+" del aula "+contadorAula+" esta libre");
					}
				}
				
			}
		}
	}
	
	
	static void gestionAlumnos(String [][] colegio, String accion) {
		int aula=0;
		boolean aulaCorrecta= true;
		do {
			aula= Integer.parseInt(Utils.pideValor("En que aula quieres meter al alumno"));
			aulaCorrecta = validaAula(aula, colegio);
			if(!aulaCorrecta) {
				System.out.println("El aula introducida no existe");
			}else {
				String [] aulaSeleccionada = colegio[aula-1];
				boolean aulaCompleta=true;
				for(int i = 0; i <aulaSeleccionada.length; i++) {
					if(aulaSeleccionada[i] == null) {
						if(accion.equals(INSERTAR)) {
							aulaSeleccionada[i]=Utils.pideValor("Cual es el nombre del alumno"+(i+1));
						}
						aulaCompleta=false;
						break;
					}else {
						if(accion.equals(MOSTRAR)) {
							System.out.println("Alumno "+aulaSeleccionada[i]);
						}
					}
				}
				if(aulaCompleta) {
					System.out.println("El aula esta llena");
				}
			}
		}while(!aulaCorrecta);
	}
	
	/**
	 * Funcion para operar sobre un alumno--
	 * @param colegio
	 * @param accion
	 */
	static void operarSobreAlumno(String [][] colegio, String accion) {
		String nombreABorrar = Utils.pideValor("Introduce nombre del alumno para "+accion);
		boolean alumnoEncontrado = false;
		for (int i = 0; i < colegio.length; i++) { //filas
			for (int j = 0; j < colegio[i].length; j++) { //columnas
				String nombreAlumno = colegio[i][j];
				if(nombreAlumno != null && nombreAlumno.equals(nombreABorrar)) {
					if(accion.equals("buscar")) {
						System.out.println("Alumno encontrado en el aula "+(i+1));
					}else if(accion.equals("borrar")) {
						colegio[i][j]=null;
					}
					//Establezco los valores de i y j para que se cumplan las condiciones del bucle y se salga.						
					j=colegio[i].length;
					i=colegio.length-1;
				}
			}
		}
		if(!alumnoEncontrado) {
			System.out.println("El alumno "+nombreABorrar+" no se encuentra en el colegio");
		}
	}

	/**
	 * Funcion para buscar un alumno en concreto
	 * @param colegio
	 */
	static void buscarAlumno(String [][] colegio){
		String nombreABuscar = Utils.pideValor("Introduce el nombre del alumno a buscar");

		int contadorAula=0;
		boolean alumnoEncontrado = false;
		for (String[] aula : colegio) {
			contadorAula++;
			for (String alumno : aula) {
				if(alumno !=null && alumno.equals(nombreABuscar)) {
					System.out.println("Alumno encontrado"+ contadorAula);
					alumnoEncontrado = true;
					break;
				}                      
			}
			if(alumnoEncontrado) {
				break;
			}
		}
		if(!alumnoEncontrado) {
			System.out.println("El alumno "+nombreABuscar+" no esta en el colegio");
		}
	}
	
	/**
	 * Funcion para borrar un alumno
	 */
	static void borrarAlumno(String [][] colegio) {
		String nombreABorrar = Utils.pideValor("Introduce nombre del alumno a borrar");
		boolean alumnoEncontrado = false;
		for (int i = 0; i < colegio.length; i++) { //filas
			for (int j = 0; j < colegio[i].length; j++) { //columnas
				String nombreAlumno = colegio[i][j];
				if(nombreAlumno != null && nombreAlumno.equals(nombreABorrar)) {}
					colegio [i][j] =null;
					//Establezco los valores de i y j para que se cumplan las condiciones del bucle y se salga.						
					j=colegio[i].length;
					i=colegio.length;
			}
		}
		if(!alumnoEncontrado) {
			System.out.println("El alumno "+nombreABorrar+" no se encuentra en el colegio");
		}
	}

	/**
	 * Funcion para saber si existe un aula
	 * @param aula
	 * @param colegio
	 * @return
	 */
	static boolean validaAula (int aula, String [][] colegio) {
		return aula <= colegio.length && aula>0;
	}
}
