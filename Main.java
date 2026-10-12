import java.util.Arrays;
import java.util.Scanner;
import model.Estudiante;


public class Main {
        public static void menu (){
        System.out.println("Menu");
        System.out.println("1.Ingresar datos de Estudiante.");
        System.out.println("9.Salir........................");
    }
    public static void subMenuEstudiante (){
        System.out.println("1.Ingresar todos los datos del estudiante");
        System.out.println("2.Modificar datos de estudiante.......... ");
        System.out.println("3.Consultar Estudiantes.................. ");
        System.out.println("Menu Principal...........................");
    }
    

    public static void  main(String [] args){
        int posicionEstudiante = 0;
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        while (opcion != 9){
            menu();
            opcion = scanner.nextInt();
            switch(opcion){
                
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
