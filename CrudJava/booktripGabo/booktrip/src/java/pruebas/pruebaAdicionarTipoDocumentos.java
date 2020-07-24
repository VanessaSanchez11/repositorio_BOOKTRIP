
    package pruebas;

    import controlador.tipodocumentosDAO;
    import controlador.tipodocumentosDAO;
    import modelo.tipodocumentos;
    import java.util.Scanner;

    public class pruebaAdicionarTipoDocumentos {


        public static void main(String[] args) {
        tipodocumentosDAO tipodocumentosDAO=new  tipodocumentosDAO();
        tipodocumentos mitipodocumento =new  tipodocumentos();

        Scanner leer= new Scanner (System.in);

        String nombre="";

            System.out.println("por favor digite el nombre de tipodocumento");
            nombre=leer.next();
            mitipodocumento.setNombre(nombre);


           String respuesta = tipodocumentosDAO.adicionarTipoDocumentos(mitipodocumento);
            if(respuesta.length()==0){
                System.out.println("registrado");
            }else{
            System.out.println("error"+respuesta);
        }
        }

        }

