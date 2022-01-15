
/**
 * @author Daniel Alejandro Morales Castillo
 *
 */


//imports
package estructuraslineales;

import herramientas.comunes.TipoLogaritmo;
//clase Tabla2DNumeros
public class Tabla2DNumeros extends Tabla2D{
    /**
     * constructor Tabla2DNumeros #1
     *  @param fila serán las filas de la matriz o tabla 2D
     *  @param columna serán las columnas de nuestra matriz o tabla2D
     *
     */

    public Tabla2DNumeros(int fila, int columna){
        super(fila,columna);
        rellenar(0);
    }

    /**
     * constructor Tabla2DNumeros #2
     * @param fila serán las filas de la matriz o tabla 2D
     * @param columna serán las columnas de nuestra matriz o tabla2D
     * @param contenido el contenido con el que se rellenara inicialmente la matriz o tabla2D
     */

    public Tabla2DNumeros(int fila, int columna, Number contenido){
        super(fila,columna);
        rellenar(contenido);
    }


    /**
     * Multiplica una tabla2D o matriz por un escalar.
     * @param escalar Número a ser usado para multiplicar a la matriz.
     */

    public void xEscalar(double escalar){
        Number numero;
        double multiplicacion;
        for(int fila=0;fila<filas;fila++){
            for(int columna=0;columna<columnas;columna++){
                numero=((Number)lote[fila][columna]);
                multiplicacion= numero.doubleValue()*escalar;
                lote[fila][columna]=multiplicacion;
            }
        }
    }

    /**
     * suma una tabla2D o matriz un escalar.
     * @param escalar Número a ser usado para multiplicar a la matriz.
     */

    public void sumarEscalar(double escalar){
        Number numero;
        double suma;
        for(int fila=0;fila<filas;fila++){
            for(int columna=0;columna<columnas;columna++){
                numero=((Number)lote[fila][columna]);
                suma= numero.doubleValue()+escalar;
                lote[fila][columna]=suma;
            }
        }
    }

    /**
     * Multiplica 2 matrices.
     * @param tabla2 Matriz con la que se realizara la multiplicacion.
     * @return Regresa true en caso de que se realize correctamete, false en caso contrario.
     */
    public boolean multiplicar(Tabla2DNumeros tabla2){
        boolean condicion=true;
        if(columnas == tabla2.getFilas()){
            condicion=false;
        }else{
            Tabla2DNumeros producto = new Tabla2DNumeros(filas,tabla2.getColumnas());
            Number valor1;
            Number valor2;
            Number valor3;
            for(int filas1=0;filas1<filas;filas1++){
                for(int columnas2=0;columnas2<tabla2.getColumnas();columnas2++){
                    for(int columnas1=0;columnas1<columnas;columnas1++){
                        valor1=(Number)lote[filas1][columnas1];
                        valor2=(Number)tabla2.lote[columnas1][columnas2];
                        valor3=(Number)producto.obtenerElementoCelda(filas1, columnas2);
                        producto.asignarCelda(filas1,columnas2,valor3.doubleValue()+(valor1.doubleValue()*valor2.doubleValue()));
                    }
                }
            }
            condicion=true;
        }
        return condicion;
    }

    /**
     * Suma 2 matrices.
     * @param tabla2 Matriz a sumar.
     * @return Regresa true en caso de que se complete de manera exitosa,
     * false en caso contrario.
     */
    public boolean sumar(Tabla2DNumeros tabla2){
        if(filas==tabla2.getFilas() && columnas==tabla2.getColumnas()){
            Number valor1;
            Number valor2;
            for(int filas1=0;filas1<filas;filas1++){
                for(int columna=0;columna<columnas;columna++){
                    valor1=(Number)lote[filas1][columna];
                    valor2=(Number)tabla2.obtenerElementoCelda(filas1, columna);
                    lote[filas1][columna]=valor1.doubleValue()+valor2.doubleValue();
                }
            }
            return true;
        } else{
            return false;
        }
    }

    /**
     * Eleva cada elemento de la matriz a cierta potencia.
     * @param escalar Potecnia a elevar.
     */
    public void potenciaExE(double escalar){
        Number valor;
        double elevacion;
        for(int fila=0;fila<filas;fila++){
            for(int columna=0;columna<columnas;columna++){
                valor=(Number)lote[fila][columna];
                elevacion= Math.pow(valor.doubleValue(),escalar);
                lote[fila][columna]=elevacion;
            }
        }
    }

    /**
     * Aplica el tipo de logaritmo que se le indique.
     * @param tipoLog Tipo de logaritmo.
     * @return Regresa true en caso de que se haga de manera exitosa,
     * false en caso contrario.
     */
    public boolean aplicarLog(TipoLogaritmo tipoLog){
        boolean condicion = true;
        Number valor;
        for(int fila=0;fila<filas;fila++){
            for(int columna=0;columna<columnas;columna++){
                valor=(Number)lote[fila][columna];
                if(valor.doubleValue()==0.0){
                    return false;
                }
            }
        }
        Number valor2;
        double logaritmo;
        if(tipoLog.getTipo()==1){
            for(int fila=0;fila<filas;fila++){
                for(int columna=0;columna<columnas;columna++){
                    valor2=(Number)lote[fila][columna];
                    logaritmo=Math.log(valor2.doubleValue());
                    lote[fila][columna]=logaritmo;
                }
            }
        }
        if(tipoLog.getTipo()==2){
            for(int fila=0;fila<filas;fila++){
                for(int columna=0;columna<columnas;columna++){
                    valor2=(Number)lote[fila][columna];
                    logaritmo=Math.log10(valor2.doubleValue());
                    lote[fila][columna]=logaritmo;
                }
            }
        }
        else{
            double calculabase2;
            for(int fila=0;fila<filas;fila++){
                for(int columna=0;columna<columnas;columna++){
                    valor2=(Number)lote[fila][columna];
                    logaritmo=Math.log(valor2.doubleValue());
                    calculabase2 = logaritmo/ Math.log(2);  //formula de log log(valor)/log(base)
                    lote[fila][columna]=calculabase2;
                }
            }
        }
        return condicion;
    }

    /**
     * Diagonal de una tabla2d - matriz 2D.
     * @param contenido valor a rellenar.
     */
    public void matrizDiagonal(Number contenido){
        if(filas==columnas) {//cuadrada
            for (int diag = 0; diag < filas; diag++) {
                lote[diag][diag] = contenido;
            }
        }else{//Caso especial
        }
    }


    //MATRIZ SUPERIOR
    //123
    //022
    //007
    /**
     * Ver si es diagonal superior regresa True si  lo es
     */
    public boolean esDiagonalSup(){
        Number valorsup;
        for(int fila=0;fila<filas;fila++){
            for(int columna=0;columna>=filas;columna++){
                valorsup=(Number)lote[fila][columna];
                if(valorsup.doubleValue() == 0){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    //MATRIZ INFERIOR
    //100
    //220
    //112
    /**
     * Ver si es diagonal inferior regresa True si  lo es
     */
    public boolean esDiagonalinf(){
        Number valorinf;
        for(int fila=0;fila<filas;fila++){
            for(int columna=0;columna<=filas;columna++){
                valorinf=(Number)lote[fila][columna];
                if(valorinf.doubleValue() == 0){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }



























}
