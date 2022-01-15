package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;
import estructuraslineales.ListaEncadenada;
import estructuraslineales.registros.Nodo;

/**
 *
 * @author Daniel Alejandro Morales Castillo
 */

public class PruebaListaEncadenada2 {
    public static void main(String[] args) {
        ListaEncadenada lista =new ListaEncadenada();

        lista.agregar("J");
        lista.agregar("R");
        lista.agregar("L");
        lista.agregar("E");

        lista.imprimir();
        SalidaTerminal.consola("\n");

        lista.agregarInicio("B");
        lista.agregarInicio("A");

        lista.imprimir();
        SalidaTerminal.consola("\n");

        //---

        SalidaTerminal.consola("Eliminando al inicio: "+ lista.eliminarInicio()+ "\n");

        lista.imprimir();
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Eliminando al final: "+ lista.eliminar()+ "\n");

        lista.imprimir();
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("obtener un valor por indice :" + lista.obtener(3));

        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Contar M's: " + lista.contarElementosIguales("M"));

        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Cambiar un valor: " + lista.cambiar("R","D",2));

        SalidaTerminal.consola("\n");
        lista.imprimir();
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Imprimir orden inverso:");
        lista.imprimirOrdenInverso();
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Buscar la J:" + lista.buscar("J"));
        SalidaTerminal.consola("\n");


       // ArregloDatos arreglo = new ArregloDatos(5);
        //lista.listaAArreglo();

       // ListaEncadenada lista2 =new ListaEncadenada();
        //lista2.rellenar("I",5);
        //lista2.imprimir();





        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Vaciar lista:");
        lista.vaciar();
        lista.imprimir();




    }
}
