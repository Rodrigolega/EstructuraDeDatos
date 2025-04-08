
public class MergeSort {
    public int operationCount = 0; // Contador de operaciones
    public int comparisonCount = 0; // Contador de comparaciones

    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copiamos los datos en arreglos temporales
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
            operationCount++; // Contar copia
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
            operationCount++; // Contar copia
        }

        // Fusionamos las dos mitades ordenadas
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            comparisonCount++; // Contar comparación
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
            operationCount++; // Contar asignación
        }

        // Copiar los elementos restantes de leftArray[], si hay alguno
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
            operationCount++; // Contar asignación
        }

        // Copiar los elementos restantes de rightArray[], si hay alguno
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
            operationCount++; // Contar asignación
        }
    }

    public void printResults() {
        System.out.println("Total de operaciones: " + operationCount);
        System.out.println("Total de comparaciones: " + comparisonCount);
    }

}