// import java.util.Arrays;
import java.util.Scanner;
// import model.Estudiante;
// import Excercises.GestionCalificaciones;
import Excercises.Ejercicio1;
import Excercises.OperacionesBancarias;
import Excercises.SistemaEmpleados;


public class Main {
        public static void menu (){
        System.out.println("******Menu Examen Programacion II******");
        System.out.println("1.Ingresar datos de Estudiante.........");
        System.out.println("2.Operaciones Bancarias................");
        System.out.println("3.Gestion de empleados..................");
        System.out.println("Analisis de datos con Arreglos y bucles");
        System.out.println("9.Salir................................");
    }
    // public static void subMenuEstudiante (){
    //     System.out.println("1.Ingresar todos los datos del estudiante");
    //     System.out.println("2.Modificar datos de estudiante.......... ");
    //     System.out.println("3.Consultar Estudiantes.................. ");
    //     System.out.println("9.Menu Principal..........................");
    // }
    
    public static void  main(String [] args){
        // int posicionEstudiante = 0;
        // GestionCalificaciones gestionDeCalificaciones = new GestionCalificaciones();
        int opcion = 0;
        
        // System.out.println(opcion);
        // int subMenuOpcion = 0;
        Scanner scanner = new Scanner(System.in);
        while (opcion != 9 ){
            menu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Ejercicio1.ejecutar();
                    opcion = 0;
                    // scanner.next();
                    break; //***Break siempre entre casos!! */
                    // opcion = scanner.nextInt();
                case 2:
                    OperacionesBancarias.ejecutar();
                    opcion = 0;
                    break;
                case 3:
                    SistemaEmpleados.ejecutar();
            
                default:
                    menu();
                    break;
            }
        }


        scanner.close();

    }
}
