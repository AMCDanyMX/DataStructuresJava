package estructurasnolineales;
import entradasalida.EntradaTerminal;
import entradasalida.SalidaTerminal;
import estructuraslineales.ArbolMonticulos;
import estructuraslineales.ArregloPila;
import estructuraslineales.ListaEncadenada;
import estructuraslineales.ListaPila;
import estructuraslineales.registros.Nodo;
import estructuraslineales.registros.NodoDoble;
import herramientas.matematicasprofe.ExpAritmetica;
/**
 * Esta clase crear un árbol binario a petición del usuario.
 * @author Clase ED y Daniel Alejandro Morales Castillo
 * @version 3.0.
 *
 */

public class ArbolBinario {
    protected NodoDoble raiz;
    int cant;
    int altura;

    public ArbolBinario() {
        raiz = null;
    }

    public boolean crearArbol() {
        SalidaTerminal.consola("Introduce la raíz del árbol: ");
        String datoNodo = EntradaTerminal.consolaCadena();
        NodoDoble nuevoNodo = new NodoDoble(datoNodo);
        if (nuevoNodo != null) { //hay espacio
            raiz = nuevoNodo;
            crearArbol(raiz); //La raiz se vuelve subraiz para comenzar a agegar los hijos de ella
            return true;
        } else { //no hay espacio
            return false;
        }
    }

    private void crearArbol(NodoDoble subRaiz) {
        //Agregar hijo izquierdo
        SalidaTerminal.consola("¿El nodo " + subRaiz.getDato() + " tiene hijo izquierdo? [S/N] ");
        String respuestaHijoIzquierdo = EntradaTerminal.consolaCadena();
        if (respuestaHijoIzquierdo.equalsIgnoreCase("S")) { //quiere agregar un hijo izquierdo
            SalidaTerminal.consola("Introduce el dato del hijo izquierdo de " + subRaiz.getDato() + " : ");
            String datoNodo = EntradaTerminal.consolaCadena();
            NodoDoble nuevoNodoIzquierdo = new NodoDoble(datoNodo);
            if (nuevoNodoIzquierdo != null) { //si hay espacio
                subRaiz.setDirMemIzq(nuevoNodoIzquierdo);
                crearArbol(subRaiz.getDirMemIzq());
            }
        } //si no entra, no quiere agregar hijo izquierdo

        //Agregar hijo derecho
        SalidaTerminal.consola("¿El nodo " + subRaiz.getDato() + " tiene hijo derecho? [S/N] ");
        String respuestaHijoDerecho = EntradaTerminal.consolaCadena();
        if (respuestaHijoDerecho.equalsIgnoreCase("S")) { //quiere agregar un hijo derecho
            SalidaTerminal.consola("Introduce el dato del hijo derecho de " + subRaiz.getDato() + ": ");
            String datoNodo = EntradaTerminal.consolaCadena();
            NodoDoble nuevoNodoDerecho = new NodoDoble(datoNodo);
            if (nuevoNodoDerecho != null) { //si hay espacio
                subRaiz.setDirMemDer(nuevoNodoDerecho);
                crearArbol(subRaiz.getDirMemDer());
            }
        } //si no entra, no quiere agregar hijo derecho
    }

    public void inOrden() {
        inOrden(raiz);
    }

    private void inOrden(NodoDoble subRaiz) {
        //IRD
        if (subRaiz != null) { //hay alguna subRaiz válida
            //I
            inOrden(subRaiz.getDirMemIzq());
            //R
            SalidaTerminal.consola(subRaiz.getDato() + " ");
            //D
            inOrden(subRaiz.getDirMemDer());
        } //en caso contrario, es deci la subRaiz es nula, no hacemos nada, CASO BASE
    }

    //Metodo in orden no recursivo
    //Metodo practica 26
    /**
     * Metodo que recorre inOrden el arbol binario
     * @return regresa una lista con nuestros nodos inorden del arbol
     */
    public void inOrdenSinRecursion() {
        if (raiz == null)
            return;
        ListaPila pilaNodos = new ListaPila();
        NodoDoble nodoActual = raiz;
        // atravesar el árbol
        while (!pilaNodos.vacia() || nodoActual != null) {
            while (nodoActual !=  null) {
                pilaNodos.agregar(nodoActual);
                nodoActual = nodoActual.getDirMemIzq();
            }
            /*El actual debería  ser NULL en este punto  */
            if(!pilaNodos.vacia()){
                nodoActual = (NodoDoble) pilaNodos.quitar();
                SalidaTerminal.consola(" " + nodoActual.getDato() );
                nodoActual = nodoActual.getDirMemDer();
            }
        }
    }

    /////////////////////////
    public void preOrden() {
        preOrden(raiz);
    }

    private void preOrden(NodoDoble subRaiz) {
        //RID
        if (subRaiz != null) { //hay alguna subRaiz válida
            //R
            SalidaTerminal.consola(subRaiz.getDato() + " ");
            //I
            preOrden(subRaiz.getDirMemIzq());
            //D
            preOrden(subRaiz.getDirMemDer());
        } //en caso contrario, es deci la subRaiz es nula, no hacemos nada, CASO BASE
    }

    public void postOrden() {
        postOrden(raiz);
    }

    private void postOrden(NodoDoble subRaiz) {
        //IDR
        if (subRaiz != null) { //hay alguna subRaiz válida
            //I
            postOrden(subRaiz.getDirMemIzq());
            //D
            postOrden(subRaiz.getDirMemDer());
            //R
            SalidaTerminal.consola(subRaiz.getDato() + " ");
        } //en caso contrario, es deci la subRaiz es nula, no hacemos nada, CASO BASE
    }

    public void ArbolMonticulo() {
        ArbolMonticulo(raiz);
    }

    private void ArbolMonticulo(NodoDoble subRaiz) {
        //IDR
        if (subRaiz != null) { //hay alguna subRaiz válida
            Object valorRaiz = raiz.getDato();
            ArbolMonticulo(subRaiz.getDirMemIzq());
            //D
            ArbolMonticulo(subRaiz.getDirMemDer());
            //R
            SalidaTerminal.consola(subRaiz.getDato() + " ");
        } //en caso contrario, es deci la subRaiz es nula, no hacemos nada, CASO BASE
    }



    //METODOS PRAC 24

    /**
     * Manda llamar a un método que extrae los operadores.
     *
     * @return Regresa una lista ligada con los operadores.
     */
    public ListaEncadenada extraerOperadores() {
        ListaEncadenada lista = new ListaEncadenada();
        return extraerOperadores(lista, raiz);
    }

    /**
     * Extrae los operadores de un árbol.
     *
     * @param lista   Lista para almacenar los operadores.
     * @param subRaiz raíz actual a analizar.
     * @return Regresa la lista con los operadores.
     */
    private ListaEncadenada extraerOperadores(ListaEncadenada lista, NodoDoble subRaiz) {
        if (subRaiz != null) {
            if (ExpAritmetica.esOperandoString(subRaiz.getDato().toString())) {
                lista.agregar(subRaiz.getDato());
            }
            extraerOperadores(lista, subRaiz.getDirMemIzq());
            extraerOperadores(lista, subRaiz.getDirMemDer());
        }
        return lista;
    }

    /**
     * Manda llamar a un método que extrae los operandos.
     *
     * @return Regresa una lista ligada con los operandos.
     */
    public ListaEncadenada extraerOperandos() {
        ListaEncadenada lista = new ListaEncadenada();
        return extraerOperandos(lista, raiz);
    }

    /**
     * Extrae los operandos de un árbol.
     *
     * @param lista   Lista para almacenar los operandos.
     * @param subRaiz raíz actual a analizar.
     * @return Regresa la lista con los operandos.
     */
    private ListaEncadenada extraerOperandos(ListaEncadenada lista, NodoDoble subRaiz) {
        if (subRaiz != null) {
            if (ExpAritmetica.esOperandoString(subRaiz.getDato().toString())) {
                lista.agregar(subRaiz.getDato());
            }
            extraerOperandos(lista, subRaiz.getDirMemIzq());
            extraerOperandos(lista, subRaiz.getDirMemDer());
        }
        return lista;
    }

    /**
     * Manda a llamar a un método que reemplaza las variables del árbol.
     */
    public void reemplazar() {
        reemplazar(raiz);
    }

    /**
     * Reemplaza las variables que contiene el arbol.
     *
     * @param subRaiz Subraiz a analizar.
     */
    private void reemplazar(NodoDoble subRaiz) {
        if (subRaiz != null) {
            if (ExpAritmetica.esOperandoString(subRaiz.getDato().toString())) {
                SalidaTerminal.consola("Nuevo valor para la variable: " + subRaiz.getDato().toString() + ": ");
                String valor = EntradaTerminal.consolaCadena();
                subRaiz.setDato(valor);
            }
            reemplazar(subRaiz.getDirMemIzq());
            reemplazar(subRaiz.getDirMemDer());
        }
    }


    //ACTIVIDAD 3 METODOS
    /**
     * Metodo que nos regresa la altura del arbol binario
     *
     * @return Regresa la altura del arbol
     */
    private void retornarAltura(NodoDoble subraiz, int nivel) {
        if (subraiz != null) {
            retornarAltura(subraiz.getDirMemIzq(), nivel + 1);
            if (nivel > altura)
                altura = nivel;
            retornarAltura(subraiz.getDirMemDer(), nivel + 1);
        }
    }
    /**
     * Manda a llamar a un método que retorna la latura del arbol
     *
     * @return regresa .la altura del arbol
     */
    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    /**
     * Manda a llamar a un método que encuentra los nodos hoja.
     *
     * @return Regresa cuantos nodo hoja existen.
     */
    public int contarNodosHoja() {
        ListaEncadenada lista = new ListaEncadenada();
        ListaEncadenada nodos = contarNodosHoja(raiz, lista);
        return nodos.contarRecursivo();

    }

    /**
     * Encuentra los nodos hoja que hay en un arbol.
     *
     * @param subRaiz Raíz a analizar.
     * @param lista   Lista para almacenar los nodos.
     * @return Regresa una lista con los nodos hoja.
     */
    private ListaEncadenada contarNodosHoja(NodoDoble subRaiz, ListaEncadenada lista) {
        if (subRaiz != null) {
            if (subRaiz.getDirMemIzq() == null && subRaiz.getDirMemDer() == null) {
                lista.agregar(subRaiz.getDato());
            }
            contarNodosHoja(subRaiz.getDirMemIzq(), lista);
            contarNodosHoja(subRaiz.getDirMemDer(), lista);
        }
        return lista;
    }

    /**
     * Manda a llamar a un método que encuentra los nodos padre.
     *
     * @return Regresa cuantos nodo padre existen.
     */
    public int contarNodosPadre() {
        ListaEncadenada lista = new ListaEncadenada();
        ListaEncadenada nodos = contarNodosPadre(raiz, lista);
        return nodos.contarRecursivo();

    }

    /**
     * Encuentra los nodos padre que hay en un arbol.
     *
     * @param subRaiz Raíz a analizar.
     * @param lista   Lista para almacenar los nodos.
     * @return Regresa una lista con los nodos padre.
     */
    private ListaEncadenada contarNodosPadre(NodoDoble subRaiz, ListaEncadenada lista) {
        if (subRaiz != null) {
            if (subRaiz.getDirMemIzq() != null || subRaiz.getDirMemDer() != null) {
                lista.agregar(subRaiz.getDato());
            }
            contarNodosPadre(subRaiz.getDirMemIzq(), lista);
            contarNodosPadre(subRaiz.getDirMemDer(), lista);
        }
        return lista;
    }


    /**
     * Encuentra los nodos padre que hay en un arbol.
     *
     * @param nodo  Nodo a analizar.
     * @param nivel Nivel del nodo
     * @return Regresa el nodo y su nivel
     */
    private void imprimirConNivel(NodoDoble nodo, int nivel) {
        if (nodo != null) {
            imprimirConNivel(nodo.getDirMemIzq(), nivel + 1);
            System.out.print(nodo.getDato() + " (" + nivel + ") - ");
            imprimirConNivel(nodo.getDirMemDer(), nivel + 1);
        }
    }

    /**
     * Manda a llamar a un método que imprime el nivel del nodo
     *
     * @return Rregresa el nodo y el nivel donde se encuentra
     */
    public void imprimirConNivel() {
        imprimirConNivel(raiz, 1);
        System.out.println();
    }

    /**
     * Encuentra los nodos padre que hay en un arbol.
     *
     * @param nodo  Nodo a analizar.
     * @param nivel Nivel del nodo
     * @return Regresa el nodo y su nivel
     */
    private void imprimirConNivelDado(NodoDoble nodo, int nivel) {
        SalidaTerminal.consola("Introduce el nodo: ");
        String datoNodo = EntradaTerminal.consolaCadena();
        NodoDoble nuevoNodo = new NodoDoble(datoNodo);
        if (nuevoNodo != null) {
            imprimirConNivelDado(nodo.getDirMemIzq(), nivel + 1);
            System.out.print(nodo.getDato() + " (" + nivel + ") - ");
            imprimirConNivelDado(nodo.getDirMemDer(), nivel + 1);
        }
    }
    /**
     * Manda a llamar a un método que imprime el nivel del nodo
     *
     * @return Rregresa el nodo y el nivel donde se encuentra
     */
    public void imprimirConNivelDado() {
        imprimirConNivel(raiz, 1);
        System.out.println();
    }


    /**
     * Crea un árbol a partir de una expresión aritmetica.
     * @param expresion Expresión para crear el arbol.
     */
    public void crearArbolDeExpresiones(String expresion){
        ArregloPila pila = new ArregloPila(expresion.length());
        NodoDoble nodoActual;
        char token=expresion.charAt(0);
        NodoDoble nodoRaiz = new NodoDoble(token);
        raiz=nodoRaiz;
        nodoActual = nodoRaiz;
        pila.poner(nodoActual);
        for(int posToken=1;posToken<expresion.length();posToken++){
            token=expresion.charAt(posToken);
            if(token=='('){
                NodoDoble nodo = new NodoDoble(token);
                if(nodoActual.getDirMemIzq()==null){
                    nodoActual.setDirMemIzq(nodo);
                }
                else{
                    nodoActual.setDirMemDer(nodo);
                }
                nodoActual = nodo;
                pila.poner(nodoActual);
            }
            if(ExpAritmetica.esOperando(token)==true && token!=' '){
                NodoDoble nodo = new NodoDoble(token);
                if(nodoActual.getDirMemIzq()==null){
                    nodoActual.setDirMemIzq(nodo);
                }
                else{
                    nodoActual.setDirMemDer(nodo);
                }
                nodoActual = nodo;
            }
            if(ExpAritmetica.esOperando(token)==false && token!=' ' && token!=')' && token!='('){
                NodoDoble nodoCabeza = (NodoDoble)pila.quitar();
                nodoCabeza.setDato(token);
            }
        }
    }










}





