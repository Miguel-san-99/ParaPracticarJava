package Logica;

import Gui.Pantalla;
import java.util.Scanner;

/**
 *
 * @author sanchezmagana
 */
public class ParaPracticar {
    public static void main(String[] args) {
        /**
        Pantalla pantalla = new Pantalla();
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
        **/
        sobrecarga();
    }
    public static void sentencias_if_else(){
        /**
         * SENTENCIAS IF ELSE
         */
        int num1 = 5;
        int num2 = 10;
        if (num2 > num1){
            System.out.println("num2 es mayor que num1");
        }
        else{
            System.out.println("num1 es mayor que num2");
        }
    }
    public static void sentencia_switch(){
        int dia = 5;
        String nombreDia;
        
        switch(dia){
            case 1: nombreDia="Lunes";
            break;
            case 2: nombreDia="Martes";
            break;
            case 3: nombreDia="Miercoles";
            break;
            case 4: nombreDia="Jueves";
            break;
            case 5:
                nombreDia="Viernes";
                break;
            case 6:
                nombreDia="Sabado";
                break;
            case 7:
                nombreDia="Domingo";
                break;
            default: nombreDia="Numero de dia invalido";
            break;
        }
        System.out.println("El dia de la semana seleccionado es: " + nombreDia);
    }
    public static void operador_ternario(){
        double promedio;
        String calificacionFinal;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la calificacion del alumno: ");
        promedio = teclado.nextDouble();
        
        calificacionFinal = promedio>=6 ? "Aprobado" : "Desaprobado";
        System.out.println("La calificacion final del alumno es: " + calificacionFinal);
    }
    public static void operador_while(){
        int cont = 0;
        
        while (cont <= 10){
            System.out.println("Estoy en la vuelta: " + cont++);
        }
    }
    public static void operador_for(){
        for(int i=0; i <= 10; i++){
            System.out.println("Estoy en la vuelta: " + i++);
        }
    }
    public static void vectores(){
        /**
         * vectores
         */
        int vector [] = new int [4];
        Scanner teclado = new Scanner(System.in);
        
        vector[0] = 4;
        vector[0] = 412;
        vector[0] = 342;
        vector[0] = 55;
        
        for (int i=0; i<vector.length; i++){
            System.out.println("Ingrese el valor para el indice " + i);
            vector[i] = teclado.nextInt();
        }
        for (int i=0; i<vector.length; i++){
            System.out.println("Estoy en el indice " + i);
            System.out.println("Tengo guardado un " + vector[i]);
            System.out.println("-------------------");
        }
    }
    public static void matrices(){
        /**
         * Creacion de matrices
         */
        int matriz [][] = new int [3][3];
        Scanner teclado = new Scanner(System.in);
        
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Ingresa el valor de la posicion " + i + j);
                matriz[i][j] = teclado.nextInt();
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Estoy en el indice " + i + j);
                System.out.println("Tengo guardado un " + matriz[i][j]);
                System.out.println("-------------------");
            }
        }
    }
    public static void crearClaseAlumno(){
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno("Computacion", 3, "2", "Angel", "Magaña", "Santa fe", "3313293049");
        System.out.println("La id del alumno2 es: " + alumno2.getId());
        System.out.println("El nombre es: " + alumno2.getNombre());
        System.out.println("El apellido es: " + alumno2.getApellido());
        alumno1.setId(1);
        alumno1.setNombre("Miguel");
        alumno1.setApellido("Sanchez");
        System.out.println("----------------------");
        System.out.println("La id del alumno1 es: " + alumno1.getId());
        System.out.println("El nombre es: " + alumno1.getNombre());
        System.out.println("El apellido es: " + alumno1.getApellido());
        System.out.println("----------------------");
        alumno2.setId(35);
    }
    public static void polimorfismo(){
        Persona vector [] = new Persona [5];
        vector[0] = new Persona();
        vector[1] = new Alumno();
        
        Persona perso = new Persona();
        Alumno alu = new Alumno();
        
        perso = alu;
    }
    public static void sobrecarga(){
        Alumno alu = new Alumno();
        alu.saludar();
        alu.saludar("Miguel");
        alu.saludar("Miguel", 25);
        Profesor profe = new Profesor();
        profe.reir();
        alu.reir();
    }
}
