import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GestionarEquipos {

    private List<EquipoFutbol> equipos;

    public GestionarEquipos() {
        equipos = new ArrayList<>();
    }

    public void anadirEquipos(EquipoFutbol equipo) {
        for (EquipoFutbol e : equipos) {
            if (e.getEquipo().equals(equipo.getEquipo()) && e.getNumeroJugador() == equipo.getNumeroJugador()){
                System.out.println("El número del jugador está repetido");
                return; // Termina el método si encuentra un jugador con el mismo número
            }
        }
        equipos.add(equipo);
    }

    public  void mostrarEquipos() {
        for (EquipoFutbol e : equipos) {
            System.out.println(e);
        }
    }
//tengo una idea con esta funcion y es crear otra funcion ejemplo repetida 
//si me retorna true es que en esye caso existe ese numero y ese equipo y entonces lo que hago es 
//mandar todos los datos para que los modifique, pero si no encuentra nada entonces me sale un mensaje
//diciendo de que no esta y entonces me ahorro un tiempo de ingresar datos y que despues me diga
//"Este jugador no existe" en pocas palabras me ahorra tiempo
    public void modificarEquipos(int numju, String equi,int nuevoNumeroju, String nuevoEqui) {
        for (EquipoFutbol equipo : equipos) {
            if (equipo.getEquipo().equals(equi) && equipo.getNumeroJugador() == numju) {
                equipo.setNumeroJugador(nuevoNumeroju);
                equipo.setEquipo(nuevoEqui);
                break; // Rompe el bucle una vez que se han modificado los datos del equipo
            }
        }
    }

    public void eliminarEquipos(int numju, String equi) {
        Iterator<EquipoFutbol> iterator = equipos.iterator();
        while (iterator.hasNext()) {
            EquipoFutbol equipoFutbol = iterator.next();
            if (equipoFutbol.getNumeroJugador() == numju && equipoFutbol.getEquipo().equals(equi)) {
                iterator.remove();
            }
        }
        // for (EquipoFutbol equipoFutbol : equipos) {
        //     if (equipoFutbol.getNumeroJugador() == numju && equipoFutbol.getEquipo().equals(equi)) {
        //         equipos.remove(numju);
        //     }
        // }
    }

    public void mostrarEquipoEspecifico( int numJu, String nomEqui) {
        for (EquipoFutbol e : equipos) {
            if (nomEqui == e.getEquipo() && numJu == e.getNumeroJugador()) {
                System.out.println(e);
            }
        }
    }

    public void agregarEquiposDesdeGenerico(EquipoGenerico<? extends EquipoFutbol> equipoGenerico,boolean b) {
        if (b == true) {
            equipos.addAll(equipoGenerico.obtenerListaEquipos());
        }else{
            System.out.println("esta lista esta repetida");
        }
        
    }

    public boolean repetido( String equi, int numeroJugador) {
        for (EquipoFutbol equipoFutbol : equipos) {
            if (equipoFutbol.getEquipo().equals(equi) && equipoFutbol.getNumeroJugador() == numeroJugador) {
                return true; // Jugador repetido encontrado
            }
        }
        return false; // No se encontró jugador repetido
    }   

}
