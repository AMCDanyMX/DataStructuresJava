package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ListaEncadenadaOrdenada;
import herramientas.comunes.TipoOrden;

/**
 * @author Daniel Alejandro Morales Castillo
 */

public class PruebaListaEncadenadaOrdenada {
    public static void main(String[] args) {

        TipoOrden orden1 =TipoOrden.ASC;
        TipoOrden orden2 =TipoOrden.DESC;

        ListaEncadenadaOrdenada lista =new ListaEncadenadaOrdenada(orden1);

        lista.agregarOrdenado(1);
        lista.agregarOrdenado(3);
        lista.agregarOrdenado(3);
        lista.agregarOrdenado(5);
        lista.agregarOrdenado(7);
        lista.agregarOrdenado(2);

        lista.imprimir();
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Buscando el 3: " + lista.buscar(3));
        SalidaTerminal.consola("\n");
        lista.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Imprimiendo inverso");
        lista.imprimirOrdenInverso();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Agregando el 6");
        SalidaTerminal.consola("\n");
        lista.agregar(6);

        lista.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Eliminando el 2");
        lista.eliminar(2);
        SalidaTerminal.consola("\n");
        lista.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Agregando el 9");
        lista.agregarOrdenado(9);
        SalidaTerminal.consola("\n");
        lista.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Eliminando el elemento del inicio");
        lista.eliminarInicio();
        SalidaTerminal.consola("\n");
        lista.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Eliminando el elemento del final");
        lista.eliminarFin();
        SalidaTerminal.consola("\n");
        lista.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("agregando el elemento al final");
        lista.agregarOrdenado(13);
        SalidaTerminal.consola("\n");
        lista.imprimir();













    }
}
