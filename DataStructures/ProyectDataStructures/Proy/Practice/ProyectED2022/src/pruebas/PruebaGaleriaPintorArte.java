package pruebas;

import entradasalida.SalidaTerminal;
import registros.pintores.ActividadPintor;
import registros.pintores.GaleriaArte;
import registros.pintores.Pintor;

public class PruebaGaleriaPintorArte {
    public static void main(String[] args) {
        GaleriaArte galeriazacatecas = new GaleriaArte("Galeria de Zacatecas",3,2,3);

        SalidaTerminal.consola("Agregando los pintores");
        SalidaTerminal.consola("\n");
        Pintor pintor1=new Pintor("Pedro",20,"Hombre","999871","Licenciatura");
        Pintor pintor2=new Pintor("Ramiro",19,"Hombre","997866","Licenciatura");
        Pintor pintor3=new Pintor("Alfonso",100,"Hombre","123476","Preparatoria");
        galeriazacatecas.agregarPintor(pintor1);
        galeriazacatecas.agregarPintor(pintor2);
        galeriazacatecas.agregarPintor(pintor3);



        SalidaTerminal.consola("Agregando los anios");
        SalidaTerminal.consola("\n");
        galeriazacatecas.agregarAnio("2017");
        galeriazacatecas.agregarAnio("2018");

        SalidaTerminal.consola("Agregando semanas");
        SalidaTerminal.consola("\n");
        galeriazacatecas.agregarSemana("semana1");
        galeriazacatecas.agregarSemana("semana2");
        galeriazacatecas.agregarSemana("semana3");

        SalidaTerminal.consola("Creando las actividades");
        SalidaTerminal.consola("\n");
        ActividadPintor act1 =ActividadPintor.PINTAR;
        ActividadPintor act2 =ActividadPintor.VIAJAR;
        ActividadPintor act3 =ActividadPintor.EXPONER;
        ActividadPintor act4 =ActividadPintor.FIRMARAUTOGRAFOS;
        SalidaTerminal.consola("Agregando las actividades");
        SalidaTerminal.consola("\n");
        galeriazacatecas.agregarActividad(act1,"Daniel","2018","semana36");
        galeriazacatecas.agregarActividad(act2,"Juanito","2019","semana35");
        galeriazacatecas.agregarActividad(act1,"Luis","2018","semana2");
        galeriazacatecas.imprimir();

        SalidaTerminal.consola("Pintores con actividades en el 2018");
        galeriazacatecas.pintorActividadesAnio("2018");

        SalidaTerminal.consola(galeriazacatecas.anioConMenosArtes("2018") + "");



    }
}
