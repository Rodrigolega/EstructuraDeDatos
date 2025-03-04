/*
 * imprimir aleatoriamente piedra papel o tijera
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 05/02/2025
 */

import java.util.Random;
// se imprime el paquete para que el random funcione
class Piedrapap {
    public void startGame() {
        String[] opciones = {"piedra", "papel", "tijera"};
        Random random = new Random();
        //se usa la funcion random para que elija entre piedra papel o tijera
        int indice = random.nextInt(opciones.length);
        
        System.out.println(opciones[indice]);
    }
}