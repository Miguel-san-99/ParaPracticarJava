package Logica;

public class Alumno extends Persona{
    
    String carrera;

    public Alumno() {
    }

    public Alumno(String carrera, int id, String dni, String name, String apellido, String domicilio, String telefono) {
        super(id, dni, name, apellido, domicilio, telefono);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
    public void estatus(double calificacion){
        if (calificacion >= 6){
            System.out.println("El alumno esta aprobado");
        }
        else{
            System.out.println("El alumno esta reprobado");
        }
    }
    
    public void saludar(){
        System.out.println("Hola soy un alumno");
    }
    public void saludar(String name){
        System.out.println("Hola soy un alumno y me dicen: " + name);
    }
    public void saludar(String name, int edad){
        System.out.println("Hola soy un alumno y me dicen " + name + " y tengo " + edad);
    }

    @Override
    public void reir() {
        System.out.println("Soy un alumno y asi rio jejejejeje");
    }
    
}
