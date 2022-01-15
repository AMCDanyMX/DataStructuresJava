/**
 * Esta interface administra la funcionalidad de una lista de datos.
 * @author Clase de ED. Y
 * @author Daniel Alejandro Morales Castillo
 * @version 1.0
 */

package estructuraslineales;

public interface ListaDatos {

    /**
     * Determina si una lista de datos esta vacia.
     * @return Regresa <b>true</b> si la lista esta vacia, <b>false</b> en caso contrario.
     */
    public boolean vacia();

    /**
     * Inserta al final de la lista un elemento proporcionado.
     * @param elemento Es el dato que se desea agregar a la lista.
     * @return Regresa la posicion de memoria (indice) en donde se agrega el elemento, o -1 en caso contrario.
     */

    public int agregar(Object elemento);

    /**
     * Inserta al final de la lista un elemento proporcionado.
     * @param elemento Es el dato que se desea agregar a la lista.
     * @return Regresa la posicion de memoria (indice) en donde se agrega el elemento, o -1 en caso contrario.
     */

    public boolean agregarOrdenado(Object elemento);


    /**
     * Imprime los elementos de un arreglo
     * @return imprime el arreglo de forma natural.
     */
    public void imprimir();


    /**
     * Imprime los elementos de un arreglod e manera inversa
     * @return imprime el arreglo de forma inversa.
     */
    public void imprimirOrdenInverso();


    /**
     * Hace una busqueda de un elemento del arreglo
     * @return regresa el elemento que se busca.
     */
    public Object buscar(Object elemento);


    /**
     * Elimina un elemento de un arreglo
     * @return regresa el elemento eliminado
     */
    public Object eliminar(Object elemento);

    //Metodos abstractos de la prácctica 2
    /**
     * indica si la lista actual es igual a la
     * listaDatos2.
     * @param listaDatos2 es otro arreglo con el que se comparara
     * @return regresa el elemento eliminado
     */
    public boolean esIgual(Object listaDatos2);

    /**
     * modifica el elemento viejo por el elemento nuevo
     * @param elementoViejo registro en el arreglo que se va a quitar
     * @param elementoNuevo registro en el arreglo que se pondra en lugar del viejo
     * @param numVeces numero de veces que hubo occurrencias del elemento encontrado
     * @return regresa <b>true</b> si se hizo alguna modificacion
     */
    public boolean cambiar(Object elementoViejo, Object elementoNuevo, int numVeces);

    /**
     * busca dentro de un arreglo los elementos indicados por elemento
     * @param elemento elemento que se va a buscar
     * @return regresara las posiciones de las occurencias
     */
    public ArregloDatos buscarValores(Object elemento);

    /**
     * regresa el objeto de la última posición de un arreglo
     * @return regresa el objeto de la última posición del ArregloDatos.
     */
    public Object eliminar();


    /**
     * vacía el contenido de un arreglo
     *
     */
    public void vaciar();

    /**
     * agrega al final de la lista actual el contenido de la listaDatos2
     * @param listaDatos2 es otro arreglo
     * @return regresa los arreglos juntos
     *
     * */
    public boolean agregarLista(ArregloDatos listaDatos2);

    /**
     * invierte el arreglo, le da la vuelta
     * @return regresa el arreglo invertido
     *
     */
    public void invertir();

    /**
     * contar cuántos elementos hay en el arreglo
     * @return regresa el numero de elementos iguales
     *
     */
    public int contar(Object elemento);



    //public boolean eliminarLista(Object listaDatos2);


    /**
     * rellena todos los elementos indicados
     * @param elemento es el elemento que se va a introducir
     * @param cantidad numero de veces que se metera
     * @return regresa el arreglo rellenado
     */
    public void rellenar(Object elemento, int cantidad);

    /**
     * regresa una copia de la lista actual.
     * @return el arreglo dos veces, clonado
     */
    public Object clonar();


   // public Object subLista(int indiceInicial, int indiceFinal);
    //public Object redimensionar(int maximo);

    //Metodos agregados en práctica 4
    /**
     * modifica el elemento viejo por el elemento nuevo
     * @param elementoViejo registro en el arreglo que se va a quitar
     * @param elementoNuevo registro en el arreglo que se pondra en lugar del viejo
     * @param numVeces numero de veces siempre será uno para el arreglo ordenado
     * @return regresa <b>true</b> si se hizo alguna modificacion
     */
    public boolean cambiarOrdenado(Object elementoViejo, Object elementoNuevo, int numVeces);


    public void rellenar(Object elemento);


    /**
     * Establece un valor en la posición que le porporcionamos.
     * @param indice Es la posición donde queremos poner el valor.
     * @param elemento Es objeto que queremos establecer.
     * @return Regresa verdadero en caso de que si se inserte, en el caso
     * contrario regresa false.
     */
    public boolean insertar(int indice, Object elemento);
    /**
     * Agrega la lista 2 al arreglo 1
     * @param listaDatos2 Es el arreglo del cual se agregaran los elementos.
     */

    public boolean agregarLista(ArregloOrden listaDatos2);

    /**
     * Copia el contenido del arreglo 2 al arreglo 1.
     * @param listaDatos2 Es el arreglo del cual se copiaran los elementos.
     * @return Regresa true si se copio correctamente, y false en caso
     * contrario.
     */
    public boolean copiarLista(ArregloOrden listaDatos2);


}
