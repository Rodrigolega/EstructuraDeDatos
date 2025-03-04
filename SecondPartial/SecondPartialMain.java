public class SecondPartialMain {
    public static void main(String[] args) {
        int peorCaso[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int mejorCaso[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};  

        System.out.println("Peor Caso:");
        int operacionesPeor = InsertionSortExample.insertionSort(peorCaso);
        for (int num : peorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesPeor);

        System.out.println("\nMejor Caso:");
        int operacionesMejor = InsertionSortExample.insertionSort(mejorCaso);
        for (int num : mejorCaso) {
            System.out.print(num + " ");
        }
        System.out.println("\nOperaciones realizadas: " + operacionesMejor);
    }
}
