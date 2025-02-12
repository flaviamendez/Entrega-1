package presentacion;

import dominio.Mates;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 8, 10};
        int[] lista2 = {2, 3, 4, 5, 6, 7, 8, 9}; // Para producto escalar

        // ✅ Métodos estáticos se llaman directamente con Mates
        System.out.println("Suma hasta 5: " + Mates.suma(5));
        System.out.println("Factorial de 5: " + Mates.calcularFactorial(5));
        System.out.println("Potencia de 2^5: " + Mates.calcularPotencia(2, 5));
        System.out.println("Suma de elementos de la lista: " + Mates.calcularSumaElementosLista(lista));
        System.out.println("Media aritmética de la lista: " + Mates.calcularMediaAritmetica(lista));
        System.out.println("Desviación típica de la lista: " + Mates.calcularDesviacionTipica(lista));
        System.out.println("Suma de los primeros números pares hasta 5: " + Mates.calcularSumaPares(5));
        System.out.println("Suma de los elementos pares de la lista: " + Mates.calcularSumaElementosParesLista(lista));
        System.out.println("Lista de pares hasta 9: " + Arrays.toString(Mates.calcularListaPar(9)));
        System.out.println("Producto escalar de dos listas: " + Mates.calcularProductoEscalarLista(lista, lista2));
        int[] listaPares1 = Mates.calcularListaPar(10);  
        int[] listaPares2 = Mates.calcularListaPar(10);  
        System.out.println("Producto escalar de los primeros números pares hasta 10: " + Mates.calcularProductoEscalarNoVacio(listaPares1, listaPares2));
    }
}
