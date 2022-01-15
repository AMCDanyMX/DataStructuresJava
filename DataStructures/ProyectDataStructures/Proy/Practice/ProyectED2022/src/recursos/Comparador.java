/**
 * Clase Comparador de objects en este caso serán numeros
 * @author Daniel Alejandro Morales Castillo
 * @version 1.0
 */
package recursos;

/**
 * Esta clase es para usar los métodos de comparación de objetos.
 * @author Daniel Alejandro Morales Castillo
 */
public class Comparador{
    /**
     * Es el constructor de la clase.
     */
    public Comparador(){

    }
    /**
     * Este método compara dos objetos.
     * @param objeto1 Primero objeto.
     * @param objeto2 Segunto objeto.
     * @return Regresa 1 si el primero objeto es mayor, regresa -1
     * si es el caso contrario.
     */
    public static int comparar(Object objeto1, Object objeto2){
        if(objeto1 instanceof Number && objeto2 instanceof Number){
            Number numero1 = (Number)objeto1;
            Number numero2 = (Number)objeto2;
            double num1=numero1.doubleValue();
            double num2=numero2.doubleValue();
            if(num1>num2){
                return 1;
            }
            else{
                if(num1<num2){
                    return -1;
                }
                else{
                    return 0;
                }
            }
        }
        else{  //Metodo toString con el que nos es posible comparar elementos
            if(objeto1.toString().compareTo(objeto2.toString())==1){
                return 1;
            }
            else{
                if((objeto2.toString().compareTo(objeto1.toString())==1)){
                    return -1;
                }
                else{
                    return 0;
                }
            }

        }
    }

}