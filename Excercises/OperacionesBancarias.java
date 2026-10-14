package Excercises;
import java.util.Scanner;
import java.util.Random;

import model.CuentaBancaria;

public class OperacionesBancarias{
    static Scanner scanner = new Scanner(System.in);
    static CuentaBancaria cuentaBancaria = new CuentaBancaria();
    
    
   
    static int primerIngreso = 0;
    public static void ejecutar (){
        int opcionEjecutar = 0;
        // subeMenuCuentaBancaria();
        
        
        Random random = new Random();
        cuentaBancaria.setNumeroCuenta(random.nextInt(100000));
        cuentaBancaria.setSaldo(random.nextDouble(1000000));
        System.out.println("***Ejercicio 2 - Operaciones Bancarias***");
        System.out.println("Ingrese el nombre del titular");
        cuentaBancaria.setTitular(scanner.nextLine());
        System.out.println("\n1. Ingresar Datos bancarios - 9. Regresar");
        
        while (opcionEjecutar != 9){
        opcionEjecutar = scanner.nextInt();
        switch (opcionEjecutar) {
            case 1:
                
                subeMenuCuentaBancaria();
                break;
            case 9:
                System.out.println("Salir");
                break ;
            
            default:
                return;
        }}
    }

    public static void subeMenuCuentaBancaria(){
        int opcionSubmenu= 0;
        // scanner.next();

        // cuentaBancaria.set
        
        
        
        System.out.println("1.Hacer deposito");
        System.out.println("2.Hacer Retiro");
        System.out.println("3.Mostrar saldo");
        System.out.println("9. Salir");
        opcionSubmenu = scanner.nextInt();
        // while (opcionSubmenu != 9)
        switch (opcionSubmenu) {
            case 1: 
                cuentaBancaria.depositar();
                return;
            case 2:
                cuentaBancaria.retirar();
                return;
            case 3:
                cuentaBancaria.mostrarSaldo();
                return;
            case 9:
                // scanner.next();
                cuentaBancaria.mostrarSaldo();
                System.out.println("Cerrando...");  
                System.out.println("Presione 9 nuevamente y luego enter  para salir");
                // ejecutar();
                return; 

        
            default:
                break;
        }


    }
    

}