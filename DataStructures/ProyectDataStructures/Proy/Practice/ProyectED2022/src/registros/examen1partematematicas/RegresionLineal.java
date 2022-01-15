package registros.examen1partematematicas;

import entradasalida.ArchivoTexto;
import estructuraslineales.ArregloDatos;
/**
 *
 * @author Daniel Alejandro Morales Castillo
 */
/**
 * Clase que calcula la regresion lineal
 *
 */
public class RegresionLineal {
    //Regresión Lineal con Gradiente Descendente
    private double theta0 = 0.0 ;  //interceptar
    private double theta1 = 0.0 ;  //Pendiente
    private double alpha = 0.01 ;  //Tasa de aprendizaje
    private int iteracion_max = 100000 ; // Número máximo de pasos de iteración
    private ArregloDatos arreglodedatos;
    //leer datos de regresion
    /**
     *Metodo de regresion linieal
     *Lee los datos del archivo
     */
    public RegresionLineal(){
        arreglodedatos = ArchivoTexto.leer("E:\\Programacion\\EstructurasDatos2021ED\\DATOS.txt");
    }

    //prediccion
    /**
     *Metodo prediccion
     * @param x es el valor que  le pasaremos por parametro en la prediccion
     *
     */
    public double prediccion(double x){
        return theta0+theta1*x ;
    }
    //error
    /**
     * Metodo que calula el error de nuestro modelo
     * @param x primer valor del caluclo
     * @param y valor en y del calculo
     *
     */
    public double calcularError(double x, double y) {
        return prediccion(x)-y;
    }
    /**
     * Clase MenuValidadorDeBalance
     * menu que se usa pra el programa 1
     */
    public void gradienteDescendiente(){
        double sum0 =0.0 ;
        double sum1 =0.0 ;
        double sum2 =0.0;

        for(int i = 0 ; i < arreglodedatos.cantidadElementos() ;i++) {
            //sum0 += calcularError(arreglodedatos.obtener(i), arreglodedatos.obtener(0));
            //sum1 += calcularError(arreglodedatos.obtener(i), arreglodedatos.obtener(0));
            //sum2 += calcularError(arreglodedatos.obtener(i)*arreglodedatos.obtener((0));
        }
        this.theta0 = theta0 - alpha*sum0/arreglodedatos.cantidadElementos() ;
        this.theta1 = theta1 - alpha*sum1/arreglodedatos.cantidadElementos() ;
    }

    public void lineaGre() {
        int iterador = 0 ;
        while( iterador< iteracion_max){
            System.out.println("El paso es :"+iterador);
            System.out.println("theta0 "+theta0);
            System.out.println("theta1 "+theta1);
            System.out.println();
            gradienteDescendiente();
            iterador ++ ;
        }
    }

}
