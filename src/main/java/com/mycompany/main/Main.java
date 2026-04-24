package com.mycompany.main;
import java.util.Scanner;
public class Main {
 static Scanner scanner = new Scanner(System.in);
    static Operaciones operaciones = new Operaciones();
    static ManejadorErrores errores = new ManejadorErrores();
    static Colecciones colecciones = new Colecciones();
    
    public static void main(String[] args) {
        int opcion;
        
        do {
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Sobrecarga de Métodos");
            System.out.println("2. Manejo de Errores");
            System.out.println("3. Colecciones");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    menuSobrecarga();
                    break;
                case 2:
                    menuErrores();
                    break;
                case 3:
                    menuColecciones();
                    break;
                case 4:
                    System.out.println("👋 ¡Hasta luego!");
                    break;
                default:
                    System.out.println("❌ Opción no válida");
            }
        } while (opcion != 4);
        
        scanner.close();
    }
    
    static void menuSobrecarga() {
        System.out.println("\n--- SOBRECARGA DE MÉTODOS ---");
        System.out.println("1. Sumar dos enteros");
        System.out.println("2. Sumar tres enteros");
        System.out.println("3. Sumar dos decimales");
        System.out.println("4. Concatenar textos");
        System.out.print("Elige: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
            case 1:
                System.out.print("Primer número: ");
                int n1 = scanner.nextInt();
                System.out.print("Segundo número: ");
                int n2 = scanner.nextInt();
                System.out.println("Resultado: " + operaciones.sumar(n1, n2));
                break;
            case 2:
                System.out.print("Primer número: ");
                int n3 = scanner.nextInt();
                System.out.print("Segundo número: ");
                int n4 = scanner.nextInt();
                System.out.print("Tercer número: ");
                int n5 = scanner.nextInt();
                System.out.println("Resultado: " + operaciones.sumar(n3, n4, n5));
                break;
            case 3:
                System.out.print("Primer decimal: ");
                double d1 = scanner.nextDouble();
                System.out.print("Segundo decimal: ");
                double d2 = scanner.nextDouble();
                System.out.println("Resultado: " + operaciones.sumar(d1, d2));
                break;
            case 4:
                System.out.print("Primer texto: ");
                String t1 = scanner.nextLine();
                System.out.print("Segundo texto: ");
                String t2 = scanner.nextLine();
                System.out.println("Resultado: " + operaciones.sumar(t1, t2));
                break;
        }
    }
    
    static void menuErrores() {
        System.out.println("\n--- MANEJO DE ERRORES ---");
        System.out.println("1. Dividir números");
        System.out.println("2. Convertir a entero");
        System.out.println("3. Acceder a array");
        System.out.print("Elige: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
            case 1:
                System.out.print("Dividendo: ");
                int a = scanner.nextInt();
                System.out.print("Divisor: ");
                int b = scanner.nextInt();
                System.out.println("Resultado: " + errores.dividir(a, b));
                break;
            case 2:
                System.out.print("Ingresa texto: ");
                String num = scanner.nextLine();
                System.out.println("Convertido: " + errores.convertirAEntero(num));
                break;
            case 3:
                int[] array = {10, 20, 30, 40, 50};
                System.out.print("Índice (0-4): ");
                int idx = scanner.nextInt();
                errores.accederArray(array, idx);
                break;
        }
    }
    
    static void menuColecciones() {
        System.out.println("\n--- COLECCIONES ---");
        System.out.println("1. Lista");
        System.out.println("2. Conjunto");
        System.out.println("3. Mapa");
        System.out.print("Elige: ");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
            case 1:
                System.out.print("Texto: ");
                colecciones.agregarLista(scanner.nextLine());
                colecciones.mostrarLista();
                break;
            case 2:
                System.out.print("Número: ");
                colecciones.agregarConjunto(scanner.nextInt());
                colecciones.mostrarConjunto();
                break;
            case 3:
                System.out.print("Clave: ");
                String clave = scanner.nextLine();
                System.out.print("Valor: ");
                int valor = scanner.nextInt();
                colecciones.agregarMapa(clave, valor);
                colecciones.mostrarMapa();
                break;
        }
    }
}
