package com.example;

import static org.junit.Assert.assertArrayEquals;

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
        Assert.assertFalse(clasif.estaOrdenado(vectorVacio, true, true));
        Assert.assertTrue(clasif.estaOrdenado(vectorAscendente, true, true));
        Assert.assertFalse(clasif.estaOrdenado(vectorDescendente, true, true));
        Assert.assertFalse(clasif.estaOrdenado(vectorAleatorio, true, true));
        Assert.assertTrue(clasif.estaOrdenado(vectorIguales, true, false));
        Assert.assertFalse(clasif.estaOrdenado(vectorNegativos, true, true));
        Assert.assertFalse(clasif.estaOrdenado(vectorNegativosPositivos, true, true));
        //Assert.assertTrue(clasif.estaOrdenado(vectorInvalido));
    }

    @Test
    public void testOrdenarPorInsercion() {
        TClasificador clasif = new TClasificador();
        assertArrayEquals(new int[0], clasif.ordenarPorInsercion(vectorVacio, true));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, clasif.ordenarPorInsercion(vectorAscendente, true)); //Orden 1
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, clasif.ordenarPorInsercion(vectorDescendente, true)); // Orden n
        assertArrayEquals(new int[] {0, 1, 3, 4}, clasif.ordenarPorInsercion(vectorAleatorio, true)); // Orden n^2
        assertArrayEquals(new int[] {1, 1, 1, 1, 1}, clasif.ordenarPorInsercion(vectorIguales, true));
        assertArrayEquals(new int[] {-5, -4, -3, -2, -1}, clasif.ordenarPorInsercion(vectorNegativos, true));
        assertArrayEquals(new int[] {-5, -3, -1, 2, 4}, clasif.ordenarPorInsercion(vectorNegativosPositivos, true));
        assertArrayEquals(null, clasif.ordenarPorInsercion(vectorInvalido, true));
        // el orden de espacio es constante porque es inplace, solo usa un int extra para intercambiar
    }

    @Test
    public void testOrdenarPorShell() {
        TClasificador clasif = new TClasificador();
        assertArrayEquals(new int[0], clasif.ordenarPorShell(vectorVacio, true));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, clasif.ordenarPorShell(vectorAscendente, true)); // Orden n^1.26¿?
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, clasif.ordenarPorShell(vectorDescendente, true)); // Orden n^1.26¿?
        assertArrayEquals(new int[] {0, 1, 3, 4}, clasif.ordenarPorShell(vectorAleatorio, true)); // Orden n^1.26¿?
        assertArrayEquals(new int[] {1, 1, 1, 1, 1}, clasif.ordenarPorShell(vectorIguales, true));
        assertArrayEquals(new int[] {-5, -4, -3, -2, -1}, clasif.ordenarPorShell(vectorNegativos, true));
        assertArrayEquals(new int[] {-5, -3, -1, 2, 4}, clasif.ordenarPorShell(vectorNegativosPositivos, true));
        // el orden de espacio es constante porque es inplace, solo usa un int extra para intercambiar
    }

    @Test
    public void testOrdenarPorBurbuja() {
        TClasificador clasif = new TClasificador();
        assertArrayEquals(new int[0], clasif.ordenarPorBurbuja(vectorVacio, true));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, clasif.ordenarPorBurbuja(vectorAscendente, true)); // Orden n^2
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, clasif.ordenarPorBurbuja(vectorDescendente, true)); // Orden n^2
        assertArrayEquals(new int[] {0, 1, 3, 4}, clasif.ordenarPorBurbuja(vectorAleatorio, true)); // Orden n^2
        assertArrayEquals(new int[] {1, 1, 1, 1, 1}, clasif.ordenarPorBurbuja(vectorIguales, true));
        assertArrayEquals(new int[] {-5, -4, -3, -2, -1}, clasif.ordenarPorBurbuja(vectorNegativos, true));
        assertArrayEquals(new int[] {-5, -3, -1, 2, 4}, clasif.ordenarPorBurbuja(vectorNegativosPositivos, true));
        // el orden de espacio es constante porque es inplace, solo usa un int extra para intercambiar
    }

    @Test
    public void testOrdenarPorHeapSort() {
        TClasificador clasif = new TClasificador();
        assertArrayEquals(new int[0], clasif.ordenarPorHeapSort(vectorVacio, true));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, clasif.ordenarPorHeapSort(vectorAscendente, false)); // Orden n log n
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, clasif.ordenarPorHeapSort(vectorDescendente, false)); // Orden n log n
        assertArrayEquals(new int[] {0, 1, 3, 4}, clasif.ordenarPorHeapSort(vectorAleatorio, false)); // Orden n log n
        assertArrayEquals(new int[] {1, 1, 1, 1, 1}, clasif.ordenarPorHeapSort(vectorIguales, false));
        assertArrayEquals(new int[] {-5, -4, -3, -2, -1}, clasif.ordenarPorHeapSort(vectorNegativos, false));
        assertArrayEquals(new int[] {-5, -3, -1, 2, 4}, clasif.ordenarPorHeapSort(vectorNegativosPositivos, false));
        // el orden de espacio es constante porque es inplace, solo usa un int extra para intercambiar
    }
}
