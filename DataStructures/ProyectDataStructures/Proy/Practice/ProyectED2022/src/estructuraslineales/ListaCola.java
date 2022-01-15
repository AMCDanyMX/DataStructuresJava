
package estructuraslineales;

import estructuraslineales.registros.Nodo;
/**
 *
 * @author Daniel Alejandro Morales Castillo
 */
public class ListaCola {
    protected ListaEncadenada datosCola;
    /**
     * Constructor del TDA Cola.
     */
    public ListaCola(){
        datosCola = new ListaEncadenada();

    }
    /**
     * Verifica si la Cola esta vacia.
     * @return Regresa true si esta vacia, false en caso contrario.
     */
    public boolean vacia(){
        if(datosCola.frente == null){
            return true;
        } else{
            return false;
        }
    }
    /**
     * Verifica si la Cola esta llena.
     * @return Regresa true si esta vacia, false en caso contrario.
     */
    public boolean llena(){
        Nodo nodoPrueba = new Nodo("Prueba");
        if(nodoPrueba!=null){
            return true;
        } else{
            return false;
        }
    }
    /**
     * Agrega un valor en la Cola.
     * @param valor Valor a agregar.
     * @return Regresa <b>true</b> en caso de que se realice de manera correcta,
     * <b>false</b> en caso contrario.
     */
    public int agregar(Object valor){
        int resultado = datosCola.agregar(valor);
        return resultado;
    }
    /**
     * Elimina un dato de una Cola.
     * @return Regresa el dato que fue eliminado., si no existe un elemento a
     * eliminar entonces regresa null.
     */
    public Object eliminar(){
        Object eliminado = datosCola.eliminarInicio();
        return eliminado;
    }
    /**
     * Imprime los datos de la cola.
     */
    public void imprimir(){
        datosCola.imprimir();
    }
}
