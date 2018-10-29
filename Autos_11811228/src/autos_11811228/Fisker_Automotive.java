package autos_11811228;

import java.util.Date;

public class Fisker_Automotive extends Carro {

    boolean Cam_Tur;
    boolean Convertible;

    public Fisker_Automotive(boolean Cam_Tur, boolean Convertible, Date Fecha, String Color, String Marca_Llantas, boolean Polarizado, double Vel_max, double Kil_gal, double precio) {
        super(Fecha, Color, Marca_Llantas, Polarizado, Vel_max, Kil_gal, precio);
        this.Cam_Tur = Cam_Tur;
        this.Convertible = Convertible;
    }

    public boolean isCam_Tur() {
        return Cam_Tur;
    }

    public void setCam_Tur(boolean Cam_Tur) {
        this.Cam_Tur = Cam_Tur;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

}
