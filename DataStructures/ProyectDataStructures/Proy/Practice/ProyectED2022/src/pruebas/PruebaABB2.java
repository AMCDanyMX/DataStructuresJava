package pruebas;

import entradasalida.SalidaTerminal;
import estructurasnolineales.ABB;

public class PruebaABB2 {
    public static  void main(String[] argumentos){
        ABB arbol=new ABB();

        arbol.agregar(8);
        arbol.agregar(3);
        arbol.agregar(10);
        arbol.agregar(14);
        arbol.agregar(13);
        arbol.agregar(1);
        arbol.agregar(6);
        arbol.agregar(4);
        arbol.agregar(7);


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
        SalidaTerminal.consola("Buscando a 10: "+ arbol.buscar(10)+ "\n");
        SalidaTerminal.consola("Buscando a 1: "+ arbol.buscar(1)+ "\n");

        //CASO1
        SalidaTerminal.consola("Eliminar a 1: ");
        arbol.eliminar(1);
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("InOrden: ");
        arbol.inOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("PreOrden: ");
        arbol.preOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Postorden: ");
        arbol.postOrden();
        //CASO2
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Eliminar a 14: ");
        arbol.eliminar(14);
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("InOrden: ");
        arbol.inOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("PreOrden: ");
        arbol.preOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Postorden: ");
        arbol.postOrden();
        //CASO3
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Eliminar a 8: ");
        arbol.eliminar(8);
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("InOrden: ");
        arbol.inOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("PreOrden: ");
        arbol.preOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Postorden: ");
        arbol.postOrden();

    }
}
