
package herramientas.comunes;

/**
 *  Esta clase enumerada contiene los ordenes que se utilizan en otras clases.
 * @author Daniel Alejandro Morales Castillo
 */
public enum TipoColumna {


    IZQ("IZQUIERDA",1), DER("DERECHA",0);

    private String columna;
    private int tipocol;

    private TipoColumna(String columna, int tipocol){
        this.columna=columna;
        this.tipocol=tipocol;
    }

    /**
     * Obtiene el nombre de columna.
     * @return Regresa el nombre.
     */
    public String getColumna() {
        return columna;
    }

    /**
     * Obtiene el orden del tipo
     * @return Regresa el tipo de columna.
     */
    public int getTipocol() {
        return tipocol;
    }
}
