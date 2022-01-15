/**
 * @author Profesor Aldonso Becerra Sánchez
 * @author Daniel Alejandro Morales Castillo
 */

package estructuraslineales;

public class ArregloPila implements LoteDatos{
    protected ArregloDatos pila;
    /**
     *
     * @param capacidad es el tamaño de nuestra pila pasada por parametro
     */

    public ArregloPila(int capacidad){
        pila=new ArregloDatos(capacidad);
    }
    /**
     *
     * Comprueba si la pila esta vacia
     * @return regresa <b>true</b> o <b>false</b> si la pila esta vacia
     */
    @Override
    public boolean vacio(){
        return pila.vacia();
    }
    /**
     *
     * Comprueba si la pila esta llena
     * @return la pila si está llena nos dice <b>ture</b>
     */

    @Override
    public boolean lleno(){
        return pila.lleno();
    }
    /**
     *
     * @param elemento es el valor que se agregará a la pila
     * metodo que agrega un elemento a la pila
     * @return regresa <b>true</b>> si se pudo agregar el elemento de lo contrario regresa <b>false</b>
     */

    @Override
    public boolean poner(Object elemento){
        int valorRetorno=pila.agregar(elemento);
        if(valorRetorno>=0) {
            return true;
        } else{
            return false;
        }
    }
    /**
     *
     * Metodo que imprime la pila
     * @return regresa el objeto eliminado
     */
    @Override
    public Object quitar(){
        return pila.eliminar();
    }
    /**
     * @return la pila completa impresa
     * metodo que ve el tope de la pila
     */

    @Override
    public void imprimir(){
        pila.imprimirOrdenInverso();
    }
    /**
     * @return el tope de la fila
     * metodo que ve el tope de la pila
     */

    @Override
    public Object verTope(){
        return pila.verTope();
    }








}