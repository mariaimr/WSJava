package consumidor;


import dto.Facultad;
import java.util.List;
import co.edu.udea.wsClient.OrgSistemasWebServiceClient;
import co.edu.udea.exception.OrgSistemasSecurityException;
import ppt.ConstantesStatic;
import ppt.LeerPropiedades;


/**
 *
 * @author maria.martinez3
 */
public class Consumo {
    LeerPropiedades prop1 = new LeerPropiedades(ConstantesStatic.PROPERTIES_WEB_SERVICE);
    
    //token de acceso asignado al servidor hakuna.udea.edu.co
    private final String TOKEN = prop1.getDato(LeerPropiedades.PROPIEDADES_TOKEN);
    //clave publica requerida cuando los metodos invocados requieren cifrado
    private String CLAVE = prop1.getDato(LeerPropiedades.PROPIEDADES_CLAVE);

    private boolean DATOS_PRUEBAS = prop1.getBoolean(LeerPropiedades.PROPIEDADES_DATOS_PRUEBAS);
    private static final String FACULTADES = "consultafacultadesmares";
    
    
    private volatile OrgSistemasWebServiceClient wsCliente;
    //nombre del metodo para consultar las notas de las actividades de una materia
   // private static final String FACULTADES = "consultafacultadesmares";
    // private final String TOKEN = "6aaa5e631067cdda423396987f54f9df96625150";
    
    public Consumo(boolean requiereCifrado) {
        try {
            if (requiereCifrado) {
                wsCliente = new OrgSistemasWebServiceClient(CLAVE, DATOS_PRUEBAS);
            } else {
                wsCliente = new OrgSistemasWebServiceClient(DATOS_PRUEBAS);
            }
        } catch (OrgSistemasSecurityException ex) {
            System.out.println(ex);
        }
    }
    
    public List<Facultad> consultarFacultades(String facultad) throws OrgSistemasSecurityException {
        this.wsCliente.addParam("facultad", facultad);
        List<Facultad> actividades = wsCliente.obtenerBean(FACULTADES, TOKEN, Facultad.class);
        return actividades;
    }
}
