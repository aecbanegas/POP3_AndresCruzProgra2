package autos_11811228;

public class Persona {
    protected String Nombre;
    protected String Identidad;
    protected int Edad;
    protected double altura;
    protected double peso;
    String Imprimir="";

    public Persona(String Nombre, String Identidad, int Edad, double altura, double peso) {
        this.Nombre = Nombre;
        this.Identidad = Identidad;
        this.Edad = Edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentidad() {
        return Identidad;
    }

    public void setIdentidad(String Identidad) {
        this.Identidad = Identidad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
