package curso.java.bandaMusica;

import curso.java.bandaMusica.Instrumento;


public class BandaMusica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BandaMusica banda = new BandaMusica();
		banda.crearInstrumentos();
		
	}
	
	public void crearInstrumentos() {
		Instrumento arrayObjetos[] = new Instrumento[4];
		
		Guitarra guitarra = new Guitarra("guitarraEsp", "guitarra", "sony", 8, "madera");
		GuitarraElectrica electrica = new GuitarraElectrica("guitarraElc", "guitarraElectrica", "sony", 10, "Fibra de carbono", 2.0);
		Bateria bateria = new Bateria("bateria1", "bateria", "Beat", 4, 1);
		Piano piano = new Piano("Piano percutido", "piano", "Caset", 8, 1);
		
		arrayObjetos[0] = guitarra;
		arrayObjetos[1] = electrica;
		arrayObjetos[2] = bateria;
		arrayObjetos[3] = piano;

		for(int i=0; i<arrayObjetos.length;i++) {
			System.out.println();
			arrayObjetos[i].tocar();
			if(arrayObjetos[i] instanceof Bateria) {
				bateria.aporrear();
			}
			
		}
	}
}
