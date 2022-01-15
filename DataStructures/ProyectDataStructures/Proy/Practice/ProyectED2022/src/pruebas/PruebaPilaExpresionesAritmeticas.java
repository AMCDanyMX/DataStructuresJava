package pruebas;
import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloPila;
import herramientas.matematicas.ExpresionAritmetica;
import herramientas.matematicas.LectorExpresionAritmetica;

/**
 * @author Daniel Alejandro Morales Castillo
 * prueba clase main de ExpresionesAritmeticas
 */
public class PruebaPilaExpresionesAritmeticas {
    public static void main(String args[]){
        ArregloPila pila=new ArregloPila(5);

        pila.poner(4);
        pila.poner(8);
        pila.poner(2);
        pila.poner(2);
        pila.poner(9);
        pila.poner(1);

        SalidaTerminal.consola("\n");
        pila.imprimir();
        SalidaTerminal.consola("\n");
        LectorExpresionAritmetica variable = new LectorExpresionAritmetica();
        SalidaTerminal.consola(variable.sustituirVariables("(a-2)*y/2^(suma - 9)"));
        //a=1 y=3 suma = 12
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Ejemplo de postfija 12/2^2*3+");
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Ejecutando la expresion postfija: \n" +ExpresionAritmetica.evaluarExpresionPostfija("12/2^2*3+"));

        SalidaTerminal.consola("\n");
        ExpresionAritmetica prueba = new ExpresionAritmetica();
        SalidaTerminal.consola("\n");
        String infija_a_postfija = prueba.infijaAPostfija("(3-2)*3/2^+-9");
        Double resultado = prueba.evaluarExpresionPostfija(infija_a_postfija);
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("Resultado "+resultado);




    }
}
