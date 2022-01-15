
package herramientas.comunes;

/**
 * Clase que representa un objeto con un nombre y una prioridad.
 * @author Daniel Alejandro Morales Castillo
 */
public class Monticulos {

    //nombre del proceso
    //prioridad

    /**
     *
     * @param nombre es el proceso a llevar a cabo en forma de monticulo
     * @param prioridad tipo de prioridad del proceso
     */
    private String nombre;
    private int prioridad;
    public Monticulos(String nombre, int prioridad){
        this.nombre=nombre;
        this.prioridad=prioridad;
    }

    /**
     * @return Regresa el nombre del objeto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return la prioridadd
     */
    public int getPrioridad() {
        return prioridad;
    }
    @Override
    public String toString(){
        return nombre+" ["+prioridad+"] ";
    }
}
