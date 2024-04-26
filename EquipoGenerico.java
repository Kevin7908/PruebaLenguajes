import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Como vemos la clase va a ser generico y su generico va a extender de EquipoFutbol
public class EquipoGenerico<T extends EquipoFutbol> {
    //Creamos una lista generica llamada equiposge
    private List<T> equiposge;
    GestionarEquipos g = new GestionarEquipos();
    
    public EquipoGenerico() {
        //Su constructor en donde decimos que la lista va a ser de tipo ArrayList
        equiposge = new ArrayList<>();
    }
/**
 * Agrega un equipo genérico a la lista de equipos genéricos si no existe otro equipo con el mismo número de jugador.
 *
 * parametro e, El equipo genérico que se desea agregar a la lista.
 * return true, si el equipo se agregó con éxito, false si el número de jugador está repetido y el equipo no se agregó.
 */
public boolean agregarEquipoGenerico(T e) {
    // Itera sobre la lista de equipos genéricos
    for (T equipo : equiposge) {
        // Verifica si hay otro equipo con el mismo número de jugador
        if (equipo.getEquipo().equals(e.getEquipo()) && equipo.getNumeroJugador() == e.getNumeroJugador()) {
            // Si encuentra un jugador con el mismo número, imprime un mensaje y devuelve false
            System.out.println("El número del jugador está repetido");
            return false;
        }
    }
    // Si no se encuentra otro equipo con el mismo número de jugador, agrega el equipo a la lista
    equiposge.add(e);
    return true; // Devuelve true indicando que el equipo se agregó con éxito
}
//Me retorna la lista
    public List<T> obtenerListaEquipos() {
        return equiposge;
    }
    public boolean repetido(T equipo) {
        // Iterar sobre la lista de equipos genéricos
        for (T e : equiposge) {
            // Verificar si el equipo tiene el mismo nombre y número de jugador
            if (e.getEquipo().equals(equipo.getEquipo()) && e.getNumeroJugador() == equipo.getNumeroJugador()) {
                // Si se encuentra un equipo repetido, devolver true
                return true;
            }
        }
        // Si no se encontraron equipos repetidos, devolver false
        return false;
    }

    public void eliminarEquipos(int numju, String equi) {
    // Se crea un iterador sobre la lista de equipos de fútbol.
    Iterator<T> iterator = equiposge.iterator();
    // Se recorre la lista utilizando el iterador.
    while (iterator.hasNext()) {
        // Se obtiene el próximo equipo de fútbol en la lista.
        EquipoFutbol equipoFutbol = iterator.next();
        // Se verifica si el número de jugador y el nombre del equipo coinciden con los proporcionados.
        if (equipoFutbol.getNumeroJugador() == numju && equipoFutbol.getEquipo().equals(equi)) {
            // Si coinciden, se elimina el equipo de la lista.
            iterator.remove();
        }
    }
}
   

}
