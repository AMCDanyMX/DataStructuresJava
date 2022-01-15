package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;
import estructuraslineales.ListaEncadenada;

public class PruebaArregloRecursivo {
    public static void main(String[] args) {
        ArregloDatos arreglo=new ArregloDatos(6);

        arreglo.agregar(77);
        arreglo.agregar(18);
        arreglo.agregar(4);
        arreglo.agregar(1);
        arreglo.agregar(2);
        arreglo.agregar(7);

        SalidaTerminal.consola("\nImprimiendo arreglo usando recursion\n");
        arreglo.imprimirRRecursivo();

        SalidaTerminal.consola("\nBuscando el 4 de manera recursiva\n");
        SalidaTerminal.consola(""+arreglo.buscarRR(4));

        SalidaTerminal.consola("\nEliminando el 1 de manera recursiva\n");
        SalidaTerminal.consola(""+arreglo.eliminarRR(1)+"\n"+"\n");

        ArregloDatos arreglo2 = arreglo.buscarValoresRecursivo(16);
        arreglo.imprimirRRecursivo();
        SalidaTerminal.consola("\nInvertir arreglo recursivamente\n");
        arreglo.invertirRR();

        SalidaTerminal.consola("\nContando cuantas veces esta el 7: "+arreglo.contarRR(7));
        SalidaTerminal.consola("\nImprimiendo de manera recursiva: \n");
        arreglo.imprimirRecursivo();
        SalidaTerminal.consola("\nProbando arreglo a lista ligada\n");
        ListaEncadenada lista = arreglo.arregloAListaRR();
        lista.imprimir();
    }
}
