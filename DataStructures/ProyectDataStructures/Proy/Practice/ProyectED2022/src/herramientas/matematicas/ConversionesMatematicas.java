package herramientas.matematicas;


import estructuraslineales.ArregloDatos;

/**
 * Esta clase tiene métodos de conversiones de haxdecimal, binario, bases
 * @author Daniel Alejandro Morales Castillo
 */
public class ConversionesMatematicas {
    /**
     * Método privado que convierte de decimal a Hexadecimal.
     * @param numero Número a convertir.
     * @param digito Arreglo con los valores para el Hexadecimal.
     * @return Regresa una cadena que representa el hexadecimal.
     */
    private static String convertirAHexadecimal(int numero, ArregloDatos digito){
        if(numero>=16){
            return ""+convertirAHexadecimal(numero/16,digito)+digito.obtener(numero%16);
        }
        else{
            return ""+digito.obtener(numero);
        }
    }
    /**
     * Método publico que convierte de decimal a Hexadecimal.
     * @param numero Número a convertir.
     * @return Regresa como cadena la conversión.
     */
    public static String convertirAHexadecimal(int numero){
        ArregloDatos digito = new ArregloDatos(16);
        digito.agregar(0);
        digito.agregar(1);
        digito.agregar(2);
        digito.agregar(3);
        digito.agregar(4);
        digito.agregar(5);
        digito.agregar(6);
        digito.agregar(7);
        digito.agregar(8);
        digito.agregar(9);
        digito.agregar("A");
        digito.agregar("B");
        digito.agregar("C");
        digito.agregar("D");
        digito.agregar("E");
        digito.agregar("F");
        return convertirAHexadecimal(numero,digito);
    }
    /**
     * Método que convierte un decimal  a un número de cierta base.
     * @param base Base a aplicar.
     * @param numero Número a convertir.
     * @param digito Arreglo con los valores.
     * @return Regresa un String que representa a el número.
     */
    private static String convertirBaseB(int base, int numero,ArregloDatos digito){
        if(numero>=base){
            return ""+convertirBaseB(base,numero/base,digito)+digito.obtener(numero%base);
        }
        else{
            return ""+digito.obtener(numero);
        }
    }
    /**
     * Método que convierte de decimal a cierta base.
     * @param base Base a usar.
     * @param numero Número a convertir.
     * @return Regresa un String que representa la base o null en caso de que haya un error.
     */
    public static String convertirBaseB(int base, int numero){
        if(base<10 && base>0){
            ArregloDatos digito = new ArregloDatos(16);
            digito.agregar(0);
            digito.agregar(1);
            digito.agregar(2);
            digito.agregar(3);
            digito.agregar(4);
            digito.agregar(5);
            digito.agregar(6);
            digito.agregar(7);
            digito.agregar(8);
            digito.agregar(9);
            return convertirBaseB(base,numero,digito);
        }
        else{
            return null;
        }
    }
    /**
     * Método que sirve para convertir numeros de decimal a binario.
     * @param num Número a convertir.
     * @return Regresa la expresion en binario que representa al número.
     */
    public static String decimalBinario(int num){
        if(num==1){
            return "1";
        }
        else{
            if(num%2==0){
                return decimalBinario(num/2)+"0";
            }
            else{
                return decimalBinario(((num-1)/2))+"1";
            }
        }
    }
}
