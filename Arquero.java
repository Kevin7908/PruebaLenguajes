
public class Arquero extends EquipoFutbol {

    private int golesTapados;
    private String agilidadManos;
    private String salidaEnFalso;
    private String juegoAereoDefensivo;

    public Arquero(String equipo, String posicion, NombreEquipo nombreEqui, 
    int numeroJugador, int numeroGoles,
            int numeroPases, int numeroAutoGoles, double salarioJugador) {
        super(equipo, posicion, nombreEqui, numeroJugador, numeroGoles, numeroPases,
                numeroAutoGoles, salarioJugador);
    }

    public int getGolesTapados() {
        return golesTapados;
    }

    public void setGolesTapados(int golesTapados) {
        this.golesTapados = golesTapados;
    }

    public String getAgilidadManos() {
        return agilidadManos;
    }

    public void setAgilidadManos(String agilidadManos) {
        this.agilidadManos = agilidadManos;
    }

    public String getSalidaEnFalso() {
        return salidaEnFalso;
    }

    public void setSalidaEnFalso(String salidaEnFalso) {
        this.salidaEnFalso = salidaEnFalso;
    }

    public String getJuegoAereoDefensivo() {
        return juegoAereoDefensivo;
    }

    public void setJuegoAereoDefensivo(String juegoAereoDefensivo) {
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

}
