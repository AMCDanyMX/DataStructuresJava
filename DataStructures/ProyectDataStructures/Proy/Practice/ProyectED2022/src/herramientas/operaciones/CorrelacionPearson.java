package herramientas.operaciones;

import estructuraslineales.ListaEncadenadaDoble;

/**
 * Clase que tiene métodos que ayudan a calcular la correlación de pearson.
 * @author Daniel Alejandro Morales Castillo
 */
public class CorrelacionPearson {
    /**
     * Método que calcula la correlacion de pearson para poblacion
     * @param lista1 Valores X.
     * @param lista2 Valores Y.
     * @return Regresa el valor de la correlación, en caso de que haya un problema regresa null.
     */
    public static Double correlacion(ListaEncadenadaDoble lista1, ListaEncadenadaDoble lista2){
        if (lista1.vacia()==false && lista2.vacia()==false){
            Double promX = promedio(lista1);
            Double promY = promedio(lista2);  //modas o promedioos de los valores de x y y
            Double desvX = desviacionEstandar(lista1);
            Double desvY = desviacionEstandar(lista2);
            double acumulador =0;
            int contador =0;
            lista1.inicializarIterador();
            lista2.inicializarIterador();
            while(lista1.hayNodoSiguiente()){
                Number contenidoX = (Number)lista1.obtenerSiguiente();
                Number contenidoY = (Number)lista2.obtenerSiguiente();
                Double valorX = contenidoX.doubleValue();
                Double valorY = contenidoY.doubleValue();
                acumulador= acumulador + ((valorX-promX)*(valorY-promY));  //covarianza
                contador++;
            }
            double r = acumulador/((contador-1)*(desvX)*(desvY));    //parte de covarianza pero acomodada para el calculo
            return r;
        } else{
            return null;
        }
    }

    /**
     * Método que calcula la correlacion de pearson para poblacion
     * @param lista1 Valores X.
     * @param lista2 Valores Y.
     * @return Regresa el valor de la correlación, en caso de que haya un problema regresa null.
     */
    public static Double covarianzaEstandarizada(ListaEncadenadaDoble lista1, ListaEncadenadaDoble lista2){
        if (lista1.vacia()==false && lista2.vacia()==false){
            double acumulador =0;
            int contador =0;
            lista1.inicializarIterador();
            lista2.inicializarIterador();
            while(lista1.hayNodoSiguiente()){
                Number contenidoX = (Number)lista1.obtenerSiguiente();
                Number contenidoY = (Number)lista2.obtenerSiguiente();
                Double valorX = contenidoX.doubleValue();
                Double valorY = contenidoY.doubleValue();
                acumulador= acumulador + ((valorX*valorY)); //covarianza estanadar
                contador++;
            }
            double cov = acumulador/((contador-1));    //parte de covarianza pero acomodada para el calculo
            return cov;
        } else{
            return null;
        }
    }

    /**
     * Método que calcula el coeficiente r
     * @param lista1 Valores X.
     * @param lista2 Valores Y.
     * @return Regresa el valor dell coeficiente
     */
    public static Double coeficienteR(ListaEncadenadaDoble lista1, ListaEncadenadaDoble lista2){
        if (lista1.vacia()==false && lista2.vacia()==false){
            double acumuladorsumax =0;
            double acumuladorsumay = 0;
            double acumuladormulti = 0;
            double dominador = 0;
            double denominador = 0;
            double parte1denom = 0;
            double parte2denom = 0;
            double parte3denom = 0;
            double parte4denom = 0;

            int contador =0;
            lista1.inicializarIterador();
            lista2.inicializarIterador();
            while(lista1.hayNodoSiguiente()){
                Number contenidoX = (Number)lista1.obtenerSiguiente();
                Number contenidoY = (Number)lista2.obtenerSiguiente();
                Double valorX = contenidoX.doubleValue();
                Double valorY = contenidoY.doubleValue();
                acumuladormulti= acumuladormulti + ((valorX*valorY));
                acumuladorsumax= acumuladorsumax + valorX;
                acumuladorsumay= acumuladorsumay + valorY;
                contador++;
            }
            parte1denom = contador * Math.pow(acumuladorsumax,2) - (Math.pow(acumuladorsumax,2));
            parte2denom  = Math.sqrt(parte1denom);
            parte3denom = Math.pow(acumuladorsumax,2);
            parte4denom = Math.pow(acumuladorsumay,2);

            dominador = acumuladormulti-((acumuladorsumax*acumuladorsumay));
            denominador = Math.sqrt(parte1denom - parte2denom) * Math.sqrt(parte3denom-parte4denom);
            double rxy = dominador/denominador;    //parte de covarianza pero acomodada para el calculo
            return rxy;
        } else{
            return null;
        }
    }


    /**
     * Método para sacar la desviación estandar de una lista de valores.
     * @param lista Lista de valores a evaluar.
     * @return Regresa el valor de la desviación estandar, en caso de que haya ocurrido
     * algun problema regresa null.
     */
    public static Double desviacionEstandar(ListaEncadenadaDoble lista){
        if(lista.vacia()==false){
            Double promedio = promedio(lista);
            lista.inicializarIterador();
            double acumulador=0;
            int contador=0;
            while(lista.hayNodoSiguiente()){
                Number contenido = (Number)lista.obtenerSiguiente();
                Double valor = contenido.doubleValue();
                acumulador+=Math.pow((valor-promedio),2);
                contador++;
            }
            Double desviacion = acumulador/(contador-1);
            desviacion = Math.sqrt(desviacion);
            return desviacion;
        }
        else{
            return null;
        }
    }
    /**
     * Método que sirve para sacar el promedio a una lista con valores.
     * @param lista Lista a evaluar.
     * @return Regresa el valor del promedio, en caso de que ocurra alguna falla
     * regresa null.
     */
    public static Double promedio(ListaEncadenadaDoble lista){
        if(lista.vacia()==false){
            lista.inicializarIterador();
            double sumador=0;
            int contador=0;
            while(lista.hayNodoSiguiente()){
                Number contenido = (Number)lista.obtenerSiguiente();
                Double valor = contenido.doubleValue();
                sumador+=valor;
                contador++;
            }
            Double prom= sumador/contador;
            return prom;
        }
        else{
            return null;
        }
    }
}
