/*
 * imprimir nombre usando variables del main
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 06/02/2025
 */

public class UserData {
    public String fullName(String firstName, String lastName) {
        
        //el % es para indicar que ahi ira la variable
        return String.format("el nombre es: %s %s", firstName, lastName);
        //el format es para juntar dos variables pero consume mas recursos
        // el ejemplo de arriba es interpolacion

        //firstName + lastName // concatenacion
    }
}
