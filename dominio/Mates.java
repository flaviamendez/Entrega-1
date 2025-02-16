package dominio;

import java.util.ArrayList;

public class Mates {

    //Ejercicio 1
    public static int suma(int n) {
        int resultado = 0;  
        for (int i = 0; i <= n; i++) {  
            resultado += i;  
        }
        return resultado;  
    }

    //Ejercicio 2
    public static int calcularFactorial(int n) {
        int f = 1;  // Inicializamos el factorial a 1
        for (int i = 1; i <= n; i++) {  // Recorremos desde 1 hasta n
            f *= i;  // Multiplicamos f por cada valor de i
        }
        return f;  // Devolvemos el resultado del factorial
    }

    //Ejercicio 3
    public static int calcularPotencia (int base, int exponente) {
        int resultado = 1;  
        for (int i = 1; i <= exponente ; i++) {  
            resultado *= base;  
        }
        return resultado;  
    }

    //Ejercicio 4
    public static int calcularSumaElementosLista (int[] lista) {
        int resultado = 0;  
        for (int i = 0; i<lista.length; i++) {  
            resultado += lista[i] ;  
        }
        return resultado;  
    }

    //Ejercicio 5
    public static double calcularMediaAritmetica (int[] lista) {
        int resultado = 0;  
        for (int i = 0; i<lista.length; i++) {  
            resultado += lista[i];
        }
        return (double) resultado/lista.length;  
    }

    //Ejercicio 6
    public static double calcularDesviacionTipica (int[] lista) {
        //Paso 1: Calcular la media
        double suma = 0;  
        for (int i = 0; i<lista.length; i++) {  
            suma += lista[i];
        }
        double media = suma/lista.length; 

        //Paso 2: Calcular la suma de los cuadrados de las desviaciones
        double sumaCuadrados = 0;
        for(int i = 0; i<lista.length; i++) {
            sumaCuadrados += Math.pow(lista[i]-media,2);
        }
        
        //Paso 3: Calcular la varianza
        double varianza = sumaCuadrados/lista.length;

        //Paso 4: Calcular la desviación típica
        return Math.sqrt(varianza);
    }

    //Ejercicio 7
    public static int calcularSumaPares (int n) {
        int resultado = 0;  
        for (int i = n - 1; i>=2; i--) { 
            if(i%2 == 0) {
                resultado += i;
            } 
        }
        return resultado;  
    }

    //Ejercicio 8
    public static int calcularSumaElementosParesLista (int[] lista) {
        int resultado = 0;  
        for (int i = 0; i<lista.length; i++) {  
            if(lista[i]%2 == 0)
            resultado += lista[i] ;  
        }
        return resultado;  
    }

    //Ejercicio 9
    public static ArrayList<Integer> obtenerListaPares(int[] lista){
        ArrayList<Integer> listaPares = new ArrayList<>();  
        for (int i = 0; i<lista.length; i++) {  
            if(lista[i]%2 == 0)
            listaPares.add(lista[i]);  
        }
        return listaPares;  
    }

    //Ejercicio 10
    public static ArrayList<Integer> obtenerListaParesHastaN (int n) {
        ArrayList<Integer> listaPares = new ArrayList<>(); 
        for (int i = n - 1; i>=2; i--) { 
            if(i%2 == 0) {
                listaPares.add(i);
            } 
        }
        return listaPares;  
    }

    //Ejercicio 11
    public static int calcularProductoEscalar (int[] lista1, int[] lista2) {
        int resultado = 0;
        for (int i = 0; i<lista1.length; i++) { 
            resultado += lista1[i] * lista2[i];
        }
        return resultado;
    }
    
}