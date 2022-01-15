package estructuraslineales;
/**
 * Esta interface administra la funcionalidad de una lista de datos.
 * @author Clase de ED y
 * @author Daniel Alejandro Morales Castillo
 * @version 1.0
 */
public interface VectorDatos extends ListaDatos{

    public boolean lleno();
    /**
     * muestra el tamaño del arreglo
     * @return regresara el tamaño del arreglo
     */
    public int capacidad();


    /**
     * muestra la cantidad que tiene el arreglo
     * @return regresara la cantidad de elementos en el arreglo
     */
    public int cantidadElementos();

    //Metodos Abstractos Practica 2
    /**
     * regresa el Objeto de la posición indice
     * @param indice es la posicion del elemento que regresara
     * @return regresara el objeto degun su indice
     */
    public Object obtener(int indice);


    /**
     * regresa el Objeto de la posición indice
     * @param indice es ls posicion en el arreglo
     * @param elemento es el nuevo valor a colocar
     * @return regresa <b>true</b> si se pudo y <b>false</b> si no se pudo
     */
    public boolean cambiar(int indice, Object elemento);


    public boolean cambiarArregloDatos(ArregloDatos indicesBusqueda,
                                       ArregloDatos elementosNuevos);


    /**
     * elimina un elemento del arreglo en una posicion especifica
     * @return regresara el elemento eliminado
     */
    public Object eliminar(int indice);

}
