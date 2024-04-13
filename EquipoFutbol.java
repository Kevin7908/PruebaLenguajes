abstract class EquipoFutbol {
    //aca va el enum nombreEquipo
    private String nombre;
    private String posicion;
    private NombreEquipo nombreEqui;
    private int numeroJugador;
    private int numeroGoles;
    private int numeroPases;
    private int numeroAutoGoles;
    private double salarioJugador;

    public abstract double calcularGoles();
    public abstract double calcularPases();
    public abstract double calcularSalarioTotal();

    public EquipoFutbol(int numeroJugador, int numeroGoles, int numeroPases, int numeroAutoGoles,
            double salarioJugador) {
        super();
        this.numeroJugador = numeroJugador;
        this.numeroGoles = numeroGoles;
        this.numeroPases = numeroPases;
        this.numeroAutoGoles = numeroAutoGoles;
        this.salarioJugador = salarioJugador;
    }

    public int getNumeroJugador() {
        return numeroJugador;
    }

    public void setNumeroJugador(int numeroJugador) {
        this.numeroJugador = numeroJugador;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getNumeroPases() {
        return numeroPases;
    }

    public void setNumeroPases(int numeroPases) {
        this.numeroPases = numeroPases;
    }

    public int getNumeroAutoGoles() {
        return numeroAutoGoles;
    }

    public void setNumeroAutoGoles(int numeroAutoGoles) {
        this.numeroAutoGoles = numeroAutoGoles;
    }

    public double getSalarioJugador() {
        return salarioJugador;
    }

    public void setSalarioJugador(double salarioJugador) {
        this.salarioJugador = salarioJugador;
    }

    public NombreEquipo getNombreEqui() {
        return nombreEqui;
    }

    public void setNombreEqui(NombreEquipo nombreEqui) {
        this.nombreEqui = nombreEqui;
    }

    

}
