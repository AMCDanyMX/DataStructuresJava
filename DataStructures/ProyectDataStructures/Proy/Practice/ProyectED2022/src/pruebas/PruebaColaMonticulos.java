package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ColaMonticulos;
import herramientas.comunes.Monticulos;
import herramientas.comunes.TipoOrden;

/**
 *
 * @author Daniel Alejandro Morales Castillo
 */
public class PruebaColaMonticulos{
    public static void main(String args[]){
        TipoOrden orden1 =TipoOrden.ASC;
        TipoOrden orden2 =TipoOrden.DESC;
        ColaMonticulos impresion = new ColaMonticulos(6,orden1);
        Monticulos nodo1=new Monticulos("descarga",20);
        Monticulos nodo2=new Monticulos("descarga",18);
        Monticulos nodo3=new Monticulos("descarga",9);
        Monticulos nodo4=new Monticulos("descarga",8);
        Monticulos nodo5=new Monticulos("descarga",10);
        Monticulos nodo6=new Monticulos("descarga",12);

        SalidaTerminal.consola("Agregando: "+nodo1+"\n");
        impresion.ponerEnCola(nodo1);
        SalidaTerminal.consola("Agregando: "+nodo2+"\n");
        impresion.ponerEnCola(nodo2);
        SalidaTerminal.consola("Agregando: "+nodo3+"\n");
        impresion.ponerEnCola(nodo3);
        SalidaTerminal.consola("Agregando: "+nodo4+"\n");
        impresion.ponerEnCola(nodo4);
        SalidaTerminal.consola("Agregando: "+nodo5+"\n");
        impresion.ponerEnCola(nodo5);
        SalidaTerminal.consola("Agregando: "+nodo6+"\n");
        impresion.ponerEnCola(nodo6);
        SalidaTerminal.consola("Imprimiendo la cola con prioridad de forma ascendente\n");
        impresion.imprimir();
        SalidaTerminal.consola("\n Borrando elemento\n");
        impresion.borrar();
        SalidaTerminal.consola("Imprimiendo la cola con prioridad sin la raiz\n");
        impresion.imprimir();
        SalidaTerminal.consola("\nBorrando elemento\n");
        impresion.borrar();
        SalidaTerminal.consola("Imprimiendo la cola con prioridad volviendo a eliminar\n");
        impresion.imprimir();

        SalidaTerminal.consola("\n");

        ColaMonticulos impresion2 = new ColaMonticulos(6,orden2);
        Monticulos nodo7=new Monticulos("impresion",20);
        Monticulos nodo8=new Monticulos("impresion",18);
        Monticulos nodo9=new Monticulos("impresion",9);
        Monticulos nodo10=new Monticulos("impresion",8);
        Monticulos nodo11=new Monticulos("impresion",10);
        Monticulos nodo12=new Monticulos("impresion",12);

        SalidaTerminal.consola("Agregando: "+nodo7+"\n");
        impresion2.ponerEnCola(nodo7);
        SalidaTerminal.consola("Agregando: "+nodo8+"\n");
        impresion2.ponerEnCola(nodo8);
        SalidaTerminal.consola("Agregando: "+nodo9+"\n");
        impresion2.ponerEnCola(nodo9);
        SalidaTerminal.consola("Agregando: "+nodo10+"\n");
        impresion2.ponerEnCola(nodo10);
        SalidaTerminal.consola("Agregando: "+nodo11+"\n");
        impresion2.ponerEnCola(nodo11);
        SalidaTerminal.consola("Agregando: "+nodo12+"\n");
        impresion2.ponerEnCola(nodo12);
        SalidaTerminal.consola("Imprimiendo la cola con prioridad de forma descendente\n");
        impresion2.imprimir();
        SalidaTerminal.consola("\nBorrando elemento\n");
        impresion2.borrar();
        SalidaTerminal.consola("Imprimiendo la cola con prioridad sin la raiz\n");
        impresion2.imprimir();
        SalidaTerminal.consola("\nBorrando elemento\n");
        impresion2.borrar();
        SalidaTerminal.consola("Imprimiendo la cola con prioridad volviendo a eliminar\n");
        impresion2.imprimir();

    }
}
