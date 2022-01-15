/**
 *
 * @author Daniel Alejandro Morales Castillo
 */
package registros.pintores;

public enum ActividadPintor{


    PINTAR("pintar",1),
    EXPONER("exponer",2),
    FIRMARAUTOGRAFOS("firmar",3),
    VIAJAR("viajar",4);


    private String nombre;
    private int identificador;
    /**
     * Metodo constructor de la Actividad de pintor
     * @param nombre es el nombre del tipo de actividad, pintar, exponer, firmar, viajar
     * @param identificador es el id o num con que se identifica la actividad del pintor arealizar
     *
     */
    ActividadPintor(String nombre, int identificador){
        this.nombre=nombre;
        this.identificador=identificador;
    }

    /**
     * @return Regresa el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return Regresa el identificador.
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Metodo to String
     */

    @Override
    public String toString(){
        return nombre;
    }
}
