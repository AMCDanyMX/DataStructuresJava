/**
 * @autor Daniel Alejandro Morales Castillo
 *
 */

package registros.diccionarios;
import entradasalida.SalidaTerminal;
import herramientas.comunes.TipoPalabra;

public class Palabra {
    public String palabra;
    public String definicion;
    public String abreviacion;
    public TipoPalabra tipoPalabra;

//constructor de la clase Palabra
    public Palabra(String palabra,String definicion, String abreviacion, TipoPalabra tipoPalabra){
        this.palabra = palabra;
        this.definicion = definicion;
        this.abreviacion = abreviacion;
        this.tipoPalabra = tipoPalabra;
    }

    /**
     * @autor Daniel Alejandro Morales Castillo
     * Metodo que devuelve la palabra
     *
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @autor Daniel Alejandro Morales Castillo
     * Metodo que devuelve la definicion de la plaabra
     *
     */

    public String getDefinicion() {
        return definicion;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public TipoPalabra getTipoPalabra() {
        return tipoPalabra;
    }


    /**
     * @autor Daniel Alejandro Morales Castillo
     * Metodo toString, para impimir objetos en tipo de Strings
     *
     */
    @Override
    public String toString() {
        return "Palabra{" +
                "palabra='" + palabra + '\'' +
                ", definicion='" + definicion + '\'' +
                ", abreviacion='" + abreviacion + '\'' +
                ", tipoPalabra=" + tipoPalabra +
                '}';
    }




}
