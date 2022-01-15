/**
 *
 * @author Daniel Alejandro Morales Castillo
 * @version 1.0
 */

package herramientas.matematicas;

import estructuraslineales.ArregloPila;

public class ExpresionAritmetica{
    /**
     * Evalua una expresión postfija.
     * @param postfija Expresión a evaluar.
     * @return Regresa el resultado de la expresión.
     */
    public static Double evaluarExpresionPostfija(String postfija){
        ArregloPila pila=new ArregloPila(postfija.length());

        //1.- operador
        for(int posOperador=0;posOperador<postfija.length();posOperador++){
            char operador=postfija.charAt(posOperador);//1.1. Obtener operador.
            //2.- Si es operando, lo meto a la pila
            if(esOperando(operador)) {
                if(!pila.poner("" + operador)){
                    return null;
                }
            }else{//es operador
                //3.- Si es operador, saco el tope de la pila como operando 2.
                //    saco el tope de la pila y es el operando 1.
                String operando2=(String)pila.quitar();
                String operando1=(String)pila.quitar();

                if(operando1==null || operando2==null){
                    return null;
                }
                //4.- Hago la operación con el ope(operador actual) y esos dos
                //operandos.
                double resultadoParcial=ejecutarOperador(operador,
                        Double.parseDouble(operando1),
                        Double.parseDouble(operando2));
                //5.- Meto el resultado de esa operación en la pila.
                if(!pila.poner(""+resultadoParcial)){
                    return null;
                }
            }
        }//6.- Repito hasta que no haya tokens.
        //7.- El resultado de la operación está en el tope, y lo retorno.
        String resultadoCadena=(String)pila.quitar();
        if (resultadoCadena!=null) {
            return Double.parseDouble(resultadoCadena);
        } else {
            return null;
        }
    }
    /**
     * Realiza la operación correspondiente segun el operador.
     * @param signoAritmeticoOperador Operador a usar.
     * @param op1 Valor 1.
     * @param op2 Valor 2.
     * @return Regresa el resultado de la operación.
     */
    public static double ejecutarOperador(char signoAritmeticoOperador,double op1, double op2){
        if(signoAritmeticoOperador=='^'){
            return Math.pow(op1,op2);
        }
        if(signoAritmeticoOperador=='*'){
            return op1*op2;
        }
        if(signoAritmeticoOperador=='/'){
            return op1/op2;
        }
        if(signoAritmeticoOperador=='+'){
            return op1+op2;
        }
        if(signoAritmeticoOperador=='-'){
            return op1-op2;
        } else{
            return 0.0;
        }
    }
    /**
     * Evalua si un char regresenta un operando.
     * @param caracter Caracter a evaluar.
     * @return Regresa true si es operando, false si no lo es.
     */
    public static boolean esOperando(char caracter){
        if(caracter!='^' && caracter!='(' && caracter!=')' && caracter!='/' && caracter!='+' && caracter!='-' && caracter!='*'){
            return true;
        } else{
            return false;
        }
    }
    /**
     * Evalua si un String regresenta un operando.
     * @param caracter String a evaluar.
     * @return Regresa true si es operando, false si no lo es.
     */
    public static boolean esOperandoString(String caracter){
        if(!"^".equals(caracter) && !"(".equals(caracter) && !")".equals(caracter) && !"/".equals(caracter) && !"+".equals(caracter) && !"-".equals(caracter) && !"*".equals(caracter)){
            return true;
        } else{
            return false;
        }
    }
    /**
     * Evalua una expresió prefija.
     * @param prefija Expresión que será evaluada.
     * @return Regresa el resultado de la expresión evaluada.
     */
    public static Double evaluarExpresionPrefija(String prefija){
        ArregloPila pila=new ArregloPila(prefija.length());

        //1.- Operador
        for(int posOperador=prefija.length()-1;posOperador>=0;posOperador--){
            //1.1. Obtener operador.
            char operador=prefija.charAt(posOperador);
            //2.- Si es operando, lo meto a la pila
            if(esOperando(operador)) {
                if(!pila.poner("" + operador)){
                    return null;
                }
            }else{//es operador
                //3.- Si es operador, saco el tope de la pila como operando 2.
                //    saco el tope de la pila y es el operando 1.
                String operando2=(String)pila.quitar();
                String operando1=(String)pila.quitar();
                if(operando1==null || operando2==null){
                    return null;
                }
                //4.- Hago la operación con el operador(operador actual) y esos dos
                //operandos.
                double resultadoParcial=ejecutarOperador(operador,
                        Double.parseDouble(operando1),
                        Double.parseDouble(operando2));
                //5.- Meto el resultado de esa operación en la pila.
                if(!pila.poner(""+resultadoParcial)){
                    return null;
                }
            }
        }//6.- Repito hasta que no haya operadores.
        //7.- El resultado de la operación está en el tope, y lo retorno.
        String resultadoCadena=(String)pila.quitar();
        if (resultadoCadena!=null) {
            return Double.parseDouble(resultadoCadena);
        } else {
            return null;
        }
    }
    /**
     * Transforma una expresión de nitacion infija a postfija.
     * @param infija Expresión a cambiar.
     * @return Regresa la expresion transformada en caso de que se pueda, null
     *  en caso contrario.
     */
    public static String infijaAPostfija(String infija){
        ArregloPila pila=new ArregloPila(infija.length());
        String postfija="";
        for(int posOperador=0;posOperador<infija.length();posOperador++){
            char operador=infija.charAt(posOperador);
            if(esOperando(operador)){//Es operando
                postfija=postfija+operador;
            }
            else{//Es operador
                if(operador=='('){
                    pila.poner(operador);
                }
                else if(operador==')'){
                    char token2=(char)pila.quitar();
                    while(token2!='('){
                        postfija=postfija+token2;
                        token2=(char)pila.quitar();
                    }
                }
                else{
                    if(pila.vacio()){
                        pila.poner(operador);
                    }
                    else{
                        if(prioridadOperador(operador)>=prioridadOperador((char)pila.verTope())){
                            pila.poner(operador);
                        }
                        else{
                            char operador2=(char)pila.quitar();
                            while(prioridadOperador(operador2)>prioridadOperador(operador)){
                                postfija+=operador2;
                                if(pila.vacio()==false && prioridadOperador(operador)<prioridadOperador((char)pila.verTope())){
                                    operador2=(char)pila.quitar();
                                } else{
                                    break;
                                }
                            }
                            pila.poner(operador);
                        }
                    }
                }
            }
        }
        if(pila.vacio()==false){
            while(pila.vacio()==false){
                char operandoSacado=(char)pila.quitar();
                postfija+=operandoSacado;
            }
        }
        return postfija;
    }
    /**
     * Transforma una expresion de notación infija a prefija.
     * @param infija Notación infija a transformar.
     * @return Regresa la expresion transformada en caso de que se pueda.
     */
    public static String infijaAPrefija(String infija){
        ArregloPila pila=new ArregloPila(infija.length());
        String prefija="";
        for(int posOperador=infija.length()-1;posOperador>=0;posOperador--){
            char operador=infija.charAt(posOperador);
            if(esOperando(operador)){//Es operando
                prefija=operador+prefija;
            }
            else{//Es operador
                if(operador==')'){
                    pila.poner(operador);
                }
                else if(operador=='('){
                    char operador2=(char)pila.quitar();
                    while(operador2!=')'){
                        prefija=operador2+prefija;
                        operador2=(char)pila.quitar();
                    }
                }
                else{
                    if(pila.vacio()){
                        pila.poner(operador);
                    }
                    else{
                        if(prioridadOperador(operador)>=prioridadOperador((char)pila.verTope())){
                            pila.poner(operador);
                        }
                        else{
                            char operador2=(char)pila.quitar();
                            while(prioridadOperador(operador2)>prioridadOperador(operador)){
                                prefija=operador2+prefija;
                                if(pila.vacio()==false && prioridadOperador(operador)<prioridadOperador((char)pila.verTope())){
                                    operador2=(char)pila.quitar();
                                } else{
                                    break;
                                }
                            }
                            pila.poner(operador);
                        }
                    }
                }
            }
        }
        if(pila.vacio()==false){
            while(pila.vacio()==false){
                char operandoSacado=(char)pila.quitar();
                prefija=operandoSacado+prefija;
            }
        }
        return prefija;
    }
    /**
     * Obtiene el valor de un operador.
     * @param operador operador a evaluar.
     * @return Regresa el valor asignado al token.
     */
    public static int prioridadOperador(char operador){
        if(operador=='^'){
            return 4;
        }
        else if(operador=='*'){
            return 3;
        }
        else if(operador=='/'){
            return 3;
        }
        else if(operador=='+'){
            return 2;
        }
        else if(operador=='-'){
            return 2;
        }
        return 0;
    }
}
