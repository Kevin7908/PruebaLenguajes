
public class Arquero extends EquipoFutbol {

    private int golesTapados;
    private CalidadJugador agilidadManos;
    private CalidadJugador salidaEnFalso;
    private CalidadJugador juegoAereoDefensivo;


    public Arquero(String equipo, String posicion, NombreEquipo nombreEqui, int numeroJugador, int numeroGoles,
            int numeroPases, int numeroAutoGoles, double salarioJugador, int golesTapados,
            CalidadJugador agilidadManos, CalidadJugador salidaEnFalso, CalidadJugador juegoAereoDefensivo) {
        super(equipo, posicion, nombreEqui, numeroJugador, numeroGoles, numeroPases, numeroAutoGoles, salarioJugador
                );
        this.golesTapados = golesTapados;
        this.agilidadManos = agilidadManos;
        this.salidaEnFalso = salidaEnFalso;
        this.juegoAereoDefensivo = juegoAereoDefensivo;
    }

    public int getGolesTapados() {
        return golesTapados;
    }

    public void setGolesTapados(int golesTapados) {
        this.golesTapados = golesTapados;
    }

    public CalidadJugador getAgilidadManos() {
        return agilidadManos;
    }

    public void setAgilidadManos(CalidadJugador agilidadManos) {
        this.agilidadManos = agilidadManos;
    }

    public CalidadJugador getSalidaEnFalso() {
        return salidaEnFalso;
    }

    public void setSalidaEnFalso(CalidadJugador salidaEnFalso) {
        this.salidaEnFalso = salidaEnFalso;
    }

    public CalidadJugador getJuegoAereoDefensivo() {
        return juegoAereoDefensivo;
    }

    public void setJuegoAereoDefensivo(CalidadJugador juegoAereoDefensivo) {
        this.juegoAereoDefensivo = juegoAereoDefensivo;
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
        return "╔════════════════════════════════════════════════╗\n" +
               "║              Atributos del Arquero             ║\n" +
               "╠════════════════════════════════════════════════║\n" +
               "║  Número de jugador: " + getNumeroJugador() + " ║\n" +
               "║  Número de goles: " + getNumeroGoles() + "     ║\n" +
               "║  Número de pases: " + getNumeroPases() + "     ║\n" +
               "║  Número de autogoles: " +getNumeroAutoGoles()+"║\n" +
               "║  Salario del jugador: " + getSalarioJugador()+"║\n" +
               "║  Nombre del equipo: " + getNombreEqui() + "    ║\n" +
               "║  Posición: " + getPosicion() + "               ║\n" +
               "║  Goles tapados: " + golesTapados + "           ║\n" +
               "║  Agilidad de manos: " + agilidadManos + "      ║\n" +
               "║  Salida en falso: " + salidaEnFalso + "        ║\n" +
               "║  Juego aéreo defensivo: "+juegoAereoDefensivo+"║\n" +
               "╚════════════════════════════════════════════════╝";
    }

}
