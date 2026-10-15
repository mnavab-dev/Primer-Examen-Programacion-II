package model;
import java.util.Scanner;
// import Excercises.OperacionesBancarias;

public class CuentaBancaria {
    private int numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria (int numeroCuenta, String titular, double saldo){
    this.numeroCuenta = numeroCuenta;
    this.titular = titular;
    this.saldo = saldo;
  
}

public CuentaBancaria (){
    
}

public int getNumeroCuenta(){
    return numeroCuenta;
}   

public String getTitular(){
    return titular;
}

public double getSaldo(){
    return saldo;
}

public void setSaldo (double saldo){
    this.saldo = saldo;
}


public void mostrarSaldo(){
    System.out.println("Titular "  + getTitular());
    System.out.println("Numero de cuenta CR"+getNumeroCuenta());
    System.out.println("Saldo  " + getSaldo());
}

// public void 

public void depositar (){
    double cantidad = 0;
    int controladorDeposito = 0;
    // double exceptionCheck =10;
    Scanner scanner = new Scanner(System.in);
    // Scanner scanner = scanner.system.in
    System.out.println("1. Deposito Bancario");
    System.out.println("2. Saldo disponible: "+getSaldo());
    controladorDeposito = scanner.nextInt();
    // System.out.println("Ingrese el monto a depositar.");

    while(controladorDeposito != 9){
        switch (controladorDeposito) {
            case 1:
            System.out.println("Ingrese el monto a depositar");
            cantidad = scanner.nextDouble();
            
            try
            {   
                // exceptionCheck = exceptionCheck / cantidad;
                
                if (cantidad < 0){
                    throw new ArithmeticException("El monto no puede ser menor a 0");
                }
                saldo += cantidad ;

            }
            catch(ArithmeticException e)
            {
                System.out.println("Error.... No es posible hacer el deposito. El monto no puede ser menor a 0");
            }
                System.out.println(saldo);
                System.out.println("Continuar? - 1 Salir - 9");
                // scanner.next();
                controladorDeposito = scanner.nextInt();
            

                break;
            case 9:
                
                break;
        
            default:
                // scanner.close();
                return;
        }
        scanner.close();
    }
        

    }

    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;

    }

    public void setTitular (String titular){
        this.titular = titular;
    }

    public void retirar (){
        double cantidad = 0;
        int controladorRetiro;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saldo disponible: " +getSaldo());
        System.out.println("1. Retirar dinero");
        System.out.println("9.Regresar");
        controladorRetiro = scanner.nextInt();

        while (controladorRetiro != 9){
            switch (controladorRetiro) {
                case 1:
                    System.out.println("Ingrese el monto a retirar: ");
                    cantidad = scanner.nextDouble();
                    try
                {   
                if (cantidad < 0){
                    throw new ArithmeticException("El monto no puede ser menor a 0");
                }
                if (saldo >= cantidad){
                    saldo -= cantidad ;
                } else {
                    throw new ArithmeticException("Fondos insuficientes");
                }
                


            }
            catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }
                // System.out.println(saldo);
                System.out.println("Saldo disponible"  + saldo);
                System.out.println("Continuar? - 1 Salir - 9");
                controladorRetiro = scanner.nextInt();
                
                    
                    
                    break;
                case 9:
                    mostrarSaldo();
                    scanner.close();
                    break;
                default:
                    break;
            }
        }
    }
    
    
    
}

// }

