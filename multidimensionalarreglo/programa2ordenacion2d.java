/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multidimensionalarreglo;

/**
 *
 * @author Hogar
 */
import java.util.Arrays;

public class programa2ordenacion2d {
    public static void main(String[] args) {
        // Declarar matriz 3x3
        int[][] matriz = {
            {9, 4, 7},
            {1, 6, 3},
            {8, 2, 5}
        };

        // Copiar la matriz original
        int[][] copia = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            System.arraycopy(matriz[i], 0, copia[i], 0, matriz[i].length);
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(copia);

        // Ordenar una fila (ejemplo fila 1)
        int fila = 1;
        Arrays.sort(matriz[fila]);

        // Mostrar la matriz con la fila ordenada
        System.out.println("\nMatriz con la fila " + fila + " ordenada:");
        imprimirMatriz(matriz);
    }

    // Método para imprimir la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }
    }
}