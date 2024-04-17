import java.util.Scanner;

public class App {

    public static void main(String[] args) {
    menu();

    }
    public static void menu(){
        Scanner t = new Scanner(System.in);
        GestionarEquipos gestionar = new GestionarEquipos();


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
                    Object [] v = informacion(opc);
                    gestionar.anadirEquipos(new Arquero("Real madrid", (String)v[0],
                    NombreEquipo.BARCELONA, (int)v[1], (int)v[3],(int)v[4] ,(int)v[5],(int)v[6], (int)v[8],
                    (CalidadJugador)v[9], (CalidadJugador)v[10],(CalidadJugador)v[11]), 
                    (int)v[1],(String)v[0],"Real madrid");
                    
                    //   public Arquero(String equipo, String posicion, NombreEquipo nombreEqui, int numeroJugador, int numeroGoles,
                    //   int numeroPases, int numeroAutoGoles, double salarioJugador, CalidadJugador calidadJu, int golesTapados,
                    //   String agilidadManos, String salidaEnFalso, String juegoAereoDefensivo) {
                    break;

                default:

                    break;

            }//fin switch
        }//fin while menu
        t.close();
    }//fin funcion

    @SuppressWarnings("resource")
    public static Object[] informacion(int opc) {
        Scanner te = new Scanner(System.in);
        Object[] array = new Object[20];
        String decideNombre="";
        // private String equipo;
        // private String posicion;
        // private NombreEquipo nombreEqui;
        // private int numeroJugador;
        // private int numeroGoles;
        // private int numeroPases;
        // private int numeroAutoGoles;
        // private double salarioJugador;   

        if (opc == 1) {
            decideNombre = "arquero";
        }else if (opc ==2 ) {
            decideNombre = "delantero";
        }else if (opc == 3) {
            decideNombre = "defensa";
        }else if (opc == 4) {
            decideNombre = "medio campista";
        }
        
        System.out.println("Ingrese el numero del "+decideNombre+": ");
        array[1] = te.nextInt();

        System.out.println("Ingrese el numero de goles del "+decideNombre+": ");
        array[3] = te.nextInt();
        System.out.println("Ingrese el numero de pases del "+decideNombre+": ");
        array[4] = te.nextInt();
        System.out.println("Ingrese el numero de autogoles del "+decideNombre+": ");
        array[5] = te.nextInt();
        System.out.println("Ingrese el salario del "+decideNombre+": ");
        array[6] = te.nextDouble();

        if (opc == 1 ) {
            array[0] = "Arquero";
            System.out.println("Ingrese el numero de goles tapados del "+decideNombre+": ");
            array[8] = te.nextInt();
            System.out.println("      Ingrese la aguilidad de manos con el balon del "+decideNombre);
            System.out.println("1=Malo, 2=Masomenos, 3=Bueno, 4=Excelente, 5=Increible");
            array[9] = te.nextInt();
            // System.out.println("        Ingrese la salida en falso del "+decideNombre);
            // System.out.println("1=Malo, 2=Masomenos, 3=Bueno, 4=Excelente, 5=Increible");
            // array[10] = te.nextInt();
            array[10] = 1;
            System.out.println();
            System.out.println("  Ingrese el juego aereo defensivo del "+decideNombre+": ");
            System.out.println("1=Malo, 2=Masomenos, 3=Bueno, 4=Excelente, 5=Increible");
            array[11] = te.nextInt();
        }else if (opc == 2) {
            array[0] = "Delantero";
            System.out.println("   Ingrese la habilidad de desmarque del "+decideNombre);
            System.out.println("1=Malo, 2=Masomenos, 3=Bueno, 4=Excelente, 5=Increible");
            array[12] = te.nextInt();
            System.out.println("    Ingrese el remate de primera del "+decideNombre);
            System.out.println("1=Malo, 2=Masomenos, 3=Bueno, 4=Excelente, 5=Increible");
            System.out.println("Ingrese el numero de goles por partido del "+decideNombre+": ");
            array[13] = te.nextInt();
            System.out.println("Ingrese el numero de goles por partido del "+decideNombre);
            array[14] = te.nextInt();
            System.out.println("  Ingrese la presicion de los tiros del "+decideNombre);
            System.out.println("1=Malo, 2=Masomenos, 3=Bueno, 4=Excelente, 5=Increible");
            array[15] = te.nextInt();
        }else if (opc ==3 ) {
            array[0] = "Defensa";
            System.out.println("   Ingrese el liderazgo defensivo del "+decideNombre);
            System.out.println("1=Malo, 2=Masomenos, 3=Bueno, 4=Excelente, 5=Increible");
            array[16] = te.nextInt();
            System.out.println("Ingrese la posición del jugador:");
            System.out.println("1= Defensa central, 2= Defensa lateral");
            int decision = te.nextInt();
            array[17] = (decision == 1) ? "Defensa central" : (decision == 2) ? "Defensa lateral" : "";
            System.out.println("Ingrese el tackle del "+decideNombre);
            System.out.println("1=Malo, 2=Masomenos, 3=Bueno, 4=Excelente, 5=Increible");
            array[18] = te.nextInt();
            System.out.println("Ingrese el marcaje al hombre del "+decideNombre);
            System.out.println("1=Malo, 2=Masomenos, 3=Bueno, 4=Excelente, 5=Increible");
            array[19] = te.nextInt();            
        }
        for (int i = 9; i <= array.length-1; i++) {
            if (i == 14 || i == 22 ) {
                break;
            }else{
                if ((int)array[i] == 1) {
                    array[i] = CalidadJugador.Malo;
                }else if ((int)array[i] == 2) {
                    array[i] = CalidadJugador.Masomenos;                    
                }else if ((int)array[i] == 3) {
                    array[i] = CalidadJugador.Bueno;                    
                }else if ((int)array[i] == 4) {
                    array[i] = CalidadJugador.Excelente;                    
                }else if ((int)array[i] == 4) {
                    array[i] = CalidadJugador.Excelente;                    
                }
            }
        }
        return array;
    }//Fin duncion informacion

    public static void crearInstanciaEquipo(){


//         public static Hotel crearInstanciaHotel(String tipoHabi, String usu, int ide, int edad,
//         int numHabi, int numCamas, int numDias) {
//     if (tipoHabi.equals("sencilla")) {
//         return new Sencilla(usu, ide, edad, tipoHabi, numHabi, numCamas, numDias);
//     } else if (tipoHabi.equals("doble")) {
//         return new Doble(usu, ide, edad, tipoHabi, numHabi, numCamas, numDias);
//     } else if (tipoHabi.equals("suite")) {
//         return new Suite(usu, ide, edad, tipoHabi, numHabi, numCamas, numDias);
//     } else {
//         return null;
//     }

    }

}
