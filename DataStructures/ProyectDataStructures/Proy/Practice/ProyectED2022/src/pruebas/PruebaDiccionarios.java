/**
 * @autor Daniel Alejandro Morales Castillo
 * Clase de pruebas
 *
 */
package pruebas;

import entradasalida.EntradaTerminal;
import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;
import herramientas.comunes.TipoOrden;
import herramientas.comunes.TipoPalabra;
import registros.diccionarios.Palabra;

//Clase pruebaDiccionarios
public class PruebaDiccionarios {
    public static void main(String[] args) {

        boolean salir = false;
        int opcion;

        while (!salir) { //bucle para no salir solo hasta que ponga esa opcion

            TipoPalabra tp1 = TipoPalabra.VERB;
            TipoPalabra tp2 = TipoPalabra.ADJ;   //asignando el tipo de dato a variables
            TipoPalabra tp3 = TipoPalabra.SUST;

            ArregloDatos arregloOrden = new ArregloDatos(10);

            SalidaTerminal.consola("Diccionario Palabras: \n");
            //creando objetos de tipo Palabra para meterlos en nuestro arregloOrden
            Palabra palabra1 = new Palabra("Amigo", "[persona] Que mantiene una relación de amistad con otra u otras personas."
                    , "MAPS ", tp2);
            arregloOrden.agregar(palabra1);

            Palabra palabra2 = new Palabra("Correr", "Desplazarse [una persona o un animal] rápidamente con pasos largos " +
                    "y de manera que levanta un pie del suelo antes de haber apoyado el otro.", "Correr", tp1);
            arregloOrden.agregar(palabra2);

            Palabra palabra3 = new Palabra("Dominar", "Tener e imponer la supremacía (en cuanto al poder, la autoridad, la fuerza, etc.) sobre algo o alguien."
                    , "Dominar", tp1);
            arregloOrden.agregar(palabra3);

            Palabra palabra4 = new Palabra("Frustrar", "[persona] Que tiene un sentimiento de frustración o que lo ha tenido en algún momento de su vida y ha quedado marcado por él."
                    , "Frustrar ", tp2);
            arregloOrden.agregar(palabra4);

            Palabra palabra5 = new Palabra("Jugar", "Realizar una actividad o hacer una cosa, generalmente ejercitando alguna capacidad o destreza, con el fin de divertirse o entretenerse."
                    , "Jugar ", tp1);
            arregloOrden.agregar(palabra5);

            arregloOrden.imprimir();
            SalidaTerminal.consola("---------------------------- \n");

            SalidaTerminal.consola("Menu Diccionario\n");
            SalidaTerminal.consola("---------------------------- \n");
            SalidaTerminal.consola("1=Agregar Palabra\n" +
                    "2=Consultar definicion\n" +
                    "3=Listar palabra por letra inicial\n" +
                    "4=Listar palabra por tipo\n" +
                    "5=Listar palabra por frase\n");
            SalidaTerminal.consola("Ingrese una opcion: ");
            opcion = EntradaTerminal.consolaInt();

            /*Switch con cada uno de los casos para las diferentes opciones del menu*/
            switch (opcion) {
                case 1:
                    SalidaTerminal.consola("Agregar palabra \n");
                    SalidaTerminal.consola("Palabra: \n");
                    String palabra = EntradaTerminal.consolaCadena();
                    SalidaTerminal.consola("Definicion: \n");
                    String definicion = EntradaTerminal.consolaCadena();
                    SalidaTerminal.consola("Abreviacion: \n");
                    String abreviacion = EntradaTerminal.consolaCadena();
                    SalidaTerminal.consola("Tipo de palabra: \n");
                    String tipopalabra = EntradaTerminal.consolaCadena();

                    Palabra nuevapalabra = new Palabra(palabra, definicion, abreviacion, tp1);
                    arregloOrden.agregar(nuevapalabra);
                    arregloOrden.imprimir();
                    break;
                case 2:
                    //correr= 0
                    //
                    SalidaTerminal.consola("Palabra a buscar: ");
                    String palabrabuscar= EntradaTerminal.consolaCadena();
                    Integer palabracorrer= (Integer)arregloOrden.buscar(palabra2);


                    SalidaTerminal.consola("Definicion de la palabra: \n");
                    if(palabrabuscar.equals("Amigo")){
                        SalidaTerminal.consola(palabra1.getDefinicion());
                    }
                    if(palabrabuscar.equals("Correr")){
                        SalidaTerminal.consola(palabra2.getDefinicion());
                    }
                    if(palabrabuscar.equals("Dominar")){
                        SalidaTerminal.consola(palabra3.getDefinicion());
                    }
                    if(palabrabuscar.equals("Frustrar")){
                        SalidaTerminal.consola(palabra4.getDefinicion());
                    }
                    if(palabrabuscar.equals("Jugar")){
                        SalidaTerminal.consola(palabra5.getDefinicion());
                    }
                    break;
                case 3:
                    SalidaTerminal.consola("Letra inicial: \n");
                    char c1 = EntradaTerminal.consolaChar();
                    char c2 = palabra1.palabra.charAt(0);
                    char c3 = palabra2.palabra.charAt(0);
                    char c4 = palabra3.palabra.charAt(0);
                    char c5 = palabra4.palabra.charAt(0);
                    char c6 = palabra5.palabra.charAt(0);
                    SalidaTerminal.consola(c2 + "\n");
                    SalidaTerminal.consola(c3 + "\n");
                    SalidaTerminal.consola(c4 + "\n");

                    if(c1==c2){
                        SalidaTerminal.consola(palabra1.getPalabra());
                    }
                    if(c1==c3){
                        SalidaTerminal.consola(palabra2.getPalabra());
                    }
                    if(c1==c4){
                        SalidaTerminal.consola(palabra3.getPalabra());
                    }
                    if(c1==c5){
                        SalidaTerminal.consola(palabra4.getPalabra());
                    }
                    if(c1==c6){
                        SalidaTerminal.consola(palabra5.getPalabra());
                    }
                    break;
                case 4:
                    SalidaTerminal.consola("Palabras que son verbos:' \n");
                    if(palabra1.tipoPalabra==tp1){
                        SalidaTerminal.consola(palabra1.getPalabra());
                    }
                    if(palabra2.tipoPalabra==tp1){
                        SalidaTerminal.consola(palabra2.getPalabra());
                    }
                    if(palabra3.tipoPalabra==tp1){
                        SalidaTerminal.consola(palabra3.getPalabra());
                    }
                    if(palabra4.tipoPalabra==tp1){
                        SalidaTerminal.consola(palabra4.getPalabra());
                    }
                    if(palabra5.tipoPalabra==tp1){
                        SalidaTerminal.consola(palabra5.getPalabra());
                    }
                    break;

                case 5:
                    SalidaTerminal.consola("Frase o palabra:' \n");
                    String frase1 = EntradaTerminal.consolaCadena();

                    if((palabra1.definicion).contains(frase1)){
                        SalidaTerminal.consola(palabra1.toString());
                    }
                    if((palabra2.definicion).contains(frase1)){
                        SalidaTerminal.consola(palabra2.toString());
                    }
                    if((palabra3.definicion).contains(frase1)){
                        SalidaTerminal.consola(palabra3.toString());
                    }
                    if((palabra4.definicion).contains(frase1)){
                        SalidaTerminal.consola(palabra4.toString());
                    }
                    if((palabra5.definicion).contains(frase1)){
                        SalidaTerminal.consola(palabra5.toString());
                    }
                    break;
                case 6:
                    SalidaTerminal.consola("Saliendo");
                    salir = true;//Se pone la variable salir en verdadero para salir del Bucle
                    break;
                default:
                    SalidaTerminal.consola("Opcion no valida!");
            }
        }

    }


}
