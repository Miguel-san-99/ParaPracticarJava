package Logica;

public class Circulo implements Figura, Rotable, Dibujable
{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        System.out.println("Calucular area");
        return 0;
    }

    @Override
    public void rotar() {
        System.out.println("rotar");
    }

    @Override
    public void dibujar() {
        System.out.println("dibujar");
    }
    
}
