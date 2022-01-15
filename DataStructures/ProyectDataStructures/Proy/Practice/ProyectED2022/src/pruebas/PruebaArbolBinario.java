package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ListaEncadenada;
import estructurasnolineales.ArbolBinario;

public class PruebaArbolBinario {
    public static  void  main(String args[]){
        ArbolBinario arbol3 = new ArbolBinario();
        arbol3.crearArbol(); //crear un árbol a petición del usuario
        SalidaTerminal.consola("Altura del arbol: " +  arbol3.retornarAltura());
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Nodos y nivel del arbol: " );
        arbol3.imprimirConNivel();

        SalidaTerminal.consola("Nodos y nivel del arbol dado por usuario: " );
        arbol3.imprimirConNivelDado();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Contar nodos hoja");
        SalidaTerminal.consola("Nodos hoja:" + arbol3.contarNodosHoja());
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Contar nodos padre");
        SalidaTerminal.consola("Nodos padre:" + arbol3.contarNodosPadre());








    }
}
