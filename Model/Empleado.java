package model;

public class Empleado extends Persona{
    private  int numeroEmpleado;
    private double salario;

    public Empleado (String nombre, int edad ){
        super(nombre, edad);
        this.numeroEmpleado = 0;
        this.salario = 0;
    }

    @Override
    public String toString() {
    return "Nombre: " + getNombre() + "\nNumero de empleado:" + getNumeroEmpleado() + "\nEdad: " + getEdad() + "\nSalario: " + getSalario() +"\n Bono anual: " + getCalcularBono();
}

    public int getNumeroEmpleado(){
        return numeroEmpleado;
    }

    public double getSalario(){
        return salario;
    }

    public void setNumeroEmpleado(int numeroEmpleado){
        this.numeroEmpleado =  numeroEmpleado;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getCalcularBono(){
        return salario * 0.15;
    }

    public void mostrarInformacion(){
        // System.out.println(presentarse());
        System.out.println("Numero de empleado: " + getNumeroEmpleado());
        System.out.println("Salario: " + getSalario());
        System.out.println("Bono Anual: " + getCalcularBono() );

    }

        public void presentarse(){
        System.out.println("Mi nombre es: " + getNombre() + "y tengo" + getEdad() +" años"); 

    }
}

