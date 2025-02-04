import java.util.Random;

class Piedrapap {
    public void startGame() {
        String[] opciones = {"piedra", "papel", "tijera"};
        Random random = new Random();
        
        int indice = random.nextInt(opciones.length);
        
        System.out.println(opciones[indice]);
    }
}