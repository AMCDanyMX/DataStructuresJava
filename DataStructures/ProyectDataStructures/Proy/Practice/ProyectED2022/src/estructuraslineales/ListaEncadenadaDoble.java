package estructuraslineales;

import entradasalida.SalidaTerminal;
import estructuraslineales.registros.NodoDoble;

/**
 * @author Clase ED
 * @author Daniel Alejandro Morales Castillo
 * 6/10/2021
 * @version 2.0
 *
 */

public class ListaEncadenadaDoble implements ListaDatos{
    protected NodoDoble frente;
    protected NodoDoble fin;

    //Nodo iterador
    protected NodoDoble nodoActualDelIterador;

    /**
     *Constructor de la lista encadenada doble
     *
     */
    public ListaEncadenadaDoble(){
        frente=null;
        fin=null;
        nodoActualDelIterador = null;
    }

    /**
     *Metoo que ve si una lista esta vacia
     * @return verdadero si está vacia o falso en caso contrario
     */

    public boolean vacia(){
        if(frente==null){
            return true;
        }else{
            return false;
        }
    }


    /**
     *Metoo que ve si una lista esta llena
     * @return verdadero si está llena o falso en caso contrario
     */

    public boolean llena() {
        NodoDoble nodoPrueba = new NodoDoble("Nodo de prueba");
        if(nodoPrueba!=null){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Metodo que agrega un elemento a la lista encadenada
     * @param elemento el elemento que se va a aagregar el lal lista
     */


    public int agregar(Object elemento){
        NodoDoble nuevoNodo=new NodoDoble(elemento); //1
        if(nuevoNodo==null){ //esta lleno
            return -1;
        }else{ //no esta lleno
            if(vacia()==true){ //a, vacia
                frente=nuevoNodo; //2
                fin=nuevoNodo;
            }else{ //hay varios, b
                fin.setDirMemDer(nuevoNodo);//2
                nuevoNodo.setDirMemIzq(fin);//3
                fin=nuevoNodo;//4
            }
            return 1;
        }
    }

    /**
     * Metodo que imprime una lista encadenanda
     * @return nos regresa la impresion de la lista
     */

    public void imprimir(){
        if(vacia()==true){
            SalidaTerminal.consola("null");
        }else{ //hay datos
            NodoDoble temporal=frente;
            SalidaTerminal.consola("null <- ");
            while(temporal!=fin){
                SalidaTerminal.consola(temporal.getDato()+ " <--> ");
                temporal=temporal.getDirMemDer();
            }
            SalidaTerminal.consola(temporal.getDato() + " -> null");
        }
    }



    /**
     * Metodo que imprime una lista encadenanda de manera inversa
     * @return nos regresa la impresion de la lista pero de manera inversa
     */

    @Override
    public void imprimirOrdenInverso() {
        NodoDoble temporal = fin;
        SalidaTerminal.consola("null<-");
        if (temporal!=null){
            SalidaTerminal.consola(temporal.getDato()+"<->");
        }
        while (temporal!=null){
            temporal = temporal.getDirMemIzq();
            if (temporal!=null){
                SalidaTerminal.consola(temporal.getDato()+"");
            }
            if(temporal!=null && temporal.getDirMemIzq()!=null){
                SalidaTerminal.consola("<->");
            }
        }
        SalidaTerminal.consola("->null");
    }


    /**
     * Metodo que elimina un elemento de la lista
     * @param elemento es el elemento que se eliminara de la lista
     */
    @Override
    public Object eliminar(Object elemento) {
        if(buscar(elemento)!=null){//El valor se encuentra en la lista.
            NodoDoble temp = frente;
            if(frente==fin){//Es el único.
                frente=null;
                fin=null;
                return temp.getDato();
            } else{//Hay varios
                if(temp.getDato().toString().equalsIgnoreCase(elemento.toString())){//Es el primero.
                    frente=temp.getDirMemDer();
                    frente.setDirMemIzq(null);
                    return temp.getDato();
                }
                else if(fin.getDato().toString().equalsIgnoreCase(elemento.toString())){//Es el ultimo.
                    fin=fin.getDirMemIzq();
                    fin.setDirMemDer(null);
                    return fin.getDato();
                }
                else{//Esta en medio.
                    while(!temp.getDirMemDer().getDato().toString().equalsIgnoreCase(elemento.toString())){
                        temp=temp.getDirMemDer();
                    }
                    NodoDoble valorABorrar = temp.getDirMemDer();
                    NodoDoble adelante = valorABorrar.getDirMemDer();
                    temp.setDirMemDer(adelante);
                    adelante.setDirMemIzq(valorABorrar.getDirMemIzq());
                    return valorABorrar.getDato();
                }
            }
        } else{//La lista esta vacia o el valor no esta en la lista.
            return null;
        }
    }


    /**
     * Metodo que elimina un elemento de la lista
     */
    public Object eliminar(){
        if(vacia()==true){ //no hay nada, a
            return null;
        }else{ //si hay algo
            Object elementoBorrado=fin.getDato();//1
            if(frente==fin){ //b, unico
                frente=null; //2
                fin=null;
            }else{ //c, har varios
                fin=fin.getDirMemIzq();//2
                fin.setDirMemDer(null);//3
            }
            return elementoBorrado;
        }
    }

    /**
     * Metodo que vacia la lista
     */

    @Override
    public void vaciar() {
        frente=null;
        fin=null;
    }


    /**
     * Metodo que rellena la lista con elementos
     * @param elemento es el elemento que se agregara a la lista
     * @param cuantos la cantidad de elementos que llenara la lista
     */
    @Override
    public void rellenar(Object elemento, int cuantos) {
        if(vacia()==false){
            NodoDoble nodo = frente;
            int contador = 1;
            while(nodo!=null && contador <= cuantos){
                nodo.setDato(elemento);
                nodo=nodo.getDirMemDer();
                contador++;
            }
        }
    }

    /**
     * Metodo que rellena la lista con elementos
     * @param elemento es el elemento que se agregara a la lista
     */
    @Override
    public void rellenar(Object elemento) {
        if(vacia()==false){
            NodoDoble nodo = frente;
            while(nodo!=null){
                nodo.setDato(elemento);
                nodo=nodo.getDirMemDer();
            }
        }
    }

    //Metodos practica 19
    /**
     * Método que inicializa el nodo actual iterador.
     */
    public void inicializarIterador(){
        nodoActualDelIterador = frente;
    }

    /**
     * Método que verifica si existe un nodo siguiente.
     * @return Regresa <b>true</b> en caso de que sea verdad y <b>false</b> en
     * caso contrario.
     */
    public boolean hayNodoSiguiente(){
        if(nodoActualDelIterador!=null){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Método que obtiene el contenido del nodo actual y se cambia al siguiente nodo.
     * @return Regresa el contenido del nodo actual y null en caso de que no haya un
     * nodo siguiente.
     */
    public Object obtenerSiguiente(){
        if(hayNodoSiguiente()){
            Object contenido = nodoActualDelIterador.getDato();
            nodoActualDelIterador=nodoActualDelIterador.getDirMemDer();
            return contenido;
        } else{
            return null;
        }
    }
    /**
     * Método que inserta un nodo doble al inicio de la lista.
     * @param elemento Valor que contendra el nuevo nodo a insertar.
     * @return Regresa <b>true</b> en caso de que se inserte correctamente
     * <b>false</b> en caso contrario.
     */
    public boolean insertarInicio(Object elemento){
        NodoDoble nuevo = new NodoDoble(elemento);
        if (nuevo != null){//Hay espacio o no hay error.
            if(vacia()){//Esta vacia.
                frente=nuevo;
                fin=nuevo;
            } else{//Ya hay algo.
                nuevo.setDirMemDer(frente);
                frente.setDirMemIzq(nuevo);
                frente = nuevo;
            }
            return true;
        } else{//Hay error o no hay espacio.
            return false;
        }
    }

    @Override
    public boolean agregarOrdenado(Object elemento) {
        return false;
    }

    @Override
    public boolean agregarLista(ArregloDatos listaDatos2) {
        return false;
    }

    @Override
    public Object clonar() {
        return null;
    }



    /**
     * Método que inserta un nodo doble al inicio de la lista.
     * @param elemento Valor que contendra el nuevo nodo a insertar.
     * @param indice en el cal se pondra el elemtno nuevo
     * @return Regresa <b>true</b> en caso de que se inserte correctamente
     * <b>false</b> en caso contrario.
     */
    @Override
    public boolean insertar(int indice, Object elemento) {
        NodoDoble nuevo = new NodoDoble(elemento);
        if (nuevo != null){//Hay espacio o no hay error.
            if(vacia()){//Esta vacia.
                frente=nuevo;
                fin=nuevo;
            } else{//Ya hay algo.
                nuevo.setDirMemDer(frente);
                frente.setDirMemIzq(nuevo);
                frente = nuevo;
            }
            return true;
        } else{//Hay error o no hay espacio.
            return false;
        }
    }


    /**
     * Método que busca un nodo desde el inicio va hacia la derecha
     * @param elemento Valor que contendra el nodo
     * @return regresa el dato del nodo buscado
     */
    @Override
    public Object buscar(Object elemento) {
        NodoDoble temp = frente;
        while(temp!=null && !temp.getDato().toString().equalsIgnoreCase(elemento.toString())){
            temp=temp.getDirMemDer();
        }
        if(temp==null){//Esta vacia o no existe.
            return null;
        } else{//Si hay algo.
            return temp.getDato();
        }
    }

    @Override
    public boolean esIgual(Object listaDatos2) {
        return false;
    }

    @Override
    public boolean cambiar(Object elementoViejo, Object elementoNuevo, int numVeces) {
        return false;
    }

    @Override
    public ArregloDatos buscarValores(Object elemento) {
        return null;
    }


    /**
     * Método que busca un nodo desde el final, va hacia la izquierda
     * @param elemento Valor que contendra el nodo
     * @return regresa el dato del nodo buscado
     */
    public Object buscarDesdeFinal(Object elemento) {
        NodoDoble temp = fin; //iniciamos pero desde el fnal de la lista
        while(temp!=null && !temp.getDato().toString().equalsIgnoreCase(elemento.toString())){
            temp=temp.getDirMemIzq();
        }
        if(temp==null){//Esta vacia o no existe.
            return null;
        } else{//Si hay algo.
            return temp.getDato();
        }
    }

    /**
     * Método que cuenta la cantidad de elementos de la lista
     * @param elemento Valor que contendra el nodo
     */
    @Override
    public int contar(Object elemento) {
        if(vacia()==false){//Hay Elementos.
            inicializarIterador();
            int contador=0;
            while (hayNodoSiguiente()){
                Object contenido = obtenerSiguiente();
                if(contenido.toString().equalsIgnoreCase(elemento.toString())){
                    contador++;
                }
            }
            return contador;
        } else{
            return 0;
        }
    }

    /**
     * Método que inicializa el nodo actual iterador inverso.
     */
    public void inicializarIteradorInverso(){
        nodoActualDelIterador = fin;
    }

    /**
     * Método que verifica si existe un nodo siguiente.
     * @return Regresa <b>true</b> en caso de que sea verdad y <b>false</b> en
     * caso contrario.
     */
    public boolean hayNodoSiguienteAlReves(){
        if(nodoActualDelIterador!=null){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Método que obtiene el contenido del nodo actual y se cambia al siguiente nodo.
     * @return Regresa el contenido del nodo actual y null en caso de que no haya un
     * nodo siguiente.
     */
    public Object obtenerSiguienteInverso(){
        if(hayNodoSiguiente()){
            Object contenido = nodoActualDelIterador.getDato();
            nodoActualDelIterador=nodoActualDelIterador.getDirMemIzq();
            return contenido;
        } else{
            return null;
        }
    }

    /**
     * Método que elimina el inicio el nodo al inicio de la lista
     * @return Regresa el contenido del nodo eliminado
     */

    public Object eliminarInicio(){
        Object datoEliminado=null;
        if (vacia()==true){ //a
            return null;
        }else{   //si hay algo
            datoEliminado=frente.getDato(); //1
            if(frente==fin){  //b, único
                //datoEliminado=frente.getDato(); //1
                frente=null;//2
                fin=null;
            }else{   //c, varios
                //datoEliminado=frente.getDato(); //1
                frente=frente.getDirMemDer();//2
            }
            return datoEliminado;
        }
    }

    @Override
    public void invertir() {
        nodoActualDelIterador = fin;
    }


    /**
     * Método que obtiene el contenido del nodo actual y se cambia al siguiente nodo.
     * @return Regresa el contenido del nodo actual y null en caso de que no haya un
     * nodo siguiente.
     */
    public Object obtenerNodoIzqDer(){
        if(hayNodoSiguiente() && hayNodoSiguienteAlReves()){
            Object contenido = nodoActualDelIterador.getDato();
            nodoActualDelIterador = nodoActualDelIterador.getDirMemDer();
            nodoActualDelIterador = nodoActualDelIterador.getDirMemIzq();
            return contenido;

        } else{
            return null;
        }
    }

    /**
     * Método que regresa 3 listas encadenadas de 3 tipos
     */
    public void lasListas(ListaEncadenadaDoble numeros, ListaEncadenadaDoble cadenas, ListaEncadenadaDoble alumnos){
        numeros.imprimir();
        cadenas.imprimir();
        alumnos.imprimir();
    }


    @Override
    public boolean cambiarOrdenado(Object elementoViejo, Object elementoNuevo, int numVeces) {
        return false;
    }

    @Override
    public boolean agregarLista(ArregloOrden listaDatos2) {
        return false;
    }

    @Override
    public boolean copiarLista(ArregloOrden listaDatos2) {
        return false;
    }














}