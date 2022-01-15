package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.Tabla2D;
import estructurasnolineales.GrafoMatriz;
import herramientas.generales.TipoOrden;

public class PruebaAlgoritmoPrim {
    public static void main(String[] args) {
        GrafoMatriz grafo=new GrafoMatriz(7, TipoOrden.DESC);

        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");
        grafo.agregarVertice("E");
        grafo.agregarVertice("F");
        grafo.agregarVertice("G");


        grafo.agregarArista("A","B",5.0);
        grafo.agregarArista("B","A",5.0);

        grafo.agregarArista("A","C",2.0);
        grafo.agregarArista("C","A",2.0);

        grafo.agregarArista("A","D",3.0);
        grafo.agregarArista("D","A",3.0);

        grafo.agregarArista("D","E",8.0);
        grafo.agregarArista("E","D",8.0);

        grafo.agregarArista("C","E",4.0);
        grafo.agregarArista("E","C",4.0);

        grafo.agregarArista("C","G",1.0);
        grafo.agregarArista("G","C",1.0);

        grafo.agregarArista("C","F",1.0);
        grafo.agregarArista("F","C",1.0);

        grafo.agregarArista("B","F",9.0);
        grafo.agregarArista("F","B",9.0);

        grafo.agregarArista("F","G",6.0);
        grafo.agregarArista("G","F",6.0);

        grafo.agregarArista("E","G",7.0);
        grafo.agregarArista("G","E",7.0);


        GrafoMatriz grafo2=new GrafoMatriz(7,TipoOrden.DESC);

        grafo2.agregarVertice("A");
        grafo2.agregarVertice("B");
        grafo2.agregarVertice("C");
        grafo2.agregarVertice("D");
        grafo2.agregarVertice("E");
        grafo2.agregarVertice("F");
        grafo2.agregarVertice("G");


        grafo2.agregarArista("A","B",5.0);
        grafo2.agregarArista("B","A",5.0);

        grafo2.agregarArista("A","C",2.0);
        grafo2.agregarArista("C","A",2.0);

        grafo2.agregarArista("A","D",3.0);
        grafo2.agregarArista("D","A",3.0);

        grafo2.agregarArista("D","E",8.0);
        grafo2.agregarArista("E","D",8.0);

        grafo2.agregarArista("C","E",4.0);
        grafo2.agregarArista("E","C",4.0);

        grafo2.agregarArista("C","G",1.0);
        grafo2.agregarArista("G","C",1.0);

        grafo2.agregarArista("C","F",1.0);
        grafo2.agregarArista("F","C",1.0);

        grafo2.agregarArista("B","F",9.0);
        grafo2.agregarArista("F","B",9.0);

        grafo2.agregarArista("F","G",6.0);
        grafo2.agregarArista("G","F",6.0);

        grafo2.agregarArista("E","G",7.0);
        grafo2.agregarArista("G","E",7.0);
        SalidaTerminal.consola("\n");


        grafo.distanciaMinimaPrim();
        SalidaTerminal.consola("\nDISTANCIA MINIMA HACIENDO USO DEL ALGORITMO DE PRIM\n");
        grafo.imprimir();

        Tabla2D matriz = grafo2.distanciaMinimaYAlmacenajePrim();
        SalidaTerminal.consola("\n EL MINIMO Y ALMACENARLOS VERTICES HACIENDO USO DEL ALGORITMO DE PRIM\n");
        matriz.imprimir();

        SalidaTerminal.consola("PRIM:");
        grafo.algoritmoPrim();

    }
}
