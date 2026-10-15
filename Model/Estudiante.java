package model;

import java.util.Arrays;

public class Estudiante {
    private String identificacion;
    private String nombre;
    private int matricula;
    private double [] calificaciones = new double [3];
    // private int promedio;
    public Estudiante (String identificacion, String nombre, int matricula, double[] calificaciones ){
    this.identificacion = identificacion;
    this.nombre = nombre;
    this.matricula = matricula;
    this.calificaciones = calificaciones;
    }

public Estudiante(){

}



public String getIdentificacion (){
    return identificacion;

}

public String getNombre (){
    return nombre;
}

public int getMatricula(){
    return matricula;
}

public double [] getCalificaciones () {
    return calificaciones;
}

public double getCalcularPromedio (){
     double promedio = 0;
     for (int i = 0; i < calificaciones.length; i++){
        promedio += calificaciones[i];
     }
     return (promedio / calificaciones.length);
}

public boolean getAprobado (boolean approbado){
    if (getCalcularPromedio( ) >= 70){
        approbado = true;
    } else {
        approbado = false;
    }
    return approbado;   
}

@Override 
public String toString(){
    return "Datos del estudiante"+ " Identificacion: " + identificacion 
    + " Nombre: " + nombre + "Matricula: " + matricula + "Calificaciones: " + Arrays.toString(calificaciones) + "Promedio" + getCalcularPromedio() + "Aprobado? " + getAprobado(false);
}
public void mostrarInformacion (){
    System.out.println(getNombre());
    System.out.println(getMatricula());
    System.out.println("Calificaciones: ");
    // for(double i : getCalificaciones()){
    //     System.out.println(i);
    // }
    System.out.println(Arrays.toString(calificaciones));
}

public void setIdentificacion (String identificacion) {
    this.identificacion = identificacion;
}

public void setNombre (String nombre){
    this.nombre = nombre;
}
public void setMatricula (int matricula) {
    this.matricula = matricula;

}

public void setCalificaciones (double [] calificaciones){
    this.calificaciones[0] = calificaciones[0];
    this.calificaciones[1] = calificaciones[1];
    this.calificaciones[2] = calificaciones[2];
}





}

