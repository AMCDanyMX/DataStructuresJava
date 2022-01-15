/**
 * TDA que reptresenta un arreglo mutlidimensional
 * @author Daniel Alejandro Morales Castillo
 */

package estructuraslineales;

import entradasalida.SalidaTerminal;
import herramientas.comunes.TipoColumna;


public class Tabla2D {

    protected Object lote[][];
    protected int filas;
    protected int columnas;

    /**
     * Constructor del TDA Tabla2D.
     * @param filas Número de renglones que tendrá.
     * @param columnas Número de columnas que tendrá.
     */

    public Tabla2D(int filas, int columnas) {
        this.filas=filas;
        this.columnas=columnas;
        lote=new Object[filas][columnas];
    }

    /**
     * 2do Constructor del TDA Tabla2D.
     * @param filas Número de renglones que tendrá.
     * @param columnas Número de columnas que tendrá.
     */

    public Tabla2D(int filas,int columnas, Object contenido){
        this.filas=filas;
        this.columnas=columnas;
        lote=new Object[filas][columnas];
        rellenar(contenido);
    }
    /**
     * Leer un dato de una celda
     * @param fila en la fila del elemento
     * @param columna columna del elemento a obtener
     */
    public Object obtenerCelda(int fila, int columna){
        if(validarDim(fila,filas)==true && validarDim(columna,columnas)){
            return lote[fila][columna];
        }else{
            return null;
        }
    }
    /**
     * Este método hace que la matriz se inicie con un valor en cada posición.
     * @param valor El valor con el que se va a inicializar.
     */
    public void inicializar(Object valor){
        for(int fila=0;fila<filas;fila++){
            for(int col=0;col<columnas;col++){
                lote[fila][col]=valor;
            }
        }
    }


    /**
     * Valida que el valor este en un rango dado.
     * @param indice Valor a validar.
     * @param tamDimension Tamaño del arreglo.
     * @return Regresa true en caso de que sea correcto, false en caso contrario.
     */
    private boolean validarDim(int indice,int tamDimension){
        if(indice>=0 && indice<tamDimension){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Establece un elemento en una posicion indicada.
     * @param fila Posicion de fila
     * @param columna Posicion de la columna
     * @param contenido contenido a insertar.
     * @return Regresa true en caso de que se inserte de manera correcta.
     */
    public boolean asignarCelda(int fila,int columna,Object contenido){
        if((validarDim(fila,filas) && validarDim(columna,columnas))){
            lote[fila][columna]=contenido;
            return true;
        } else{
            return false;
        }
    }

    /**
     * Obtiene el número de renglones que tiene la matriz.
     * @return Regresa los renglones.
     */
    public int getFilas(){
        return filas;
    }
    /**
     * Obtiene el número de columnas que tiene la matriz.
     * @return Regresa las columnas.
     */
    public int getColumnas(){
        return columnas;
    }
    /**

    /**
     * Obtiene el valor de un elemento en nuestra tabla2D.
     * @param fila Número de fila.
     * @param col Número de columna.
     * @return Regresa el valor en caso de que la posicion sea valida, regresa
     * null en caso contrario.
     */
    public Object obtenerElementoCelda(int fila, int col){
        if((validarDim(fila,filas) && validarDim(col,columnas))){
            return lote[fila][col];
        } else{
            return null;
        }
    }

    /**
     * Imprimir tabla2D
     */
    public void imprimir(){
        //Rebanar por cada fila
        for(int fila=0;fila<filas;fila++){
            //ahora, tenemos una tabla 2D, se imprime primero su columna
            for(int columna=0;columna<columnas;columna++){
                SalidaTerminal.consola(lote[fila][columna]+ " ");
            }
            //cuando acabe todas las columnas de la tabla 2d
            SalidaTerminal.consola("\n");
        }
    }

    /**
     * Imprimir tabla2D por renglon
     */

    public void imprimirR(){
        //Rebanar por cada columa
        for(int fila=0;fila<filas;fila++){
            //ahora, tenemos una tabla 2D, se imprime primero su renglón
            for(int columna=0;columna<columnas;columna++){
                //ahora sigue las columnas de la tabla 2d, es decir la profundidad original
                SalidaTerminal.consola(lote[fila][columna]+ " ");
                //cuando acaba todas las columnas de la tabla 2d (profundidad)
                SalidaTerminal.consola("\n");
            }
            //cuando acabe todas las filas de la tabla 2d
            SalidaTerminal.consola("\n");
        }
    }

    /**
     * Imprimir tabla2D por columna
     */
    public void imprimirC(){
        //Rebanar por cada columa
        for(int columna=0;columna<columnas;columna++){
            //ahora, tenemos una tabla 2D, se imprime primero su renglón
            for(int fila=0;fila<filas;fila++){
                //ahora sigue las columnas de la tabla 2d, es decir la profundidad original
                SalidaTerminal.consola(lote[fila][columna]+ " ");
            }
            //cuando acaba todas las columnas de la tabla 2d (profundidad)
            SalidaTerminal.consola("\n");
        }
        //cuando acabe todas las filas de la tabla 2d
        SalidaTerminal.consola("\n");

    }
    /**
     * Aplica la transpuesta a nuestra tabl2d.
     */
    public void aplicarTanspuesta(){
        Object aux;
        for(int fila=0;fila<filas;fila++){
            for(int columna=0;columna<fila;columna++){
                aux=lote[fila][columna];
                lote[fila][columna]=lote[columna][fila];
                lote[columna][fila]=aux;
            }
        }
    }


    /**
     * Este método hace que la tabla se inicie con un valor en cada posición.
     * @param contenido El valor con el que se va a inicializar.
     */
    public void rellenar(Object contenido){
        for(int fila=0;fila<filas;fila++){
            for(int col=0;col<columnas;col++){
                lote[fila][col]=contenido;
            }
        }
    }



    /**
     * Copia la tabla2D actual.
     * @return Regresa la copia.
     */
    public Tabla2D clonar(){
        Tabla2D copia = new Tabla2D(filas,columnas);
        for(int fila=0;fila<filas;fila++){
            for(int columna =0;columna<columnas;columna++){
                copia.asignarCelda(fila,columna,lote[fila][columna]);
            }
        }
        return copia;
    }


    /**
     * Compara dos tablas2D elemento por elemento.
     * @param tabla2d Matriz a comparar con la matriz original.
     * @return Regresa verdadero si son iguales, falso en caso contrario.
     */

    public boolean esIgual(Tabla2D tabla2d){
        if(tabla2d.getFilas()==filas && tabla2d.getColumnas()==columnas){
            boolean condicion = true;
            for(int fila=0;fila<filas;fila++){
                for(int columna =0;columna<columnas;columna++){
                    Object objeto1=lote[fila][columna];
                    Object objeto2=tabla2d.obtenerElementoCelda(fila, columna);
                    if(objeto1.equals(objeto2)==false){
                        condicion=false;
                        return false;
                    }
                }
            }
            return condicion;
        }
        else{
            return false;
        }
    }


    /**
     * Genera una columna con el valor dado.
     * @param numFilas numero de renglon a llenar.
     * @param contenido Valor a insertar.
     * @return Regresa true si la accion se realizó de manera correcta, false
     * en caso contrario.
     */
    public boolean vectorColumna(int numFilas, Object contenido){
        if(validarDim(numFilas,filas)){
            for(int columna=0;columna<columnas;columna++){
                lote[numFilas][columna]=contenido;
            }
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Genera un vector renglon.
     * @param numColumnas Número de columnas a llenar.
     * @param contenido Valor a insertar.
     * @return Regresa true si la accion se realizó de manera correcta, false
     * en caso contrario.
     */
    public boolean vectorReng(int numColumnas, Object contenido){
        if(validarDim(numColumnas,columnas)){
            for(int renglon=0;renglon<filas;renglon++){
                lote[renglon][numColumnas]=contenido;
            }
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * agarramos otra tabla2d y redefinimos
     * @param tabla2d arreglo multidimension a basarse.
     * @return Regresa true en caso de que se haga la reestructuracion, false en caso
     * contrario.
     */
    public boolean redefinirTabla(Tabla2D tabla2d){
        if(filas==tabla2d.getFilas() && columnas==tabla2d.getColumnas()){
            for(int fila=0;fila<filas;fila++){
                for(int columna=0;columna<columnas;columna++){
                    lote[fila][columna]=tabla2d.obtenerElementoCelda(fila,columna);
                }
            }
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * El contenido de un arreglo lo pone como las filas de la tabla2d.
     * @param arreglo Arreglo a agregar.
     * @return Regresa true en caso de que se complete de manera correcta el agregado,
     * false en caso contrario.
     */
    public boolean agregarFila(ArregloDatos arreglo){
        if(arreglo.capacidad()==columnas){
            for(int fila=0;fila<filas;fila++){
                for(int columna=0;columna<columnas;columna++){
                    lote[fila][columna]=arreglo.obtener(columna);
                }
            }
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * El contenido de un arreglo lo pone como las columnas de la matriz.
     * @param arreglo Arreglo a agregar.
     * @return Regresa true en caso de que se complete de manera correcta el agregado,
     * false en caso contrario.
     */
    public boolean agregarColumna(ArregloDatos arreglo){
        if(arreglo.capacidad()==filas){
            for(int columna=0;columna<columnas;columna++){
                for(int fila=0;fila<filas;fila++){
                    lote[fila][columna]=arreglo.obtener(fila);
                }
            }
            return true;
        }
        else{
            return false;
        }

    }


    public boolean quitarColumna(TipoColumna tipocol){
        if(tipocol == TipoColumna.DER){
            for(int columna=0;columna<columnas;columna++){
                for(int fila=0;fila<filas;fila++){
                    lote[fila][columna] = 0;
                }
            }return true;
        }
        else {
            return false;
        }
    }

    public void diagonal(Object elemento){
        if(filas==columnas){
            for(int diag=0;diag<filas;diag++){
                lote[diag][diag]=elemento;
            }
        }else{ //hacer lo que corresponda,
        }
    }
}
