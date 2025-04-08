public class BinarySearch {
    public static int search (int[] arrayb, int  target) {
        int left = 0, right = arrayb.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arrayb[middle] == target) {
                return middle; // Elemento encontrado
            }
            if (arrayb[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1; //si no se encuentra el valor, se regresa -1
    }
   
}