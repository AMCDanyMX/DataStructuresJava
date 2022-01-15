package pruebas;

import entradasalida.SalidaTerminal;
import estructurasnolineales.ABB;

public class PruebaABB3 {
    public static void main(String[] args) {
        ABB arbol=new ABB();

        arbol.agregar(8);
        arbol.agregar(3);
        arbol.agregar(1);
        arbol.agregar(6);
        arbol.agregar(4);
        arbol.agregar(7);
        arbol.agregar(10);
        arbol.agregar(14);
        arbol.agregar(13);

        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("InOrden: ");
        arbol.inOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("PreOrden: ");
        arbol.preOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Postorden: ");
        arbol.postOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("inorden sin recursion:");
        arbol.inOrdenSinRecursion();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Recorrido de anchura con cola:");
        arbol.recorridoAnchuraCola(9);
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Recorrido de amplitud con pila:");
        arbol.recorridoAnchuraPila();
    }
}
