import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //menu();


    }//fin main

    public static void menu() {
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
                    
                    

                        
                    break;
                default:
                    break;
            }// fin switch
        }// fin while menu
       
    }// fin funcion

}
