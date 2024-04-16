
public class Delantero extends EquipoFutbol {

    private String desmarque;
    private String remateDePrimera;
    private int golesAnotados;
    private String presicionTiros;

    public Delantero(String equipo, String posicion, NombreEquipo nombreEqui,
            int numeroJugador, int numeroGoles,
            int numeroPases, int numeroAutoGoles, double salarioJugador,
            String desmarque, String remateDePrimera,
            int golesAnotados, String presicionTiros) {
        super(equipo, posicion, nombreEqui, numeroJugador, numeroGoles,
                numeroPases, numeroAutoGoles, salarioJugador);
        this.desmarque = desmarque;
        this.remateDePrimera = remateDePrimera;
        this.golesAnotados = golesAnotados;
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

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
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
