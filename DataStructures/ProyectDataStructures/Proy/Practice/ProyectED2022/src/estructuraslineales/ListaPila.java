package estructuraslineales;

/**
 * Clase que representa un TDA Listapila
 * @author Daniel Alejandro Morales Castillo
 */
public class ListaPila {
    private ListaEncadenada datosPila;
    /**
     * Constructor de la clase PilaLista.
     */
    public ListaPila(){
        datosPila=new ListaEncadenada();
    }
    /**
     * Comprueba si la pila esta vacia.
     * @return Regresa true en caso de que este vacia, false en caso contrario.
     */
    public boolean vacia(){
        return datosPila.vacia();
    }
    /**
     * Agrega un objeto a la pila.
     * @param valor Valor a ser agregado.
     * @return Regresa true en caso de que se agrege correctamente, false en caso contrario.
     */
    public Object agregar(Object valor){
        return datosPila.agregar(valor);
    }
    /**
     * Saca el ultimo objeto de la pila.
     * @return Regresa el elemento que fue quitado de la pila.
     */
    public Object quitar(){
        return datosPila.eliminar();
    }
    /**
     * Imprime la pila.
     */
    public void imprimir(){
        datosPila.imprimir();
    }

}
