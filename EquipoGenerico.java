import java.util.ArrayList;
import java.util.List;

public class EquipoGenerico<T extends EquipoFutbol> {

    private List<T> equiposge;
    GestionarEquipos g = new GestionarEquipos();
    
    public EquipoGenerico() {
        equiposge = new ArrayList<>();
    }

    public void agregarEquipoGenerico(T e) {
        equiposge.add(e);
    }

    public void mostrarEquiposGenericos() {
        for (T equipo : equiposge) {
            System.out.println(equipo);
        }
    }
    
    public void modificarEquipoGenericos(int indice, T nuevoEquipo) {
        if (indice >= 0 && indice < equiposge.size()) {
            equiposge.set(indice, nuevoEquipo);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    public void eliminarEquipoGenericos(int indice) {
        if (indice >= 0 && indice < equiposge.size()) {
            equiposge.remove(indice);
        } else {
            System.out.println("Índice fuera de rango.");
        }

    }

    public void buscarJugadorGenericos(String equipo, String posicion, int numeroJugador) {
        for (T equipoFutbol : equiposge) {
            if (equipoFutbol.getEquipo().equals(equipo) &&
                equipoFutbol.getPosicion().equals(posicion) &&
                equipoFutbol.getNumeroJugador() == numeroJugador) {
                System.out.println("Jugador encontrado: " + equipoFutbol);
                break;
            }
        }
        System.out.println("Jugador no encontrado.");
    }

    public List<T> obtenerListaEquipos() {
        return equiposge;
    }

}
