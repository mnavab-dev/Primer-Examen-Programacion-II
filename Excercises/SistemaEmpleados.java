package Excercises;
import java.util.Scanner;

// import model.CuentaBancaria;
import model.Empleado;

public class SistemaEmpleados {
    private Empleado [] empleados = new Empleado [4];
    

    public Empleado[] getMostrarInformacion (){
    return empleados;


}




// static int posicionEmpleado = 0;
public void agregarEmpleado(int posicionEmpleado, Empleado empleado){
    this.empleados[posicionEmpleado] = empleado;
}



public static void ejecutar (){
    // SistemaEmpleados sistema = new SistemaEmpleados();
    Scanner scanner = new Scanner(System.in);
    int opcionEjecutar = 0;
    System.out.println("Sistema de Empleados");
    System.out.println("1. Sistema de empleados");
    opcionEjecutar = scanner.nextInt();
    if (opcionEjecutar == 1){
        subMenuSistemaEmpleados();
    }
  



}
//   scanner.close();

public static void subMenuSistemaEmpleados(){
    
    SistemaEmpleados sistemaEmpleados = new SistemaEmpleados();
    Scanner scanner = new Scanner(System.in);
    // int controladorPresentacion = 0;
    double totalSalario = 0;
    double totalBono = 0;
    int posicionEmpleado = 0;
    int opcionSubmenu = 0;
    while (opcionSubmenu !=9){
    System.out.println("1.Agregar empleado");
    System.out.println("2. Consultar Informacion de empleados registrados");
    System.out.println("3. Presentarse");
    System.out.println("9. Salir");
    System.out.println("9. Salir");
    opcionSubmenu = scanner.nextInt();
    scanner.nextLine();
        switch (opcionSubmenu) {
        case 1:
            if (posicionEmpleado >= 4){
                System.out.println("Precaucion! Base de datos de empleado llena, hacer mas entradas va a sustituir la informacion actual.");
                posicionEmpleado = 0;
            }
            Empleado empleado = new Empleado("", 0);
            
            System.out.println("Digite el nombre del empleado: ");
            empleado.setNombre(scanner.nextLine());
            scanner.nextLine();
            System.out.println("Digite el numero de empleado");
            empleado.setNumeroEmpleado(scanner.nextInt());
            // scanner.next();
            System.out.println("Digite la edad del empleado: ");
            empleado.setEdad(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Ingrese el Salario anual: ");
            empleado.setSalario(scanner.nextDouble());
            scanner.nextLine();
            totalSalario += empleado.getSalario();
            totalBono += empleado.getCalcularBono();

            if (posicionEmpleado < sistemaEmpleados.getMostrarInformacion().length){
                sistemaEmpleados.agregarEmpleado(posicionEmpleado, empleado);
                // System.out.println(sistemaEmpleados.getMostrarInformacion());
                posicionEmpleado ++;
            }


            break;
        case 2:
            for (int i = 0; i < sistemaEmpleados.getMostrarInformacion().length; i++){
                if (sistemaEmpleados.getMostrarInformacion()[i] != null){
                    System.out.println(sistemaEmpleados.getMostrarInformacion()[i]);
                    
                }
                System.out.println("Salario total de los empleados: " + totalSalario);
                System.out.println("Bono total de los empleados: " + totalBono);
            }
        case 3:
           for (Empleado i : sistemaEmpleados.getMostrarInformacion()){
                if (i != null) {
                    i.presentarse();
                }
                break;
           }

        case 9: 
            break;
            
    
        default:
            break;
    }
    // scanner.close();
    }
    // scanner.close();

}



}