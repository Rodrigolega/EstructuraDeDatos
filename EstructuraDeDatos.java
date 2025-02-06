/*
 * codigo main de los programas
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 06/02/2025
 */

public class EstructuraDeDatos {
    public static void main(String[] args) {
       ListNames objListNames = new ListNames();
       objListNames.showNames();
       
        Piedrapap objPiedrapap = new Piedrapap();
        objPiedrapap.startGame();
    
        Promedio objPromedio = new Promedio();
        objPromedio.prom();

        //problema de nombre y apellido
        UserData objUserData = new UserData();
        String fullName = objUserData.fullName("Rodrigo", "Legarreta");
        //aqui se crea el objeto y se mandan las variables para que lo imprima usando interpolacion osea se suman
        System.out.println(fullName);

    }
    
}
