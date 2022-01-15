/**
 *
 * @author Daniel Alejandro Morales Castillo
 *
 */

package herramientas.comunes;

/**
 * Tipos de logaritmo enum class
 *
 */
public enum TipoLogaritmo{
    NATURAL("NATURAL",1),
    BASE10("BASE10",2),
    BASE2("BASE2",3);


    private String nombre;
    private int tipo;
    /**
     * Constructor.
     * @param nombre Nombre del logaritmo.
     * @param tipo Tipo de logaritmo.
     */
    private TipoLogaritmo(String nombre, int tipo){
        this.nombre=nombre;
        this.tipo=tipo;
    }
    /**
     * Obtiene el nombre del logaritmo.
     * @return Regresa el nombre.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Obtiene el tipo de logaritmo.
     * @return Regresa el tipo.
     */
    public int getTipo() {
        return tipo;
    }
}
