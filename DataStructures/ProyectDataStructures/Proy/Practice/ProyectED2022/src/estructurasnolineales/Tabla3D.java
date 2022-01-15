/**
 *
 * @author Daniel Alejandro Morales Castillo
 * y
 * @author Profesor Aldonso Becerra Sanchez - Clase ED
 */

package estructurasnolineales;

import entradasalida.SalidaTerminal;
/**
 * Clase de TABLA3D
 */
public class Tabla3D {
    protected int filas;
    protected int columnas;
    protected int profundidad;
    protected Object lote[][][];

    /**
     * @param filas parametro que indica el estado iniccial de nuestra tabla3D, es el numero de filas
     * @param columnas parametro que indica el estado inicial de nuiestra tabla 3D, es el numero de columnas
     * @param profundidad parametro que indica el estado inicial de nuiestra tabla 3D, es el numero de la profundidad
     */
    public Tabla3D(int filas,int columnas,int profundidad){
        this.filas=filas;
        this.columnas=columnas;
        this.profundidad=profundidad;
        lote=new Object[filas][columnas][profundidad];
    }
    /**
     * @param filas parametro que indica el estado iniccial de nuestra tabla3D, es el numero de filas
     * @param columnas parametro que indica el estado inicial de nuiestra tabla 3D, es el numero de columnas
     * @param profundidad parametro que indica el estado inicial de nuiestra tabla 3D, es el numero de la profundidad
     * @param contenido es el valor agregar para darle un valor inicial a la matriz 3D
     */
    public Tabla3D(int filas,int columnas,int profundidad, Object contenido){
        this.filas=filas;
        this.columnas=columnas;
        this.profundidad=profundidad;
        lote=new Object[filas][columnas][profundidad];
        rellenar(contenido);
    }
    /**
     * @param fila parametro que indica el estado iniccial de nuestra tabla3D, es el numero de filas
     * @param columna parametro que indica el estado inicial de nuiestra tabla 3D, es el numero de columnas
     * @param prof parametro que indica el estado inicial de nuiestra tabla 3D, es el numero de la profundidad
     * Este metodo nos regresa una celda pasada como argumento segun los parametros
     */
    public Object obtenerCelda(int fila, int columna, int prof){
        if(enLimites(fila,filas)==true && enLimites(columna,columnas)==true &&
                enLimites(prof,profundidad)==true){
            return lote[fila][columna][prof];
        }else{
            return null;
        }
    }
    /**
     * @param fila parametro que indica el estado iniccial de nuestra tabla3D, es el numero de filas
     * @param columna parametro que indica el estado inicial de nuiestra tabla 3D, es el numero de columnas
     * @param prof parametro que indica el estado inicial de nuiestra tabla 3D, es el numero de la profundidad
     * @param contenido es el valor que se asignara a una celda en espeficico
     * Este metodo nos regresa una celda pasada como argumento segun los parametros
     */
    public boolean asignarCelda(int fila, int columna, int prof, Object contenido){
        if(enLimites(fila,filas)==true && enLimites(columna,columnas)==true &&
                enLimites(prof,profundidad)==true){
            lote[fila][columna][prof]=contenido;
            return true;
        }else{
            return false;
        }
    }
    /**
     * @param indice indice de la tabla
     * @param tamDimension dimension de la tabla
     * Este metodo nos dice si la matriz esta en el limite
     */
    private boolean enLimites(int indice,int tamDimension){
        if(indice>=0 && indice<tamDimension){
            return true;
        }else{
            return false;
        }
    }

    /**
     *
     * @param contenido valor que se agregara en la matriz
     * Este metodo nos llena la matriz con un valor pasado como parametro
     */

    public void rellenar(Object contenido){
        for(int fila=0;fila<filas;fila++){ //recorrer de una por una las filas
            //asumir que es un solo renglon (fila)
            for(int columna=0;columna<columnas;columna++){
                //asumir que hay una sola columna y haré un recorrido de las hileras
                for(int prof=0;prof<profundidad;prof++){
                    lote[fila][columna][prof]=contenido;
                }
            }
        }
    }
    /**
     *Metodo que imprime por columnas
     *
     */

    public void imprimirxColumnas(){
        //Rebanar por cada columa
        for(int columna=0;columna<columnas;columna++){
            //ahora, tenemos una tabla 2D, se imprime primero su renglón
            for(int fila=0;fila<filas;fila++){
                //ahora sigue las columnas de la tabla 2d, es decir la profundidad original
                for(int prof=0;prof<profundidad;prof++){
                    SalidaTerminal.consola(lote[fila][columna][prof]+ " ");
                }
                //cuando acaba todas las columnas de la tabla 2d (profundidad)
                SalidaTerminal.consola("\n");
            }
            //cuando acabe todas las filas de la tabla 2d
            SalidaTerminal.consola("\n");
        }
    }

    /**
     * metodo que regresa las filas
     */

    public int getFilas() {
        return filas;
    }

    /**
     * metodo que regresa las columnas
     */
    public int getColumnas() {
        return columnas;
    }
    /**
     * metodo que regresa la profundidad
     */
    public int getProfundidad() {
        return profundidad;
    }


    /**
     * metodo que imprime la matriz, filas, columnas y profundidad
     */
    //Imprimir matriz 3D
    public void imprimir(){
        //Sacar las rebanadas de jamón.
        for(int prof=0;prof<profundidad;prof++){
            for(int fil=0;fil<filas;fil++){
                for(int col=0;col<columnas;col++){
                    SalidaTerminal.consola(lote[fil][col][prof]+"");
                }
                SalidaTerminal.consola("\n");
            }
            SalidaTerminal.consola("\n");
        }
    }



}