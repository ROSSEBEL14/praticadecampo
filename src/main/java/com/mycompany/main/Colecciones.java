package com.mycompany.main;
import java.util.*; 
public class Colecciones {
        private List<String> lista = new ArrayList<>();
    private Set<Integer> conjunto = new HashSet<>();
    private Map<String, Integer> mapa = new HashMap<>();
    
    public void agregarLista(String elemento) {
        lista.add(elemento);
        System.out.println("✓ Agregado a lista: " + elemento);
    }
    
    public void mostrarLista() {
        System.out.println("Lista: " + lista);
    }
    
    public void agregarConjunto(int numero) {
        if (conjunto.add(numero)) {
            System.out.println("✓ Agregado a conjunto: " + numero);
        } else {
            System.out.println("⚠ Ya existe: " + numero);
        }
    }
    
    public void mostrarConjunto() {
        System.out.println("Conjunto: " + conjunto);
    }
    
    public void agregarMapa(String clave, int valor) {
        mapa.put(clave, valor);
        System.out.println("✓ Agregado a mapa: " + clave + " => " + valor);
    }
    
    public void mostrarMapa() {
        System.out.println("Mapa: " + mapa);
    }
    
}
