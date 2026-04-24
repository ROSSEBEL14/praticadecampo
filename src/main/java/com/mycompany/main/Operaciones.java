/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Rossebel
 */
public class Operaciones {
       
    // Sobrecarga: suma de dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }
    
    // Sobrecarga: suma de tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    // Sobrecarga: suma de decimales
    public double sumar(double a, double b) {
        return a + b;
    }
    
    // Sobrecarga: concatenar strings
    public String sumar(String a, String b) {
        return a + " " + b;
    }
}
    

