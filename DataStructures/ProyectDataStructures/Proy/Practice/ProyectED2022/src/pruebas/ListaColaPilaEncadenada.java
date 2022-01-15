package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ColaMonticulos;
import estructuraslineales.ListaCola;
import estructuraslineales.ListaEncadenada;
import estructuraslineales.ListaPila;
import herramientas.comunes.Monticulos;
import herramientas.comunes.TipoOrden;

/**
 *
 * @author Daniel Alejandro Morales Castillo
 */

public class ListaColaPilaEncadenada {
    public static void main(String[] args) {
        ListaCola nuevalistacola = new ListaCola();
        nuevalistacola.agregar('I');
        nuevalistacola.agregar('H');
        nuevalistacola.agregar('A');
        nuevalistacola.agregar('D');

        SalidaTerminal.consola("Ejemplo de listaCola\n");
        SalidaTerminal.consola("\n");
        nuevalistacola.imprimir();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Quitando elemento: "+nuevalistacola.eliminar());
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Agregando elemento: ");
        nuevalistacola.agregar('U');
        SalidaTerminal.consola("\n");
        nuevalistacola.imprimir();

        SalidaTerminal.consola("\n");

        ListaPila nuevalistapila  = new ListaPila();
        nuevalistapila.agregar('D');
        nuevalistapila.agregar('A');
        nuevalistapila.agregar('N');
        nuevalistapila.agregar('I');
        nuevalistapila.agregar('E');
        nuevalistapila.agregar('L');

        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Ejemplo de listaPila\n");
        nuevalistapila.imprimir();

        SalidaTerminal.consola("\n");

        TipoOrden orden1 =TipoOrden.ASC;
        TipoOrden orden2 =TipoOrden.DESC;
        ColaMonticulos impresion = new ColaMonticulos(6,orden1);
        Monticulos nodo1=new Monticulos("descarga",20);
        Monticulos nodo2=new Monticulos("descarga",18);
        Monticulos nodo3=new Monticulos("descarga",9);
        Monticulos nodo4=new Monticulos("descarga",8);
        Monticulos nodo5=new Monticulos("descarga",10);
        Monticulos nodo6=new Monticulos("descarga",12);

        ColaMonticulos impresion2 = new ColaMonticulos(6,orden2);
        Monticulos nodo7=new Monticulos("descarga",20);
        Monticulos nodo8=new Monticulos("descarga",18);
        Monticulos nodo9=new Monticulos("descarga",9);
        Monticulos nodo10=new Monticulos("descarga",8);
        Monticulos nodo11=new Monticulos("descarga",10);
        Monticulos nodo12=new Monticulos("descarga",12);

        ListaPila listademonticulosasce  = new ListaPila();
        listademonticulosasce.agregar(nodo1);
        listademonticulosasce.agregar(nodo2);
        listademonticulosasce.agregar(nodo3);
        listademonticulosasce.agregar(nodo4);
        listademonticulosasce.agregar(nodo5);
        listademonticulosasce.agregar(nodo6);

        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Ejemplo de listaConMonticulos\n");
        listademonticulosasce.imprimir();

        SalidaTerminal.consola("\n");

        ListaCola listademonticulosdesce  = new ListaCola();
        listademonticulosdesce.agregar(nodo7);
        listademonticulosdesce.agregar(nodo8);
        listademonticulosdesce.agregar(nodo9);
        listademonticulosdesce.agregar(nodo10);
        listademonticulosdesce.agregar(nodo11);
        listademonticulosdesce.agregar(nodo12);
        listademonticulosdesce.imprimir();




    }
}
