package com.example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("static-access")
public class TClasificadorTest {

    int[] vectorVacio = new int[0];
    int[] vectorAscendente = new int[] { 1, 2, 3, 4, 5 };
    int[] vectorDescendente = new int[] { 5, 4, 3, 2, 1 };
    int[] vectorAleatorio = new int[] { 3, 4, 1, 0 };
    int[] vectorIguales = new int[] { 1, 1, 1, 1, 1 };
    int[] vectorNegativos = new int[] { -1, -2, -3, -4, -5 };
    int[] vectorNegativosPositivos = new int[] { -1, 2, -3, 4, -5 };
    int[] vectorInvalido = null;

    @Test
    public void testEstaOrdenado() {
        TClasificador clasif = new TClasificador();
        assertFalse(clasif.estaOrdenado(vectorVacio, true, true));
        assertTrue(clasif.estaOrdenado(vectorAscendente, true, true));
        assertFalse(clasif.estaOrdenado(vectorDescendente, true, true));
        assertFalse(clasif.estaOrdenado(vectorAleatorio, true, true));
        assertTrue(clasif.estaOrdenado(vectorIguales, true, false));
        assertFalse(clasif.estaOrdenado(vectorNegativos, true, true));
        assertFalse(clasif.estaOrdenado(vectorNegativosPositivos, true, true));
        //Assert.assertTrue(clasif.estaOrdenado(vectorInvalido));
    }

    @Test
    public void testOrdenarPorInsercion() {
        TClasificador clasif = new TClasificador();
        //assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorVacio, false), false, true));
        //assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorVacio, true), true, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorAscendente, true), true, true)); //Orden 1
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorAscendente, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorDescendente, true), true, true)); // Orden n
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorDescendente, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorAleatorio, true), true, true)); // Orden n^2
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorAleatorio, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorIguales, true), true, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorIguales, false), false, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorNegativos, true), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorNegativos, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorNegativosPositivos, true), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorNegativosPositivos, false), false, true));
        //Assert.assertTrue(clasif.estaOrdenado(clasif.ordenarPorInsercion(vectorInvalido));
        // el orden de espacio es constante porque es inplace, solo usa un int extra para intercambiar
    }

    @Test
    public void testOrdenarPorShell() {
        TClasificador clasif = new TClasificador();
        //assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorVacio, false), false, true));
        //assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorVacio, true), true, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorAscendente, true), true, true)); // Orden n^1.26¿?
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorAscendente, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorDescendente, true), true, true)); // Orden n^1.26¿?
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorDescendente, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorAleatorio, true), true, true)); // Orden n^1.26¿?
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorAleatorio, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorIguales, true), true, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorIguales, false), false, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorNegativos, true), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorNegativos, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorNegativosPositivos, true), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorNegativosPositivos, false), false, true));
        //Assert.assertTrue(clasif.estaOrdenado(clasif.ordenarPorShell(vectorInvalido));
        // el orden de espacio es constante porque es inplace, solo usa un int extra para intercambiar
    }

    @Test
    public void testOrdenarPorBurbuja() {
        TClasificador clasif = new TClasificador();
        //assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorVacio, false), false, true));
        //assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorVacio, true), true, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorAscendente, true), true, true)); // Orden n
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorAscendente, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorDescendente, true), true, true)); // Orden n
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorDescendente, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorAleatorio, true), true, true)); // Orden n^2
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorAleatorio, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorIguales, true), true, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorIguales, false), false, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorNegativos, true), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorNegativos, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorNegativosPositivos, true), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorNegativosPositivos, false), false, true));
        //Assert.assertTrue(clasif.estaOrdenado(clasif.ordenarPorBurbuja(vectorInvalido));
        // el orden de espacio es constante porque es inplace, solo usa un int extra para intercambiar
    }

    @Test
    public void testOrdenarPorHeapSort() {
        TClasificador clasif = new TClasificador();
        //assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorVacio, false), false, true));
        //assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorVacio, true), true, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorAscendente, true), false, true)); // Orden n log n
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorAscendente, false), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorDescendente, false), true, true)); // Orden n log n
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorDescendente, true), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorAleatorio, true), false, true)); // Orden n log n
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorAleatorio, false), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorIguales, true), false, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorIguales, false), true, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorNegativos, true), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorNegativos, false), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorNegativosPositivos, true), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorNegativosPositivos, false), true, true));
        //Assert.assertTrue(clasif.estaOrdenado(clasif.ordenarPorHeapSort(vectorInvalido));
        // el orden de espacio es constante porque es inplace, solo usa un int extra para intercambiar
    }

    @Test
    public void testOrdenarPorSeleccionDirecta() {
        TClasificador clasif = new TClasificador();
        //assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorVacio, false), false, true));
        //assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorVacio, true), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorAscendente, true), true, true)); // Orden n²
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorAscendente, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorDescendente, true), true, true)); // Orden n²
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorDescendente, true), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorAleatorio, true), true, true)); // Orden n²
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorAleatorio, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorIguales, true), true, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorIguales, false), false, false));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorNegativos, true), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorNegativos, false), false, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorNegativosPositivos, true), true, true));
        assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorNegativosPositivos, false), false, true));
        //Assert.assertTrue(clasif.estaOrdenado(clasif.ordenarPorSeleccionDirecta(vectorInvalido));
        // el orden de espacio es constante porque es inplace, solo usa un int extra para intercambiar
    }
}
