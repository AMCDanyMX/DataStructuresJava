package registros.restaurante;

import entradasalida.SalidaTerminal;
import estructuraslineales.ListaEncadenada;
/**
 *
 * @author Daniel Alejandro Morales Castillo
 * Clase de platillo de restaurante
 */

public class PlatilloL {
    protected String nombreComida;
    protected ListaEncadenada ingredientes;
    protected String procedimientoPreparacion;
    protected String chef;

    /**
     * Metodo constructor del PlatilloL
     *
     * @param nombreComida             Es un string que indica el nombre del platillo
     * @param ingredientes             Es una Lista Encadenada que contiene los ingredientes del platillo
     * @param procedimientoPreparacion Es el tipo de procedimiento que se lleva a cabo para hacer el platillo
     * @param chef                     Es un String que indica el nombre del chef
     */
    public PlatilloL(String nombreComida, ListaEncadenada ingredientes, String procedimientoPreparacion, String chef) {
        this.nombreComida = nombreComida;
        this.ingredientes = ingredientes;
        this.procedimientoPreparacion = procedimientoPreparacion;
        this.chef = chef;
    }

    /**
     * Metodo Getter que nos regresa el nombre de la comida
     * @return el nombre de la comida
     */
    public String getNombreComida() {
        return nombreComida;
    }

    /**
     * Metodo  Setter que asigna un nombre a la comida
     * @return el nombre de la comida
     */
    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    /**
     * Metodo Getter que nos regresa los ingredientes en forma de lista de la comida
     *
     * @return ingredientes que contiene el platillo en forma de lista
     */
    public ListaEncadenada getIngredientes() {
        return ingredientes;
    }


    /**
     * Metodo Setter que puede asignar ingredientes
     * @return el nombre de la comida
     */
    public void setIngredientes(ListaEncadenada ingredientes) {
        this.ingredientes = ingredientes;
    }


    /**
     * Metodo Getter que nos regresa el proceso de preparacion
     * @return el proceso de preparacion del platillo
     */
    public String getProcedimientoPreparacion() {
        return procedimientoPreparacion;
    }

    /**
     * Metodo Setter que puede asignar para el proceso de preparacion
     */
    public void setProcedimientoPreparacion(String procedimientoPreparacion) {
        this.procedimientoPreparacion = procedimientoPreparacion;
    }


    /**
     * Metodo Getter que nos regresa el nombre del chef
     * @return el nombre del Chefe encargado de cocinar el platillo
     */

    public String getChef() {
        return chef;
    }


    /**
     * Metodo Setter que asigna un nomnre de chef
     */
    public void setChef(String chef) {
        this.chef = chef;
    }


    /**
     * Metodo que nos imprime los ingredientes del platillo
     */
    public void imprimirIngredientes() {
        int contadorC = 0;
        SalidaTerminal.consola("Listado de ingredientes: ");
        ingredientes.inicializarIterador();
        while (ingredientes.hayElementos() == true) {
            Object cantelem = ingredientes.obtenerElemento();
            SalidaTerminal.consola("Ingrediente (" + (++contadorC) + ") " + cantelem + ", ");
            //ingrediente (1) "Jamon", ingrediente (2) "Chorizo"
        }
    }


    /**
     * Metodo toString de la comida
     */
    @Override
    public String toString() {
        return nombreComida;
    }
}
