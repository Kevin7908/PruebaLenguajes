abstract class EquipoFutbol {
    // aca va el enum nombreEquipo
    private String equipo = "";
    private String posicion;
    private NombreEquipo nombreEqui;
    private int numeroJugador = -1;
    private int numeroGoles;
    private int numeroPases;
    private int numeroAutoGoles;
    private double salarioJugador;
    private CalidadJugador calidadJu;

    public abstract double calcularGoles();
    public abstract double calcularPases();
    public abstract double calcularSalarioTotal();

    public EquipoFutbol(String equipo, String posicion, NombreEquipo nombreEqui, int numeroJugador, int numeroGoles,
            int numeroPases, int numeroAutoGoles, double salarioJugador) {
        this.equipo = equipo;
        this.posicion = posicion;
        this.nombreEqui = nombreEqui;
        this.numeroJugador = numeroJugador;
        this.numeroGoles = numeroGoles;
        this.numeroPases = numeroPases;
        this.numeroAutoGoles = numeroAutoGoles;
        this.salarioJugador = salarioJugador;
    }

    public EquipoFutbol(String numeroJugador2, String equipo2) {
		//TODO Auto-generated constructor stub
	}
	public EquipoFutbol(String equipo2) {
        //TODO Auto-generated constructor stub
    }
    public CalidadJugador getCalidadJu() {
        return calidadJu;
    }
    public void setCalidadJu(CalidadJugador calidadJu) {
        this.calidadJu = calidadJu;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "EquipoFutbol [equipo=" + equipo + ", posicion=" + posicion + ", nombreEqui=" + nombreEqui
                + ", numeroJugador=" + numeroJugador + ", numeroGoles=" + numeroGoles + ", numeroPases=" + numeroPases
                + ", numeroAutoGoles=" + numeroAutoGoles + ", salarioJugador=" + salarioJugador + "]";
    }

}
