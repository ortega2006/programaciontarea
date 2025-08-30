/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multidimensionalarreglo;

/**
 *
 * @author Hogar
 */

public class programa1busqueda2d {
    public static void main(String[] args) {
       
  
        // Declarar matriz con valores fijos
        int[][] matriz = {
            {5, 8, 12},
            {4, 7, 9},
            {1, 3, 6}
        };

        // Mostrar la matriz en pantalla
        System.out.println("Matriz 3x3:");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println();
        }

        // Número fijo a buscar
        int valorABuscar = 5;

        // Buscar el número
        int[] posicion = buscarValor(matriz, valorABuscar);

        // Mostrar resultado
        if (posicion[0] != -1) {
            System.out.println("El numero " + valorABuscar +
                               " se encontro en la posicion [" + posicion[0] + ", " + posicion[1] + "]");
        } else {
            System.out.println("El numero " + valorABuscar + " no se encontro en la matriz.");
        }
    }

    // Método que busca un valor en la matriz
    public static int[] buscarValor(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valor) {
                    return new int[] {i, j}; // Retorna la posición donde lo encontró
                }
            }
        }
        return new int[] {-1, -1}; // Si no lo encuentra
    }
}