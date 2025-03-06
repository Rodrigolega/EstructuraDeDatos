/*
 * codigo main del segundo parcial
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 06/03/2025
 */

public class SecondPartialMain {
    public static void main(String[] args) {
        //insertion sort
        System.out.println("insertion sort: ");

        int peorCaso[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; //se pone la lista en inverso para ver el peor caso

        System.out.print("Peor Caso:");
        int operacionesPeor = InsertionSortExample.insertionSort(peorCaso);
       
        System.out.println("\nOperaciones realizadas: " + operacionesPeor); //se manda a llamar la clase de insertion con sus variables para que compare el arreglo

        System.out.println();

        //selection sort
        System.out.println("selection sort: ");
        int worstCase[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; 

        System.out.println("Peor caso:");
        System.out.println("Operaciones realizadas: " + SelectionSortExample.selectionSort(worstCase));

        System.out.println();
        
        //bubble sort
        System.out.println("bubble sort: ");
        System.out.println("Peor caso:");
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Peor caso (orden inverso)
        int comparisons = BubbleSortExample.bubbleSort(arr);
        System.out.println("operaciones realizadas: " + comparisons);
        
    }
}
    
