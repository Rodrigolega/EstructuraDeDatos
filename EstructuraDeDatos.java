/*
 * codigo main de los programas
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 12/02/2025
 */
import java.util.Scanner;
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

        //calcular el area de un triangulo
        //Scanner objScanner = new Scanner(System.in);
        //se usa scanner para usar su biblioteca y poder sacar la altura, esta se tiene que importar al inicio del main
        //System.out.print("Ingresa la base del triangulo: ");
        //double base = objScanner.nextDouble();

        //System.out.print("Ingresa la altura del triangulo: ");
        //double height = objScanner.nextDouble();

        //TriangleArea objTriangle = new TriangleArea();
        //double area = objTriangle.calculateArea(base, height);

        //System.out.println(String.format("El área del triángulo con base %.2f y altura %.2f es de: %.2f", base, height, (base * height) / 2));
        
        //objScanner.close();


        //calcular el area de un circulo
        //Scanner objScanner1 = new Scanner(System.in);
        //se usa scanner para usar su biblioteca y poder sacar la altura, esta se tiene que importar al inicio del main
        //System.out.print("Ingresa el radio del circulo: ");
        //double radio = objScanner1.nextDouble();

        
        //CircleArea objCircle = new CircleArea();
        //double area1 = objCircle.calculateAreaCircle(radio);
        
        //System.out.println(String.format("El área del circulo con radio %.2f es de %.2f: ", radio, area1));
                
        //objScanner1.close();

        //imprimir lista de objetos ejemplo

        ArrayListExample objArrayExample = new ArrayListExample();
        objArrayExample.addCars("Mazda");
        objArrayExample.addCars("Chevrolet");
        objArrayExample.removeCar();

        System.out.println(objArrayExample.returnSize());


    }
}

            
        


