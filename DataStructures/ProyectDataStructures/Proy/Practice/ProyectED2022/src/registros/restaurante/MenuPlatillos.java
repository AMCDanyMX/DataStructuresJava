package registros.restaurante;

import entradasalida.SalidaTerminal;

/**
 * @author Daniel Alejandro Morales Castillo
 * Clase que contiene algunos menus solo de strings para ahorrar lineas de codigo
 */



public class MenuPlatillos {

    public MenuPlatillos() {
    }

    public static void menuConocer() {
        SalidaTerminal.consola("¿De que platillo quieres saber los ingredientes?\n");
        SalidaTerminal.consola("1: Sopa Mexicana \n 2:Enchiladas TDA \n 3: Torta del Chavo \n 4: Huevos Mexicanos \n 5: Hot Cakes Estructurados \n 6:No conocer");
    }


    public static void menuAgregar() {
        SalidaTerminal.consola("¿A que platillo le quieres agregar?\n");
        SalidaTerminal.consola("1: Sopa Mexicana \n 2:Enchiladas TDA \n 3: Torta del Chavo \n 4: Huevos Mexicanos \n 5: Hot Cakes Estructurados \n 6:No agregar" );
    }

    public static void menuVegetariano(){
        SalidaTerminal.consola("Menu vegetariano para los amantes de la hierba:");
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("1: Ensalada con Deep \n 2:Panini \n 3:Tacos de Soya \n 4:Ensalada de hongos \n 5:Ensalada de verduras");
    }

    public static void menuEliminar(){
        SalidaTerminal.consola("¿De que platillo deseas eliminar?");
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("1: Sopa Mexicana \n 2:Enchiladas TDA \n 3: Torta del Chavo \n 4: Huevos Mexicanos \n 5: Hot Cakes Estructurados \n 6:No eliminar");
    }





}
