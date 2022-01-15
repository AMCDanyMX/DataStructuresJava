package registros.examen1partetexto;

import entradasalida.ArchivoTexto;
import entradasalida.EntradaTerminal;
import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;

/**
 *
 * @author Daniel Alejandro Morales Castillo
 */

/**
 * Clase MenuValidadorDeBalance
 * menu que se usa pra el programa 1
 */
public class MenuValidadorDeBalance {
    public static boolean menu(){
        SalidaTerminal.consola("¿Quieres validar una cadena o un Archivo?\n");
        SalidaTerminal.consola("1=Archivo 2=Cadena\n");
        String eleccion = EntradaTerminal.consolaCadena();
        if("1".equals(eleccion)){
            SalidaTerminal.consola("Ingresa la ruta del archivo: \n");
            String ruta = EntradaTerminal.consolaCadena();
            SalidaTerminal.consola("¿Cuál es el número de lineas del archivo?\n");
            String tamanio = EntradaTerminal.consolaCadena();
            Integer tam = Integer.parseInt(tamanio);
            ArregloDatos arreglo = ArchivoTexto.leer(ruta, tam);
            boolean respuesta = ValidarCadenaArchivoTexto.validarArchivo(arreglo);
            return respuesta;
        }
        else{
            SalidaTerminal.consola("Ingresa la cadena: \n");
            String cadena = EntradaTerminal.consolaCadena();
            boolean respuesta = ValidarCadenaArchivoTexto.validarCadena(cadena);
            return respuesta;
        }
    }
}