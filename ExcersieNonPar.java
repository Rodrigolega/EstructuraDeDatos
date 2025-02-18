/*
 * imprimir cuantos pares e impares hay
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 04/02/2025
 */


public class ExcersieNonPar {
    public void CalculateNonePar() {
        int[] numeros = {
            0, 2, 5, 8, 11, 14, 17, 20, 23, 26, 
            29, 32, 35, 38, 41, 44, 47, 50, 53, 56, 
            59, 62, 65, 68, 71, 74, 77, 80, 83, 86, 
            89, 92, 95, 98, 0, 3, 6, 9, 12, 15, 
            18, 21, 24, 27, 30, 33, 36, 39, 42, 45
        };

        int even = 0;
        int odd = 0;
        int zero = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0) {
                zero++;
            } else if (numeros[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Cantidad de ceros: " + zero);
        System.out.println("Cantidad de números pares: " + even);
        System.out.println("Cantidad de números impares: " + odd);
    }

}
