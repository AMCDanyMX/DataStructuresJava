package registros.texto;


import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloPila;
import herramientas.matematicas.ExpresionAritmetica;
/**
 * Clase Encriptador que ayuda a encriptar Strings.
 * @author Daniel Alejandro Morales Castillo
 */
public class Encriptador {
    /**
     * Método encriptar ayuda a encriptar un texto
     * @param texto Texto a encriptar.
     * @param pos1 Posición del primer simbolo.
     * @param pos2 Posición del segundo simbolo.
     * @param tam1 Tamaño del primer simbolo.
     * @param tam2 Tamaño del segundo simbolo.
     * @return Regresa la cadena de texto modificada, en caso de que no se pueda regresa <b>null</b>
     */
    //pos3 y tam3
    public static String encriptarTexto (String texto, int pos1, int pos2, int tam1, int tam2){
        SalidaTerminal.consola("Su texto plano ingresado es: "+texto+"\n");
        if( ((pos1-1) < texto.length()) && (pos1-1)+tam1 <texto.length()
                && ((pos2-1) < texto.length()) && ((pos2-1)+tam2 <texto.length())){

            String primeraParte="";
            String segundaParte="";
            ArregloPila pila1 = new ArregloPila(texto.length());
            ArregloPila pila2 = new ArregloPila(texto.length());
            for(int posLetra=0;posLetra<=pos1-2;posLetra++){
                char simbolo=texto.charAt(posLetra);
                primeraParte+=simbolo;
            }
            //el simbolo "Ç"  no lo use porque al usar los  operadores tuve problemas
            primeraParte+="*";
            for(int posLetra=pos1-1;posLetra<(pos1-1)+tam1;posLetra++){
                char simbolo=texto.charAt(posLetra);
                pila1.poner(simbolo);
            }
            if(pila1.vacio()==false){
                while(pila1.vacio()==false){
                    char letraSacada=(char)pila1.quitar();
                    primeraParte+=letraSacada;
                }
            }
            primeraParte+="*";
            for(int posLetra=(pos1-1)+tam1;posLetra<texto.length();posLetra++){
                char simbolo=texto.charAt(posLetra);
                primeraParte+=simbolo;
            }
            texto=primeraParte;

            for(int posLetra=0;posLetra<=pos2-2;posLetra++){
                char simbolo=texto.charAt(posLetra);
                segundaParte+=simbolo;
            }
            segundaParte+="*";
            for(int posLetra=pos2-1;posLetra<(pos2-1)+tam2;posLetra++){
                char simbolo=texto.charAt(posLetra);
                pila2.poner(simbolo);
            }
            if(pila2.vacio()==false){
                while(pila2.vacio()==false){
                    char letraSacada=(char)pila2.quitar();
                    segundaParte+=letraSacada;
                }
            }
            segundaParte+="*";
            for(int posLetra=(pos2-1)+tam2;posLetra<texto.length();posLetra++){
                char simbolo=texto.charAt(posLetra);
                segundaParte+=simbolo;
            }
            return segundaParte;
        } else{
            return null;
        }

    }
    /**
     * Método que ayuda a desencriptar una cadena de texto.
     * @param texto Texto a desencriptar.
     * @return Regresa la cadena  de texto desencriptada.
     */
    public static String desencriptar(String texto){
        SalidaTerminal.consola("Su texto a desencriptar ingresado es: "+texto+"\n");
        ArregloPila pila1 = new ArregloPila(texto.length());
        String cadena1="";
        String cadena2="";
        int nuevoIndice=0;
        for(int posLetra=0; posLetra<texto.length();posLetra++){
            char letra1=texto.charAt(posLetra);
            if(ExpresionAritmetica.esOperando(letra1)==false){
                for(int pos=0;pos<=posLetra-1;pos++){
                    char letra2=texto.charAt(pos);
                    cadena1+=letra2;
                }
                for(int posLetra2=posLetra+1;posLetra2<texto.length();posLetra2++){
                    char letra2=texto.charAt(posLetra2);
                    if(ExpresionAritmetica.esOperando(letra2)){
                        pila1.poner(letra2);
                    } else{
                        posLetra=posLetra2+1;
                        posLetra2=texto.length();
                    }
                }
                while(!pila1.vacio()){
                    char letra3=(char)pila1.quitar();
                    cadena1+=letra3;
                }
                nuevoIndice=posLetra;
                break;
            }
        }
        //return string en cadena 1;
        for(int posLetra=nuevoIndice; posLetra<texto.length();posLetra++){
            char letra1=texto.charAt(posLetra);
            if(ExpresionAritmetica.esOperando(letra1)==false){
                for(int pos=nuevoIndice;pos<=posLetra-1;pos++){
                    char letra2=texto.charAt(pos);
                    cadena2+=letra2;
                }
                for(int posLetra2=posLetra+1;posLetra2<texto.length();posLetra2++){
                    char letra2=texto.charAt(posLetra2);
                    if(ExpresionAritmetica.esOperando(letra2)){
                        pila1.poner(letra2);
                    }
                    else{
                        posLetra=posLetra2+1;
                        posLetra2=texto.length();
                    }
                }
                while(!pila1.vacio()){
                    char letra3=(char)pila1.quitar();
                    cadena2+=letra3;
                }
                for(int indice=posLetra;indice<texto.length();indice++){
                    char letra4=texto.charAt(indice);
                    cadena2+=letra4;
                }
                break;
            }
        }
        return cadena1+cadena2;

    }
}
