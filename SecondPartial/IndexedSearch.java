/*
 * Indexed Searxh example
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 20/03/2025
 */

public class IndexedSearch {
    public static int buscarElemento(int[] datos, int[] indices, int buscar) {
        int comparaciones = 0;
        int bloque = -1;

        // Búsqueda en el índice
        for (int i = 0; i < indices.length - 1; i++) {
            comparaciones++;
            if (datos[indices[i]] <= buscar && datos[indices[i + 1]] >= buscar) {
                bloque = i;
                break;
            }
        }

        if (bloque == -1) {
            System.out.println("Elemento no encontrado.");
            System.out.println("Comparaciones realizadas: " + comparaciones);
            return -1;
        }

        // Búsqueda secuencial dentro del bloque identificado
        for (int i = indices[bloque]; i <= indices[bloque + 1]; i++) {
            comparaciones++;
            if (datos[i] == buscar) {
                System.out.println("Elemento encontrado en la posición: " + i);
                System.out.println("Comparaciones realizadas: " + comparaciones);
                return i;
            }
        }

        System.out.println("Elemento no encontrado.");
        System.out.println("Comparaciones realizadas: " + comparaciones);
        return -1;
    }
}
