package com.example;

public class App 
{
	private static final int METODO_CLASIFICACION_INSERCION = 1;
    private static final int METODO_CLASIFICACION_SHELL = 2;
    private static final int METODO_CLASIFICACION_BURBUJA = 3;
    private static final int METODO_CLASIFICACION_QUICKSORT = 4;
	private static final int METODO_CLASIFICACION_SELECCION_DIRECTA = 5;
	private static final int METODO_CLASIFICACION_HEAPSORT = 6;

    public static void main(String args[]) {
		
		TClasificador clasif = new TClasificador();
		GeneradorDatosGenericos gdg = new GeneradorDatosGenericos();
		
		
		clasificacionPorInsercion(clasif, gdg);
		shellSort(clasif, gdg);
		bubbleSort(clasif, gdg);
		ordenacionPorQuickSort(clasif, gdg);
		clasificacionSeleccionDirecta(clasif, gdg);
		heapSort(clasif, gdg);

	}

	public static void clasificacionPorInsercion( TClasificador clasificador,GeneradorDatosGenericos gdg){
		int[] vectorAleatorio = gdg.generarDatosAleatorios();

		int[] resAleatorio = clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_INSERCION, true);
		
		System.out.println("Ordenado de forma ascendente por clasificacion por insercion : ");
		for (int i = 0; i < resAleatorio.length; i++) {
			System.out.print(resAleatorio[i] + " ");
		}

		System.out.println("\nEsta ordenado de forma ascendente?" + clasificador.estaOrdenado(resAleatorio, true, true));
		System.out.println("\n");

		int[] resDescendente = clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_INSERCION, false);

		System.out.println("Ordenado de forma decreciente por clasificacion por insercion: ");
		for (int k = 0; k < resDescendente.length; k++) {
			System.out.print(resDescendente[k] + " ");
		}
		System.out.println("\nEsta ordenado de forma decreciente?" + clasificador.estaOrdenado(resDescendente, false, true));
		System.out.println("\n");

	}

	public static void shellSort(TClasificador clasificador, GeneradorDatosGenericos gdg){
		int[] vectorAleatorio = gdg.generarDatosAleatorios();

		int[] resAleatorio = clasificador.clasificar(vectorAleatorio,METODO_CLASIFICACION_SHELL, true);

		System.out.println("Ordenado de forma ascendente por Shell Sort: ");
		for (int j = 0; j < resAleatorio.length; j++) {
			System.out.print(resAleatorio[j] + " ");
		}
		System.out.println("\nEsta ordenado de forma ascendente?" + clasificador.estaOrdenado(resAleatorio, true, true));
		System.out.println("\n");

		int[] resDescendente = clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_SHELL, false);

		System.out.println("Ordenado de forma decreciente por Shell Sort: ");
		for (int k = 0; k < resDescendente.length; k++) {
			System.out.print(resDescendente[k] + " ");
		}
		System.out.println("\nEsta ordenado de forma decreciente?" + clasificador.estaOrdenado(resDescendente, false, true));
		System.out.println("\n");
	}

	public static void bubbleSort(TClasificador clasificador, GeneradorDatosGenericos gdg){
		int[] vectorAleatorio = gdg.generarDatosAleatorios();

		int[] resAleatorio = clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_BURBUJA, true);

		System.out.println("Ordenado de forma ascendente por Bubble Sort: ");
		for (int k = 0; k < resAleatorio.length; k++) {
			System.out.print(resAleatorio[k] + " ");
		}
		System.out.println("\nEsta ordenado de forma ascendente?" + clasificador.estaOrdenado(resAleatorio, true, true));
		System.out.println("\n");

		int[] resDescendente = clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_BURBUJA, false);

		System.out.println("Ordenado de forma decreciente por Bubble Sort: ");
		for (int k = 0; k < resDescendente.length; k++) {
			System.out.print(resDescendente[k] + " ");
		}
		System.out.println("\nEsta ordenado de forma decreciente?" + clasificador.estaOrdenado(resDescendente, false, true));
		System.out.println("\n");

	}

	public static void ordenacionPorQuickSort(TClasificador clasificador, GeneradorDatosGenericos gdg){
		int[] vectorAleatorio = gdg.generarDatosAleatorios();

		int[] resAleatorio = clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_QUICKSORT, true);

		System.out.println("Ordenado de forma ascendente por Quick Sort: ");
		for (int k = 0; k < resAleatorio.length; k++) {
			System.out.print(resAleatorio[k] + " ");
		}
		System.out.println("\nEsta ordenado de forma ascendente?" + clasificador.estaOrdenado(resAleatorio, true, true));
		System.out.println("\n");

		int[] resDescendente = clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_QUICKSORT, false);

		System.out.println("Ordenado de forma decreciente por Quick Sort: ");
		for (int k = 0; k < resDescendente.length; k++) {
			System.out.print(resDescendente[k] + " ");
		}
		System.out.println("\nEsta ordenado de forma decreciente?" + clasificador.estaOrdenado(resDescendente, false, true));
		System.out.println("\n");

	}

	public static void clasificacionSeleccionDirecta(TClasificador clasificador, GeneradorDatosGenericos gdg){
		int[] vectorAleatorio = gdg.generarDatosAleatorios();

		int[] resAleatorio = clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_SELECCION_DIRECTA, true);

		System.out.println("Ordenado de forma ascendente por Seleccion Directa: ");
		for (int k = 0; k < resAleatorio.length; k++) {
			System.out.print(resAleatorio[k] + " ");
		}
		System.out.println("\nEsta ordenado de forma ascendente?" + clasificador.estaOrdenado(resAleatorio, true, true));
		System.out.println("\n");

		int[] resDescendente = clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_SELECCION_DIRECTA, false);

		System.out.println("Ordenado de forma decreciente por Seleccion Directa: ");
		for (int k = 0; k < resDescendente.length; k++) {
			System.out.print(resDescendente[k] + " ");
		}
		System.out.println("\nEsta ordenado de forma decreciente?" + clasificador.estaOrdenado(resDescendente, false, true));
		System.out.println("\n");
	}

	public static void heapSort(TClasificador clasificador, GeneradorDatosGenericos gdg){

		//HEAPSORT es contraitruitivo en ascendencia y descendencia
		int[] vectorAleatorio = gdg.generarDatosAleatorios();

		int[] resAleatorio = clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_HEAPSORT, false);

		System.out.println("Ordenado de forma ascendente por Heap Sort: ");
		for (int k = 0; k < resAleatorio.length; k++) {
			System.out.print(resAleatorio[k] + " ");
		}
		System.out.println("\nEsta ordenado de forma ascendente?" + clasificador.estaOrdenado(resAleatorio, true, true));
		System.out.println("\n");

		int[] resDescendente = clasificador.clasificar(vectorAleatorio, METODO_CLASIFICACION_HEAPSORT, true);

		System.out.println("Ordenado de forma decreciente por Heap Sort: ");
		for (int k = 0; k < resDescendente.length; k++) {
			System.out.print(resDescendente[k] + " ");
		}
		System.out.println("\nEsta ordenado de forma decreciente?" + clasificador.estaOrdenado(resDescendente, false, true));
		System.out.println("\n");
	}
}
