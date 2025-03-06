/*
 * Ejemplo de selection sort
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 06/03/2025
 * formula para el peor caso
 * T(n) = (n(n - 1)) / 2
 */

  // notacion del big o o(n^2)
public class SelectionSortExample {
    public static int selectionSort(int arr[]) {
        int n = arr.length;
        int comparisons = 0;

        for (int i = 0; i < n - 1; i++) { //aqui se inicia el bucle for n representa el valor que sera cambiado de pocision, es -1 porque ahi quedara el dato ordenadp
            int minIndex = i;//miniindex guarda el elemento mas pequeno
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;//cuando se inicia el bucle se comparan todos los valores del arreglo y agarra el mas pequeno y lo mete en miniindex osea j para que pueda ser cambiado
                }
            }
            // Intercambio de elementos
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;//Si minIndex cambió, significa que se encontró un número menor y hay que intercambiarlo con arr[i].
        }
        return comparisons;
    }
}

//este agarra el valor mas pequeno y lo comapara con todos los elementos del arreglo para ver cual cambiar