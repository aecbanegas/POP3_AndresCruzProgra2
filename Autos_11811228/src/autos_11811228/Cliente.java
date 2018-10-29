package autos_11811228;

import java.util.ArrayList;

public class Cliente extends Persona{
    double Dinero;
    ArrayList<Carro> Carros=new ArrayList();

    public Cliente(double Dinero, String Nombre, String Identidad, int Edad, double altura, double peso) {
        super(Nombre, Identidad, Edad, altura, peso);
        this.Dinero = Dinero;
    }

    public double getDinero() {
        return Dinero;
    }

    public void setDinero(double Dinero) {
        this.Dinero = Dinero;
    }

    public ArrayList<Carro> getCarros() {
        return Carros;
    }

    public void setCarros(ArrayList<Carro> Carros) {
        this.Carros = Carros;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String getIdentidad() {
        return Identidad;
    }

    @Override
    public void setIdentidad(String Identidad) {
        this.Identidad = Identidad;
    }

    @Override
    public int getEdad() {
        return Edad;
    }

    @Override
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public double getAltura() {
        return altura;
    }

    @Override
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + " Numero de Identidad=" + Identidad + " Edad=" + Edad + " Altura=" + altura + " Peso=" + peso+ "Dinero=" + Dinero + " Carros comprados=" + Carros+"\n";
    }
    
}
