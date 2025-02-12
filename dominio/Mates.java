package dominio;

import java.util.ArrayList;
import java.util.List;

public class Mates {

    // Suma de los números de 0 a n
    public static int suma(int n) {
        int resultado = 0;
        for (int i = 0; i <= n; i++) {
            resultado += i;
        }
        return resultado;
    }

    // Factorial de un número
    public static int calcularFactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    // Potencia de un número
    public static int calcularPotencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    // Suma de los elementos de una lista
    public static int calcularSumaElementosLista(int[] lista) {
        int resultado = 0;
        for (int num : lista) {
            resultado += num;
        }
        return resultado;
    }

    // Media aritmética de una lista
    public static double calcularMediaAritmetica(int[] lista) {
        if (lista.length == 0) return 0;
        int suma = calcularSumaElementosLista(lista);
        return (double) suma / lista.length;
    }

    // Desviación típica de una lista.
    public static double calcularDesviacionTipica(int[] lista) {
        if (lista.length == 0) return 0;
        double media = calcularMediaAritmetica(lista);
        double sumaCuadrados = 0;
        for (int num : lista) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumaCuadrados / lista.length);
    }

    // Suma de los primeros números pares hasta n
    public static int calcularSumaPares(int n) {
        int resultado = 0;
        for (int i = 2; i <= n; i += 2) {
            resultado += i;
        }
        return resultado;
    }

    // Suma de los elementos pares de una lista.
    public static int calcularSumaElementosParesLista(int[] lista) {
        int resultado = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                resultado += num;
            }
        }
        return resultado;
    }

    //Corrección: Lista de números pares hasta n (orden ascendente)
    public static int[] calcularListaPar(int n) {
        int[] resultado = new int[n / 2];
        int index = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                resultado[index++] = i;
            }
        }
        return resultado;
    }

    // Producto escalar de dos listas
    public static int calcularProductoEscalarLista(int[] lista1, int[] lista2) {
        if (lista1.length != lista2.length) {
            throw new IllegalArgumentException("Las listas deben tener el mismo tamaño");
        }
        int resultado = 0;
        for (int i = 0; i < lista1.length; i++) {
            resultado += lista1[i] * lista2[i];
        }
        return resultado;
    }

    //Producto escalar de dos listas de números no vacías y del mismo tamaño.
    public static int calcularProductoEscalarNoVacio(int[] lista1, int[] lista2) {
        if (lista1.length == 0 || lista2.length == 0) {
            throw new IllegalArgumentException("Las listas no deben estar vacías");
        }
        return calcularProductoEscalarLista(lista1, lista2);
    }
}
