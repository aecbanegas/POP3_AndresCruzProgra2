package autos_11811228;

import java.util.Date;

public class Carro {

    Date Fecha;
    String Color;
    String Marca_Llantas;
    boolean Polarizado;
    double Vel_max;
    double Kil_gal;
    double precio;
    String Imprimir="";

    public Carro(Date Fecha, String Color, String Marca_Llantas, boolean Polarizado, double Vel_max, double Kil_gal, double precio) {
        this.Fecha = Fecha;
        this.Color = Color;
        this.Marca_Llantas = Marca_Llantas;
        this.Polarizado = Polarizado;
        this.Vel_max = Vel_max;
        this.Kil_gal = Kil_gal;
        this.precio = precio;
    }

    public Carro() {
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMarca_Llantas() {
        return Marca_Llantas;
    }

    public void setMarca_Llantas(String Marca_Llantas) {
        this.Marca_Llantas = Marca_Llantas;
    }

    public boolean getPolarizado() {
        return Polarizado;
    }

    public void setPolarizado(boolean Polarizado) {
        this.Polarizado = Polarizado;
    }

    public double getVel_max() {
        return Vel_max;
    }

    public void setVel_max(double Vel_max) {
        this.Vel_max = Vel_max;
    }

    public double getKil_gal() {
        return Kil_gal;
    }

    public void setKil_gal(double Kil_gal) {
        this.Kil_gal = Kil_gal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
