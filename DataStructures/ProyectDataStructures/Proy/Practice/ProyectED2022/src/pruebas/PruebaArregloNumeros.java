/**
 * @autor Daniel Alejandro Morales Castillo
 */


package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloNumeros;

//Clase de pruebas con el metodo main
public class PruebaArregloNumeros {
    public static void main(String[] args) {
        SalidaTerminal.consola("Arreglo de numeros [3,2,3,1]: \n");


        //creacdiion de varios arreglos de numeros para las diversas pruebas
        ArregloNumeros arreglonumeros1 = new ArregloNumeros(5);
        arreglonumeros1.agregar(3.0);
        arreglonumeros1.agregar(2.0);
        arreglonumeros1.agregar(3.0);
        arreglonumeros1.agregar(1.0);
        arreglonumeros1.imprimir();
        SalidaTerminal.consola("Agregando el 6 al arreglo de numeros: \n");
        arreglonumeros1.agregar(6.0);
        arreglonumeros1.imprimir();

        SalidaTerminal.consola("Multiplicando por escalar 2.0: \n");
        arreglonumeros1.multiplicarEscalar(2.0);
        arreglonumeros1.imprimir();

        SalidaTerminal.consola("Sumar por escalar 8.0: \n");
        arreglonumeros1.sumaEscalar(8.0);
        arreglonumeros1.imprimir();


        SalidaTerminal.consola("Sumar arreglos [14,12,14,10,20][2,4,3,6,9] : \n");
        ArregloNumeros arregloNumeros2 = new ArregloNumeros(5);
        arregloNumeros2.agregar(2.0);
        arregloNumeros2.agregar(4.0);
        arregloNumeros2.agregar(3.0);
        arregloNumeros2.agregar(6.0);
        arregloNumeros2.agregar(9.0);

        arreglonumeros1.sumar(arregloNumeros2);
        arreglonumeros1.imprimir();

        SalidaTerminal.consola("Multiplicar arreglos: [3,2,3][5,2,2] \n");
        ArregloNumeros arregloNumeros3 = new ArregloNumeros(3);
        arregloNumeros3.agregar(3.0);
        arregloNumeros3.agregar(2.0);
        arregloNumeros3.agregar(3.0);

        ArregloNumeros arregloNumeros4 = new ArregloNumeros(3);
        arregloNumeros4.agregar(5.0);
        arregloNumeros4.agregar(2.0);
        arregloNumeros4.agregar(2.0);

        arregloNumeros3.multiplicar(arregloNumeros4);
        arregloNumeros3.imprimir();

        SalidaTerminal.consola("Potencia arreglo [3,2,3] al escalar 3: \n");
        ArregloNumeros arregloNumeros5 = new ArregloNumeros(3);
        arregloNumeros5.agregar(3.0);
        arregloNumeros5.agregar(2.0);
        arregloNumeros5.agregar(3.0);

        arregloNumeros5.potenciarEscalar(3);
        arregloNumeros5.imprimir();

        SalidaTerminal.consola("Potencia arreglo [3,2,3] al escalar []: \n");
        ArregloNumeros arregloNumeros6 = new ArregloNumeros(3);
        arregloNumeros6.agregar(3.0);
        arregloNumeros6.agregar(2.0);
        arregloNumeros6.agregar(3.0);

        arregloNumeros6.potencia(arregloNumeros3);
        SalidaTerminal.consola3(arregloNumeros6.potencia(arregloNumeros3));
        SalidaTerminal.consola("\n");


        SalidaTerminal.consola("Producto punto arreglos [3,2,3][4,5,6] : \n");
        ArregloNumeros arregloNumeros7 = new ArregloNumeros(3);
        arregloNumeros7.agregar(3.0);
        arregloNumeros7.agregar(2.0);
        arregloNumeros7.agregar(3.0);

        ArregloNumeros arregloNumeros8 = new ArregloNumeros(3);
        arregloNumeros8.agregar(4.0);
        arregloNumeros8.agregar(5.0);
        arregloNumeros8.agregar(6.0);

        SalidaTerminal.consola5(arregloNumeros7.productoPunto(arregloNumeros8));
        SalidaTerminal.consola(" \n");

        SalidaTerminal.consola("Modulo del arreglo [3,2,3]: \n");
        ArregloNumeros arregloNumeros9 = new ArregloNumeros(3);
        arregloNumeros9.agregar(3.0);
        arregloNumeros9.agregar(2.0);
        arregloNumeros9.agregar(3.0);

        SalidaTerminal.consola5(arregloNumeros9.modulo());

        SalidaTerminal.consola(" \n");

        SalidaTerminal.consola("Norma euclidiana de arreglo [3,2,3] [4,5,6]: \n");
        SalidaTerminal.consola5(arregloNumeros9.normaEuclidiana(arregloNumeros8));



        SalidaTerminal.consola("\n");
        ArregloNumeros arregloNumeros10 = new ArregloNumeros(2);
        arregloNumeros10.agregar(3.0);
        arregloNumeros10.agregar(2.0);

        ArregloNumeros arregloNumeros11 = new ArregloNumeros(2);
        arregloNumeros11.agregar(4.0);
        arregloNumeros11.agregar(5.0);

        SalidaTerminal.consola("Los arreglos son ortogonales?:  [3,2] [4,5]: \n");
        SalidaTerminal.consola3(arregloNumeros10.esOrtogonal(arregloNumeros11));







    }
}
