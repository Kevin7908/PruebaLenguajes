import java.util.Scanner;

public class AppMejorada {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner t = new Scanner(System.in);
        EquipoGenerico<EquipoFutbol> equipoGenerico = new EquipoGenerico<>();
        GestionarEquipos gestionar = new GestionarEquipos();

        boolean continuar = true;

        while (continuar) {
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║         Bienvenido al menu        ║");
            System.out.println("╠═══════════════════════════════════╣");
            System.out.println("║  1. Agregar jugador               ║");
            System.out.println("║  2. Borrar jugador                ║");
            System.out.println("║  3. Mostrar jugador               ║");
            System.out.println("║  4. modificar jugador             ║");
            System.out.println("║  5. Salir                         ║");
            System.out.println("╚═══════════════════════════════════╝");
            System.out.print("Selecciona una opción: ");
            int opc = t.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("╔═══════════════════════════════════╗");
                    System.out.println("║       Donde desea agregarlo       ║");
                    System.out.println("╠═══════════════════════════════════╣");
                    System.out.println("║  1. Arquero                       ║");
                    System.out.println("║  2. Delantero                     ║");
                    System.out.println("║  3. Defensa                       ║");
                    System.out.println("╚═══════════════════════════════════╝");
                    System.out.print("Selecciona una opción: ");
                    int agregar = t.nextInt();

                    System.out.println("Ingrese el nombre del equipo: ");
                    NombreEquipo nombreEquipito = MostrarGenericos.mostrarEquipos();
                    String nombreEquipitoString = nombreEquipito.getnom();
                    System.out.println("Ingrese el numero del jugador ");
                    int numeroJugador = t.nextInt();
                    System.out.println("Ingrese el numero de goles del jugador ");
                    int numeroGoles = t.nextInt();
                    System.out.println("Ingrese el numero de pases del jugador ");
                    int numeroPases = t.nextInt();
                    System.out.println("Ingrese el numero de autogoles del jugador ");
                    int numeroAutoGoles = t.nextInt();
                    System.out.println("Ingrese el salario del jugador ");
                    double salarioJugador = t.nextDouble();

                    if (agregar == 1) {
                        String posicion = "Arquero";
                        System.out.println("Ingrese el numero de balones tapados del jugador ");
                        int golesTapados = t.nextInt();
                        System.out.println("      Ingrese la aguilidad de manos con el balon del jugador");
                        CalidadJugador agilidadManosArquero = MostrarGenericos.mostrarCalidad();
                        System.out.println(" Ingrese la salida en falso del jugador");
                        CalidadJugador salidaFalsoArquero = MostrarGenericos.mostrarCalidad();
                        System.out.println(" Ingrese el juego aereo defensivo del jugador");
                        CalidadJugador juegoAereoDefensivoArquero = MostrarGenericos.mostrarCalidad();

                        EquipoFutbol arquero = new Arquero(nombreEquipitoString, posicion, nombreEquipito,
                            numeroJugador, numeroGoles, numeroPases, numeroAutoGoles, salarioJugador, golesTapados,
                            agilidadManosArquero, salidaFalsoArquero, juegoAereoDefensivoArquero);

                        boolean b = equipoGenerico.agregarEquipoGenerico(arquero);
                        gestionar.agregarEquiposDesdeGenerico(equipoGenerico,b);
                        // gestionar.anadirEquipos(arquero);
                        gestionar.mostrarEquipos();

                    } else if (agregar == 2) {
                        String posicion = "Delantero";
                        System.out.println("   Ingrese la habilidad de desmarque del jugador");
                        CalidadJugador habilidadDesmarque = MostrarGenericos.mostrarCalidad();
                        System.out.println("    Ingrese el remate de primera del jugador");
                        CalidadJugador rematePrimera = MostrarGenericos.mostrarCalidad();
                        System.out.println("Ingrese el numero de goles por partido del jugador");
                        int numeroGolesPartido = t.nextInt();
                        System.out.println("  Ingrese la presicion de los tiros del jugador");
                        CalidadJugador presicionTiros = MostrarGenericos.mostrarCalidad();
            
                        EquipoFutbol delantero = new Delantero(nombreEquipitoString, posicion, nombreEquipito,
                                numeroJugador, numeroGoles, numeroPases, numeroAutoGoles, salarioJugador, 
                                habilidadDesmarque,rematePrimera, numeroGolesPartido, presicionTiros);
                        
                        

                    } // fin if agregar
                    break;

                default:
                    break;
            }// fin swicht

        } // fin while
    }// fin funcion
}
