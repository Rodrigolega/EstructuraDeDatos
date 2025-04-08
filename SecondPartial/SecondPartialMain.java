/*
 * codigo main del segundo parcial
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 06/03/2025


public class SecondPartialMain {
    public static void main(String[] args) {

    }
}




        
        //hashmap
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int number = 7;

        int result = BinarySearch.search(array, number);

        if (result != -1) {
            System.out.println("Elemento encontrado en la posición: " + result);
        } else {
            System.out.println("Elemento no encontrado en el arreglo.");
        }

        HashMapExample hashMap = new HashMapExample();
        hashMap.performOperations();
        
        //index search 
        int[] datos = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80};
        int[] indices = {0, 3, 6, 12, 14}; // Índices auxiliares
        int buscar = 45;

        // Como el método es estático, se puede llamar sin instanciar la clase
        IndexedSearch.buscarElemento(datos, indices, buscar);
    }
}
*/

import java.util.Arrays;

public class SecondPartialMain {
    public static void main(String[] args) {
        //insertion sort
        System.out.println("insertion sort: ");

        int peorCaso[] = {5, 4, 3, 2, 1}; //se pone la lista en inverso para ver el peor caso

        System.out.print("Peor Caso");
        int operacionesPeor = InsertionSortExample.insertionSort(peorCaso);
       
        System.out.println("\nOperaciones realizadas: " + operacionesPeor); //se manda a llamar la clase de insertion con sus variables para que compare el arreglo

        System.out.println();

        //selection sort
        System.out.println("selection sort: ");
        int worstCase[] = {5, 4, 3, 2, 1}; 

        System.out.println("Peor caso");
        System.out.println("Operaciones realizadas: " + SelectionSortExample.selectionSort(worstCase));

        System.out.println();
        
        //bubble sort
        System.out.println("bubble sort: ");
        System.out.println("Peor caso");
        int[] arr = {5, 4, 3, 2, 1}; // Peor caso (orden inverso)
        int comparisons = BubbleSortExample.bubbleSort(arr);
        System.out.println("operaciones realizadas: " + comparisons);
    
        System.out.println();

        //merge sort
        System.out.println("Merge sort: ");
        MergeSort objMergeSort = new MergeSort(); 
        int[] array = {5, 2, 9, 1, 5};
        objMergeSort.mergeSort(array, 0, array.length - 1);
        
        System.out.println("Arreglo ordenado: " + Arrays.toString(array));
        
        System.out.println("Cantidad total de operaciones realizadas: " + objMergeSort.operationCount);
    
        System.out.println("Cantidad total de comparaciones realizadas: " + objMergeSort.comparisonCount);

        System.out.println();

        //Quicksort
        System.out.println("Quick sort: ");

        int[] a = {5, 2, 9, 1, 5};
        
        QuickSort sorter = new QuickSort();
        sorter.quicksort(a, 0, a.length - 1);

        System.out.println("Arreglo ordenado: " + Arrays.toString(a));
        System.out.println("Comparaciones: " + QuickSort.comparaciones);
        System.out.println("Intercambios: " + QuickSort.intercambios);

        System.out.println();
        //Binary Search
        System.out.println("Binary search: ");

        // Ejemplo de arreglo descendente
        // Ejemplo de arreglo ordenado en forma ascendente
        int[] arrayb = {10, 20, 30, 40, 50};
        
        int result = BinarySearch.search(arrayb, 30);
        System.out.println("El numero 30 esta en la posicion: " + result);

        System.out.println();

        //Busqueda secuencial
        System.out.println("Busqueda secuencial : ");

        int[] datos = {10, 20, 30, 40, 50};
        int resultado = BusquedaSecuencial.buscar(datos, 30);
        System.out.println("El número 30 está en la posición: " + resultado);

    }
}