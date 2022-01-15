package pruebas;

import entradasalida.SalidaTerminal;
import estructurasnolineales.GrafoMatriz;
import herramientas.generales.TipoOrden;

public class PruebaGrafoMatrizPrac28 {
    public static void main(String[] args) {
        GrafoMatriz grafo=new GrafoMatriz(8, TipoOrden.DESC);

        grafo.agregarVertice("K");
        grafo.agregarVertice("L");
        grafo.agregarVertice("M");
        grafo.agregarVertice("N");
        grafo.agregarVertice("O");
        grafo.agregarVertice("P");
        grafo.agregarVertice("Q");
        grafo.agregarVertice("R");

        grafo.agregarArista("K","L",9.0);
        grafo.agregarArista("L","K",2.0);

        grafo.agregarArista("K","M",2.0);
        grafo.agregarArista("M","K",2.0);

        grafo.agregarArista("L","N",3.0);
        grafo.agregarArista("N","L",3.0);

        grafo.agregarArista("C","D",7.0);
        grafo.agregarArista("D","C",7.0);

        grafo.agregarArista("l","Q",6.0);
        grafo.agregarArista("Q","L",6.0);

        grafo.agregarArista("N","O",5.0);
        grafo.agregarArista("E","N",5.0);

        grafo.agregarArista("C","Q",3.0);
        grafo.agregarArista("Q","C",3.0);

        grafo.agregarArista("O","Q",2.0);
        grafo.agregarArista("Q","O",2.0);

        grafo.agregarArista("O","P",4.0);
        grafo.agregarArista("P","O",4.0);

        grafo.agregarArista("O","R",3.0);
        grafo.agregarArista("R","O",3.0);

        grafo.agregarArista("Q","R",2.0);
        grafo.agregarArista("Q","R",2.0);

        SalidaTerminal.consola("El grafo: \n");
        grafo.imprimir();
        SalidaTerminal.consola("\n");
        //SalidaTerminal.consola("Ordenación topológica: ");
        //grafo.ordenacionTopologica().imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola(" es multigrafo?" + grafo.esMultigrafo());
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Eliminar un vertice L: ");
        grafo.eliminarVertice("L");
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Imprimiendo grafo:");
        grafo.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola(" es adyacente?" + grafo.esAdyacente("R","O"));
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Eliminar ARISTA : ");
        grafo.eliminarArista("P","O");
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Imprimiendo grafo:");
        grafo.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola(" es pseudografo?" + grafo.esPseudografo());
        SalidaTerminal.consola("\n");
       // SalidaTerminal.consola(" es multigrafo?" + grafo.esMultigrafo());
       // SalidaTerminal.consola("\n");
        SalidaTerminal.consola(" grado vertice" + grafo.gradoVertice("C"));
        SalidaTerminal.consola("\n");
       // SalidaTerminal.consola(" es conexo?" + grafo.esConexo("K"));
        //SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Buscar vertice R ");
        grafo.buscarVertice("R");





    }
}
