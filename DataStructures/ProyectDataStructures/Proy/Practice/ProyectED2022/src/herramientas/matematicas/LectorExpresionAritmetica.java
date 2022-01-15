package herramientas.matematicas;


import entradasalida.EntradaTerminal;
import entradasalida.SalidaTerminal;

/**
 * @author Daniel Alejandro Morales Castillo
 */

public class LectorExpresionAritmetica{
    /**
     * Método que sustituye las variables en una expresión aritmetica.
     * @param notacion Notación a sustituir.
     * @return Regresa la notación ya sustituida.
     */
    public static String sustituirVariables(String notacion){
        String cambiada=notacion;
        for(int posOperador=0;posOperador<notacion.length();posOperador++){
            char operador=notacion.charAt(posOperador);
            String cambio="";
            if(ExpresionAritmetica.esOperando(operador)){
                while(ExpresionAritmetica.esOperando(operador)==true && posOperador<notacion.length()-1){
                    cambio+=operador;
                    posOperador++;
                    operador=notacion.charAt(posOperador);
                }
                if(ExpresionAritmetica.esOperando(operador)==true && posOperador==notacion.length()-1){
                    cambio+=operador;
                }
                SalidaTerminal.consola("¿Cual sera el valor para la variable: "+cambio+"\n");
                String valorVariable= EntradaTerminal.consolaCadena();
                cambiada=cambiada.replaceFirst(cambio, valorVariable);
            }
        }
        return cambiada;
    }
}
