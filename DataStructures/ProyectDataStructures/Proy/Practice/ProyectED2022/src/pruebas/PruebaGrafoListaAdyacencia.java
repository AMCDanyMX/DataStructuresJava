package pruebas;

import entradasalida.SalidaTerminal;
import estructurasnolineales.GrafoListaAdyacencia;

public class PruebaGrafoListaAdyacencia {
    public static void main(String[] args) {
        GrafoListaAdyacencia grafo= new GrafoListaAdyacencia();
        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");
        grafo.agregarVertice("E");
        grafo.agregarArista("A","B");
        grafo.agregarArista("B","C");
        grafo.agregarArista("C","D");
        grafo.agregarArista("E","F");
        grafo.agregarArista("F","G");
        grafo.imprimir();
        SalidaTerminal.consola("El recorrido en profundidad conexo del grafo es: ");
        grafo.recorridoProfundidad("B").imprimir();
        //grafo.GConexo("A");


        GrafoListaAdyacencia grafo2= new GrafoListaAdyacencia();
        grafo2.agregarVertice("A");
        grafo2.agregarVertice("B");
        grafo2.agregarVertice("C");
        grafo2.agregarVertice("D");
        grafo2.agregarVertice("E");
        grafo2.agregarArista("A","A");
        grafo2.agregarArista("D","B");
        grafo2.agregarArista("B","H");
        grafo2.agregarArista("D","C");
        grafo2.agregarArista("C","R");
        grafo2.agregarArista("R","H");
        grafo2.agregarArista("H","T");
        grafo2.imprimir();
        SalidaTerminal.consola("El recorrido en profundidad conexo del grafo es: ");
        grafo2.recorridoProfundidad("D").imprimir();
        //grafo.GConexo("B");
    }
}
