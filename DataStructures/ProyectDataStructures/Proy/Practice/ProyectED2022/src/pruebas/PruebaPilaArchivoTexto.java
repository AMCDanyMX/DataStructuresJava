package pruebas;

import entradasalida.ArchivoTexto;
import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;
import registros.texto.Encriptador;
import registros.texto.EsPalindromo;

/**
 * Clase de pruebas de PilaArchivoTXT
 * @author Daniel Alejandro Morales Castillo
 */
public class PruebaPilaArchivoTexto {
    public static void main(String args[]){

        Encriptador encriptador = new Encriptador();
        String salida=encriptador.encriptarTexto("Curso de Estructuras de datos",4,13,2,4);
        SalidaTerminal.consola("Su texto plano encriptado es: "+salida+"\n");
        String salida2=encriptador.desencriptar(salida);
        SalidaTerminal.consola("Su texto plano desencriptado es: "+salida2+"\n");


        ArchivoTexto nuevo = new ArchivoTexto();
        String archivo = "E:\\Programacion\\archivoprac13.txt";
        ArregloDatos nuevoarreglo = new ArregloDatos(3);
        nuevoarreglo.agregar("Daniel");
        nuevoarreglo.agregar("ED");
        nuevoarreglo.agregar("Clase de estructuras");
        nuevoarreglo.agregar("2021");

        ArchivoTexto.leer(archivo);
        ArchivoTexto.escribir(nuevoarreglo,archivo);

        Encriptador encriptador2 = new Encriptador();
        String salidatexto = encriptador2.encriptarTexto(archivo,4,13,2,4);
        SalidaTerminal.consola("Su texto plano encriptado es: "+salidatexto+"\n");
        String salidaencriptadorarchivo=encriptador.desencriptar(salidatexto);
        SalidaTerminal.consola("Su texto plano desencriptado es: "+salidaencriptadorarchivo+"\n");

        EsPalindromo palindromocomprobar = new EsPalindromo();
        palindromocomprobar.espalindromo("Daniel");  //No me funciona el metodo de palindromo






    }
}
