
public class Delantero extends EquipoFutbol {

    private CalidadJugador desmarque;
    private CalidadJugador remateDePrimera;
    private int golesAnotadosPartido;
    private CalidadJugador presicionTiros;

    

    public Delantero(String equipo, String posicion, NombreEquipo nombreEqui, int numeroJugador, int numeroGoles,
            int numeroPases, int numeroAutoGoles, double salarioJugador, CalidadJugador desmarque,
            CalidadJugador remateDePrimera, int golesAnotadosPartido, CalidadJugador presicionTiros) {
        super(equipo, posicion, nombreEqui, numeroJugador, numeroGoles, numeroPases, numeroAutoGoles, salarioJugador);
        this.desmarque = desmarque;
        this.remateDePrimera = remateDePrimera;
        this.golesAnotadosPartido = golesAnotadosPartido;
        this.presicionTiros = presicionTiros;
    }

    public CalidadJugador getDesmarque() {
        return desmarque;
    }

    public void setDesmarque(CalidadJugador desmarque) {
        this.desmarque = desmarque;
    }

    public CalidadJugador getRemateDePrimera() {
        return remateDePrimera;
    }

    public void setRemateDePrimera(CalidadJugador remateDePrimera) {
        this.remateDePrimera = remateDePrimera;
    }

    public CalidadJugador getPresicionTiros() {
        return presicionTiros;
    }

    public void setPresicionTiros(CalidadJugador presicionTiros) {
        this.presicionTiros = presicionTiros;
    }

    public int getGolesAnotadosPartido() {
        return golesAnotadosPartido;
    }

    public void setGolesAnotadosPartido(int golesAnotadosPartido) {
        this.golesAnotadosPartido = golesAnotadosPartido;
    }

    @Override
    public double calcularGoles() {
        return 0;
    }

    @Override
    public double calcularPases() {
        return 0;
    }

    @Override
    public double calcularSalarioTotal() {
        return 0;
    }

    @Override
    public String toString() {
        return "╔═════════════════════════════════════════════════════╗\n" +
               "║               Atributos del Delantero               ║\n" +
               "╠═════════════════════════════════════════════════════╣\n" +
               "║ Equipo: " + getEquipo() + "                         ║\n" +
               "║ Posición: " + getPosicion() + "                     ║\n" +
               "║ Nombre del Equipo: " + getNombreEqui() + "          ║\n" +
               "║ Número de Jugador: " + getNumeroJugador() + "       ║\n" +
               "║ Número de Goles: " + getNumeroGoles() + "           ║\n" +
               "║ Número de Pases: " + getNumeroPases() + "           ║\n" +
               "║ Número de Autogoles: " +getNumeroAutoGoles()+"      ║\n" +
               "║ Salario del Jugador: " + getSalarioJugador()+"      ║\n" +
               "║ Desmarque: " + desmarque + "                        ║\n" +
               "║ Remate de primera: " + remateDePrimera + "          ║\n" +
               "║ Goles anotados por partido: "+golesAnotadosPartido+"║\n" +
               "║ Precisión de tiros: " + presicionTiros + "          ║\n" +
               "╚═════════════════════════════════════════════════════╝";
    }
    
    
}
