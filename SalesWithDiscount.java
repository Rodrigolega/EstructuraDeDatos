
/*
 * examen parcial 1 programas
 * Autor: Rodrigo Legarreta Soto
 * matricula: 15068
 * dia: 24/02/2025
 */

public class SalesWithDiscount {
    public void totalWithDiscount() {

        double[] sales = {
                100.0, 200.0, 150.0,
        };
        double totalSales = 0;

        for (int i = 0; i < sales.length; i++) {
            double discount = (sales[i] * 0.9);

            totalSales += discount;
        }

        System.out.println("La sumatotal de ventas con el 10% de descuento es: " + totalSales);
    }
}