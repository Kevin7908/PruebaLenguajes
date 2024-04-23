
public class Defensa extends EquipoFutbol {

    private CalidadJugador liderazgoDefensivo;
    private String posicionDefensaString; // puede ser lateral izquierdo, lateral derecho o central
    private CalidadJugador tackle;
    private CalidadJugador marcajeAlHombre;

    public Defensa(String equipo, String posicion, NombreEquipo nombreEqui, int numeroJugador, int numeroGoles,
            int numeroPases, int numeroAutoGoles, double salarioJugador, CalidadJugador liderazgoDefensivo,
            String posicionDefensaString, CalidadJugador tackle, CalidadJugador marcajeAlHombre) {
        super(equipo, posicion, nombreEqui, numeroJugador, numeroGoles, numeroPases, numeroAutoGoles, salarioJugador);
        this.liderazgoDefensivo = liderazgoDefensivo;
        this.posicionDefensaString = posicionDefensaString;
        this.tackle = tackle;
        this.marcajeAlHombre = marcajeAlHombre;
    }
    
    public CalidadJugador getLiderazgoDefensivo() {
        return liderazgoDefensivo;
    }

    public void setLiderazgoDefensivo(CalidadJugador liderazgoDefensivo) {
        this.liderazgoDefensivo = liderazgoDefensivo;
    }

    public CalidadJugador getTackle() {
        return tackle;
    }

    public void setTackle(CalidadJugador tackle) {
        this.tackle = tackle;
    }

    public CalidadJugador getMarcajeAlHombre() {
        return marcajeAlHombre;
    }

    public void setMarcajeAlHombre(CalidadJugador marcajeAlHombre) {
        this.marcajeAlHombre = marcajeAlHombre;
    }

    public String getposicionDefensaString() {
        return posicionDefensaString;
    }

    public void setposicionDefensaString(String posicionDefensaString) {
        this.posicionDefensaString = posicionDefensaString;
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
        return "╔═══════════════════════════════════════════════╗\n" +
               "║              Atributos del Defensa            ║\n" +
               "╠═══════════════════════════════════════════════╣\n" +
               "║  Equipo: " + getEquipo() +                  " ║\n" +
               "║  Posición: " + getPosicion() +              " ║\n" +
               "║  Nombre del Equipo: " + getNombreEqui() +   " ║\n" +
               "║  Número de Jugador: " + getNumeroJugador() + "║\n" +
               "║  Número de Goles: " + getNumeroGoles() +     "║\n" +
               "║  Número de Pases: " + getNumeroPases() +     "║\n" +
               "║  Número de Autogoles: "+getNumeroAutoGoles()+"║\n" +
               "║  Salario del Jugador: "+getSalarioJugador()+ "║\n" +
               "║  Liderazgo Defensivo: " + liderazgoDefensivo+"║\n" +
               "║  Posición Defensa: " + posicionDefensaString+"║\n" +
               "║  Tackle: " + tackle +                        "║\n" +
               "║  Marcaje al Hombre: " + marcajeAlHombre +    "║\n" +
               "╚═══════════════════════════════════════════════╝";
    }
    
}
