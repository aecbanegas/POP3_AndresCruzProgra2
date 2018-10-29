package autos_11811228;

import java.util.Date;

public class Morgan_Aero_8 extends Carro {

    boolean Convertible;
    boolean Cabina;

    public Morgan_Aero_8(boolean Convertible, boolean Cabina, Date Fecha, String Color, String Marca_Llantas, boolean Polarizado, double Vel_max, double Kil_gal, double precio) {
        super(Fecha, Color, Marca_Llantas, Polarizado, Vel_max, Kil_gal, precio);
        this.Convertible = Convertible;
        this.Cabina = Cabina;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public boolean isCabina() {
        return Cabina;
    }

    public void setCabina(boolean Cabina) {
        this.Cabina = Cabina;
    }

}
