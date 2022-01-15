
package pruebas;

import entradasalida.SalidaTerminal;
import herramientas.matematicas.ConversionesMatematicas;
import herramientas.matematicas.OperacionesMatematicas;
import herramientas.matematicas.SerieDeNumeros;


/**
 *
 * @author Daniel A Morales Castillo
 */
public class PruebasRecursividad {
    public static void main(String args[]){

        SalidaTerminal.consola("Actividad 2 Multiplicacion 6x7: \n");
        int multiplicacionR = OperacionesMatematicas.multiplicacionR(6,7);
        SalidaTerminal.consola("Resultado de multiplicación: " + multiplicacionR + "\n");
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Actividad 3 calcular serie: \n");
        double serie = SerieDeNumeros.calcularSerieNumeros(1,7,7,1,2,10);
        SalidaTerminal.consola("" + serie);

        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("\nActividad 4 Hexadecimal y Base B: \n");
        String hexa = ConversionesMatematicas.convertirAHexadecimal(65029);
        SalidaTerminal.consola("65029 a hexadecimal ="+hexa + "\n");
        String baseB = ConversionesMatematicas.convertirBaseB(8, 66000);
        SalidaTerminal.consola("\n 66000 a base 8 ="+baseB + "\n");
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("Actividad 5 Algoritmo Euclides con 412 y 184: \n");
        int euclides = OperacionesMatematicas.maximoComunDivisor(412, 184);
        SalidaTerminal.consola("MCD:"+euclides + "\n");
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Actividad 6 Binario:\n");
        SalidaTerminal.consola("Binario de 150:\n");
        String binario = ConversionesMatematicas.decimalBinario(150);
        SalidaTerminal.consola(binario);




    }
}
