
package prueba;

import controlador.municipiosDAO;
import java.util.ArrayList;
import modelo.municipios;


public class pruebaEliminarMunicipios {

    public static void main(String[] args) {

        municipiosDAO municipiosDAO = new municipiosDAO();
        ArrayList<municipios> ListaMunicipios = municipiosDAO.ConsularListaMunicipio("");

        for (municipios M : ListaMunicipios) {
            System.out.println("IdMunicipio:    "  + M.getIdMunicipio()+ "     "
                  + "Nombre:   "   + M.getNombre());
        }

        System.out.println("se elimino");

        municipiosDAO.EliminarMunicipio(ListaMunicipios.get(2));
        ListaMunicipios = municipiosDAO.ConsularListaMunicipio("");

        for (municipios M : ListaMunicipios) {
            System.out.println("IdMunicipio:    " + M.getIdMunicipio() + "     "
                    
                    + "Nombre:   " + M.getNombre());
        }

    }

}
