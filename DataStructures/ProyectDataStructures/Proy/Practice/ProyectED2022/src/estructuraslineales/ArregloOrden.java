/**
 * Clase ArregloOrden es la clase que crearemos para hacer arreglos ordenados
 * @author Daniel Alejandro Morales Castillo
 * @version 1.0
 */

package estructuraslineales;

import herramientas.comunes.TipoOrden;
import recursos.Comparador;

//Hereda de ArregloDatos e impleneta sus metodos
public class ArregloOrden extends ArregloDatos {
    //atributo de TipoOrden definido en la clase comparador
    protected TipoOrden orden;

    /**
     * Es el constructor de la clase.
     *
     * @param capacidad El tamaño que se desea del arreglo.
     * @param orden     El tipo de orden que el arreglo sigue.
     */

    public ArregloOrden(int capacidad, TipoOrden orden) {
        super(capacidad);
        this.orden = orden;
    }

    /**
     * @param elemento es el elemento que se va a  agregar ordenadamente
     * @return
     */

    @Override
    public int agregar(Object elemento) {
        if (!lleno()) {
            int posicion = (Integer) buscar(elemento);
            if (posicion < 0) {  //No esta puedo agregarlo
                posicion = posicion * (-1);
                posicion = posicion - 1;
                tope = tope + 1;

                for (int movs = tope; movs >= posicion + 1; movs--) {
                    lote[movs] = lote[movs - 1];
                }
                lote[posicion] = elemento;
                return posicion;
            } else {   //Si esta, no puedo insertarlo
                return -1;
            }
        } else {
            return -1;
        }
    }

    /**
     * Busca un valor.
     *
     * @param elemento El elemento a ser buscado.
     * @return la posición del valor o de donde deberia estar.
     */
    @Override
    public Object buscar(Object elemento) {
        if (orden.getOrden() == 1) {
            int pos = 0;
            while (pos <= tope && Comparador.comparar(elemento, lote[pos]) == 1) {
                pos++;
            }
            if (pos > tope || Comparador.comparar(lote[pos], elemento) == 1) {
                return (pos + 1) * (-1);
            } else {
                return (pos + 1);
            }
        } else {
            int pos = 0;
            while (pos <= tope && Comparador.comparar(lote[pos], elemento) == 1) {
                pos++;
            }
            if (pos > tope || Comparador.comparar(elemento, lote[pos]) == 1) {
                return (pos + 1) * (-1);
            } else {
                return (pos + 1);
            }
        }
    }

    /**
     * Cambia un valor.
     *
     */
    @Override
    public boolean cambiar(int indice, Object elemento) {
        if (indice >= 0 && indice <= tope) {
            lote[indice] = elemento;
            return true;
        }
        return false;
    }

    /**
     * Busca un valor.
     *
     * @param elemento El elemento a ser eliminado.
     * @return el elmento borrado
     */
    @Override
    public Object eliminar(Object elemento) {
        if (!vacia()) {
            int posicion = (Integer) buscar(elemento);
            if (posicion > 0) {
                posicion = posicion - 1;
                Object elementoBorrado = lote[posicion];
                tope = tope - 1;
                for (int movs = posicion; movs <= tope; movs++) {
                    lote[movs] = lote[movs + 1];
                }
                return elementoBorrado;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    /**
     * Invierte el orden de los elementos del arreglo.
     */
    @Override
    public void invertir() {
        if (vacia() == false) {
            int auxiliar = tope;
            Object valor1;
            Object valor2;
            for (int contador = 0; contador <= (tope) / 2; contador++) {
                valor1 = lote[contador];
                valor2 = lote[auxiliar];
                lote[contador] = valor2;
                lote[auxiliar] = valor1;
                auxiliar--;

            }
            if (orden.getOrden() == 1) {
                orden = orden.DESC;
            } else {
                orden = orden.ASC;
            }
        }
    }


    @Override
    public void rellenar(Object valor){
        agregar(valor);
    }


    public ListaDatos arregloDesordenado(){
        return arregloDesordenado();
    }








}
