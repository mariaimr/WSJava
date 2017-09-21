package consumidor;


import dto.Facultad;
import java.util.List;
import co.edu.udea.wsClient.OrgSistemasWebServiceClient;
import co.edu.udea.exception.OrgSistemasSecurityException;


/**
 *
 * @author maria.martinez3
 */
public class Consumo {
    
    private volatile OrgSistemasWebServiceClient wsCliente;
    //nombre del metodo para consultar las notas de las actividades de una materia
    private static final String FACULTADES = "consultafacultadesmares";
    private String TOKEN = "6aaa5e631067cdda423396987f54f9df96625150";
    
    public List<Facultad> consultarFacultades(String facultad) throws OrgSistemasSecurityException {
        wsCliente.addParam("facultad", facultad);
        
        List<Facultad> actividades = null;

        actividades = wsCliente.obtenerBean(FACULTADES, TOKEN, Facultad.class);

        return actividades;
    }
}
