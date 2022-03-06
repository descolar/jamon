/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jamon;

/**
 * Clase Main de la aplicación
 *
 * @author portatil_profesorado
 */
public class Main {

    public static void main(String[] args) {
        JamonEscolarGodinezDavid2122 miJamonEscolarGodinezDavid2122;
        int stockActual;

        miJamonEscolarGodinezDavid2122 = new JamonEscolarGodinezDavid2122("5Jotas", 580, 100);

        vendeJamEscolarGodinezDavid2122(miJamonEscolarGodinezDavid2122);

        compraJamEscolarGodinezDavid2122(miJamonEscolarGodinezDavid2122);
        stockActual = miJamonEscolarGodinezDavid2122.obtenerStock();
        System.out.println("El stock actual es " + stockActual);
    }

    /**
     *
     * Método que permite la compra de jamones y muestra por consola si la venta
     * se ha realizado correctamente o si ha habido algun fallo
     *
     * @param cantidad Cantidad de jamones a comprar
     * @throws Exception Si cantidad de jamones a comprar es inferior a 0
     *
     */
    private static void compraJamEscolarGodinezDavid2122(JamonEscolarGodinezDavid2122 miJamonEscolarGodinezDavid2122) {
        try {
            System.out.println("Compra de Jamones");
            miJamonEscolarGodinezDavid2122.comprar(50);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    /**
     *
     * Método que permite la venta de jamones y muestra por consola si la venta
     * se ha realizado correctamente o si ha habido algun fallo
     *
     * @param cantidad Cantidad de jamones a comprar
     * @throws Exception Si cantidad de jamones a comprar es inferior a 0
     *
     */
    private static void vendeJamEscolarGodinezDavid2122(JamonEscolarGodinezDavid2122 miJamonEscolarGodinezDavid2122) {
        try {
            System.out.println("Venta de Jamones");
            miJamonEscolarGodinezDavid2122.vender(80);
        } catch (Exception e) {
            System.out.print("Fallo al vender " + e);
        }
    }
}
