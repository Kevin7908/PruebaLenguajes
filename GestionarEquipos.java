import java.util.ArrayList;
import java.util.List;

public class GestionarEquipos {
    
    private List<EquipoFutbol> equipos;

    public GestionarEquipos() {
        equipos = new ArrayList<>();
    }

    public void anadirEquipos(EquipoFutbol equipo,int numJu, String pos, String nomEqui ){
        int c = 0;
        for (EquipoFutbol e : equipos) {
            if (nomEqui ==e.getEquipo() && pos == e.getPosicion() && numJu == e.getNumeroJugador()){
                c=1;
                break;
            }else{
                c=2;
            }
        }

        if (c==2) {
            equipos.add(equipo);
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


}
