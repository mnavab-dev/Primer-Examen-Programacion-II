package Excercises;

import java.util.Arrays;

public class AnalisisconArreglosYBucles {

    
    
    public static void ejecutar(){
        int[] numeros = {45, 23, 67, 12, 89, 34, 56, 78, 91, 23, 45, 67, 34, 56, 78};
        int suma = 0;
        double promedio = 0;
        int numeroMayor = 0;
        int numeroMenor = numeros[0];
        int numeroMayorAlPromedio = 0;
        int cantidadPares = 0;

                // Cantidad de paress;
        for (int i : numeros){
            if (i % 2 == 0){
                cantidadPares ++;
                
            }
        }
        int numerosPares [] = new int[cantidadPares]; 
        cantidadPares = 0;
 
        System.out.println("Analisis de datos del array: "+ Arrays.toString(numeros));
        // Suma de todo el arrau
        for (int i : numeros){
            suma += i;
        }
        // promedio del array
        promedio = suma / numeros.length;

        // Numero Mayor del array
        for (int i : numeros){
            if(i > numeroMayor){
                numeroMayor = i;
            }
        }

        // numeroMenor del array
        for (int i : numeros){
            if (numeroMenor > i){
                numeroMenor = i;
            }
            
        }
        // Cuantos numeros mayores al promedio
        for(int i : numeros){
            if (i > promedio){
                numeroMayorAlPromedio ++;
            }
        }

        for (int i : numeros){
           if (i % 2 == 0){
                numerosPares[cantidadPares]  = i;
                cantidadPares ++;
            }

        }

        System.out.println("La suma de todos los elementos del arrat es: " + suma);
        System.out.println("El promedio del array es: " + promedio);
        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("El numero menor es " + numeroMenor);
        System.out.println("La cantidad de numeros mayores al promedio es de: " + numeroMayorAlPromedio);
        System.out.println("los numeros pares son: " + Arrays.toString(numerosPares));

        
    }
}