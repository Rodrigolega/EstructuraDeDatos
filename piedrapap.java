import java.util.Random;

class piedrapap {
    public static void main(String[] args) {
        String[] opciones = {"piedra", "papel", "tijera"};
        Random random = new Random();
        
        int indice = random.nextInt(opciones.length);
        
        System.out.println(opciones[indice]);
    }
}