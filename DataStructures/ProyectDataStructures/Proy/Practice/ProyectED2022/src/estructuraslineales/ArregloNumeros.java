/**
 * @autor Daniel Alejandro Morales Castillo
 */


package estructuraslineales;

public class ArregloNumeros extends ArregloDatos{


    public ArregloNumeros(int capacidad) {
        super(capacidad);
    }

    /**
     *Inserta al final un número en nuestro arreglo
     *@param elemento Es el número a insertar en un arreglo.
     *@return Regresa <b>true</b> si la lista insertó el número, <b>false</b>
     *en caso contrario
     */
    public boolean agregar(Number elemento){
        if(super.lleno()==false){
            tope++;
            lote[tope]=elemento;
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Localiza la posición de número.
     * @param elemento es el número a encontrar.
     * @return Regresa la posición si lo encuentra, null
     * en caso contrario.
     */
    public Object buscar(Number elemento) {
        int posicion=0;
        while( posicion<=tope &&
                !elemento.toString().equalsIgnoreCase(lote[posicion].toString())){
            posicion++;
        }
        if(posicion<=tope){
            return posicion;
        }
        else{
            return null;
        }
    }

    /**
     * Suprime un número.
     * @param elemento Es el número a borrar.
     * @return Regresa el número de la posoción encontrada o null
     * si no lo encuentra.
     */
    public Object eliminar(Number elemento) {
        Integer pos=(Integer)buscar(elemento);
        if(pos!=null){
            Object contenido=lote[pos];
            tope=tope-1;
            for(int mov=pos;mov<=tope;mov++){
                lote[mov]=lote[mov+1];
            }
            return contenido;
        }
        else{
            return null;
        }
    }

    /**
     * Multiplica un escalar por cada uno de los números en el arreglo.
     * @param escalar Es el valor a multiplicar.
     */
    // Metodo llamado xEscalar por comodidad llamado MultiplicarEscalar
    public boolean multiplicarEscalar(Number escalar){
        if(vacia()==false){
            double multiplicacion;
            double valor1;
            double valor2=escalar.doubleValue();
            for(int contador = 0;contador<=tope;contador++){
                valor1=(double)lote[contador];
                multiplicacion=(valor1)*(valor2);
                lote[contador]=multiplicacion;
            }
            return true;
        }else {
            return false;
        }
    }

    /**
     * Suma el escalar a cada posición del arreglo numerico.
     * @param escalar Es el valor que sera sumado.
     */
    public boolean sumaEscalar(Number escalar){
        if(vacia()==false){
            double suma;
            double valor1;
            double valor2=escalar.doubleValue();
            for(int contador = 0;contador<=tope;contador++){
                valor1=(double)lote[contador];
                suma=(valor1)+(valor2);
                lote[contador]=suma;
            }
            return true;
        }else {
            return false;
        }
    }

    /**
     * Suma nuestro arregloa con otro arreglo nuevo
     * @param arreglo2 Es el arreglo con el cual se realizará la suma.
     */
    public boolean sumar(ArregloNumeros arreglo2){
        if (vacia()==false && arreglo2.vacia()==false){
            if(tope == arreglo2.tope){
                double suma;
                double valor1;
                double valor2;
                for(int contador=0;contador<=tope;contador++){
                    valor1=(double)lote[contador];
                    valor2=(double)arreglo2.lote[contador];
                    suma=valor1+valor2;
                    lote[contador]=suma;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    /**
     * Multiplica nuestro arreglo por el el arreglo que recibe el método.
     * @param arreglo2 Vector para multiplicar.
     */
    public boolean multiplicar(ArregloNumeros arreglo2){
        if (vacia()==false && arreglo2.vacia()==false){
            if(tope == arreglo2.tope){
                double multiplicacion;
                double valor1;
                double valor2;
                for(int contador=0;contador<=tope;contador++){
                    valor1=(double)lote[contador];
                    valor2=(double)arreglo2.lote[contador];
                    multiplicacion=valor1*valor2;
                    lote[contador]=multiplicacion;
                }
            }
            return true;
        }else {
            return false;
        }
    }

    /**
     * que haga la operación de potencia de cada
     * elemento del arreglo (base) por el exponente pasado como escalar
     * @param escalar Es el valor que sera la potencia
     */
    public boolean potenciarEscalar(Number escalar){
        if(vacia()==false){
            double potencia;
            double valor1;
            double valor2=escalar.doubleValue();
            for(int contador = 0;contador<=tope;contador++){
                valor1=(double)lote[contador];
                potencia= Math.pow(valor1,valor2);
                lote[contador]=potencia;
            }
            return true;
        }else{
            return false;
        }
    }

    /**
     * Calcula la potencia de nuestro arreglo
     * @param arregloEscalar es otro arreglo el cyal será la potencia a la que se elevará el arreglo base
     * @return Regresa la potenica de nuestro arreglo.
     */
    public boolean potencia(ArregloNumeros arregloEscalar){
        if (vacia()==false && arregloEscalar.vacia()==false){
            if(tope == arregloEscalar.tope){
                double potencia;
                double valor1;
                double valor2;
                for(int contador=0;contador<=tope;contador++){
                    valor1=(double)lote[contador];
                    valor2=(double)arregloEscalar.lote[contador];
                    potencia = Math.pow(valor1,valor2);

                }
            }
            return true;
        }else{
            return false;
        }
    }


    /**
     * Suma las multiplicaciones de ambos arreglos.
     * @param arreglo2 Es el arreglo con el que vamos a operar a nuestro arreglo.
     * @return Regresa la suma de las multiplicaciones de las posiciones de
     * los arreglos.
     */
    public double productoPunto(ArregloNumeros arreglo2){
        double suma = 0;
        if(vacia()==false && arreglo2.vacia()==false){
            if(tope == arreglo2.tope){
                double multiplicacion;
                for (int contador = 0; contador<=tope;contador++){
                    multiplicacion = (((double)lote[contador])*((double)arreglo2.lote[contador]));
                    suma+=multiplicacion;
                }
                return suma;
            }
        }
        return suma;
    }

    /**
     * Calcula la magnitud/modulo/normma de nuestro arreglo.
     * @return Regresa la magnitud.
     */
    public double modulo(){
        double magnitud = 0;
        double cuadrado;
        double acumulador=0;
        if(vacia()==false){
            for(int contador =0; contador<=tope;contador++){
                cuadrado=(double)lote[contador] * (double)lote[contador];
                acumulador+=cuadrado;
            }
            magnitud = Math.sqrt(acumulador);
            return magnitud;
        }
        return magnitud;
    }

    /**
     * Calcula la norma euclidiana de 2 vectores.
     * @param arreglo2 Es el arreglo con el cual se sacara la norma euclidiana al
     * operarlo con nuestro arreglo pricipal.
     * @return Regresa la norma euclidiana en caso de que la tenga.
     */

    public double normaEuclidiana(ArregloNumeros arreglo2){
        double normaeuclidiana = 0;
        double valor1;
        double valor2;
        double acumulador=0;
        double resta =0;
        double cuadrado = 0;
        if (vacia()==false && arreglo2.vacia()==false){
            if(tope == arreglo2.tope){
                for (int contador=0;contador<=tope;contador++){
                    valor1=(double)lote[contador];
                    valor2=(double)arreglo2.lote[contador];
                    resta=valor2-valor1;
                    cuadrado=resta*resta;
                    acumulador+=cuadrado;
                }
                normaeuclidiana=Math.sqrt(acumulador);
                return normaeuclidiana;
            }
        }
        return normaeuclidiana;
    }

    /**
     * Revisa si los arreglos son ortogonales o no
     * @param arreglo2 Es el arreglo con el cual se multiplica para ver si es ortogonal
     * @return verdadero si son ortogonales y falso si no lo son.
     */

    //Multiplicar dos arreglos y si da 0 es ortogonal
    //u*v = 0
    public boolean esOrtogonal(ArregloNumeros arreglo2){
        if(tope == arreglo2.tope){
            double multiplicacion = 0;
            double valor1;
            double valor2;
            for(int contador=0;contador<=tope;contador++){
                valor1=(double)lote[contador];
                valor2=(double)arreglo2.lote[contador];
                multiplicacion=valor1*valor2;
                lote[contador]=multiplicacion;
            }
            return multiplicacion == 0;
        }
        return true;
    }

    /**
     * Resta un escalar a los valores que contiene el arreglo.
     * @param escalar Número que sera restado.
     */
    public void restaEscalar(Number escalar){
        if(vacia()==false){
            double resta;
            double valor1;
            double valor2=escalar.doubleValue();
            for(int contador = 0;contador<=tope;contador++){
                valor1=(double)lote[contador];
                resta=(valor1)-(valor2);
                if(resta>=0){
                    lote[contador]=resta;
                }
                else{
                    resta=0;
                    lote[contador]=resta;
                }
            }
        }
    }







}



















