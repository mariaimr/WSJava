/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt;


public class ConstantesStatic {

    /**
     * Nombre del archivo de propiedades para leer la configuración de comun a todos los proyectos
     */
    //public static String PROPERTIES_ORGSISTEMAS = "orgSistemas";
    public static String PROPERTIES_ORGSISTEMAS = "co.edu.udea.notasandroidws.ppt.orgSistemas";
    /**
     * Nombre del archivo de propiedades para leer la configuración de conexion
     * a la base de datos.
     */
    public static String PROPERTIES_DATABASE = "co.edu.udea.notasandroidws.ppt.configuracionbd";
    /**
     * Nombre del archivo de propiedades para leer la configuración de los SQL
     * para la base de datos MySQL
     */
    public static String PROPERTIES_SQL = "co.edu.udea.notasandroidws.ppt.sql";
    /**
     * Nombre del archivo de propiedades para leer la configuración para el
     * acceso al web service de gestion informatica
     */
    public static String PROPERTIES_WEB_SERVICE = "co.edu.udea.notasandroidws.ppt.webService";

    public static String DATA_SOURCE = "conexion.datasource";
    
    //mensaje de error que indica que no se pudo cargar los semestres
    public static final String ERROR_CARGANDO_SEMESTRES = "Ocurrio un error cargando los semestres.";
    //mensaje de error que indica que no se pudo cargar las materias
    public static final String ERROR_CARGANDO_MATERIAS = "Ocurrio un error cargando las materias.";
    //mensaje de error que indica que no se pudo cargar las notas
    public static final String ERROR_CARGANDO_NOTAS = "Ocurrio un error cargando las notas.";
    //mensaje que indica que no existe en la base de datos una cedula asociada al token ingresado
    public static final String NO_EXISTE_CEDULA = "No existe cedula asociado al token.";
    //mensaje que indica que hubo un error tratando de acceder a la aplicacion (comun cuando no se envia en parametro "token" a traves del header de la peticion)
    public static final String NO_TIENE_PERMISOS = "No tiene permisos para acceder a esta aplicacion.";
    // Mensaje que indica que no se han ingresado todos los parametros de la consulta
    public static final String ERROR_INGRESE_PARAMETROS = "Ingrese todos los parametros.";
    //mensaje que indica que existe el token en la base de datos y esta asociado a una cedula pero el registro se encuentra desabilitado
    public static final String ESTUDIANTE_NO_TIENE_PERMISOS = "El estudiante no tiene permisos para acceder al aplicativo.";
    //mensaje de error que indica que un estudiante no puede ver las actividades (notas) de una materia (caso comun no ha realizado la evaluacion del docente)
    public static final String ERROR_NO_PUEDE_VER_ACTIVIDADES = "Debe realizar la evaluación del docente.";
    //mensaje de error que indica que se intenta retornar un listado de actividades vacio
    public static final String ERROR_NO_HAY_ACTIVIDADES = "No hay actividades.";
    // Valor del atributo tipoHomologacion de los semestres matriculados
    public static final String TIPO_HOMOLOGACION_MATRICULADO = "MATRIC";
    // valor retornado por error cuando una actividad ó semestre esta sin evaluar
    public static final String SIN_EVALUAR_ERROR = "9.99";
    //valor correcto a retornar cuando una actividad ó semestre esta sin evaluar
    public static final String SIN_EVALUAR = "SIN";
    //mensaje de error que indica que se intenta retornar un listado de semestres vacio
    public static final String ERROR_SEMESTRES_VACIO = "Debe haber por lo menos un semestre";
    //mensaje de error que indica que se intenta retornar un listado de materias vacio
    public static final String ERROR_MATERIAS_VACIO = "No hay materias para mostrar.";
    //valor de retorno del servicio web "estudiantepuedevernotascursomares" que indica que un estudiante puede ver las notas.
    public static final String ESTUDIANTE_PUEDE_VER_NOTAS = "S";
    //valor de retorno del servicio web "estudiantepuedevernotascursomares" que indica que un estudiante NO puede ver las notas.
    public static final String ESTUDIANTE_NO_PUEDE_VER_NOTAS = "N";
    //Identifica que SGBD se esta usando 1 para MySQL, 2 para Oracle
    public static final int DATABASE_INSTANCE = 1;
}
