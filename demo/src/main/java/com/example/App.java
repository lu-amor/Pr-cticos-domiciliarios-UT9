package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final int METODO_CLASIFICACION_INSERCION = 1;
    private static final int METODO_CLASIFICACION_SHELL = 2;
    private static final int METODO_CLASIFICACION_BURBUJA = 3;
    private static final int METODO_CLASIFICACION_QUICKSORT = 4;

    public static void main(String args[]) {
		TClasificador clasif = new TClasificador();
		GeneradorDatosGenericos gdg = new GeneradorDatosGenericos();
		int[] vectorAleatorio = gdg.generarDatosAleatorios();
		int[] vectorAleatorio2 = gdg.generarDatosAleatorios();
		int[] vectorAleatorio3 = gdg.generarDatosAleatorios();
		int[] vectorAleatorio4 = gdg.generarDatosAleatorios();

		int[] resAleatorio = clasif.clasificar(vectorAleatorio, METODO_CLASIFICACION_INSERCION, true);
		for (int i = 0; i < resAleatorio.length; i++) {
			System.out.print(resAleatorio[i] + " ");
		}
		System.out.println(clasif.estaOrdenado(resAleatorio, true, true));
		System.out.println("\n");
		//------

		int[] resAleatorio2 = clasif.clasificar(vectorAleatorio2,METODO_CLASIFICACION_SHELL, true);
		for (int j = 0; j < resAleatorio2.length; j++) {
			System.out.print(resAleatorio2[j] + " ");
		}
		System.out.println(clasif.estaOrdenado(resAleatorio2, true, true));
		System.out.println("\n");
		//------

		int[] resAleatorio3 = clasif.clasificar(vectorAleatorio3, METODO_CLASIFICACION_BURBUJA, true);
		for (int k = 0; k < resAleatorio3.length; k++) {
			System.out.print(resAleatorio3[k] + " ");
		}
		System.out.println(clasif.estaOrdenado(resAleatorio3, true, true));
		System.out.println("\n");
		//------

		int[] resAleatorio4 = clasif.clasificar(vectorAleatorio4, METODO_CLASIFICACION_QUICKSORT, true);
		for (int l = 0; l < resAleatorio4.length; l++) {
			System.out.print(resAleatorio4[l] + " ");
		}
		System.out.println(clasif.estaOrdenado(resAleatorio4, true, true));
		System.out.println("\n");
	}
}
