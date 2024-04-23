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
            System.out.println("║  4. Modificar jugador             ║");
            System.out.println("║  5. Mostrar todo                  ║");
            System.out.println("║  6. Salir                         ║");
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
                        gestionar.agregarEquiposDesdeGenerico(equipoGenerico, b);
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
                                habilidadDesmarque, rematePrimera, numeroGolesPartido, presicionTiros);

                        boolean b = equipoGenerico.agregarEquipoGenerico(delantero);
                        gestionar.agregarEquiposDesdeGenerico(equipoGenerico, b);

                        gestionar.mostrarEquipoEspecifico(numeroJugador, nombreEquipitoString );

                    } else if (agregar == 3) {
                        String posicion = "Defensa";
                        System.out.println("Ingrese el liderazgo defensivo del jugador:");
                        CalidadJugador liderazgoDefensivo = MostrarGenericos.mostrarCalidad();
                        System.out.println("Ingrese la posicion del defensa: ");
                        System.out.println("1.Defensa central, 2.Defensa lateral");
                        String posicionDefensa = t.nextLine();
                        String tipoDefensa = (posicionDefensa.equals("1")) ? "Defensa central" : "Defensa lateral";
                        System.out.println("Ingrese el tackle del jugador: ");
                        CalidadJugador tackleDefensa = MostrarGenericos.mostrarCalidad();
                        System.out.println("Ingrese el marcaje al hombre del jugador: ");
                        CalidadJugador marcajeHombre = MostrarGenericos.mostrarCalidad();

                        EquipoFutbol defensa = new Defensa(nombreEquipitoString, posicion, nombreEquipito,
                                numeroJugador, numeroGoles, numeroPases, numeroAutoGoles, salarioJugador,
                                liderazgoDefensivo, tipoDefensa, tackleDefensa, marcajeHombre);

                        boolean b = equipoGenerico.agregarEquipoGenerico(defensa);
                        gestionar.agregarEquiposDesdeGenerico(equipoGenerico, b);

                        gestionar.mostrarEquipoEspecifico(numeroJugador, nombreEquipitoString);
                    }else{
                        System.out.println("Ingrese una opcion valida");
                    } // fin if agregar
                    break;
                case 2:

                    System.out.println("Ingrese el numero del jugador a borrar: ");
                    int numeroJugadorBorrar = t.nextInt();
                    System.out.println("Ingrese el nombre del equipo del jugador a borrar: ");
                    NombreEquipo nombreEquipitoBorrar = MostrarGenericos.mostrarEquipos();
                    String nombreEquipitoBorrarString = nombreEquipitoBorrar.getnom();

                    gestionar.eliminarEquipos(numeroJugadorBorrar, nombreEquipitoBorrarString);
                    break;

                case 3:

                    System.out.println("Ingrese el numero del jugador a buscar");
                    int numeroJugadorBuscar = t.nextInt();
                    System.out.println("Ingrese el nombre del equipo del jugador a borrar: ");
                    NombreEquipo nombreEquipitoBuscar = MostrarGenericos.mostrarEquipos();
                    String nombreEquipitoBuscarString = nombreEquipitoBuscar.getnom();


                    gestionar.mostrarEquipoEspecifico(numeroJugadorBuscar,nombreEquipitoBuscarString);

                    break;
                case 4: 
                    
                    System.out.println("Ingrese el numero del jugador a modificar: ");
                    int numeroJugadorModificar = t.nextInt();
                    System.out.println("Ingrese el nombre del equipo del jugador a modificar: ");
                    NombreEquipo nombreEquipitoModificar = MostrarGenericos.mostrarEquipos();
                    String nombreEquipitoModificarString = nombreEquipitoModificar.getnom();

                    boolean repe = gestionar.repetido( nombreEquipitoModificarString, numeroJugadorModificar);
                    if (repe == true) {
                        System.out.println("Ingrese el nuevo numero: ");
                        int nuevoNum = t.nextInt();
                        System.out.println("Ingrese el nombre del equipo del jugador a borrar: ");
                        NombreEquipo nuevoEqui = MostrarGenericos.mostrarEquipos();
                        String nuevoEquiString = nuevoEqui.getnom();
                        gestionar.modificarEquipos(numeroJugadorModificar, nombreEquipitoModificarString, nuevoNum, nuevoEquiString);
                    }else{
                        System.out.println("No encontre nada ");
                    }

                    break;

                case 5:

                    gestionar.mostrarEquipos();
                    
                    break;

                case 6:
                    continuar = false;
                    break;
                default:
                    break;
            }// fin swicht

        } // fin while
        t.close();
    }// fin funcion
}