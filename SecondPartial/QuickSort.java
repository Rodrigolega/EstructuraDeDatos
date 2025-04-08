import java.util.Arrays;

public class QuickSort {
    static int comparaciones = 0;
    static int intercambios = 0;

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        intercambios++;
    }

    // Partición usando el esquema de partición de Lomuto
    public int partition(int[] a, int start, int end) {
        int pivot = a[end]; 
        int pIndex = start; 

        for (int i = start; i < end; i++) {
            comparaciones++;
            if (a[i] <= pivot) {
                swap(a, i, pIndex);
                pIndex++;
            }
        }

        swap(a, end, pIndex);
        return pIndex;
    }

    public void quicksort(int[] a, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(a, start, end);
        quicksort(a, start, pivot - 1);
        quicksort(a, pivot + 1, end);
    }
}