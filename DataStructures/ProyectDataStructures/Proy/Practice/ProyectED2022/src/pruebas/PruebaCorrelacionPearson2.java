package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ListaEncadenadaDoble;
import herramientas.operaciones.CorrelacionPearson;

public class PruebaCorrelacionPearson2 {
    public static void main(String[] args) {

        ListaEncadenadaDoble valoresX = new ListaEncadenadaDoble();
        ListaEncadenadaDoble valoresY = new ListaEncadenadaDoble();

        //valorews x
        valoresX.agregar(4.138);
        valoresX.agregar(4.138);
        valoresX.agregar(4.368);
        valoresX.agregar(4.519);
        valoresX.agregar(4.628);
        valoresX.agregar(4.652);
        valoresX.agregar(4.88);
        valoresX.agregar(4.903);
        valoresX.agregar(4.906);
        valoresX.agregar(4.926);

        //valores de Y
        valoresY.agregar(8);
        valoresY.agregar(6);
        valoresY.agregar(8.8);
        valoresY.agregar(7);
        valoresY.agregar(17.9);
        valoresY.agregar(10.5);
        valoresY.agregar(10.2);
        valoresY.agregar(11.8);
        valoresY.agregar(13.8);
        valoresY.agregar(14.6);



        Double correlacion = CorrelacionPearson.coeficienteR(valoresX, valoresY);
        SalidaTerminal.consola("Coeficiente r de Pearson de muestra: "+correlacion);

        SalidaTerminal.consola("\n");

        Double correlacionmuestra = CorrelacionPearson.covarianzaEstandarizada(valoresX, valoresY);
        SalidaTerminal.consola("Covarianza estandarizada en muestra :" + correlacionmuestra);



    }
}
