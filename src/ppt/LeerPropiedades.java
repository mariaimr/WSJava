/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt;


import java.util.MissingResourceException;
import java.util.ResourceBundle;


public class LeerPropiedades {

    ResourceBundle bundle = null;
    public final static String PROPIEDADES_TOKEN = "webservice.token";
    public final static String PROPIEDADES_CLAVE = "webservice.clave";
    public final static String PROPIEDADES_DATOS_PRUEBAS = "webservice.datosPruebas";
    public final static String PROPIEDADES_DATABASE_URL = "conexion.url";
    public final static String PROPIEDADES_DATABASE_DATABASE = "conexion.database";
    public final static String PROPIEDADES_DATABASE_DRIVER = "conexion.driver";
    public final static String PROPIEDADES_DATABASE_USER = "conexion.user";
    public final static String PROPIEDADES_DATABASE_PASSWORD = "conexion.password";

    public final static String PROPS_INFO_ACADEMICA = "ws.consultainformacionacademicamares";

    public final static String PROPS_MATERIA_ESTUDIANTE = "ws.consultamateriasestudiantemares";
    public final static String PROPS_NOTA_PARCIAL_EST = "ws.consultarnotaparcialestudiantemares";
    public final static String PROPS_EST_PUEDE_VER_NOTA_CURSO = "ws.estudiantepuedevernotascursomares";
    public final static String PROPS_VALIDAR_USER_X_CN = "ws.validarusuariooidxcn";

    public LeerPropiedades(String propiedadesNombre) {
        try {
            bundle = ResourceBundle.getBundle(propiedadesNombre);
        } catch (MissingResourceException e) {
        }
    }

   
    public String getDato(String clave) {
        return bundle.getString(clave);
    }    

   
    public boolean getBoolean(String clave) {
        return "true".equalsIgnoreCase(bundle.getString(clave));
    }
}
