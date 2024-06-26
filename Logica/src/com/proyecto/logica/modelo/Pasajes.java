package com.proyecto.logica.modelo;

public class Pasajes {
    public String destino;
    public String horario;
    public String tipoServicio;
    public int numeroAsiento;
    public int edad;
    public double precio;
    public boolean llevaMascota;

    public Pasajes (String destino, String horario, String tipoServicio, int numeroAsiento, int edad, double precio, boolean llevaMascota) {
        this.destino = destino;
        this.horario = horario;
        this.tipoServicio = tipoServicio;
        this.numeroAsiento = numeroAsiento;
        this.edad = edad;
        this.precio = precio;
        this.llevaMascota = llevaMascota;
    }
}


