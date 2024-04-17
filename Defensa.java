
public class Defensa extends EquipoFutbol {

    private String liderazgoDefensivo;
    private String posicion; // puede ser lateral izquierdo, lateral derecho o central
    private String tackle;
    private String marcajeAlHombre;



    public Defensa(String equipo, String posicion, NombreEquipo nombreEqui, int numeroJugador, int numeroGoles,
            int numeroPases, int numeroAutoGoles, double salarioJugador, 
            String liderazgoDefensivo, String posicion2, String tackle, String marcajeAlHombre) {
        super(equipo, posicion, nombreEqui, numeroJugador, numeroGoles, numeroPases, numeroAutoGoles, salarioJugador);
        this.liderazgoDefensivo = liderazgoDefensivo;
        posicion = posicion2;
        this.tackle = tackle;
        this.marcajeAlHombre = marcajeAlHombre;
    }

    public String getLiderazgoDefensivo() {
        return liderazgoDefensivo;
    }

    public void setLiderazgoDefensivo(String liderazgoDefensivo) {
        this.liderazgoDefensivo = liderazgoDefensivo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getTackle() {
        return tackle;
    }

    public void setTackle(String tackle) {
        this.tackle = tackle;
    }

    public String getMarcajeAlHombre() {
        return marcajeAlHombre;
    }

    public void setMarcajeAlHombre(String marcajeAlHombre) {
        this.marcajeAlHombre = marcajeAlHombre;
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
