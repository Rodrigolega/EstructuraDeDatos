// Clase que implementa la búsqueda binaria en un arreglo descendente
public class BinarySearch {
    // Método de búsqueda binaria con contador de movimientos
    public static int search(int[] arr, int number) {
        int left = 0, right = arr.length - 1;
        int movements = 0; // Contador de movimientos

        while (left <= right) {
            movements++; // Incrementamos el contador en cada iteración
            int mid = left + (right - left) / 2;

            // Si encontramos el número, mostramos los movimientos y devolvemos la posición
            if (arr[mid] == number) {
                System.out.println("Movimientos realizados: " + movements);
                return mid;
            }
            // En un arreglo descendente, si el número buscado es mayor, descartamos la derecha
            else if (arr[mid] < number) {
                right = mid - 1;
            }
            // Si el número buscado es menor, descartamos la izquierda
            else {
                left = mid + 1;
            }
        }

        System.out.println("Movimientos realizados: " + movements);
        return -1; // Si el número no está en el arreglo
    }
}
