package Logica;

import Gui.Pantalla;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sanchezmagana
 */
public class ParaPracticar {
    enum Color {
            ROJO, VERDE, AZUL, AMARILLO, ANARANJADO, NEGRO, BLANCO
        }
    public static void main(String[] args) {
        /**
        Pantalla pantalla = new Pantalla();
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
        **/
        ejemploEnum();
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
        vector[0] = new Alumno();
        vector[1] = new Alumno();
        
        Alumno perso = new Alumno();
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
    public static void listas(){
        List<Alumno> lista = new ArrayList<Alumno>();
        Alumno alu = new Alumno();
        lista.add(alu);
        
        LinkedList<Alumno> listaLinked = new LinkedList<Alumno>();
        Alumno alu2 = new Alumno();
        listaLinked.add(alu);
        listaLinked.add(alu2);
        
        lista.remove(0);
        
        System.out.println("Tamaño de la lista: " + listaLinked.size());
        System.out.println("Primero de la lista: " + listaLinked.getFirst());
        System.out.println("Primero de la lista: " + listaLinked.getLast());
        
        listaLinked.clear();
        
        System.out.println("Esta vacia? " + listaLinked.isEmpty());
        
        
        
    }
    public static void pilas(){
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("Pilas vacia:" + pila);
        System.out.println("Esta vacia?" + pila.isEmpty());
        pila.add(1);
        pila.add(2);
        pila.pop();
        System.out.println("Muestra el ultimo valor agregado. " + pila.peek());
    }
    public static void hashmap(){
        Map<Integer, String> mapaEmpleados = new HashMap<>();
        mapaEmpleados.put(1524, "Miguel");
        mapaEmpleados.put(1525, "Angel");
        
        boolean estaono = mapaEmpleados.containsValue("Miguel");
        boolean estaono2 = mapaEmpleados.containsKey(1524);
        
        System.out.println(estaono);
        System.out.println(estaono2);
        
        System.out.println(mapaEmpleados.values());
        System.out.println(mapaEmpleados.keySet());
        
        String nombre = mapaEmpleados.get(1524);
        System.out.println(nombre);
        mapaEmpleados.remove(1524);
        System.out.println(mapaEmpleados);
    }
    public static void excepciones(){
        
        int edades [] = {15, 20, 25, 30};
        
        try{
            System.out.println("La edad de la posicion 4 es: " + edades[4]);
        }
        catch(Exception e){
            System.out.println("Intentaste acceder a un indice que no existe");
        }
    }
    public static void conversiones(){
        
        double num = 1.67;
        
        //Casteo a entero
        int numInt = (int) num;
        
        //Casteo a long
        long numLong = (long) num;
        
        String cantidad = "15";
        String precio = "150.27";
        int cantInt = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        
        int edad = 30;
        double estatura = 1.67;
        
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        
        System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);
        
    }
    public static void ejemploEnum(){
        
        for(Color c : Color.values()){
            System.out.println("EL color es: " + c);
        }
        
    }
}
