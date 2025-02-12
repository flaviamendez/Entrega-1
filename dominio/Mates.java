package dominio;

import java.util.ArrayList;
import java.util.List;

public class Mates {

    // ✅ Todos los métodos ahora son `static`
    
    public static int suma(int n) {
        int resultado = 0;
        for (int i = 0; i <= n; i++) {
            resultado += i;
        }
        return resultado;
    }

    public static int calcularFactorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int calcularPotencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static int calcularSumaElementosLista(int[] lista) {
        int resultado = 0;
        for (int num : lista) {
            resultado += num;
        }
        return resultado;
    }

    public static double calcularMediaAritmetica(int[] lista) {
        if (lista.length == 0) return 0;
        int suma = calcularSumaElementosLista(lista);
        return (double) suma / lista.length;
    }

    public static double calcularDesviacionTipica(int[] lista) {
        if (lista.length == 0) return 0;
        double media = calcularMediaAritmetica(lista);
        double sumaCuadrados = 0;
        for (int num : lista) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumaCuadrados / lista.length);
    }

    public static int calcularSumaPares(int n) {
        int resultado = 0;
        for (int i = 2; i <= n; i += 2) {
            resultado += i;
        }
        return resultado;
    }

    public static int calcularSumaElementosParesLista(int[] lista) {
        int resultado = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                resultado += num;
            }
        }
        return resultado;
    }

    // ✅ Método corregido para obtener la lista de pares
    public static int[] calcularListaPar(int n) {
        int[] resultado = new int[n / 2];
        int index = 0;
        for (int i = n; i >= 2; i--) {
            if (i % 2 == 0) {
                resultado[index++] = i;
            }
        }
        return resultado;
    }

    // ✅ Producto escalar de dos listas del mismo tamaño
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
}
