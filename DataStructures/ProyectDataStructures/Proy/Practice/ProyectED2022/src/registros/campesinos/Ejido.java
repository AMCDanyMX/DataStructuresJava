/**
 * @author Clase de ED y
 * @author Daniel Alejandro Morales Castillo
 */

package registros.campesinos;
import estructuraslineales.ArregloDatos;

//Clase Ejido
public class Ejido{
    protected String nombre;  //atributos
    protected ArregloDatos campesinos;
//metodo constructor
    public Ejido(String nombre, int numCampesinos){
        this.nombre=nombre;
        campesinos=new ArregloDatos(numCampesinos);
    }

    /**
     * @author Clase de ED y
     * @author Daniel Alejandro Morales Castillo
     * @return boolean - regresa un booleano que es -1 si hay error
     */
    //codigo de guia de profesor Aldonso para crear un metodo que agrega campesinos
    public boolean agregarCampesino(Campesino campesino){
        int valorRetorno=campesinos.agregar(campesino);
        if(valorRetorno==-1){ //hubo algún error
            return false;
        }else{
            return true;
        }
    }
    /**
     * @author Daniel Alejandro Morales Castillo
     *Metodo de impresion de campesinos
     */
    public void imprimirCampesinos(){
        campesinos.imprimirOrdenInverso();
    }
    /**
     * @author Daniel Alejandro Morales Castillo
     *Metodo que saca el promedio, devuelve elpromedio
     * @param id es el id del campesino
     */
    public Double obtenerPromedio(String id){
        //Necesitamos saber cual alumno
        Integer posicion=(Integer)campesinos.buscar(id);

        if(posicion==null){ //no existe ese campesino
            return null;
        }else{ //si esta el campesino
            Campesino campesinoElegido= (Campesino)campesinos.obtener(posicion);
            return campesinoElegido.sacarPromedioToneladas();
        }
    }

}
