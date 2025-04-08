public class BusquedaSecuencial {
    public static int buscar(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                return i; // Retorna la posición del elemento encontrado
            }
        }
        return -1; // Retorna -1 si el elemento no está en el arreglo
    }
    }