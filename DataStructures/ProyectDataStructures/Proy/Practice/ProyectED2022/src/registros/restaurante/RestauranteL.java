package registros.restaurante;

import entradasalida.SalidaTerminal;
import estructuraslineales.ListaEncadenada;

/**
 * @author Daniel Alejandro Morales Castillo
 * Clase de Restaurante
 */
public class RestauranteL {
    protected String nombre;
    protected ListaEncadenada platillos;

    /**
     * Metodo constructor del Restaurante que asigna un nombre y una lista la cual serán los platillos
     */
    public RestauranteL(String nombre){
        this.nombre=nombre;
        platillos=new ListaEncadenada();
    }
    /**
     * Metodo que agrega un platillo al restaurante
     * @return true o false si se agregó
     */

    public boolean agregarPlatillo(PlatilloL platillo){
        int valorRetorno=platillos.agregar(platillo);
        if(valorRetorno==-1){ //hubo algún error
            return false;
        }else{
            return true;
        }
    }
    /**
     * Metodo que elimina un platillo del restaurante
     */

    public void eliminarPlatillo(PlatilloL platillo){
        platillos.eliminar(platillo);
    }

    /**
     * Metodo que imprime los platillos en forma de lista
     */

    public void imprimirPlatillos(){
        platillos.imprimir();
    }


    /**
     * Metodo que imprime los datos de lo splatillos
     */

    public void imprimirDatosPlatillos(){
        //iterador de lista de alumnos
        platillos.inicializarIterador();

        while(platillos.hayElementos()==true){
            PlatilloL platilloTemporal=(PlatilloL) platillos.obtenerElemento();
            SalidaTerminal.consola(platilloTemporal.getNombreComida() +", "+ platilloTemporal.getIngredientes()+ ", "+
                    platilloTemporal.getProcedimientoPreparacion() + ", ");
            platilloTemporal.getChef();
            SalidaTerminal.consola("\n");
        }
    }

    public String getNombre() {
        return nombre;
    }
}