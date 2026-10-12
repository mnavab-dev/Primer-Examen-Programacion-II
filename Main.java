import java.util.Arrays;
import java.util.Scanner;
import model.Estudiante;
import Excercises.GestionCalificaciones;


public class Main {
        public static void menu (){
        System.out.println("*****Menu*****");
        System.out.println("1.Ingresar datos de Estudiante.");
        System.out.println("9.Salir........................");
    }
    public static void subMenuEstudiante (){
        System.out.println("1.Ingresar todos los datos del estudiante");
        System.out.println("2.Modificar datos de estudiante.......... ");
        System.out.println("3.Consultar Estudiantes.................. ");
        System.out.println("9.Menu Principal..........................");
    }
    
    public static void  main(String [] args){
        int posicionEstudiante = 0;
        GestionCalificaciones gestionDeCalificaciones = new GestionCalificaciones();
        int opcion = 0;
        int subMenuOpcion = 0;
        Scanner scanner = new Scanner(System.in);
        while (opcion != 9){
            menu();
            opcion = scanner.nextInt();
            switch(opcion){
                case 1: subMenuEstudiante();
                        subMenuOpcion = scanner.nextInt(); 
                        switch (subMenuOpcion) {
                            case 1:
                                Estudiante estudiante = new Estudiante();
                                System.out.println("Ingresando datos....");
                                System.out.println("Ingrese la identificacion del estudiante");
                                estudiante.setIdentificacion(scanner.next());
                                System.out.println("Ingrese el nombre del Estudiante: ");
                                estudiante.setNombre(scanner.next());
                                System.out.println("Ingrese el numero de la matricula del estudiante: ");
                                estudiante.setMatricula(scanner.nextInt());
                               gestionDeCalificaciones.ejecutar(posicionEstudiante, estudiante);
                               posicionEstudiante ++;
                               if (posicionEstudiante == gestionDeCalificaciones.getEstudiantes().length){
                                System.out.println("Precaucion!! La lista de Estudiantes llena, volver a ingresar datos nuevos sobreescribira los datos actuales..");
                                System.out.println("Si desea modificar un estudiante en especifico pruebe la opcion 2.");
                                posicionEstudiante = 0;
                               }
                            //    System.out.println(Arrays.toString(gestionDeCalificaciones.getEstudiantes()));

                                break;
                            case 2:
                                System.out.println("Seleccione el estudiante a modificar:");
                                posicionEstudiante = scanner.nextInt();
                                break;
                            case 9:
                                System.out.println("Volviendo al menu principal");
                                opcion = 0;
                                menu();
                            default:
                                break;
                        }

                        break;
                case 9: System.out.println("Cerrando"); break;

            }

        }

        scanner.close();

        
        // Estudiante estudiante = new Estudiante();
        // estudiante.setIdentificacion("902");
        // estudiante.setMatricula(13);
        // estudiante.setNombre("Laila");
        // estudiante.setCalificaciones(new double[]{23,44,54});
        // System.out.println(estudiante.getCalificaciones());
        // System.out.println(Arrays.toString(estudiante.getCalificaciones()));

    }
}
