package autos_11811228;

import java.util.ArrayList;

public class Empleado extends Persona{
double Horas;
ArrayList<Cliente>cliente=new ArrayList();

    public Empleado(double Horas, String Nombre, String Identidad, int Edad, double altura, double peso) {
        super(Nombre, Identidad, Edad, altura, peso);
        this.Horas = Horas;
    }

    public ArrayList<Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList<Cliente> cliente) {
        this.cliente = cliente;
    }
    
    public double getHoras() {
        return Horas;
    }

    public void setHoras(double Horas) {
        this.Horas = Horas;
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
        return "Nombre=" + Nombre + " Numero de Identidad=" + Identidad + " Edad=" + Edad + " Altura=" + altura + " Peso=" + peso+ " Horas=" + Horas + " cliente=" + cliente +"\n";
    }


}
