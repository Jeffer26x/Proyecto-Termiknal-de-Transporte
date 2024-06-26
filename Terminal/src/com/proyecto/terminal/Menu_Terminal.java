package com.proyecto.terminal;
import com.proyecto.logica.servicio.Venta_Pasajes;

import java.util.Scanner;

public class Menu_Terminal {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        Venta_Pasajes ventaServicio = new Venta_Pasajes();


        while (true) {
            System.out.println("Bienvenido a la terminal de tranporte");
            System.out.println("1. Registrar pasaje");
            System.out.println("2. Contar pasajes");
            System.out.println("3. Mostrar total recaudado");
            System.out.println("4. Contar menores y mayores de edad");
            System.out.println("5. Contar mascotas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = capturar.nextInt();
            capturar.nextLine();

            if (opcion == 1) {
                System.out.println("Destinos disponibles");
                System.out.println("Cúcuta Precio 30000");
                System.out.println("Bogotá Precio 50000");
                System.out.println("Barranquilla Precio 70000");
                System.out.println("Medellín Precio 60000");
                System.out.println("Tunja Precio 40000");
                System.out.println("Manizales Precio 55000");
                System.out.println("Bucaramanga Precio 45000");
                System.out.println("Pasto Precio 65000");
                System.out.print("Ingrese el destino: ");
                String destino = capturar.nextLine();

                System.out.println("Horarios disponibles ");
                System.out.println("Cúcuta 11:54 05:26 21:39");
                System.out.println("Bogotá 10:45 18:20 03:05 ");
                System.out.println("Barranquilla 08:42 19:17 21:59");
                System.out.println("Medellín 09:37 14:22 20:59");
                System.out.println("Tunja 06:45 18:20 22:55");
                System.out.println("Manizales 09:37 17:22 21:05");
                System.out.println("Bucaramanga 13:45 05:20 21:10");
                System.out.println("Pasto 08:00 15:45 21:30");
                System.out.print("Ingrese el horario: ");
                String horario = capturar.nextLine();

                System.out.print("Ingrese el tipo de servicio (primera clase, económica): ");
                String tipoServicio = capturar.nextLine();

                System.out.print("Ingrese el número de asiento: ");
                int numeroAsiento = capturar.nextInt();

                System.out.print("Ingrese la edad del pasajero: ");
                int edad = capturar.nextInt();

                System.out.print("¿Lleva mascota? (true/false): ");
                boolean llevaMascota = capturar.nextBoolean();

                ventaServicio.registrarPasaje(destino, horario, tipoServicio, numeroAsiento, edad, llevaMascota);
                System.out.println("Pasaje registrado exitosamente.");

            } else if (opcion == 2) {
                int totalPasajes = ventaServicio.contarPasajes();
                System.out.println("Total de pasajes vendidos: " + totalPasajes);

            } else if (opcion == 3) {
                double totalRecaudado = ventaServicio.mostrarTotalRecaudado();
                System.out.println("Total recaudado: $" + totalRecaudado);

            } else if (opcion == 4) {
                int menores = ventaServicio.contarMenores();
                int mayores = ventaServicio.contarMayores();
                System.out.println("Menores de edad: " + menores);
                System.out.println("Mayores de edad: " + mayores);

            } else if (opcion == 5) {
                int totalMascotas = ventaServicio.contarMascotas();
                System.out.println("Total de pasajeros con mascotas: " + totalMascotas);

            } else if (opcion == 6) {
                System.out.println("Saliendo del programa.");
                break;

            } else {
                System.out.println("Opción inválida. Por favor intente de nuevo.");
            }
        }

    }
}

