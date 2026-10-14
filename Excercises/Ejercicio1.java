package Excercises;
// import model.CuentaBancaria;
import model.Estudiante;
// import Excercises.GestionCalificaciones;

// import java.util.Arrays;
import java.util.Scanner;

// Clase Ejercicio 1 con posicionEstudiante para controlar en que parte del array estudiantes de GestionCalificaciones.java se van a guardar los datos de Estudiante.java actuales
public class Ejercicio1{
    // int subMenuCalificaciones = 0;
    static GestionCalificaciones gestionCalificaciones = new GestionCalificaciones();
    static int posicionEstudiante = 0;
    static Scanner scanner = new Scanner(System.in);
    static int estudiantesAprobados = 0;
    static int estudiantesReprobados = 0;
    
    // Controla el submenu del ejercicio 1, puede volver a Main.java si se presiona 9;
    public static void ejecutar(){   
        // int opcionSubmenu = 0;
        // Scanner scanner = new Scanner(System.in);
        int opcionEjecutar = 0;
        // opcionEjecutar = scanner.nextInt(); 
        while(opcionEjecutar != 9){
            System.out.println("***Ejercicio 1, Datos de Estudiante y Gestor de Calificaciones***");
            System.out.println("9. Salir - 1. Ingresar Datos de estudiante");
            opcionEjecutar = scanner.nextInt();
            switch (opcionEjecutar) {
                case 1:
                    subMenuCalificaciones();
                    break;
                case 9:
                    
                    break;
                    
                default:
                    break;
            }
        }         
    }
    // Gestor de datos de estudiante
    public static void subMenuCalificaciones(){
        // GestionCalificaciones gestionDeCalificaciones = new GestionCalificaciones();
        
        int opcionSubmenu= 0;
        
        Estudiante estudiante = new Estudiante();
        double calificaciones[] = new double[3];
        // Scanner scanner = new Scanner(System.in);
        System.out.println("1. Ingresar datos de estudiante");
        System.out.println("2. Modificar datos de estudiante");
        System.out.println("3. Consultar Estudiante");
        System.out.println("9. Volver.......................");
        opcionSubmenu = scanner.nextInt();
        if (opcionSubmenu < 1 || opcionSubmenu > 9){
            System.out.println("`\n\n\nOpcion invalida, por favor seleccione una opcion entre 1 y 9");
            System.out.println("1. Ingresar datos de estudiante");
            System.out.println("2. Modificar datos de estudiante");
            System.out.println("9. Volver.......................");
            opcionSubmenu = scanner.nextInt();

        }
       if (opcionSubmenu == 9){
        return;
       }
        
        while (opcionSubmenu != 9){
            // if (posicionEstudiante ==3 ){
                // posicionEstudiante = 0;
                // System.out.println("Precaucion! Ingresar datos nuevamente sobreescribira los datos actuales en el arreglo de GestionCalificaciones.java");
                // System.out.println("1. Sobreescribir");
                // System.out.println("2. Modificar datos existentes");
                
            //     opcionSubmenu = scanner.nextInt();
            // } 
            switch (opcionSubmenu) {
            case 1:
                System.out.println("Ingrese la identificacion del estudiante. ");
                estudiante.setIdentificacion(scanner.next());
                scanner.nextLine();
                System.out.println("Ingrese el nombre del Estudiante:");
                estudiante.setNombre(scanner.nextLine());
                System.out.println("Ingrese el numero de matricula");
                estudiante.setMatricula(scanner.nextInt()); //Limpia la linea restante del scanner para poder asignar input al siguiente scanner;
                for (int i = 0; i < calificaciones.length; i++){
                    System.out.println("Ingrese la calificacion " +(i+1));
                    calificaciones[i] = scanner.nextDouble();
                }
                estudiante.setCalificaciones(calificaciones);
                System.out.println("Estuante: " + estudiante.getNombre() + " Aprobado? " + estudiante.getAprobado(false));
                if (estudiante.getAprobado(true)){
                    estudiantesAprobados++;
                } else{
                    estudiantesReprobados ++;
                }
                // subMenuCalificaciones();
                gestionCalificaciones.ejecutar(posicionEstudiante, estudiante);
                posicionEstudiante ++;
                
                return;
            case 3:
                for (Estudiante i : gestionCalificaciones. getMostrarInformacion()){
                    if(i != null){
                        System.out.println(i);
                    }

                    
                }
                System.out.println("Estudiantes aprobados: " + estudiantesAprobados);
                System.out.println("Estudiantes reprobados " + estudiantesReprobados );
                return;
            
            case 9:
                System.out.println("Cerrando...");
                return;
                // break;
            default:
                break;
        }
             
        }

        scanner.close();
        
        
    }

    
}

