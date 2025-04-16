package org.example;
import gestorFrontera.SistemaFrontera;
import gestorFrontera.Viajero;

public class Main {
    /**
     * Clase principal que simula el proceso de verificación de viajeros en un sistema de control frontera.
     * Los viajeros son verificados basándose en su documento y escaneo para determinar su estado de acceso.
     */

    public static void main(String[] args) {
        SistemaFrontera sistemaFrontera = new SistemaFrontera();

        Viajero viajero1 = new Viajero("Juan", "pasaporte123"); // Documento válido
        Viajero viajero2 = new Viajero("Ana", ""); // Documento vacío
        Viajero viajero3 = new Viajero("Carl", "pasaporte456");

        sistemaFrontera.verificar(viajero1);
        sistemaFrontera.verificar(viajero2);
        sistemaFrontera.verificar(viajero3);

        System.out.println(viajero1.getNombre() + " - Estado: " + sistemaFrontera.obtenerEstado());
        System.out.println(viajero2.getNombre() + " - Estado: " + sistemaFrontera.obtenerEstado());
        System.out.println(viajero3.getNombre() + " - Estado: " + sistemaFrontera.obtenerEstado());
    }
}