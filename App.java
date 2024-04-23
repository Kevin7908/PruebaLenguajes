
import java.util.Scanner;

public class App {

    static String posicion = "",nombreEquipitoString;
    static int numeroJugador;

    public static void main(String[] args) {
        menu();

    }// fin main

    @SuppressWarnings("resource")
    public static void menu() {
        Scanner t = new Scanner(System.in);
        GestionarEquipos gestionar = new GestionarEquipos();
        //EquipoGenerico<EquipoFutbol> equipoGenerico = new EquipoGenerico<>();


        boolean continuar = true;
        int opc = 0;

        while (continuar) {
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║       Donde desea agregarlo       ║");
            System.out.println("╠═══════════════════════════════════╣");
            System.out.println("║  1. Arquero                       ║");
            System.out.println("║  2. Delantero                     ║");
            System.out.println("║  3. Defensa                       ║");
            System.out.println("║  4. Medio Campista                ║");
            System.out.println("╚═══════════════════════════════════╝");
            System.out.print("Selecciona una opción: ");
            opc = t.nextInt();

            switch (opc) {
                case 1:

                    EquipoGenerico<EquipoFutbol> equipo = almacenarJugador(opc);
                    gestionar.encontrarPosicion(nombreEquipitoString, numeroJugador, posicion);
                    gestionar.agregarEquiposDesdeGenerico(equipo);
                    equipo.eliminarTodoEquipoGenericos();
                    gestionar.mostrarEquipos();

                    break;
                case 2:

                    EquipoGenerico<EquipoFutbol> equipo1 = almacenarJugador(opc);
                    gestionar.agregarEquiposDesdeGenerico(equipo1);
                    equipo1.eliminarTodoEquipoGenericos();

                    break;

                case 5:

                    break;
                default:
                    break;
            }// fin switch

        } // fin while menu

    }// fin funcion

    @SuppressWarnings("resource")
    public static <T extends EquipoFutbol> EquipoGenerico<EquipoFutbol> almacenarJugador(int opc) {
        EquipoGenerico<EquipoFutbol> equipoGenerico = new EquipoGenerico<>();
        Scanner teclado = new Scanner(System.in);


        if (opc == 1) {
            posicion = "Arquero";
        }else if (opc == 2) {
            posicion="Delantero";
        }else if (opc == 2) {
            posicion = "Defensa";
        }

        System.out.println("Ingrese el nombre del equipo:");
        NombreEquipo nombreEquipito = MostrarGenericos.mostrarEquipos();
        nombreEquipitoString = nombreEquipito.getnom();

        System.out.println("Ingrese el numero del jugador:");
        numeroJugador = teclado.nextInt();
        System.out.println("Ingrese el numero de goles del jugador:");
        int numeroGoles = teclado.nextInt();
        System.out.println("Ingrese el numero de pases del jugador:");
        int numeroPases = teclado.nextInt();
        System.out.println("Ingrese el numero de autogoles del jugador:");
        int numeroAutoGoles = teclado.nextInt();
        System.out.println("Ingrese el salario del jugador:");
        double salarioJugador = teclado.nextDouble();

        if (opc == 1) {
            
            System.out.println("Ingrese el numero de balones tapados del jugador ");
            int golesTapados = teclado.nextInt();
            System.out.println("      Ingrese la aguilidad de manos con el balon del jugador");
            CalidadJugador agilidadManosArquero = MostrarGenericos.mostrarCalidad();
            System.out.println(" Ingrese la salida en falso del jugador");
            CalidadJugador salidaFalsoArquero = MostrarGenericos.mostrarCalidad();
            System.out.println(" Ingrese el juego aereo defensivo del jugador");
            CalidadJugador juegoAereoDefensivoArquero = MostrarGenericos.mostrarCalidad();

            EquipoFutbol arquero = new Arquero(nombreEquipitoString, posicion,
                    nombreEquipito, numeroJugador, numeroGoles, numeroPases, numeroAutoGoles, salarioJugador,
                    golesTapados, agilidadManosArquero, salidaFalsoArquero, juegoAereoDefensivoArquero);

            equipoGenerico.agregarEquipoGenerico(arquero);

            return equipoGenerico;

        } else if (opc == 2) {

            System.out.println("   Ingrese la habilidad de desmarque del jugador");
            CalidadJugador habilidadDesmarque = MostrarGenericos.mostrarCalidad();
            System.out.println("    Ingrese el remate de primera del jugador");
            CalidadJugador rematePrimera = MostrarGenericos.mostrarCalidad();
            System.out.println("Ingrese el numero de goles por partido del jugador");
            int numeroGolesPartido = teclado.nextInt();
            System.out.println("  Ingrese la presicion de los tiros del jugador");
            CalidadJugador presicionTiros = MostrarGenericos.mostrarCalidad();

            EquipoFutbol delantero = new Delantero(nombreEquipitoString, posicion, nombreEquipito,
                    numeroJugador, numeroGoles, numeroPases, numeroAutoGoles, salarioJugador, 
                    habilidadDesmarque,rematePrimera, numeroGolesPartido, presicionTiros);

            equipoGenerico.agregarEquipoGenerico(delantero);

            return equipoGenerico;
        } else if (opc == 3) {

            System.out.println("Ingrese el liderazgo defensivo del jugador:");
            CalidadJugador liderazgoDefensivo = MostrarGenericos.mostrarCalidad();
            System.out.println("Ingrese la posicion del defensa: ");
            System.out.println("1.Defensa central, 2.Defensa lateral");
            String posicionDefensa = teclado.nextLine();
            String tipoDefensa = (posicionDefensa.equals("1")) ? "Defensa central" : "Defensa lateral";
            System.out.println("Ingrese el tackle del jugador: ");
            CalidadJugador tackleDefensa = MostrarGenericos.mostrarCalidad();
            System.out.println("Ingrese el marcaje al hombre del jugador: ");
            CalidadJugador marcajeHombre = MostrarGenericos.mostrarCalidad();

            EquipoFutbol defensa = new Defensa(nombreEquipitoString, posicion, nombreEquipito,
                    numeroJugador, numeroGoles, numeroPases, numeroAutoGoles, salarioJugador, 
                    liderazgoDefensivo,tipoDefensa, tackleDefensa, marcajeHombre);

            equipoGenerico.agregarEquipoGenerico(defensa);

            return equipoGenerico;
        }

        return equipoGenerico;
    }// fin funcion


}
