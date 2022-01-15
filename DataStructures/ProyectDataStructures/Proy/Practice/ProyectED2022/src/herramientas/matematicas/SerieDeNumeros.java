package herramientas.matematicas;

/**
 * Clase con diversos métodos que se relacionan con series.
 * @author Daniel Alejandro Morales Castillo
 */
public class SerieDeNumeros {
    /**
     * Método que ayuda a resolver por medio de recursión una serie ya definida.
     * @param x Parametro de la variable X.
     * @param valordeN Limite para n.
     * @param valordeM Limite para m.
     * @param n valor inicial n.
     * @param m valor inicial m.
     * @param contador Contador auxiliar.
     * @return Regresa el resultado de la sustitución en la serie.
     */
    public static double calcularSerieNumeros(int x, int valordeN, int valordeM, int n, int m , int contador){
        if( n<=valordeN && m<=valordeM){
            if(contador%2==0){
                return (((Math.pow(x,n))/OperacionesMatematicas.factorial(m)) + calcularSerieNumeros(x,valordeN,valordeM,n+2,m+2,contador+1));
            }
            else{
                return (((Math.pow(x,n))/OperacionesMatematicas.factorial(m)) + calcularSerieNumeros(x,valordeN,valordeM,n+2,m+2,contador+1));
            }
        }
        else{
            return 0;
        }
    }
}
