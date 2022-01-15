package pruebas;

import estructuraslineales.ListaEncadenada;
import estructuraslineales.ListaEncadenadaHash;
import estructuraslineales.Tabla2D;
import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;

/**
 *
 * @author Daniel Alejandro Morales Castillo
 */
public class PruebaListaEncadenadaHash {
    public static void main(String args[]){
        ListaEncadenadaHash lista = new ListaEncadenadaHash();
        lista.insertar(1,"Obi Wan Kenobi");
        lista.insertar(2,"Anakin Skywalker");
        lista.insertar(3,"Ashoka");
        lista.insertar(4,"Qui Gon Jinn");
        SalidaTerminal.consola("Imprimiendo la lista encadenada Hash\n");
        lista.imprimir();
        SalidaTerminal.consola("\nBuscando la clave 1: "+lista.buscar(1)+ "\n");
        SalidaTerminal.consola("Buscando el valor Ashoka: "+lista.buscarValor("Ashoka")+ "\n");
        SalidaTerminal.consola("Eliminando la clave 3: "+lista.eliminar(3)+ "\n");
        SalidaTerminal.consola("Imprimiendo la lista\n");
        lista.imprimir();
        SalidaTerminal.consola("\nAgregando Windu, Padme, Leia, Luke, Yoda.\n");
        lista.insertar(12,"Windu");
        lista.insertar(78,"Padme");
        lista.insertar(8,"Leia");
        lista.insertar(999,"Luke");
        lista.insertar(65,"Yoda");
        SalidaTerminal.consola("Imprimiendo la lista\n");
        lista.imprimir();
        SalidaTerminal.consola("\nEliminando el valor Padme\n");
        lista.eliminarValor("Padme");
        lista.imprimir();
        SalidaTerminal.consola("\nSubstituyendo el valor con clave 12 por Han Solo:"+lista.substituir(12,"Han Solo")+"\n");
        lista.imprimir();
        SalidaTerminal.consola("\nSubstituyendo Han Solo por Kylo Ren:"+lista.substituirValor("Han Solo","Kylo Ren")+"\n");
        SalidaTerminal.consola("Substituyendo Leia por Rey:"+lista.substituirValor("Leia","Rey")+"\n");
        lista.imprimir();
        SalidaTerminal.consola("\nContando cuantos elementos hay en la lista : "+lista.contarElementos()+"\n");
        ListaEncadenadaHash arreglos = lista.aArreglos();
        if(arreglos!=null){
            SalidaTerminal.consola("Método aArreglos\n");
            ArregloDatos arr1 = (ArregloDatos) arreglos.eliminarInicio();
            ArregloDatos arr2 = (ArregloDatos)arreglos.eliminarInicio();
            SalidaTerminal.consola("Arreglo 1 CLAVES\n");
            arr1.imprimir();
            SalidaTerminal.consola("Arreglo 2 VALORES\n");
            arr2.imprimir();
        }
        ListaEncadenadaHash listas = lista.aListas();
        if(listas!=null){
            SalidaTerminal.consola("\nMétodo aListas\n");
            ListaEncadenada lista1 = (ListaEncadenada)listas.eliminarInicio();
            ListaEncadenada lista2 = (ListaEncadenada)listas.eliminarInicio();
            SalidaTerminal.consola("Lista ligada 1 CLAVES\n");
            lista1.imprimir();
            SalidaTerminal.consola("\nLista ligada 2 VALORES\n");
            lista2.imprimir();
        }
        SalidaTerminal.consola("\nMétodo a matriz2D\n");
        Tabla2D matriz = lista.aMatriz2D();
        if(matriz!=null){
            SalidaTerminal.consola("Imprimiendo matriz\n");
            matriz.imprimir();
        }

    }
}