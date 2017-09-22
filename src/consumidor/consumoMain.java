/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumidor;

import co.edu.udea.exception.OrgSistemasSecurityException;
import co.edu.udea.wsClient.OrgSistemasWebServiceClient;
import dto.Facultad;
import java.util.List;
/**
 *
 * @author maria.martinez3
 */
public class consumoMain {
    static OrgSistemasWebServiceClient wsCliente;
    static String clave="452624219667108910919947";
    public static void main(String[] args) throws OrgSistemasSecurityException {
//        try {
//            wsCliente = new OrgSistemasWebServiceClient(clave,true) ;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    
//    //nombre del metodo para consultar las notas de las actividades de una materia
//    String FACULTADES = "consultafacultadesmares";
//    String TOKEN = "6aaa5e631067cdda423396987f54f9df96625150";
//    String facultad= "25";
//    wsCliente.addParam("facultad", facultad);
//    List<Facultad> actividades = wsCliente.obtenerBean(FACULTADES, TOKEN, Facultad.class);
//    System.out.println(actividades); 
//        /*Consumo respuesta =  new Consumo();
//        List res= respuesta.consultarFacultades("10");
//        System.out.println(res);*/
   }
}
