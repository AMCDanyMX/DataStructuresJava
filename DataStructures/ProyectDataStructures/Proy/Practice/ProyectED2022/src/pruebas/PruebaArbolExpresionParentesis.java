package pruebas;

import entradasalida.SalidaTerminal;
import estructurasnolineales.ArbolBinario;

public class PruebaArbolExpresionParentesis {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        //cracion de arbol con una expresion qque le pasamos como parametro
        arbol.crearArbolDeExpresiones(" (((a*c) + (e / g)) – (b + d)) ");
        //Salidas
        SalidaTerminal.consola("InOrden\n");
        arbol.inOrden();
        SalidaTerminal.consola("\nPreOrden\n");
        arbol.preOrden();
        SalidaTerminal.consola("\nPostOrden\n");
        arbol.postOrden();
    }
}
