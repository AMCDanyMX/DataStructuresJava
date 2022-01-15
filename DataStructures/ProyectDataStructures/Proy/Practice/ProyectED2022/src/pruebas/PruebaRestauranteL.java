package pruebas;

import entradasalida.EntradaTerminal;
import entradasalida.SalidaTerminal;
import estructuraslineales.ListaEncadenada;
import registros.restaurante.MenuPlatillos;
import registros.restaurante.PlatilloL;
import registros.restaurante.RestauranteL;


/**
 * @author Daniel Alejandro Morales Castillo
 * Clase de pruebas
 */

public class PruebaRestauranteL {
    public static  void  main(String argumentos[]){
        RestauranteL restaurant=new RestauranteL("La fonda de ED");

        //Platillo 1
        ListaEncadenada ingredientes=new ListaEncadenada();
        ingredientes.agregar("Lechuga - En rodajas - 100gr");
        ingredientes.agregar("Jitomate - En rodajas - 50gr");
        ingredientes.agregar("Cebolla - En rodajas - 50gr");
        ingredientes.agregar("Pimientos - Al gusto - ");
        PlatilloL platillo1=new PlatilloL("Sopa Mexicana",ingredientes,"Estufa","Chef Daniel Castillo");

        restaurant.agregarPlatillo(platillo1);

        //Platillo 2
        ListaEncadenada ingredientes2=new ListaEncadenada();
        ingredientes2.agregar("Chile - 2pz - 50gr");
        ingredientes2.agregar("Jitomate - En cuadritos - 25gr");
        ingredientes2.agregar("Cebolla - En rodajas - 25gr");
        ingredientes2.agregar("Tortilla - Calientes - 5pz");
        PlatilloL platillo2=new PlatilloL("Enchiladas TDA",ingredientes2,"Estufa","Chef Juan Robles");

        restaurant.agregarPlatillo(platillo2);


        //Platillo 3
        ListaEncadenada ingredientes3=new ListaEncadenada();
        ingredientes3.agregar("Bolillo - 1pz - 100gr");
        ingredientes3.agregar("Jitomate - En rodajas - 50gr");
        ingredientes3.agregar("Cebolla - En rodajas - 50gr");
        ingredientes3.agregar("Jamon - Piezas - 2 pz");
        PlatilloL platillo3=new PlatilloL("Torta del Chavo",ingredientes3,"Cuchillo","Chef Daniel Castillo");

        restaurant.agregarPlatillo(platillo3);


        //Platillo 4
        ListaEncadenada ingredientes4=new ListaEncadenada();
        ingredientes4.agregar("Huevos - 3pz - 250gr");
        ingredientes4.agregar("Jitomate - En cuadritos - 25gr");
        ingredientes4.agregar("Cebolla - En cuadritos - 25gr");
        ingredientes4.agregar("Jamon - Cortado - 50gr");
        ingredientes4.agregar("Salsa/Chile - Al gusto ");
        PlatilloL platillo4=new PlatilloL("Huevos Mexicanos",ingredientes4,"Estufa","Chef Roberto Ramirez");

        restaurant.agregarPlatillo(platillo4);


        //Platillo 5
        ListaEncadenada ingredientes5=new ListaEncadenada();
        ingredientes5.agregar("Harina - Media Taza - 250gr");
        ingredientes5.agregar("Huevos - 2pz - 250gr");
        ingredientes5.agregar("Leche - 3/4 Taza - Leche");
        ingredientes5.agregar("Mantequilla - 1/2Barra - 250gr");
        PlatilloL platillo5=new PlatilloL("Hot Cakes Estructurados",ingredientes5,"Estufa","Chef Daniel Castillo");

        restaurant.agregarPlatillo(platillo5);


        //a) Imprimir los nombres de las comidas (menú de platillos al cliente).
        //b) Imprimir todas las comidas y todos sus ingredientes.
        //salidas
        SalidaTerminal.consola(":"+ restaurant.getNombre() + " tiene en el menu: \n");
        restaurant.imprimirPlatillos();
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo1.getNombreComida() +"\n");
        platillo1.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo2.getNombreComida() +"\n");
        platillo2.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo3.getNombreComida() +"\n");
        platillo3.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo4.getNombreComida() +"\n");
        platillo4.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo5.getNombreComida() +"\n");
        platillo5.imprimirIngredientes();
        SalidaTerminal.consola("\n");

        SalidaTerminal.consola("\n");
        //c) Dado el nombre de una comida, imprima los ingredientes
        MenuPlatillos.menuConocer();
        int opcion = EntradaTerminal.consolaInt();
        if(opcion == 1){
            SalidaTerminal.consola("Los ingredientes de este platillo son: ");
            platillo1.imprimirIngredientes();
        }
        if(opcion == 2){
            SalidaTerminal.consola("Los ingredientes de este platillo son: ");
            platillo2.imprimirIngredientes();
        }
        if(opcion == 3){
            SalidaTerminal.consola("Los ingredientes de este platillo son: ");
            platillo3.imprimirIngredientes();
        }
        if(opcion == 4){
            SalidaTerminal.consola("Los ingredientes de este platillo son: ");
            platillo4.imprimirIngredientes();
        }
        if(opcion == 5){
            SalidaTerminal.consola("Los ingredientes de este platillo son: ");
            platillo5.imprimirIngredientes();
        }
        SalidaTerminal.consola("\n");
        //d) Dado el nombre de una comida agregue ingredientes.
        MenuPlatillos.menuAgregar();
        int opcionagregar = EntradaTerminal.consolaInt();
        if(opcionagregar == 1){
            SalidaTerminal.consola("¿Qué ingredientes quieres agregar?: ");
            String agregar = EntradaTerminal.consolaCadena();
            ingredientes.agregar(agregar);
        }
        if(opcionagregar == 2){
            SalidaTerminal.consola("¿Qué ingredientes quieres agregar?: ");
            String agregar2 = EntradaTerminal.consolaCadena();
            ingredientes2.agregar(agregar2);
        }
        if(opcionagregar == 3){
            SalidaTerminal.consola("¿Qué ingredientes quieres agregar?: ");
            String agregar3 = EntradaTerminal.consolaCadena();
            ingredientes3.agregar(agregar3);
        }
        if(opcionagregar == 4){
            SalidaTerminal.consola("¿Qué ingredientes quieres agregar?: ");
            String agregar4 = EntradaTerminal.consolaCadena();
            ingredientes4.agregar(agregar4);
        }
        if(opcionagregar == 5){
            SalidaTerminal.consola("¿Qué ingredientes quieres agregar?: ");
            String agregar5 = EntradaTerminal.consolaCadena();
            ingredientes5.agregar(agregar5);
        }

        if(opcionagregar == 6){
            SalidaTerminal.consola("No agregaste nada");
        }


        SalidaTerminal.consola("Ingredientes del platillo: " + platillo1.getNombreComida() +"\n");
        platillo1.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo2.getNombreComida() +"\n");
        platillo2.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo3.getNombreComida() +"\n");
        platillo3.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo4.getNombreComida() +"\n");
        platillo4.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo5.getNombreComida() +"\n");
        platillo5.imprimirIngredientes();
        SalidaTerminal.consola("\n");

        //e) Dado el nombre de alguna comida, elimine ingredientes.
        MenuPlatillos.menuEliminar();
        int opcioneliminar = EntradaTerminal.consolaInt();
        if(opcioneliminar == 1){
            SalidaTerminal.consola("¿Qué ingredientes quieres eliminar?: ");
            ingredientes.eliminar();
        }
        if(opcioneliminar == 2){
            SalidaTerminal.consola("¿Qué ingredientes quieres eliminar?: ");
            ingredientes2.eliminar();
        }
        if(opcioneliminar == 3){
            SalidaTerminal.consola("¿Qué ingredientes quieres eliminar?: ");
            ingredientes3.eliminar();
        }
        if(opcioneliminar == 4){
            SalidaTerminal.consola("¿Qué ingredientes quieres eliminar?: ");
            ingredientes4.eliminar();
        }
        if(opcioneliminar == 5){
            SalidaTerminal.consola("¿Qué ingredientes quieres eliminar?: ");
            ingredientes5.eliminar();
        }

        if(opcioneliminar == 6){
            SalidaTerminal.consola("No Eliminar");
        }


        SalidaTerminal.consola("Ingredientes del platillo: " + platillo1.getNombreComida() +"\n");
        platillo1.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo2.getNombreComida() +"\n");
        platillo2.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo3.getNombreComida() +"\n");
        platillo3.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo4.getNombreComida() +"\n");
        platillo4.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo5.getNombreComida() +"\n");
        platillo5.imprimirIngredientes();
        SalidaTerminal.consola("\n");


        //f) Dé de alta una comida con todos sus ingredientes.
        //Platillo nuevo
        ListaEncadenada ingredientescomidaalta=new ListaEncadenada();
        ingredientescomidaalta.agregar("Frijoles - Frijoles molidos- 300gr");
        ingredientescomidaalta.agregar("Chicharron - Prensado - 300gr");
        ingredientescomidaalta.agregar("Deshebrada - Carne - 300gr");
        PlatilloL platillo6=new PlatilloL("Orden de burritos",ingredientescomidaalta,"Estufa","Chef Daniel Castillo");

        restaurant.agregarPlatillo(platillo6);

        SalidaTerminal.consola("Ingredientes del platillo: " + platillo1.getNombreComida() +"\n");
        platillo1.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo2.getNombreComida() +"\n");
        platillo2.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo3.getNombreComida() +"\n");
        platillo3.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo4.getNombreComida() +"\n");
        platillo4.imprimirIngredientes();
        SalidaTerminal.consola("\n");
        //--
        SalidaTerminal.consola("Ingredientes del platillo: " + platillo5.getNombreComida() +"\n");
        platillo5.imprimirIngredientes();
        SalidaTerminal.consola("\n");


        // g)Dé de baja una comida con todos sus ingredientes.

        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Eliminando un platillo del Menu");
        SalidaTerminal.consola("\n");
        restaurant.eliminarPlatillo(platillo3);
        restaurant.imprimirPlatillos();
        SalidaTerminal.consola("\n");

        //h)h) Buscar las comidas que tengan un ingrediente X

        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Buscar platillos con Jitomate");
        SalidaTerminal.consola("\n");


        //i) Que busque todos los platillos del chef Y
        SalidaTerminal.consola("Buscar platillos con el chef Daniel Castillo");
        SalidaTerminal.consola("\n");


        if(platillo1.getChef() .equals("Chef Daniel Castillo")){
            SalidaTerminal.consola(platillo1.getNombreComida());
            SalidaTerminal.consola("\n");
        }
        if(platillo2.getChef() .equals("Chef Daniel Castillo")){
            SalidaTerminal.consola(platillo2.getNombreComida());
            SalidaTerminal.consola("\n");
        }
        if(platillo3.getChef() .equals("Chef Daniel Castillo")){
            SalidaTerminal.consola(platillo3.getNombreComida());
            SalidaTerminal.consola("\n");
        }
        if(platillo4.getChef() .equals("Chef Daniel Castillo")){
            SalidaTerminal.consola(platillo4.getNombreComida());
            SalidaTerminal.consola("\n");
        }

        if(platillo5.getChef() .equals("Chef Daniel Castillo")){
            SalidaTerminal.consola(platillo5.getNombreComida());
            SalidaTerminal.consola("\n");
        }

        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("\n");
        //j) Que busque todos los platillos que ocupan estiufa
        SalidaTerminal.consola("Buscar platillos que ocupan Estufa");
        SalidaTerminal.consola("\n");


        if(platillo1.getProcedimientoPreparacion() .equals("Estufa")){
            SalidaTerminal.consola(platillo1.getNombreComida());
            SalidaTerminal.consola("\n");
        }
        if(platillo2.getProcedimientoPreparacion() .equals("Estufa")){
            SalidaTerminal.consola(platillo2.getNombreComida());
            SalidaTerminal.consola("\n");
        }
        if(platillo3.getProcedimientoPreparacion() .equals("Estufa")){
            SalidaTerminal.consola(platillo3.getNombreComida());
            SalidaTerminal.consola("\n");
        }
        if(platillo4.getProcedimientoPreparacion() .equals("Estufa")){
            SalidaTerminal.consola(platillo4.getNombreComida());
            SalidaTerminal.consola("\n");
        }

        if(platillo5.getProcedimientoPreparacion() .equals("Estufa")){
            SalidaTerminal.consola(platillo5.getNombreComida());
            SalidaTerminal.consola("\n");
        }

        //m) Que muestre los platillos que requieren cuchillo para su preparación.
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Buscar platillos que ocupan Cuchillo:");
        SalidaTerminal.consola("\n");


        if(platillo1.getProcedimientoPreparacion() .equals("Cuchillo")){
            SalidaTerminal.consola(platillo1.getNombreComida());
            SalidaTerminal.consola("\n");
        }
        if(platillo2.getProcedimientoPreparacion() .equals("Cuchillo")){
            SalidaTerminal.consola(platillo2.getNombreComida());
            SalidaTerminal.consola("\n");
        }
        if(platillo3.getProcedimientoPreparacion() .equals("Cuchillo")){
            SalidaTerminal.consola(platillo3.getNombreComida());
            SalidaTerminal.consola("\n");
        }
        if(platillo4.getProcedimientoPreparacion() .equals("Cuchillo")){
            SalidaTerminal.consola(platillo4.getNombreComida());
            SalidaTerminal.consola("\n");
        }

        if(platillo5.getProcedimientoPreparacion() .equals("Cuchillo")){
            SalidaTerminal.consola(platillo5.getNombreComida());
            SalidaTerminal.consola("\n");
        }


        //n) Que muestre los platillos que no requieren electricidad para su preparación.
        //p) Que elimine de manera global todos los platillos carnívoros
        // k) Que muestre los platillos que requieren más de 100 gramos para su preparación.
        // l) Que muestre los platillos que requieren ingredientes líquidos.

        //o) Que muestre el menú de platillos vegetariano.
        MenuPlatillos.menuVegetariano();













    }
}