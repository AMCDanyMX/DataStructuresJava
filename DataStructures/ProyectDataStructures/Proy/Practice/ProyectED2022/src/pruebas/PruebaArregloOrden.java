/**
 * @author Daniel Alejandro Morales Castillo
 */

package pruebas;

import estructuraslineales.ArregloOrden;
import herramientas.comunes.TipoOrden;
import entradasalida.SalidaTerminal;

public class PruebaArregloOrden{
    public static void main(String args[]){

        TipoOrden orden1 =TipoOrden.ASC;
        TipoOrden orden2 =TipoOrden.DESC;

        ArregloOrden arreglo=new ArregloOrden(7,orden1);


        SalidaTerminal.consola("El arreglo ordenado es el siguiente: \n");
        arreglo.agregar(5);
        arreglo.agregar(2);
        arreglo.agregar(8);
        arreglo.agregar(6);

        arreglo.imprimirOrdenInverso();

        SalidaTerminal.consola("Agregar el 1 \n");
        arreglo.agregar(1);
        arreglo.imprimirOrdenInverso();

        SalidaTerminal.consola("Buscando el 2 \n");

        SalidaTerminal.consola(arreglo.buscar(2)+"\n");

        SalidaTerminal.consola("Buscando el 9 \n");

        SalidaTerminal.consola(arreglo.buscar(9)+"\n");

        SalidaTerminal.consola("Cambiando el elemento en la posicion 2 \n");
        arreglo.cambiar(2,3,2);
        arreglo.imprimirOrdenInverso();


        SalidaTerminal.consola("Eliminando el elemento de posicion 1 \n");
        arreglo.eliminar(1);

        arreglo.imprimirOrdenInverso();

        SalidaTerminal.consola("Creando lista 2: \n");
        ArregloOrden arreglo2 = new ArregloOrden(7,orden1);
        arreglo2.agregar(10);
        arreglo2.agregar(9);
        arreglo2.imprimir();

        SalidaTerminal.consola("Agregando lista 2 a arreglo 1: \n");
        arreglo.agregarLista(arreglo2);
        arreglo.imprimir();

        SalidaTerminal.consola("Inviertiendo el arreglo \n");
        arreglo.invertir();
        arreglo.imprimir();


        SalidaTerminal.consola("Insertar elemento 7 en posicion del 6\n");
        arreglo.insertar(3,7);
        arreglo.imprimir();

        SalidaTerminal.consola("Copiando la lista 2 en 1 \n");
        arreglo.copiarLista(arreglo2);
        arreglo2.imprimir();


    }
}
