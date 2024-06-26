package com.proyecto.logica.servicio;
import com.proyecto.logica.modelo.Pasajes;

public class Venta_Pasajes {
    Pasajes[] pasajes = new Pasajes [100];
    int indicePasajes = 0;
    double totalRecaudado = 0;

    public void registrarPasaje(String destino, String horario, String tipoServicio, int numeroAsiento, int edad, boolean llevaMascota) {
        double precio = calcularPrecio(destino, tipoServicio);
        Pasajes pasaje = new Pasajes(destino, horario, tipoServicio, numeroAsiento, edad, precio, llevaMascota);
        pasajes[indicePasajes] = pasaje;
        indicePasajes++;
        totalRecaudado += precio;
    }

    public double calcularPrecio(String destino, String tipoServicio) {
        double precio = 0;
        if(destino.equals("Cúcuta")) precio = 30000;
        else if (destino.equals("Bogotá")) precio = 50000;
        else if (destino.equals("Barranquilla")) precio = 70000;
        else if (destino.equals("Medellín")) precio = 60000;
        else if (destino.equals("Tunja")) precio = 40000;
        else if (destino.equals("Manizales")) precio = 55000;
        else if (destino.equals("Bucaramanga")) precio = 45000;
        else if (destino.equals("Pasto")) precio = 65000;

        if (tipoServicio.equals("primera clase")) precio *= 1.5;

        return precio;
    }

    public int contarPasajes() {
        return indicePasajes;
    }

    public double mostrarTotalRecaudado() {
        return totalRecaudado;
    }

    public int contarMenores() {
        int contadorMenores = 0;
        for (int i = 0; i < indicePasajes; i++) {
            if (pasajes[i].edad < 18) {
                contadorMenores++;
            }
        }
        return contadorMenores;
    }

    public int contarMayores() {
        int contadorMayores = 0;
        for (int i = 0; i < indicePasajes; i++) {
            if (pasajes[i].edad >= 18) {
                contadorMayores++;
            }
        }
        return contadorMayores;
    }

    public int contarMascotas() {
        int contadorMascotas = 0;
        for (int i = 0; i < indicePasajes; i++) {
            if (pasajes[i].llevaMascota) {
                contadorMascotas++;
            }
        }
        return contadorMascotas;
    }
}


