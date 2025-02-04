/*
 * imprimir lista de companeros de clase
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 04/02/2025
 */
class ListNames {

    public static void showNames() {
        String[] names = {
            "Rebeca", "Argel", "Leslie", "Jorge", "Rodrigo",
            "Oscar", "Carlo", "Cesar", "Justin", "Camila",
            "Sebastian", "Mario", "Sebastian 2", "Christhian"
        };

        //se hace una lista que contenga todos los nombres para no tener que poner manuelmente los numeros

        // Usamos un bucle for para imprimir todos los nombres mientras i sea menor a mi lista de nombres esta funcion se va a repetir
        for (int i = 0; i < names.length; i++) {
            System.out.println("Nombre " + (i + 1) + ": " + names[i]);
        }
    }
}
