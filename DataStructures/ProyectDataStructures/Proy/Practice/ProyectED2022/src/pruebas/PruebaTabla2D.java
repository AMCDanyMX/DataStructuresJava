package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;
import estructuraslineales.Tabla2D;
import herramientas.comunes.TipoColumna;

public class PruebaTabla2D {
    public static void main(String args[]) {
        Tabla2D tabla2D = new Tabla2D(3, 3);
        tabla2D.asignarCelda(0, 0, 3);
        tabla2D.asignarCelda(0, 1, 2);
        tabla2D.asignarCelda(0, 2, 1);
        tabla2D.asignarCelda(1, 0, 5);
        tabla2D.asignarCelda(1, 1, 6);
        tabla2D.asignarCelda(1, 2, 7);
        tabla2D.asignarCelda(2, 0, 8);
        tabla2D.asignarCelda(2, 1, 1);
        tabla2D.asignarCelda(2, 2, 2);


        Tabla2D tabla2D1 = new Tabla2D(2, 2);
        tabla2D.asignarCelda(0, 0, 1);
        tabla2D.asignarCelda(0, 1, 2);
        tabla2D.asignarCelda(0, 2, 3);
        tabla2D.asignarCelda(1, 0, 4);
        tabla2D.asignarCelda(1, 1, 5);

        tabla2D.imprimir();

        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Obtener celda de mi tabla2D fila:0 columna:1\n");
        tabla2D.obtenerCelda(0, 1);


        SalidaTerminal.consola("Asignando el 7 en 1,1\n");
        tabla2D.asignarCelda(1, 1, 7);
        tabla2D.imprimir();


        SalidaTerminal.consola3(tabla2D.asignarCelda(1, 1, 7));

        SalidaTerminal.consola("\nNumero de filas\n");
        SalidaTerminal.consola2(tabla2D.getFilas());
        SalidaTerminal.consola("\nNumero de columnas\n");
        SalidaTerminal.consola2(tabla2D.getColumnas());
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("\nImprimir por filas\n");
        tabla2D.imprimirR();


        SalidaTerminal.consola("\nImprimir por columnas\n");
        tabla2D.imprimirC();

        SalidaTerminal.consola("\nIAplicar transpuesta\n");
        tabla2D.aplicarTanspuesta();
        tabla2D.imprimir();


        SalidaTerminal.consola("\nInicializar matriz\n");
        tabla2D.rellenar(4);
        tabla2D.imprimir();

        SalidaTerminal.consola("\nCopiar matriz\n");
        Tabla2D clonada = tabla2D.clonar();
        clonada.imprimir();
        boolean respuesta = tabla2D.esIgual(clonada);
        SalidaTerminal.consola("\n¿Son iguales?\n" + respuesta +"\n");


        tabla2D.vectorColumna(3, 5);

        tabla2D.redefinirTabla(tabla2D1);
        tabla2D.imprimir();

        SalidaTerminal.consola("\nPoniendo areglo como renglones\n" + respuesta +"\n");
        ArregloDatos arreglo1 = new ArregloDatos(3);
        arreglo1.agregar(1);
        arreglo1.agregar(2);
        arreglo1.agregar(3);

        tabla2D.agregarFila(arreglo1);
        tabla2D.imprimir();

        SalidaTerminal.consola("\nPoniendo areglo como columnas\n" + respuesta +"\n");
        ArregloDatos arreglo2 = new ArregloDatos(3);
        arreglo2.agregar(2);
        arreglo2.agregar(4);
        arreglo2.agregar(5);

        tabla2D.agregarColumna(arreglo2);
        tabla2D.imprimir();

        SalidaTerminal.consola("\nQuitar columna\n" + respuesta +"\n");
        tabla2D.quitarColumna(TipoColumna.DER);
        tabla2D.imprimir();



    }
}
