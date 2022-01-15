package estructuraslineales.registros;
/**
 *
 * @author Daniel Alejandro Morales Castillo
 */
public class NodoBusquedaBinaria {
    public int indice;
    public Object nombre;
    public NodoBusquedaBinaria NIzquierdo;
    public NodoBusquedaBinaria NDerecho;
    /**
     * Es el contructor de la clase.
     * @param indice Es el indice.
     * @param nombre Es la direccion del nodo.
     */
    public NodoBusquedaBinaria(int indice, Object nombre){
        this.indice = indice;
        this.nombre = nombre;
    }

    @Override
    public String toString() {

        return nombre + "tiene el indice" + indice;
       /* return "NodoBusquedaBinaria{" +
                "indice=" + indice +
                ", nombre='" + nombre + '\'' +
                ", NIzquierdo=" + NIzquierdo +
                ", NDerecho=" + NDerecho +
                '}';
        */
    }



}
