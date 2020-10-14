
package pruebas;

import modelo.departamento;
import java.util.Scanner;
import controlador.departamentosDAO;

public class pruebaActualizarDepartamento {
    
    public static void main(String[] args) {
        departamentosDAO depa = new departamentosDAO();
        departamento departamento = new departamento();

        Scanner leer = new Scanner(System.in);

        String nombre = "";

        System.out.println("Ingrese la nueva informacion del departamento");
        nombre = leer.next();
       
        
        departamento.setIdDepartamento(1);

        String Res = depa.actualizarDepartamento(departamento);
        if (Res.length() == 0) {
            System.out.println("Dato actualizado");
        } else {
            System.out.println("Error");
        }

    }
    



    
    
    
}
