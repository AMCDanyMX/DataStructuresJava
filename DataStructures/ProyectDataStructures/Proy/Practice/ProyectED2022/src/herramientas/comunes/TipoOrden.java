package herramientas.comunes;

/**
 *  Esta clase enumerada contiene los ordenes que se utilizan en otras clases.
 * @author Daniel Alejandro Morales Castillo
 */
public enum TipoOrden {


    ASC("ASCENDENTE",1), DESC("DESCENDENTE",0);

    private String nombre;
    private int orden;

    private TipoOrden(String nombre, int orden){
        this.nombre=nombre;
        this.orden=orden;
    }

    /**
     * Obtiene el nombre del enumerado.
     * @return Regresa el nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el orden del enumerado.
     * @return Regresa el tipo de orden.
     */
    public int getOrden() {
        return orden;
    }

}
