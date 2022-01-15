package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ListaEncadenada;
import estructurasnolineales.ArbolBinario;

public class PruebaArbolProfe {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.crearArbol(); //crear un árbol a petición del usuario
        //("x + (resta / 4) * y ^ 2")
        SalidaTerminal.consola("\nImpresión en inOrden: \n");
        arbol.inOrden();
        SalidaTerminal.consola("\nImpresión en preOrden: \n");
        arbol.preOrden();
        SalidaTerminal.consola("\nImpresión en postOrden: \n");

        SalidaTerminal.consola("\n");
        ListaEncadenada operadores = arbol.extraerOperadores();
        ListaEncadenada operandos = arbol.extraerOperandos();
        SalidaTerminal.consola("Todos los operadores que contiene el árbol:\n");
        operadores.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Todos los operandos que contiene el árbol:\n");
        operandos.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Ahora a reemplazar las variables\n");
        arbol.reemplazar();
        SalidaTerminal.consola("\nPreOrden arbol reemplazo\n");
        arbol.preOrden();
        SalidaTerminal.consola("\nPostOrden arbol reemplazo\n");
        arbol.postOrden();
        SalidaTerminal.consola("\nInOrden arbol reemplazo\n");
        arbol.inOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Nodos hoja que contiene el árbol: "+arbol.contarNodosHoja()+"\n");
        SalidaTerminal.consola("Nodos padre que contiene el árbol: "+arbol.contarNodosPadre()+"\n");
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("La altura del arbol es:" + arbol.retornarAltura());





    }
}
