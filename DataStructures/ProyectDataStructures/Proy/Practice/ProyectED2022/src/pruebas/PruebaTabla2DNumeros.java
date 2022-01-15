/**
 *
 * @author Daniel Alejandro Morales Castillo
 *
 */
package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.Tabla2D;
import estructuraslineales.Tabla2DNumeros;
import herramientas.comunes.TipoLogaritmo;
//clase PruebaTabla2DNumeros
public class PruebaTabla2DNumeros {
    public static void main(String[] args) {
        SalidaTerminal.consola("Constructor iniciado con 0\n");
        //constructor 1
        Tabla2DNumeros matriznumeros = new Tabla2DNumeros(2,2);
        matriznumeros.imprimir();

        SalidaTerminal.consola("Tabla2D creada con valores\n");
        Tabla2DNumeros tabla2D = new Tabla2DNumeros(2, 2);
        tabla2D.asignarCelda(0, 0, 2);                        //INSTANCIAS Y PRUEBAS
        tabla2D.asignarCelda(0, 1, 3);
        tabla2D.asignarCelda(1, 1, 1);
        tabla2D.asignarCelda(1, 0, 1);
        tabla2D.imprimir();

        SalidaTerminal.consola("Segunda Tabla2D creada con valores\n");
        Tabla2DNumeros tabla2D1 = new Tabla2DNumeros(2, 2);
        tabla2D1.asignarCelda(0, 0, 1);
        tabla2D1.asignarCelda(0, 1, 5);
        tabla2D1.asignarCelda(1, 1, 2);
        tabla2D1.asignarCelda(1, 0, 6);
        tabla2D1.imprimir();

        SalidaTerminal.consola("Multiplicar por escalar\n");
        tabla2D.xEscalar(2.0);
        tabla2D.imprimir();

        SalidaTerminal.consola("Sumar escalar a segunda matriz\n");
        tabla2D1.sumarEscalar(8);
        tabla2D1.imprimir();

        SalidaTerminal.consola("Multiplicar 2 matrices,  matriz 1 x matriz2\n");
        SalidaTerminal.consola("Tabla2D creada con valores\n");
        Tabla2DNumeros tabla2D3 = new Tabla2DNumeros(2, 2);
        tabla2D3.asignarCelda(0, 0, 2);
        tabla2D3.asignarCelda(0, 1, 3);
        tabla2D3.asignarCelda(1, 1, 1);
        tabla2D3.asignarCelda(1, 0, 1);
        tabla2D3.imprimir();

        SalidaTerminal.consola("Segunda Tabla2D creada con valores\n");
        Tabla2DNumeros tabla2D4 = new Tabla2DNumeros(2, 2);
        tabla2D4.asignarCelda(0, 0, 1);
        tabla2D4.asignarCelda(0, 1, 5);
        tabla2D4.asignarCelda(1, 1, 2);
        tabla2D4.asignarCelda(1, 0, 6);
        tabla2D4.imprimir();

        SalidaTerminal.consola("Se multiplicó: "+tabla2D3.multiplicar(tabla2D4)+"\n");

        SalidaTerminal.consola("Sumar matrices 1 y 2\n");
        tabla2D3.imprimir();
        tabla2D4.imprimir();

        SalidaTerminal.consola("Se sumaron: "+tabla2D3.sumar(tabla2D4)+"\n");

        SalidaTerminal.consola("Elevar matriz a potencia\n");
        SalidaTerminal.consola("Tabla2D creada con valores\n");
        Tabla2DNumeros tabla2D5 = new Tabla2DNumeros(2, 2);
        tabla2D5.asignarCelda(0, 0, 2);
        tabla2D5.asignarCelda(0, 1, 3);
        tabla2D5.asignarCelda(1, 1, 1);
        tabla2D5.asignarCelda(1, 0, 1);
        tabla2D5.imprimir();
        SalidaTerminal.consola("Potencia 2\n");
        tabla2D5.potenciaExE(2);
        tabla2D5.imprimir();

        SalidaTerminal.consola("Logaritmo en matriz a base 10\n");
        tabla2D5.imprimir();

        tabla2D5.aplicarLog(TipoLogaritmo.BASE10);
        tabla2D5.imprimir();

        SalidaTerminal.consola("Matriz con 0s creada y aplicamos la diagonal con valor dado\n");
        Tabla2DNumeros tabla6 = new Tabla2DNumeros(3,3);
        tabla6.imprimir();
        SalidaTerminal.consola("Diagonal de 3s\n");
        tabla6.matrizDiagonal(3);
        tabla6.imprimir();

        SalidaTerminal.consola("Tabla2D creada con valores\n");
        Tabla2DNumeros tabla2D7 = new Tabla2DNumeros(2, 2);
        tabla2D7.asignarCelda(0, 0, 2);
        tabla2D7.asignarCelda(0, 1, 3);
        tabla2D7.asignarCelda(1, 1, 1);
        tabla2D7.asignarCelda(1, 0, 1);
        tabla2D7.imprimir();
        SalidaTerminal.consola("Es diagonal inferior: "+tabla2D7.esDiagonalinf()+"\n");


        SalidaTerminal.consola("Tabla2D creada con valores\n");
        Tabla2DNumeros tabla2D8 = new Tabla2DNumeros(2, 2);
        tabla2D7.asignarCelda(0, 0, 0);
        tabla2D7.asignarCelda(0, 1, 0);
        tabla2D7.asignarCelda(1, 1, 1);
        tabla2D7.asignarCelda(1, 0, 1);
        tabla2D7.imprimir();
        SalidaTerminal.consola("Es diagonal superior: "+tabla2D7.esDiagonalSup()+"\n");


    }
}
