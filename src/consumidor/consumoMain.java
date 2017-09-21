/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumidor;

import co.edu.udea.exception.OrgSistemasSecurityException;
import java.util.List;
/**
 *
 * @author maria.martinez3
 */
public class consumoMain {
    
    public static void main(String[] args) throws OrgSistemasSecurityException {
        Consumo respuesta =  new Consumo();
        List res= respuesta.consultarFacultades("25");
        System.out.println(res);
    }
}
