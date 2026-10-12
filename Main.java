import java.util.Arrays;

import model.Estudiante;


public class Main {
        public static void menu (){
        System.out.println("Menu");
        System.out.println("1.Ingresar Datos de Estudiante.");
        System.out.println("9.........................Salir");
    }
    

    public static void  main(String [] args){
        int opcion = 0;
        while (opcion != 9){
            Main.menu();

        }

        
        // Estudiante estudiante = new Estudiante();
        // estudiante.setIdentificacion("902");
        // estudiante.setMatricula(13);
        // estudiante.setNombre("Laila");
        // estudiante.setCalificaciones(new double[]{23,44,54});
        // System.out.println(estudiante.getCalificaciones());
        // System.out.println(Arrays.toString(estudiante.getCalificaciones()));

    }
}
