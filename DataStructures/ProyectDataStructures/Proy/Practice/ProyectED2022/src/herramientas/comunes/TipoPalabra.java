/**
 * @autor Daniel Alejandro Morales Castillo
 * Clase enumerada de TipoPalabra
 *
 */
package herramientas.comunes;

/**
 *  Esta clase enumerada contiene los ordenes que se utilizan en otras clases.
 * @author Daniel Alejandro Morales Castillo
 */
public enum TipoPalabra {


    VERB("VERBO",1), ADJ("ADJETIVO",2), SUST("SUSTANTIVO",3);

    private String palabra;
    private int tipo;

    private TipoPalabra(String palabra, int tipo){
        this.palabra=palabra;
        this.tipo=tipo;
    }

    public String getPalabra() {
        return palabra;
    }

    public int getTipo() {
        return tipo;
    }
}
