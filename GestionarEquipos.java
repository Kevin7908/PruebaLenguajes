import java.util.ArrayList;
import java.util.List;

public class GestionarEquipos {
    
    private List<EquipoFutbol> equipos;

    public GestionarEquipos() {
        equipos = new ArrayList<>();
    }

    public void anadirEquipos(EquipoFutbol equipo){
        equipos.add(equipo);
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

    // public void buscarEquipo(String nomEqui){
    //     NombreEquipo n = NombreEquipo.BARCELONA;
    //     for (EquipoFutbol e: equipos){
    //         if (nomEqui == e.getEquipo()) {
    //             System.out.println(e);
    //         }
    //     }
    // }


}
