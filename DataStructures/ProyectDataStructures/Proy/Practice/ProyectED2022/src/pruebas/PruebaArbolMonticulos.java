package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ArbolMonticulos;
import herramientas.comunes.Monticulos;
import herramientas.comunes.TipoOrden;

public class PruebaArbolMonticulos {
    public static void main(String[] args) {
        TipoOrden orden1 =TipoOrden.ASC;
        TipoOrden orden2 =TipoOrden.DESC;
        ArbolMonticulos impresion = new ArbolMonticulos(orden1);

        SalidaTerminal.consola("Arbol con monticulos ");
        Monticulos nodo1=new Monticulos("descarga",20);
        Monticulos nodo2=new Monticulos("descarga",18);
        Monticulos nodo3=new Monticulos("descarga",9);
        Monticulos nodo4=new Monticulos("descarga",8);
        Monticulos nodo5=new Monticulos("descarga",10);
        Monticulos nodo6=new Monticulos("descarga",12);

        impresion.agregar(nodo1);
        impresion.agregar(nodo2);
        impresion.agregar(nodo3);
        impresion.agregar(nodo4);
        impresion.agregar(nodo5);
        impresion.agregar(nodo6);

        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("InOrden: ");
        impresion.inOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("PreOrden: ");
        impresion.preOrden();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Postorden: ");
        impresion.postOrden();

        SalidaTerminal.consola("\n");

    }
}
