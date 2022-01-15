package registros.examen1partetexto;

import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;
import estructuraslineales.ArregloPila;

/**
 * Esta clase contiene métodos para validar filas de texto.
 * @author Daniel Alejandro Morales Castillo
 */

/**
 * Clase que valida que una cadena de texto o archivo este balanceada
 *
 */
public class ValidarCadenaArchivoTexto {
    /**
     * Método que sirve para validar que un archivo cumpla con un balance.
     * @param arreglo Arreglo con las lineas del archivo.
     * @return Regresa <b>true</b> en caso de que sea correcta, <b>false</b> en caso contrario.
     */
    public static boolean validarArchivo(ArregloDatos arreglo){
        int valor =0;
        for (int linea=0;linea<arreglo.cantidadElementos();linea++){//Sacar valor total del String comppleto del arreglo.
            String laCadena = (String)arreglo.obtener(linea);
            valor+=laCadena.length();
        }
        ArregloPila pilaApertura= new ArregloPila(valor);
        ArregloPila pilaCierre= new ArregloPila(valor);
        ArregloPila pilaCierreInvertida = new ArregloPila(valor);
        ArregloPila fila = new ArregloPila(valor);
        ArregloPila posicion = new ArregloPila(valor);
        for (int linea=0;linea<arreglo.cantidadElementos()-1;linea++){//Va linea por linea.
            String cadena=(String)arreglo.obtener(linea);
            for(int caracter=0;caracter<cadena.length();caracter++){//Evaluar letra a letra
                char letra=cadena.charAt(caracter);
                String documentadoApertura = "";
                String documentadoCierre = "";
                if(letra=='/' && caracter+1<cadena.length() && cadena.charAt(caracter+1)=='*'){
//                    documentadoApertura="/*";
//                    pilaApertura.push(documentadoApertura);
//                    fila.push(linea+1);
//                    posicion.push(caracter+1);
                }
                else{
                    documentadoApertura="";
                }
                if(letra=='*' && caracter+1<cadena.length() &&  cadena.charAt(caracter+1)=='/' ){
//                    documentadoCierre="*/";
//                    pilaCierre.poner(documentadoCierre);
                }
                else{
                    documentadoCierre="";
                }
                if(letra=='(' || letra=='[' || letra=='{' ){
                    pilaApertura.poner(letra+"");
                    fila.poner(linea+1);
                    posicion.poner(caracter+1);
                }
                if(letra==')' || letra==']' || letra=='}' ){
                    pilaCierre.poner(letra+"");
                }
            }
        }
        while(!pilaCierre.vacio()){
            String letra = (String)pilaCierre.quitar();
            pilaCierreInvertida.poner(letra);
        }
        boolean evaluacion=true;
        while(!pilaApertura.vacio()){
            String token1= (String)pilaApertura.quitar();
            String token2= (String)pilaCierreInvertida.quitar();
            int laFila = (int)fila.quitar();
            int laPos = (int)posicion.quitar();
            if(("(".equals(token1) && ")".equals(token2)) || ("[".equals(token1) && "]".equals(token2)) || ("{".equals(token1) && "}".equals(token2))
            ){
                evaluacion=true;
            }
            else{
                SalidaTerminal.consola("Error linea: "+laFila+" Posicion: "+laPos+"\n" + "El elemento faltante es ");
                evaluacion=false;
            }

        }
        return evaluacion;

    }
    /**
     * Método que sirve para validar que una cadena cumpla con un balance.
     * @param cadena Cadena a evaluar.
     * @return Regresa <b>true</b> en caso de que sea correcta, <b>false</b> en caso contrario.
     */
    public static boolean validarCadena(String cadena){
        ArregloPila pilaApertura= new ArregloPila(cadena.length());
        ArregloPila pilaCierre= new ArregloPila(cadena.length());
        ArregloPila pilaCierreInvertida = new ArregloPila(cadena.length());
        ArregloPila posicion = new ArregloPila(cadena.length());
        //ArregloPila errores = new ArregloPila(cadena.length());
        for(int caracter=0;caracter<cadena.length();caracter++){
            char letra=cadena.charAt(caracter);
            if(letra=='(' || letra=='[' || letra=='{' ){
                pilaApertura.poner(letra+"");
                posicion.poner(caracter+1);
            }
            if(letra==')' || letra==']' || letra=='}' ){
                pilaCierre.poner(letra+"");
            }

        }
        while(!pilaCierre.vacio()){
            String letra = (String)pilaCierre.quitar();
            pilaCierreInvertida.poner(letra);
        }
        boolean evaluacion=true;
        while(!pilaApertura.vacio()){
            String token1= (String)pilaApertura.quitar();
            String token2= (String)pilaCierreInvertida.quitar();
            int laPos = (int)posicion.quitar();
            if(("(".equals(token1) && ")".equals(token2))){
                evaluacion=true;
            }
            else if(("[".equals(token1) && "]".equals(token2))){
                evaluacion=true;
            }
            else if(("{".equals(token1) && "}".equals(token2))){
                evaluacion=true;
            }
            else{
                SalidaTerminal.consola("Error Posicion: "+laPos+"\n");
                evaluacion=false;
            }

        }
        return evaluacion;

    }
}