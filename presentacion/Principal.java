package presentacion;

import dominio.Mates;

public class Principal {
    public static void main(String[] args) {
        // Ejercicio 1: Suma de los primeros n números
        int n = 9;
        System.out.println("Suma de los primeros " + n + " números: " + Mates.suma(n));
        
        // Ejercicio 2: Cálculo del factorial de un número
        int numero = 5;
        System.out.println("Factorial de " + numero + ": " + Mates.calcularFactorial(numero));
        
        // Ejercicio 3: Cálculo de la potencia de un número
        int base = 2;
        int exponente = 3;
        System.out.println("Potencia de " + base + " elevado a " + exponente + ": " + Mates.calcularPotencia(base, exponente));
        
        // Ejercicio 4: Suma de los elementos de una lista
        int[] lista = {1, 2, 3, 4};
        System.out.println("Suma de los elementos de la lista: " + Mates.calcularSumaElementosLista(lista));
        
        // Ejercicio 5: Cálculo de la media aritmética de una lista
        System.out.println("Media aritmética de la lista: " + Mates.calcularMediaAritmetica(lista));
        
        // Ejercicio 6: Cálculo de la desviación típica de una lista
        System.out.println("Desviación típica de la lista: " + Mates.calcularDesviacionTipica(lista));
        
        // Ejercicio 7: Suma de los números pares hasta n
        System.out.println("Suma de los números pares hasta " + n + ": " + Mates.calcularSumaPares(n));
        
        // Ejercicio 8: Suma de los elementos pares de una lista
        System.out.println("Suma de los elementos pares de la lista: " + Mates.calcularSumaElementosParesLista(lista));
        
        // Ejercicio 9: Obtener lista de números pares de una lista
        System.out.println("Lista de números pares: " + Mates.obtenerListaPares(lista));
        
        // Ejercicio 10: Obtener lista de números pares hasta n
        System.out.println("Lista de números pares hasta " + n + ": " + Mates.obtenerListaParesHastaN(n));
        
        // Ejercicio 11: Producto escalar de dos listas
        int[] lista2 = {6, 7, 8, 9, 10};
        System.out.println("Producto escalar de las listas: " + Mates.calcularProductoEscalar(lista, lista2));
    }
}
