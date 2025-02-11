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

        // problema de nombre y apellido
        UserData objUserData = new UserData();
        String fullName = objUserData.fullName("Rodrigo", "Legarreta");
        // aqui se crea el objeto y se mandan las variables para que lo imprima usando
        // interpolacion osea se suman
        System.out.println(fullName);

        // problema de calificacion de estudiantes llamar a la clase studentgrades
        StudentGrades objStudentGrades = new StudentGrades();
        int calculatePartialGrade = objStudentGrades.calculatePartialGrade(85, 90);
        System.out.println("Calificacion del parcial: " + calculatePartialGrade);

        int totalFinal = objStudentGrades.calculateFinalGrade(80, 75, 90, 85);
        System.out.println("Calificacion final del semestre: " + totalFinal);

        String calculateFailByAbsences = objStudentGrades.calculateFailByAbsences(64, 7);
        System.out.println(calculateFailByAbsences);

    }

}
