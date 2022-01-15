
package herramientas.matematicas;

/**
 * Clase que contiene operaciones para usarlas en los metodos recursivos
 * @author Daniel Alejandro Morales Castillo
 */
public class OperacionesMatematicas {
    /**
     * Método que te calcula la factorial de un número.
     * @param n Número al que se calcula la factorial.
     * @return Regresa la factorial del número.
     */
    public static long factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    /**
     * Método que sirve para calcular el maximo comun divisor
     * @param a Primer número.
     * @param b Segundo número.
     * @return Regresa un entero que representa el MCD.
     */
    public static int maximoComunDivisor(int a, int b){
        if(a==b){
            return a;
        }
        else{
            if(a>b){
                return maximoComunDivisor(a-b,b);
            }
            else{
                return maximoComunDivisor(a,b-a);
            }
        }
    }


    /**
     * Método que sirve para calcular una multiplicacion entera
     * @param a Primer número.
     * @param b Segundo número.
     * @return Regresa un entero que representa el resultado de la mulitplicacion.
     */
    public static int multiplicacionR(int a, int b){
        if(b==1){
            return a;
        }else{
            System.out.println(a);
            return a + multiplicacionR(a,b-1);
        }

    }
}
