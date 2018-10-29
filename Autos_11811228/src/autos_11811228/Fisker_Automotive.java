package autos_11811228;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fisker_Automotive extends Carro {

    String pattern = "dd/MM/yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String Cam_Tur;
    boolean Convertible;

    public Fisker_Automotive(String Cam_Tur, boolean Convertible, Date Fecha, String Color, String Marca_Llantas, boolean Polarizado, double Vel_max, double Kil_gal, double precio) {
        super(Fecha, Color, Marca_Llantas, Polarizado, Vel_max, Kil_gal, precio);
        this.Cam_Tur = Cam_Tur;
        this.Convertible = Convertible;
        Imprimir += "Modelo de Auto= Fisker Automotive" + " Fecha de ensamblado=" + simpleDateFormat.format(Fecha) + " Color de pintura=" + Color + " Marca de Llantas=" + Marca_Llantas + " Polarizado=" + Polarizado + " Tipo de vehiculo=" + Cam_Tur + " Convertible=" + Convertible + " Velocidad Maxima=" + Vel_max + "km/hr Kilometros por Galon=" + Kil_gal + "km/gal Precio=" + precio + "\n";
    }

    public String isCam_Tur() {
        return Cam_Tur;
    }

    public void setCam_Tur(String Cam_Tur) {
        this.Cam_Tur = Cam_Tur;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    @Override
    public Date getFecha() {
        return Fecha;
    }

    @Override
    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String getColor() {
        return Color;
    }

    @Override
    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String getMarca_Llantas() {
        return Marca_Llantas;
    }

    @Override
    public void setMarca_Llantas(String Marca_Llantas) {
        this.Marca_Llantas = Marca_Llantas;
    }

    public boolean isPolarizado() {
        return Polarizado;
    }

    @Override
    public void setPolarizado(boolean Polarizado) {
        this.Polarizado = Polarizado;
    }

    @Override
    public double getVel_max() {
        return Vel_max;
    }

    @Override
    public void setVel_max(double Vel_max) {
        this.Vel_max = Vel_max;
    }

    @Override
    public double getKil_gal() {
        return Kil_gal;
    }

    @Override
    public void setKil_gal(double Kil_gal) {
        this.Kil_gal = Kil_gal;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImprimir() {
        return Imprimir;
    }

    public void setImprimir(String Imprimir) {
        this.Imprimir = Imprimir;
    }

}
