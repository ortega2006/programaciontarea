/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hogar
 */


import java.util.ArrayList;
import java.util.List;

public class Main {

    // Agregar producto al carrito
    static void agregarProducto(List<Double> carrito, double precio) {
        carrito.add(precio);
        System.out.println("Producto agregado: $" + precio);
    }

    // Calcular subtotal
    static double calcularSubtotal(List<Double> carrito) {
        double subtotal = 0;
        for (double precio : carrito) subtotal += precio;
        return subtotal;
    }

    // Calcular impuesto
    static double calcularImpuesto(double subtotal) {
        return subtotal * 0.16;
    }

    // Calcular total
    static double calcularTotal(double subtotal, double impuesto) {
        return subtotal + impuesto;
    }

    // Validar correo
    static boolean validarCorreo(String correo) {
        return correo.contains("@") && correo.contains(".");
    }

    // Mostrar carrito
    static void mostrarCarrito(List<Double> carrito) {
        for (int i = 0; i < carrito.size(); i++) {
            System.out.println("  Producto " + (i + 1) + ": $" + carrito.get(i));
        }
    }

    // Confirmar compra e imprimir reporte
    static void confirmarCompra(String correo, List<Double> carrito, double total) {
        System.out.println("\n=== REPORTE DE COMPRA ===");
        System.out.println("Correo del cliente: " + correo);
        mostrarCarrito(carrito);
        System.out.println("Total a pagar: $" + total);
        System.out.println("Gracias por su compra en Tienda Express!");
    }

    // Ejecutar pago automáticamente
    static void pagar(List<Double> carrito, String correo) {
        double subtotal = calcularSubtotal(carrito);
        double impuesto = calcularImpuesto(subtotal);
        double total = calcularTotal(subtotal, impuesto);

        System.out.println("\nSubtotal: $" + subtotal);
        System.out.println("Impuesto (16%): $" + impuesto);
        System.out.println("Total: $" + total);
        System.out.println("Correo del cliente: " + correo);

        if (!validarCorreo(correo)) {
            System.out.println("Correo invalido. Compra cancelada.");
            return;
        }

        confirmarCompra(correo, carrito, total);
        carrito.clear();
    }

    public static void main(String[] args) {
        List<Double> carrito = new ArrayList<>();
        String correo = "lilicalderon280@gmail.com";

        // Productos agregados automáticamente
        double[] productos = {20.0, 35.5, 10.25};
        for (double precio : productos) {
            agregarProducto(carrito, precio);
        }

        System.out.println("\n=== MENU SIMULADO ===");
        System.out.println("Se ejecutara la opcion de pagar automaticamente...\n");

        // Pagar automáticamente
        pagar(carrito, correo);
    }
}
