package pruebas;

import entradasalida.SalidaTerminal;
import estructurasnolineales.GrafoMatriz;
import herramientas.generales.TipoOrden;

public class PruebaPRMC {
    public static  void main(String[] argumentos){
        GrafoMatriz grafo=new GrafoMatriz(8, TipoOrden.DESC);

        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");
        grafo.agregarVertice("E");
        grafo.agregarVertice("F");
        grafo.agregarVertice("G");
        grafo.agregarVertice("H");

        grafo.agregarArista("A","B",7.0);
        grafo.agregarArista("B","A",7.0);

        grafo.agregarArista("A","c",5.0);
        grafo.agregarArista("c","A",5.0);

        grafo.agregarArista("B","D",2.0);
        grafo.agregarArista("D","B",2.0);

        grafo.agregarArista("C","D",9.0);
        grafo.agregarArista("D","C",9.0);

        grafo.agregarArista("B","F",6.0);
        grafo.agregarArista("F","B",6.0);

        grafo.agregarArista("D","E",1.0);
        grafo.agregarArista("E","D",1.0);

        grafo.agregarArista("C","G",3.0);
        grafo.agregarArista("G","C",3.0);

        grafo.agregarArista("E","G",3.0);
        grafo.agregarArista("G","E",3.0);

        grafo.agregarArista("E","F",8.0);
        grafo.agregarArista("F","E",8.0);

        grafo.agregarArista("F","H",4.0);
        grafo.agregarArista("H","F",4.0);

        grafo.agregarArista("G","H",7.0);
        grafo.agregarArista("H","G",7.0);

        SalidaTerminal.consola("El grafo: \n");
        grafo.imprimir();
        SalidaTerminal.consola("\n");
    }
}
