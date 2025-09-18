/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculo;

/**
 *
 * @author Hogar
 */
// calculo de descuento en compras 
// estudiante : Lisset Mayerly Ortega Calderon
// fecha: 18/09/2025

public class descuento {
public static double calcularDescuento(double montoTotal, double porcentajeDescuento) {
        return montoTotal * (porcentajeDescuento / 100);
}
public static double calcularDescuento(double montoTotal) {
        return montoTotal * 0.10;
    }
 public static void main(String[] args) {
        // Ejemplo de monto
        double[] montos = {1000, 500, 200};
        double[] porcentajes = {15, 20, 5};
for (int i = 0; i < montos.length; i++) {
            double monto = montos[i];

            // Descuento por defecto (10%)
            double descuentoPorDefecto = calcularDescuento(monto);
            double montoFinalPorDefecto = monto - descuentoPorDefecto;

           
            double descuentoExplicito = calcularDescuento(monto, porcentajes[i]);
            double montoFinalExplicito = monto - descuentoExplicito;

           
            System.out.println("Compra de $" + monto + " con 10% de descuento (por defecto):");
            System.out.println("Descuento aplicado = $" + descuentoPorDefecto);
            System.out.println("Monto final a pagar = $" + montoFinalPorDefecto);

            System.out.println("\nCompra de $" + monto + " con " + porcentajes[i] + "% de descuento:");
            System.out.println("Descuento aplicado = $" + descuentoExplicito);
            System.out.println("Monto final a pagar = $" + montoFinalExplicito);
            System.out.println("---------------\n");
        }
    }
}
      