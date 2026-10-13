package Excercises;
import java.util.Scanner;

import model.CuentaBancaria;

public class Ejercicio2{
    static Scanner scanner = new Scanner(System.in);
    

    public static void ejecutar (){
        int opcionEjecutar = 0;
        // subeMenuCuentaBancaria();
        
        System.out.println("***Ejercicio 2 - Operaciones Bancarias***");
        System.out.println("\n1. Ingresar Datos bancarios - 9. Regresar");
        opcionEjecutar = scanner.nextInt();
        switch (opcionEjecutar) {
            case 1:
                subeMenuCuentaBancaria();
                break;
            case 9:
                break;
        
            default:
                return;
        }
    }

    public static void subeMenuCuentaBancaria(){
        int opcionSubmenu= 0;
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        System.out.println("1.Ingresar datos de cuenta");
        System.out.println("2.Hacer deposito");
        System.out.println("3.Hacer retiro");
        System.out.println("4. Mostrar saldo");
        opcionSubmenu = scanner.nextInt();
        switch (opcionSubmenu) {
            case 2:
                cuentaBancaria.depositar();
                break;
        
            default:
                break;
        }


    }
    

}