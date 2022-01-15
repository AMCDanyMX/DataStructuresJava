package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ListaEncadenadaDoble;


/**
 *
 * @author Daniel Alejandro Morales Castillo
 */

public class PruebaListaEncadenadaDoble {
    public static void main(String[] args) {
        ListaEncadenadaDoble listaDL = new ListaEncadenadaDoble();
        listaDL.insertarInicio(19);
        listaDL.insertarInicio(22);
        listaDL.insertarInicio(13);
        listaDL.insertarInicio(65);
        listaDL.insertarInicio(2);
        SalidaTerminal.consola("Imprimiendo la lista en orden inverso\n");
        listaDL.imprimirOrdenInverso();
        SalidaTerminal.consola("\nImprimiendo la lista de manera normal\n");
        listaDL.imprimir();
        SalidaTerminal.consola("\nRevisando si está llena\n");
        boolean llena = listaDL.llena();
        SalidaTerminal.consola(""+llena);
        SalidaTerminal.consola("\nAgregando el 35\n");
        listaDL.agregar(35);
        SalidaTerminal.consola("Imprimiendo la lista\n");
        listaDL.imprimir();
        SalidaTerminal.consola("\nBuscando el 22\n");
        Object buscar = listaDL.buscar(22);
        SalidaTerminal.consola("Se encontró: "+buscar);
        SalidaTerminal.consola("\nEliminar 65\n");
        listaDL.eliminar(65);
        listaDL.imprimir();
        SalidaTerminal.consola("\nContando los valores con el valor 13\n");
        int contar = listaDL.contar(13);
        SalidaTerminal.consola(""+contar);
        SalidaTerminal.consola("\nRellenando 3 espacios con 7\n");
        listaDL.rellenar(7,3);
        listaDL.imprimir();
        SalidaTerminal.consola("\nAgregando : 77 y 99\n");
        listaDL.agregar(77);
        listaDL.agregar(99);
        listaDL.imprimir();
        SalidaTerminal.consola("\nAgregando un elemento(47) al inicio de la lista\n");
        listaDL.insertarInicio(47);
        listaDL.imprimir();

        SalidaTerminal.consola("\nEliminando elemento de inicio de la lista\n");
        listaDL.eliminarInicio();
        listaDL.imprimir();


        SalidaTerminal.consola("\nBuscando elemento desde el final\n");
        SalidaTerminal.consola("" + listaDL.buscarDesdeFinal(19));


        ListaEncadenadaDoble listacadenas = new ListaEncadenadaDoble();
        listaDL.insertarInicio("Foca");
        listaDL.insertarInicio("Perro");
        listaDL.insertarInicio("Jirafa");
        listaDL.insertarInicio("Cerdo");
        listaDL.insertarInicio("Oso");

        //alumno
        ListaEncadenadaDoble califs1=new ListaEncadenadaDoble();
        califs1.insertarInicio(5.0);
        califs1.insertarInicio(8.0);
        califs1.insertarInicio(10.0);
        califs1.insertarInicio(9.0);


        ListaEncadenadaDoble laslistas = new ListaEncadenadaDoble();
        SalidaTerminal.consola("\nSacando listas\n");
        laslistas.lasListas(listaDL,listacadenas, califs1);




    }
}
