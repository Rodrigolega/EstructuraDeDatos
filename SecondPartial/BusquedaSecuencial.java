public class BusquedaSecuencial {
    public int busqueda(int numero){
        int numeros[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int indexFinal = -1;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == numero){
                indexFinal = i;
            } 

        } 
        return (indexFinal);
    }
}

