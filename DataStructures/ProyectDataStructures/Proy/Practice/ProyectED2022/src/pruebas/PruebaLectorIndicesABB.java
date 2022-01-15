package pruebas;

import entradasalida.SalidaTerminal;
import estructurasnolineales.ABB;
import estructurasnolineales.ArbolBBIndice;
import recursos.lectorarchivosindices.LectorDeIndices;

import java.io.IOException;

public class PruebaLectorIndicesABB {
    public static void main(String[] args) throws IOException {
        LectorDeIndices lector = new LectorDeIndices();
        ArbolBBIndice arbol = LectorDeIndices.lectorPosiciones();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("InOrden: ");
        arbol.inOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("PreOrden: ");
        arbol.preOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Postorden: ");
        arbol.postOrden();


        arbol.agregarnodo(44," Hardware ASUS");



    }
}
