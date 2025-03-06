/*
 * Ejemplo de insertion sort
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 06/03/2025
 * formula para el peor caso
 * T(n) = (n(n - 1)) / 2
 */

 // notacion del big o o(n^2)
public class InsertionSortExample {
    public static int insertionSort(int arr[]) { //aqui se crea la clase de insertion sort para luego poder llamarla
        int n = arr.length;  
        int operaciones = 0; //el contador sirve para ver el numero de comparaciones que se hace
        for (int i = 1; i < n; i++) {// este bucle sirve para recorrer el arreglo y compararlo para saber cual mover
            int key = arr[i];//se usa la variable key para guardar los valores y poder compararlos
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {// este while sirve para recorrer los valores mas grandes hacia la derecha
                arr[j + 1] = arr[j];
                j = j - 1;
                operaciones++;//el contador ve los movimientos y los va guardando
            }
            arr[j + 1] = key;
            
        }
        return operaciones;
    }
}

//este programa agarra el primer valor y lo compara con todos los elemmentos del arreglo y asi saber cual mover.