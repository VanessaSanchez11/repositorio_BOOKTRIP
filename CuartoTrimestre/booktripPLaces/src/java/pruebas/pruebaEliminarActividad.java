package prueba;

import controlador.actividadesDAO;
import java.util.ArrayList;
import modelo.actividades;

public class pruebaEliminarActividad {

    public static void main(String[] args) {

        actividadesDAO actividadesDAO = new actividadesDAO();

        ArrayList<actividades> ListaActividades = actividadesDAO.ConsularListaActividades("");

        for (actividades A : ListaActividades) {

            System.out.println("idActividad: " + A.getIdActividad()
                    + "    IdMunicipio:  " + A.getIdMunicipio()
                    + "    nombre:   " + A.getNombre()
                    + "    lugar   " + A.getLugar()
                    + "     descripcion   " + A.getDescripcion());
        }

        System.out.println("se elimino");

        actividadesDAO.EliminarActividad(ListaActividades.get(1));
        ListaActividades = actividadesDAO.ConsularListaActividades("");

        for (actividades A : ListaActividades) {

             System.out.println("idActividad: " + A.getIdActividad()
                    + "    IdMunicipio:  " + A.getIdMunicipio()
                    + "    nombre:   " + A.getNombre()
                    + "    lugar   " + A.getLugar()
                    + "     descripcion   " + A.getDescripcion());
        }
    }
}
