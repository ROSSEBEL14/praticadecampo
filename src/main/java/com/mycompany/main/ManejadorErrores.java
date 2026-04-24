/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Rossebel
 */
public class ManejadorErrores {
     public int dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("❌ Error: No se puede dividir por cero");
            return 0;
        }
    }
    
    public int convertirAEntero(String numero) {
        try {
            return Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            System.out.println("❌ Error: '" + numero + "' no es un número válido");
            return 0;
        }
    }
    
    public void accederArray(int[] array, int indice) {
        try {
            System.out.println("✓ Elemento: " + array[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Error: Índice " + indice + " fuera de rango");
        }
    }
    
}
