import java.util.Scanner;

public class MostrarGenericos {
    static Scanner teclado = new Scanner(System.in);
    // public static void main(String[] args) {
    // Scanner t = new Scanner(System.in);

    // }

    static NombreEquipo mostrarEquipos() {
        
        // Mostrar la lista de equipos
        System.out.println();
        System.out.println();
        int c = 1;
        for (NombreEquipo nombreEquipo : NombreEquipo.values()) {
            System.out.println(c + ". " + nombreEquipo.getnom());
            c++;
        }

        // Capturar el número del equipo
        System.out.println("Ingrese el número del equipo:");
        int numeroEquipo;
        try {
            numeroEquipo = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese un número válido.");
            return null; // Salir del método si se produce un error
        }

        // Verificar si el número de equipo está dentro del rango válido
        if (numeroEquipo >= 1 && numeroEquipo <= NombreEquipo.values().length) {
            // Obtener el nombre del equipo correspondiente al número ingresado
            return NombreEquipo.values()[numeroEquipo - 1];
        } else {
            System.out.println("Número de equipo fuera de rango.");
            return null; // Devolver null si el número está fuera de rango
        }

    }//fin funcion

    static CalidadJugador mostrarCalidad(){

        int c = 1;
        for (CalidadJugador calidad : CalidadJugador.values()) {
            System.out.println(c + ". " + calidad);
            c++;
        }

        System.out.println("Ingrese el número correspondiente a la calidad del jugador:");
        int numeroCalidad = 0;
        try {
            numeroCalidad = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese un número válido.");
            return null; // Devolver null si se produce un error
        }

        // Verificar si el número de calidad está dentro del rango válido
        if (numeroCalidad >= 1 && numeroCalidad <= CalidadJugador.values().length) {
            // Obtener la calidad del jugador correspondiente al número ingresado
            return CalidadJugador.values()[numeroCalidad - 1];
        } else {
            System.out.println("Número de calidad fuera de rango.");
            return null; // Devolver null si el número está fuera de rango
        }
    }//fin funcion

}
