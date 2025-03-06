/*
 * Ejemplo de bubble sort
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 05/03/2025
 * formula para el peor caso
 * T(n) = (n(n - 1)) / 2
 */
// notacion del big o o(n^2)
public class BubbleSortExample {
    public static int bubbleSort(int[] arr) { //se crea la clase bubblesort
        int n = arr.length; //aqui se usa int para que el valor sea un entero y se usa lenght para ver el tamano del arreglo
        int comparisons = 0; // este es un contador para poder ver el numero de comparaciones del programa
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) { //aqui se usa un ciclo for para el bubble sort en el que inicia en 0 en el que se comparan datos y se intercambian elementos dentro de un arreglo
                comparisons++; // aqui se cuenta el numero de comparaciones
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Si no hubo intercambios, ya está ordenado
        }
        return comparisons;
    }

}

// en el bubble sort se comparan numeros pares y se ve si es mayor o menor y asi hace el cambio o no