/** @autor Daniel Alejandro Morales Castillo
 *@autor Y Profesor Aldonso en clase de ED
 * Clase Arreglo
 */

package registros.campesinos;

import estructuraslineales.ArregloDatos;

/** @autor Daniel Alejandro Morales Castillo
 */

public class Campesino {
    protected String id;  //atributos id, nombre, tipoSiembra, aniosiembra, toneladas
    protected String nombre;
    protected String tipoSiembra;
    protected String anioSiembra;
    protected ArregloDatos toneladas;

    /** Metodo constructor
     */

    public Campesino(String id, String nombre, String tipoSiembra, String anioSiembra, ArregloDatos toneladas){
        this.id = id;
        this.nombre=nombre;
        this.tipoSiembra=tipoSiembra;
        this.anioSiembra = anioSiembra;
        this.toneladas=toneladas;
    }

    /**
     * saca el promedio de las toneladas
     * @return regresa un double que es el promedio
     */
    public Double sacarPromedioToneladas(){
        double sumaToneladas=0.0;
        double promedioToneladas=0.0;

        if (!toneladas.vacia()) {  //si hay toneladas agregadas
            for (int posicion = 0; posicion<toneladas.cantidadElementos();posicion++) {
                sumaToneladas= sumaToneladas + (double)toneladas.obtener(posicion);
            }
            promedioToneladas=sumaToneladas / toneladas.cantidadElementos();
            return promedioToneladas;
        }else{ //no hay toneladas agregadas
            return null;
        }
    }


    //Metodo toString
    @Override
    public String toString() {
        return "Campesino: "
                + nombre;
    }
}
