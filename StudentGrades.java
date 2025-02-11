/*
 * Ejercicio StudentGrades
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 11/02/2025
 */

public class StudentGrades {

    public int calculatePartialGrade(int examScore, int homeworkScore) {
        double firstPartialGrade = (examScore * 0.7 + homeworkScore * 0.3);
        return (int) (firstPartialGrade);
    }

    public int calculateFinalGrade(int firstPartial, int secondPartial, int thirdPartial, int finalExam) {
        double finalSemesterGrade = ((firstPartial + secondPartial + thirdPartial) / 3);
        double totalFinal = (finalExam * 0.5 + finalSemesterGrade * 0.5);
        return (int) (totalFinal);
    }

    // se crea el punto tres para calcular si el estudiante reprueba por faltas
    public String calculateFailByAbsences(int totalHours, int absences) {
        double misses = ((double) absences / totalHours) * 100;
        // se usa double para redondear y se calcula el porcentaje a ver si aprueba
        if (misses > 10.0) {
            return "Estas reprobado por inasistencias";
            // si las veces que falto son menores al 10 por ciento aprueba

        }

        else {
            return "tienes las asistencias minimas";

        }

    }

}
