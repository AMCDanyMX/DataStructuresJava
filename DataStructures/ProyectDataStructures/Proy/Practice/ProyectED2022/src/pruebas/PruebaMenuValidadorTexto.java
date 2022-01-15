package pruebas;

import entradasalida.SalidaTerminal;
import registros.examen1partetexto.MenuValidadorDeBalance;

/**
 *
 * @author Daniel Alejandro Morales Castillo
 */
public class PruebaMenuValidadorTexto {
    public static void main(String[] args){
        boolean respuesta = MenuValidadorDeBalance.menu();
        SalidaTerminal.consola(respuesta+ "");
    }
}

