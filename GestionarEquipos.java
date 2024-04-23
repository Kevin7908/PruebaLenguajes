import java.util.ArrayList;
import java.util.List;

public class GestionarEquipos {

    private List<EquipoFutbol> equipos;

    public GestionarEquipos() {
        equipos = new ArrayList<>();
    }

    public void anadirEquipos(EquipoFutbol equipo, int numJu, String pos, String nomEqui) {
        for (EquipoFutbol e : equipos) {
            if (nomEqui.equals(e.getEquipo()) && numJu == e.getNumeroJugador()) {
                System.out.println("El número del jugador está repetido para el equipo " + nomEqui);
                return; // Salir del método si se encuentra un jugador con el mismo número
            }
        }
        equipos.add(equipo);
    }

    public  void mostrarEquipos() {
        for (EquipoFutbol e : equipos) {
            System.out.println(e);
        }
    }

    public void modificarEquipos(int indice, EquipoFutbol equipo) {
        equipos.set(indice, equipo);
    }

    public void eliminarEquipos(int indice) {
        if (indice >= 0 && indice < equipos.size()) {
            equipos.remove(indice);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public void mostrarEquipoEspecifico(String nomEqui, String pos, int numJu) {
        for (EquipoFutbol e : equipos) {
            if (nomEqui == e.getEquipo() && pos == e.getPosicion() && numJu == e.getNumeroJugador()) {
                System.out.println(e);
            }
        }
    }

    public void agregarEquiposDesdeGenerico(EquipoGenerico<? extends EquipoFutbol> equipoGenerico) {
        // List<? extends EquipoFutbol> listaEquiposGenerico =
        // equipoGenerico.obtenerListaEquipos();
        equipos.addAll(equipoGenerico.obtenerListaEquipos());
    }

    public void encontrarPosicion(String nombreEquipitoString, int numeroJugador, String posicion) {
        for (int i = 0; i < equipos.size(); i++) {
            EquipoFutbol equipo = equipos.get(i);
            if (equipo.getNombreEqui().getnom().equals(nombreEquipitoString) &&
                equipo.getNumeroJugador() == numeroJugador &&
                equipo.getPosicion().equals(posicion)) {
                System.out.println("El objeto se encuentra en la posición " + i + " del ArrayList.");
                return; // Se encontró el objeto, así que podemos salir del bucle.
            }
        }
        // Si el objeto no se encontró en el ArrayList.
        System.out.println("El objeto no se encontró en el ArrayList.");
    }

}
