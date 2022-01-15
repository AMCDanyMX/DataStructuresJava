/** @autor Daniel Alejandro Morales Castillo
 *@autor Y Profesor Aldonso en clase de ED
 */

package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;

public class PruebaArregloPrac2 {
    public static void main(String argumentos[]){
        ArregloDatos arreglo=new ArregloDatos(4);

        arreglo.agregar("A");
        arreglo.agregar("B");
        arreglo.agregar("D");   //llenando arreglo
        arreglo.agregar("E");
        arreglo.agregar("H");


        ArregloDatos listaDatos2= new ArregloDatos(4);

        listaDatos2.agregar("G");   //llenando arreglo listaDatos2
        listaDatos2.agregar("R");
        listaDatos2.agregar("P");
        listaDatos2.agregar("L");
        listaDatos2.agregar("W");

        arreglo.imprimir();
        SalidaTerminal.consola("\n");
        arreglo.imprimirOrdenInverso();   //imprimiendo orden  inverso
        SalidaTerminal.consola("\n");

        arreglo.eliminar("B");       //eliminar elemento
        arreglo.imprimirOrdenInverso();
        SalidaTerminal.consola("\n");

        Integer resultadoB= (Integer)arreglo.buscar("E");
        SalidaTerminal.consola("Posicion de E: "+resultadoB+"\n");

        Integer resultadoB2= (Integer)arreglo.buscar("G");
        SalidaTerminal.consola("Posicion de G: "+resultadoB2+"\n");



        SalidaTerminal.consola("Obteniendo longitud de arreglo: "+ arreglo.capacidad());
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Obteniendo longitud de listaDatos2: "+ listaDatos2.capacidad());
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Obteniendo numm de elementos de arreglo: "+ arreglo.cantidadElementos());
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Obteniendo num de elementos de listaDatos2: "+ listaDatos2.cantidadElementos());
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Imprimir listaDatos2: ");
        SalidaTerminal.consola("\n");
        listaDatos2.imprimir();
        SalidaTerminal.consola("\n");


        SalidaTerminal.consola("Los arreglos 1 y 2 son iguales?: ");
        SalidaTerminal.consola3(arreglo.esIgual(listaDatos2));
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Obtener elemento de arreglo en posicion 1: ");
        SalidaTerminal.consola((String) arreglo.obtener(1));
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Obtener elemento de lista2 en posicion 2: ");
        SalidaTerminal.consola((String) listaDatos2.obtener(2));
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Cambiando elemento viejo de arreglo,  A por Z: ");
        SalidaTerminal.consola("\n");
        arreglo.cambiar("A","Z",2);
        arreglo.imprimir();

        SalidaTerminal.consola("Cambiando elemento viejo de lista2,  R por A: ");
        SalidaTerminal.consola("\n");
        listaDatos2.cambiar("R","A",2);
        listaDatos2.imprimir();

        SalidaTerminal.consola("Cambiando un dato de listaDatos2 por su indice: ");
        SalidaTerminal.consola("\n");
        listaDatos2.cambiar(1,"F");
        listaDatos2.imprimir();

        SalidaTerminal.consola("Buscar valores : "+ arreglo.buscarValores("B"));
        SalidaTerminal.consola("\n");


        SalidaTerminal.consola("Eliminar elemento por indice 2 en arreglo: ");
        SalidaTerminal.consola("\n");
        arreglo.eliminar(2);
        arreglo.imprimir();


        SalidaTerminal.consola("eliminando ultimo dato : "+ listaDatos2.eliminar());
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("vaciando arreglo : ");
        arreglo.vaciar();
        arreglo.imprimir();

        SalidaTerminal.consola("Nuevo arreglo desde 0 despues de vaciar: ");
        SalidaTerminal.consola("\n");
        arreglo.agregar("U");
        arreglo.imprimir();


        SalidaTerminal.consola("Agregar lista: "+ arreglo.agregarLista(listaDatos2));
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Invirtiendo listaDatos2: ");
        SalidaTerminal.consola("\n");
        listaDatos2.imprimir();
        listaDatos2.invertir();
        SalidaTerminal.consola("\n");
        listaDatos2.imprimir();



        SalidaTerminal.consola("Contar valores P: "+ listaDatos2.contar("P"));
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Rellenar listaDatos2 con elemento: ");
        SalidaTerminal.consola("\n");
        listaDatos2.rellenar("K",3);
        listaDatos2.imprimir();

        arreglo.clonar();



    }
}
