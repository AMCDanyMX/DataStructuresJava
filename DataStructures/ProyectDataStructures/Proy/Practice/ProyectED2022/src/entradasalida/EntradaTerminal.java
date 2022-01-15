/** @autor Daniel Alejandro Morales Castillo
 *@autor Y Profesor Aldonso en clase de ED
 */

package entradasalida;

import java.io.*;
public class EntradaTerminal {
    public static String consolaCadena(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        String cadenaEntrada="";
        try{
            cadenaEntrada  = buffer.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            return cadenaEntrada;
        }
    }
    public static Double consolaDouble() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        double cadenaEntrada=0;
        try {
            cadenaEntrada = Double.parseDouble(buffer.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            return cadenaEntrada;
        }
    }

    public static int consolaInt() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        int cadenaEntrada=0;
        try {
            cadenaEntrada = Integer.parseInt(buffer.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            return cadenaEntrada;
        }
    }

    //Metodo que lee un caracter
    public static char consolaChar() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        int cadenaEntrada=0;
        try {
            cadenaEntrada = Integer.parseInt(buffer.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            return (char) cadenaEntrada;
        }
    }


}
