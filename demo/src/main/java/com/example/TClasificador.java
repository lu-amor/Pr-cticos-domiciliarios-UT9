package com.example;

import java.util.Random;

public class TClasificador {
	public static final int METODO_CLASIFICACION_INSERCION = 1;
	public static final int METODO_CLASIFICACION_SHELL = 2;
	public static final int METODO_CLASIFICACION_BURBUJA = 3;
	public static final int METODO_CLASIFICACION_QUICKSORT = 4;

	/**
	 * Punto de entrada al clasificador
	 * 
	 * @param metodoClasificacion
	 * @param orden
	 * @param tamanioVector
	 * @return Un vector del tam. solicitado, ordenado por el algoritmo solicitado
	 */
	public int[] clasificar(int[] datosParaClasificar, int metodoClasificacion, boolean ascendente) {
		switch (metodoClasificacion) {
			case METODO_CLASIFICACION_INSERCION:
				return ordenarPorInsercion(datosParaClasificar, ascendente);
			case METODO_CLASIFICACION_SHELL:
				return ordenarPorShell(datosParaClasificar, ascendente);
			case METODO_CLASIFICACION_BURBUJA:
				return ordenarPorBurbuja(datosParaClasificar, ascendente);
			case METODO_CLASIFICACION_QUICKSORT:
				return ordenarPorQuickSort(datosParaClasificar, ascendente);
			default:
				System.err.println("Este codigo no deberia haberse ejecutado");
				break;
		}
		return datosParaClasificar;
	}

	private void intercambiar(int[] vector, int pos1, int pos2) {
		int temp = vector[pos2];
		vector[pos2] = vector[pos1];
		vector[pos1] = temp;
	}

	/**
	 * @param datosParaClasificar
	 * @return
	 */
	public int[] ordenarPorShell(int[] datosParaClasificar, boolean ascendente) {
		int j, inc;
		int[] incrementos = new int[]{3223, 358, 51, 10, 3, 1};
	
		for (int posIncrementoActual = 0; posIncrementoActual < incrementos.length; posIncrementoActual++) {
			inc = incrementos[posIncrementoActual];
			if (inc < (datosParaClasificar.length / 2)) {
				for (int i = inc; i < datosParaClasificar.length; i++) {
					j = i - inc;
					while (j >= 0) {
						if ((ascendente && datosParaClasificar[j] > datosParaClasificar[j + inc]) ||
							(!ascendente && datosParaClasificar[j] < datosParaClasificar[j + inc])) {
							intercambiar(datosParaClasificar, j, j + inc);
						}
						j -= inc;
					}
				}
			}
		}
		return datosParaClasificar;
	}

	/**
	 * @param datosParaClasificar
	 * @return
	 */
	public int[] ordenarPorInsercion(int[] datosParaClasificar, boolean ascendente) {
		if (datosParaClasificar != null) {
			for (int i = 1; i < datosParaClasificar.length; i++) {
				int j = i - 1;
				if (ascendente) {
					while ((j >= 0) && (datosParaClasificar[j + 1] < datosParaClasificar[j])) {
						intercambiar(datosParaClasificar, j, j + 1);
						j--;
					}
				} else {
					while ((j >= 0) && (datosParaClasificar[j + 1] > datosParaClasificar[j])) {
						intercambiar(datosParaClasificar, j, j + 1);
						j--;
					}
				}
			}
			return datosParaClasificar;
		}
		return null;
	}

	public int[] ordenarPorBurbuja(int[] datosParaClasificar, boolean ascendente) {
		int n = datosParaClasificar.length - 1;
		for (int i = 0; i <= n; i++) {
			for (int j = n; j >= (i + 1); j--) {
				if (ascendente) {
					if (datosParaClasificar[j] < datosParaClasificar[j - 1]) {
						intercambiar(datosParaClasificar, j - 1, j);
					}
				} else {
					if (datosParaClasificar[j] > datosParaClasificar[j - 1]) {
						intercambiar(datosParaClasificar, j - 1, j);
					}
				}
			}
		}
		return datosParaClasificar;
	}

	public int[] ordenarPorQuickSort(int[] datosParaClasificar, boolean ascendente) {
		quicksort(datosParaClasificar, 0, datosParaClasificar.length - 1, ascendente);
		return datosParaClasificar;
	}
	
	private void quicksort(int[] entrada, int izquierda, int derecha, boolean ascendente) {
		if (izquierda < derecha) {
			int posicionPivote = encuentraPivote(izquierda, derecha, entrada);
			int pivote = entrada[posicionPivote];
			int i = izquierda, j = derecha;
			while (i <= j) {
				if (ascendente) {
					while (entrada[i] < pivote) {
						i++;
					}
					while (entrada[j] > pivote) {
						j--;
					}
				} else {
					while (entrada[i] > pivote) {
						i++;
					}
					while (entrada[j] < pivote) {
						j--;
					}
				}
				if (i <= j) {
					intercambiar(entrada, i, j);
					i++;
					j--;
				}
			}
			if (izquierda < j)
				quicksort(entrada, izquierda, j, ascendente);
			if (i < derecha)
				quicksort(entrada, i, derecha, ascendente);
		}
	}
	
	private int encuentraPivote(int izquierda, int derecha, int[] entrada) {
		Random rnd = new Random();
		return izquierda + rnd.nextInt(derecha - izquierda + 1);
	}

	public static boolean estaOrdenado(int[] vector, boolean ascendente, boolean estricto) {
		boolean res = false;
		for (int i = 0; i < vector.length - 1; i++) {
			if (ascendente == true && estricto == true) {
				if (vector[i] < vector[i + 1]) {
					res = true;
				} else {
					return false;
				}
			} else if (ascendente == true && estricto == false) {
				if (vector[i] <= vector[i + 1]) {
					res = true;
				} else {
					return false;
				}
			} else if (ascendente == false && estricto == true) {
				if (vector[i] > vector[i + 1]) {
					res = true;
				} else {
					return false;
				}
			} else if (ascendente == false && estricto == false) {
				if (vector[i] >= vector[i + 1]) {
					res = true;
				} else {
					return false;
				}
			}
		}
		return res;
	}

	public int[] ordenarPorHeapSort(int[] datosParaClasificar, boolean descendente) {
		for (int i = (datosParaClasificar.length - 1) / 2; i >= 0; i--) {
			armaHeap(datosParaClasificar, i, datosParaClasificar.length - 1, descendente);
		}
		for (int i = datosParaClasificar.length - 1; i >= 1; i--) {
			intercambiar(datosParaClasificar, 0, i);
			armaHeap(datosParaClasificar, 0, i - 1, descendente);
		}
		return datosParaClasificar;
	}
	
	private void armaHeap(int[] datosParaClasificar, int primero, int ultimo, boolean descendente) {
		if (primero < ultimo) {
			int r = primero;
			while (r <= ultimo / 2) {
				if (ultimo == 2 * r) { // r tiene un hijo solo
					if ((descendente && datosParaClasificar[r] > datosParaClasificar[2 * r]) || (!descendente && datosParaClasificar[r] < datosParaClasificar[2 * r])) {
						intercambiar(datosParaClasificar, r, 2 * r);
					}
					r = ultimo;
				} else { // r tiene 2 hijos
					int posicionIntercambio;
					if ((descendente && datosParaClasificar[2 * r] > datosParaClasificar[2 * r + 1]) || (!descendente && datosParaClasificar[2 * r] < datosParaClasificar[2 * r + 1])) {
						posicionIntercambio = 2 * r + 1;
					} else {
						posicionIntercambio = 2 * r;
					}
					if ((descendente && datosParaClasificar[r] > datosParaClasificar[posicionIntercambio]) || (!descendente && datosParaClasificar[r] < datosParaClasificar[posicionIntercambio])) {
						intercambiar(datosParaClasificar, r, posicionIntercambio);
						r = posicionIntercambio;
					} else {
						r = ultimo;
					}
				}
			}
		}
	}
}
