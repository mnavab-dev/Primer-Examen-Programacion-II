package Excercises;

import model.Estudiante;

public class GestionCalificaciones{
    private Estudiante[] estudiantes  = new Estudiante[3];

public Estudiante [] getEstudiantes (){
    return estudiantes;
}

public void ejecutar(int posicion, Estudiante estudiante){
    this.estudiantes[posicion] = estudiante;
}

// public void verDatos (){
//     for( i : estudiantes){
        
//     }
}


