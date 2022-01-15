package estructurasnolineales;
import estructuraslineales.registros.NodoBusquedaBinaria;
/**
 *
 * @author Daniel Alejandro Morales Castillo
 */
public class ArbolBBIndice extends ArbolBinario {
    NodoBusquedaBinaria root;
    /**
     * Es el contructor de la clase.
     * @param indice Es el indice.
     * @param nombre Es la direccion del nodo que se va a agregar
     */
    public void agregarnodo(int indice, Object nombre) {
        NodoBusquedaBinaria nuevonodo = new NodoBusquedaBinaria(indice, nombre);
        if (root == null) {
            root = nuevonodo;
        } else {
            NodoBusquedaBinaria nodoActual = root;
            NodoBusquedaBinaria padre;
            while (true) {
                padre = nodoActual;
                if (indice < nodoActual.indice) {
                    nodoActual = nodoActual.NIzquierdo;
                    if (nodoActual == null) {
                        padre.NIzquierdo = nuevonodo;
                        return;
                    }
                } else {
                    nodoActual = nodoActual.NDerecho;
                    if (nodoActual == null) {
                        padre.NDerecho = nuevonodo;
                        return;
                    }
                }
            }
        }


    }












}





