
package estructuraslineales.registros;

/**
 * Clase que representa un nodo con clave (Nodo hash)
 * @author Daniel Alejandro Morales Castillo
 */
public class NodoHash {
    private Object clave;
    private Object valor;
    private NodoHash dirMemDer;
    /**
     * Constructor de la clase NodoHash.
     * @param clave Valor que representa el identificador del nodo.
     * @param valor Valor que toma el atributo info.
     */
    public NodoHash(Object clave, Object valor){
        this.clave=clave;
        this.valor=valor;
        dirMemDer=null;
    }

    /**
     * Obtiene la clave del nodo.
     * @return Regresa el valor de la clave.
     */
    public Object getClave() {
        return clave;
    }

    /**
     * Establece una clave al nodo.
     * @param clave Clave a establecer.
     */
    public void setClave(Object clave) {
        this.clave = clave;
    }

    /**
     * Obtiene el valor de la información.
     * @return Regresa la info.
     */
    public Object getDato() {
        return valor;
    }

    /**
     * Establece un nuevo valor a la info.
     * @param info Valor nuevo a establecer a info.
     */
    public void setDato(Object info) {
        this.valor = info;
    }

    /**
     * Regresa el nodo que representa la liga derecha.
     * @return Regresa la liga derecha.
     */
    public NodoHash getDirMemDer() {
        return dirMemDer;
    }

    /**
     * Establece un nuevo nodo a la liga derecha.
     * @param ligaDer Establece una nueva liga derecha.
     */
    public void setDirMemDer(NodoHash ligaDer) {
        this.dirMemDer = ligaDer;
    }
    @Override
    public String toString(){
        return valor.toString();
    }
}
