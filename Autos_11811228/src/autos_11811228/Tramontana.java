package autos_11811228;

import java.util.Date;

public class Tramontana extends Carro {

    double Peso;
    int Transmision;

    public Tramontana(double Peso, int Transmision, Date Fecha, String Color, String Marca_Llantas, boolean Polarizado, double Vel_max, double Kil_gal, double precio) {
        super(Fecha, Color, Marca_Llantas, Polarizado, Vel_max, Kil_gal, precio);
        this.Peso = Peso;
        this.Transmision = Transmision;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public int getTransmision() {
        return Transmision;
    }

    public void setTransmision(int Transmision) {
        this.Transmision = Transmision;
    }

}
