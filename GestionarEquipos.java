import java.util.ArrayList;
import java.util.List;

public class GestionarEquipos {
    
    private List<EquipoFutbol> equipos;

    public GestionarEquipos() {
        equipos = new ArrayList<>();
    }

    public void anadirEquipos(EquipoFutbol equipo,int numJu, String pos, String nomEqui ){
        for (EquipoFutbol e : equipos) {
            if (nomEqui ==e.getEquipo() && numJu == e.getNumeroJugador()){
                System.out.println("El numero del jugador esta repetido");
                break;
            }else{
                equipos.add(equipo);
            }
        }
    }

    public void mostrarEquipos(){
        for (EquipoFutbol e : equipos){
            System.out.println(e);
        }
    }

    public void modificarEquipos(int indice, EquipoFutbol equipo) {
        equipos.set(indice, equipo);
    }

    public void eliminarEquipos(int indice) {
        equipos.remove(indice);
    }

    public void buscarJugador(String nomEqui, String pos, int numJu){
        for (EquipoFutbol e: equipos){
            if (nomEqui == e.getEquipo() && pos == e.getPosicion() && numJu == e.getNumeroJugador()) {
                System.out.println(e);
            }
        }
    }

    public void agregarEquiposDesdeGenerico(EquipoGenerico<? extends EquipoFutbol> equipoGenerico) {
        //List<? extends EquipoFutbol> listaEquiposGenerico = equipoGenerico.obtenerListaEquipos();
        equipos.addAll(equipoGenerico.obtenerListaEquipos());
    }

}
