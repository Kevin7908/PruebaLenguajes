import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class EquipoStream {

    private int numeroj ;
    private String equipito;

    private static final NombreEquipo[] NOMBREEQUIPO = NombreEquipo.values();
    private static final String[] POSICIONDEFENSA = { "Defesa lateral", "Defensa central" };
    private static final CalidadJugador[] CALIDADJUGADORES = CalidadJugador.values();
    private static final String[] POSICIONES = { "Arquero", "Defensa", "Volante", "Delantero" };
    private static final Random random = new Random();

    List<EquipoFutbol> equiposEs;

    public EquipoStream() {
        equiposEs = new ArrayList<>();
    }

    public void agregarEquipoStream(EquipoFutbol equipo){
        equiposEs.add(equipo);
    }

    public void mostrarEquipoStream(){
        for (EquipoFutbol e : equiposEs) {
            System.out.println(e);
        }
    }

    // public void agregarEquiposDesdeGenerico(GestionarEquipos gestionar) {
    //     equiposEs.addAll(gestionar.obtenerEquiposGestionar());
    // }

    public void organizarConStreams(EquipoFutbol equipo) {
        // Crear un stream a partir de la lista de equipos
        Stream<EquipoFutbol> equipoStream = equiposEs.stream();
        // En esta linea cogemos el equipoStream el .sorted nos ordena dependiendo del
        // dato en este caso String
        // comparamos con el metodo comparing de la clase Comparator
        // Depues de esto la sguinete linea nos dice que va a comparar segun el
        // getEquipo de la clase EquipoFutbol
        Stream<EquipoFutbol> equiposOrdenados = equipoStream.sorted(Comparator.comparing(EquipoFutbol::getEquipo));

        // Imprimir los equipos ordenados
        equiposOrdenados.forEach(System.out::println);
    }

    Supplier<EquipoFutbol> generarEquipoAleatorio = () -> {
    
        NombreEquipo nombreEquipo = NOMBREEQUIPO[random.nextInt(NOMBREEQUIPO.length)];
        String posiciones = POSICIONES[random.nextInt(POSICIONES.length)];
        CalidadJugador calidadJugadores = CALIDADJUGADORES[random.nextInt(CALIDADJUGADORES.length)];
        String posicionDefensa = POSICIONDEFENSA[random.nextInt(POSICIONDEFENSA.length)];
    
        String nombreEquipitoString = nombreEquipo.getnom();
        this.setEquipito(nombreEquipitoString);
        int numeroJugador = random.nextInt(50)+1;
        this.setNumeroj(numeroJugador);
        int numeroGoles = random.nextInt(6)+1;
        int numeroPases = random.nextInt(31)+1;
        int numeroAutoGoles = random.nextInt(2)+1;
        double salarioJugador = random.nextDouble() * 1000000 + 500000;
        //para arquero
        int golesTapadosArquero = random.nextInt(21)+1;
        CalidadJugador agilidadManos = calidadJugadores;
        CalidadJugador salidaEnFalso = calidadJugadores;
        CalidadJugador juegoAereoDefensivo = calidadJugadores;
        //para defensa
        CalidadJugador liderazgoDefensivo = calidadJugadores;
        //aca va la posicion que esta arriba
        CalidadJugador tackle = calidadJugadores;
        CalidadJugador marcajeAlHombre = calidadJugadores;
        //para delantero
        CalidadJugador desmarque = calidadJugadores;
        CalidadJugador rematePrimera = calidadJugadores;
        int golesAnotadosPartido = random.nextInt(8)+1;
        CalidadJugador presicionTiros = calidadJugadores;
        //definir clase 
        int definirClase = random.nextInt(3) + 1;
    
        EquipoFutbol equipoFutbol = null;
        
        switch (definirClase) {
            case 1:
                equipoFutbol = new Arquero(nombreEquipitoString, posiciones, nombreEquipo, numeroJugador,
                 numeroGoles, numeroPases, numeroAutoGoles, salarioJugador, golesTapadosArquero, 
                 agilidadManos, salidaEnFalso, juegoAereoDefensivo);
                break;
            case 2:
                equipoFutbol = new Defensa(nombreEquipitoString, posiciones, nombreEquipo, numeroJugador,
                numeroGoles, numeroPases, numeroAutoGoles, salarioJugador, liderazgoDefensivo,
                 posicionDefensa, tackle, marcajeAlHombre);
                break;
            case 3:
                equipoFutbol = new Delantero(nombreEquipitoString, posiciones, nombreEquipo, numeroJugador,
                numeroGoles, numeroPases, numeroAutoGoles, salarioJugador, desmarque,
                  rematePrimera, golesAnotadosPartido, presicionTiros);
                break;
        }
    
        return equipoFutbol;
    };
    
    Supplier <EquipoFutbol> partidoEntreEquipos = () -> {

        //int numeroGoles = random.nextInt(3);

        return null;
    };

    public List<EquipoFutbol> obtenerEquipoStream(){
        return equiposEs;
    }

    public void eliminarEquiposStreams(){
        equiposEs.clear();
    }

/////////////////////////////////////////////////
//getter and setters
    public int getNumeroj() {
        return numeroj;
    }

    public void setNumeroj(int numeroj) {
        this.numeroj = numeroj;
    }

    public String getEquipito() {
        return equipito;
    }

    public void setEquipito(String equipito) {
        this.equipito = equipito;
    }


}
