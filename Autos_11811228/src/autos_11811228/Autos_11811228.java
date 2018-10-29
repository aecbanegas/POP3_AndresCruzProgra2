package autos_11811228;

import java.util.ArrayList;
import java.util.Scanner;

public class Autos_11811228 {

    static Scanner s = new Scanner(System.in);
    static ArrayList<Cliente> ListaClientes = new ArrayList();
    static ArrayList<Empleado> ListaEmpleados = new ArrayList();
    static ArrayList<Carro> ListaCarros = new ArrayList();

    public static void main(String[] args) {
        int opc = 0;
        while (opc != 5) {
            System.out.println("Menu\n"
                    + "1-Menu de Carros\n"
                    + "2-Menu de Empleados\n"
                    + "3-Menu de Clientes\n"
                    + "4-Compra de Vehiculo\n"
                    + "5-Salir\n"
                    + "Ingrese su opcion: ");
            String option = s.next();
            espacio();
            while (validacion(option) == false) {
                System.out.println("Menu\n"
                        + "1-Menu de Carros\n"
                        + "2-Menu de Empleados\n"
                        + "3-Menu de Clientes\n"
                        + "4-Compra de Vehiculo\n"
                        + "5-Salir\n"
                        + "Ingrese una opcion valida: ");
                option = s.next();
                espacio();
            }
            opc = Integer.parseInt(option);
            
        }
    }

    public static void opc1() {
        System.out.println("Menu de Carros\n"
                + "1-Agregar Carro\n"
                + "2-Modificar Carro\n"
                + "3-Listar Carros\n"
                + "4-Eliminar Carro\n"
                + "Ingrese su opcion: ");
        String option = s.next();
        espacio();
        while (validacion(option) == false) {
            System.out.println("Menu de Carros\n"
                    + "1-Agregar Carro\n"
                    + "2-Modificar Carro\n"
                    + "3-Listar Carros\n"
                    + "4-Eliminar Carro\n"
                    + "Ingrese una opcion valida: ");
            option = s.next();
            espacio();
        }
        int opc = Integer.parseInt(option);

    }

    public static void espacio() {
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print("---");
        }
        System.out.println("");
    }

    public static boolean validacion(String temp) {
        int cont = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (Character.isDigit(temp.charAt(i))) {
                cont++;
            }
        }
        if (cont == temp.length()) {
            return true;
        } else {
            return false;
        }
    }

}
