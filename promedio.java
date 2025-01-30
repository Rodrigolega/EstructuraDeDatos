class Main {
    public static void main(String[] args) { 
        double[] calificaciones = {8.5, 9.2, 7.3}; 
        double suma = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        double promedio = suma / calificaciones.length;
        System.out.println("El promedio es: " + promedio);
    }
}
