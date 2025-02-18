/*
 * ejemplo arreglo bidimensional
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 12/02/2025
 */

public class MultiArrayExample {
    public void Printbidimensionalarray() {

        // forma de inicializar un arreglo bidimesnional o matriz
        int[][] matrix = {
                { 1, 2 }, // [0][0] = 1 [0][1] = 2
                { 3, 4 }, // [1][0] = 3 [1][1] = 4

        };

        // recorrer e imprir la matriz
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("longitud de la fila: " + matrix[i].length);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}