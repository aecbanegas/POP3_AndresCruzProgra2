package autos_11811228;

import java.util.Date;

public class Maybach extends Carro {

    int llantas;

    public Maybach(int llantas, Date Fecha, String Color, String Marca_Llantas, boolean Polarizado, double Vel_max, double Kil_gal, double precio) {
        super(Fecha, Color, Marca_Llantas, Polarizado, Vel_max, Kil_gal, precio);
        this.llantas = llantas;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

}
