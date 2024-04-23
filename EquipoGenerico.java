import java.util.ArrayList;
import java.util.List;

public class EquipoGenerico<T extends EquipoFutbol> {

    private List<T> equiposge;
    GestionarEquipos g = new GestionarEquipos();
    
    public EquipoGenerico() {
        equiposge = new ArrayList<>();
    }

    public boolean agregarEquipoGenerico(T e) {
        for (T equipo : equiposge) {
            if (equipo.getEquipo().equals(e.getEquipo()) && equipo.getNumeroJugador() == e.getNumeroJugador()){
                System.out.println("El número del jugador está repetido");
                return false; // Termina el método si encuentra un jugador con el mismo número
            }
        }
        equiposge.add(e);

        return true;
    }

    public List<T> obtenerListaEquipos() {
        return equiposge;
    }   

}
