import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        menu();

    }// fin main

    @SuppressWarnings("resource")
    public static void menu() {
        
        Scanner t = new Scanner(System.in);
        

        boolean continuar = true;
        int opc = 0;

        while (continuar) {
            System.out.println("╔═══════════════════════════════════╗");
            System.out.println("║        Bienvenido al menu         ║");
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

                pedirDatos(opc);

                System.out.println("Ingrese el numero de balones tapados del jugador ");
                int golesTapados = t.nextInt();
                System.out.println("      Ingrese la aguilidad de manos con el balon del jugador" );
                CalidadJugador agilidadManosArquero = MostrarGenericos.mostrarCalidad();
                System.out.println(" Ingrese la salida en falso del jugador");
                CalidadJugador salidaFalsoArquero = MostrarGenericos.mostrarCalidad();
                System.out.println(" Ingrese el juego aereo defensivo del jugador");
                CalidadJugador juegoAereoDefensivoArquero = MostrarGenericos.mostrarCalidad();


                    break;
                case 2:

                default:
                    break;
            }// fin switch

        } // fin while menu

    }// fin funcion



    @SuppressWarnings("resource")
    public static void pedirDatos(int opc) {
        GestionarEquipos gestionar = new GestionarEquipos();
        Scanner te = new Scanner(System.in);
        String decideNombre = "", posicion= "";

        if (opc == 1) {
            decideNombre = "arquero";
             posicion = "Arquero";
        } else if (opc == 2) {
            decideNombre = "delantero";
             posicion = "Delantero";
        } else if (opc == 3) {
            decideNombre = "defensa";
            posicion = "Defensa";
        } else if (opc == 4) {
            decideNombre = "medio campista";
             posicion = "Medio campista";
        }
        System.out.println("Ingrese el nombre del equipo: ");
        NombreEquipo nombreEquipito = MostrarGenericos.mostrarEquipos();
        String nombreEquipitoString = nombreEquipito.getnom();

        System.out.println("Ingrese el numero del " + decideNombre + ": ");
        int numeroJugador = te.nextInt();
        System.out.println("Ingrese el numero de goles del " + decideNombre + ": ");
        int numeroGoles = te.nextInt();
        System.out.println("Ingrese el numero de pases del " + decideNombre + ": ");
        int numeroPases = te.nextInt();
        System.out.println("Ingrese el numero de autogoles del " + decideNombre + ": ");
        int numeroAutoGoles = te.nextInt();
        System.out.println("Ingrese el salario del " + decideNombre + ": ");
        double salarioJugador = te.nextDouble();

        if (opc == 1) {
            System.out.println("Ingrese el numero de balones tapados del " + decideNombre + ": ");
            int golesTapados = te.nextInt();
            System.out.println("      Ingrese la aguilidad de manos con el balon del " + decideNombre);
            CalidadJugador agilidadManosArquero = MostrarGenericos.mostrarCalidad();
            System.out.println(" Ingrese la salida en falso del "+decideNombre);
            CalidadJugador salidaFalsoArquero = MostrarGenericos.mostrarCalidad();
            System.out.println(" Ingrese el juego aereo defensivo del "+decideNombre+":");
            CalidadJugador juegoAereoDefensivoArquero = MostrarGenericos.mostrarCalidad();
            EquipoFutbol arquero = new Arquero(nombreEquipitoString, posicion, nombreEquipito, numeroJugador, 
            numeroGoles, numeroPases, numeroAutoGoles, salarioJugador, golesTapados, 
            agilidadManosArquero, salidaFalsoArquero, juegoAereoDefensivoArquero);

            gestionar.anadirEquipos(arquero, numeroJugador, posicion,nombreEquipitoString);
            gestionar.mostrarEquipos();

        }else if (opc == 2) {
            System.out.println("   Ingrese la habilidad de desmarque del "+decideNombre);

            // System.out.println("    Ingrese el remate de primera del "+decideNombre);
            // System.out.println("1=Malo, 2=Masomenos, 3=Bueno, 4=Excelente, 5=Increible");
            // System.out.println("Ingrese el numero de goles por partido del "+decideNombre+": ");
            // array[13] = te.nextInt();
            // System.out.println("Ingrese el numero de goles por partido del "+decideNombre);
            // array[14] = te.nextInt();
            // System.out.println("  Ingrese la presicion de los tiros del "+decideNombre);
            // System.out.println("1=Malo, 2=Masomenos, 3=Bueno, 4=Excelente, 5=Increible");
            // array[15] = te.nextInt();

        } // fin if

    }// fin funcion



}
