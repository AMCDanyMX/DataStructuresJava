package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ListaEncadenada;

public class PruebaListaRecursiva {
    public static void main(String[] args) {
        ListaEncadenada lista = new ListaEncadenada();
        lista.agregarInicio(55);
        lista.agregarInicio(66);
        lista.agregarInicio(58);
        lista.agregarInicio(43);
        lista.agregar(63);
        lista.agregar(10);
        lista.agregar(2);

        lista.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Buscando el 63 de manera recursiva: "+lista.buscarRecursivo(63));
        SalidaTerminal.consola("\nEliminando el 58 de manera recursiva: "+lista.eliminarRecursivo(58)+"\n");
        lista.imprimir();
        SalidaTerminal.consola("\nEliminando el tope usando recursion: "+lista.eliminarTopeRecursivo()+"\n");
        lista.imprimir();
        SalidaTerminal.consola("\nContando elementos recursivamente: "+lista.contarRecursivo()+"\n");
        lista.imprimir();
        SalidaTerminal.consola("\nImprimiendo de manera recursiva:\n");
        lista.imprimirRecursivo();
    }
}
