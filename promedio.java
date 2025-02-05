/*
 * imprimir lista de companeros de clase
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 05/02/2025
 */

public class Promedio {
    public void prom() { 
        double[] calificaciones = {8.5, 9.2, 7.3}; 
        double suma = 0;
// se usa doble para hacer la suma y poder sacar el promedio despues dividiendolo por el tamano de la lista
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        double promedio = suma / calificaciones.length;
        System.out.println("El promedio es: " + promedio);


    

    }
}
