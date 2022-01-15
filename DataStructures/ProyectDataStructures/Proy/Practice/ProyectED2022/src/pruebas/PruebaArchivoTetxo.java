package pruebas;

import entradasalida.SalidaTerminal;
import entradasalida.archivos.ArchivoTextoD;
import estructuraslineales.ArregloDatos;
import estructuraslineales.ArregloNumeros;

public class PruebaArchivoTetxo {
    public static void main(String[] args) {

        ArregloNumeros x = ArchivoTextoD.leerNumeros("E:\\Programacion\\EstructurasDatos2021ED\\Practica21\\Practica21\\Practica21\\ProyectoED2021\\src\\entradasalida\\valoresx.txt");
        SalidaTerminal.consola("" );
        x.imprimir();

    }
}
