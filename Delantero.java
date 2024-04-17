
public class Delantero extends EquipoFutbol {

    private String desmarque;
    private String remateDePrimera;
    private int golesAnotadosPartido;
    private String presicionTiros;

    public Delantero(String equipo, String posicion, NombreEquipo nombreEqui, int numeroJugador, int numeroGoles,
            int numeroPases, int numeroAutoGoles, double salarioJugador, String desmarque,
            String remateDePrimera, int golesAnotadosPartido, String presicionTiros) {
        super(equipo, posicion, nombreEqui, numeroJugador, numeroGoles, numeroPases, numeroAutoGoles, salarioJugador);
        this.desmarque = desmarque;
        this.remateDePrimera = remateDePrimera;
        this.golesAnotadosPartido = golesAnotadosPartido;
        this.presicionTiros = presicionTiros;
    }

    public String getDesmarque() {
        return desmarque;
    }

    public void setDesmarque(String desmarque) {
        this.desmarque = desmarque;
    }

    public String getRemateDePrimera() {
        return remateDePrimera;
    }

    public void setRemateDePrimera(String remateDePrimera) {
        this.remateDePrimera = remateDePrimera;
    }

    public int getGolesAnotadosPartido() {
        return golesAnotadosPartido;
    }

    public void setGolesAnotadosPartido(int golesAnotadosPartido) {
        this.golesAnotadosPartido = golesAnotadosPartido;
    }

    public String getPresicionTiros() {
        return presicionTiros;
    }

    public void setPresicionTiros(String presicionTiros) {
        this.presicionTiros = presicionTiros;
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
