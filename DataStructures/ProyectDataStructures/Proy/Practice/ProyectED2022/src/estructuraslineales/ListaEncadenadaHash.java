
package estructuraslineales;

import entradasalida.SalidaTerminal;
import estructuraslineales.registros.NodoHash;

/**
 * TDA que representa una lista enlazada simple que maneja nodos hash.
 * @author Daniel Alejandro Morales Castillo - ED
 */
public class ListaEncadenadaHash {
    protected NodoHash frente;
    protected NodoHash fin;
    protected NodoHash nodoActualIterador;

    /**
     * Constructor de la Clase lista enlazada hash.
     */
    public ListaEncadenadaHash(){
        frente=null;
        fin=null;
        nodoActualIterador=null;
    }
    /**
     * Este método busca si existe un nodo con un valor.
     * @param valor Valor a ser buscado.
     * @return Regresa el info del valor encontrado, o null en caso contrario.
     */
    public Object buscarValor(Object valor) {
        NodoHash temp = frente;
        while(temp!=null && !temp.getDato().toString().equalsIgnoreCase(valor.toString())){
            temp=temp.getDirMemDer();
        }
        if(temp==null){//Esta vacia o no existe.
            return null;
        }
        else{//Si hay algo.
            return temp.getDato();
        }
    }
    /**
     * Este método busca un elemento en la lista por medio de una clave.
     * @param clave Clave a buscar.
     * @return Regresa la info del nodo encontrado,o null en caso contrario.
     */
    public Object buscar(Object clave){
        NodoHash temp = frente;
        while(temp!=null && !temp.getClave().toString().equalsIgnoreCase(clave.toString())){
            temp=temp.getDirMemDer();
        }
        if(temp==null){//Esta vacia o no existe.
            return null;
        } else{//Si hay algo.
            return temp.getDato();
        }
    }
    /**
     * Método que funciona para insertar al final de la lista en caso de que no se repita la llave.
     * @param clave Clave del nuevo nodo a insertar.
     * @param valor Valor del nuevo nodo a insertar.
     * @return Regresa true en caso de que se realice correctamente false en caso contrario.
     */
    public boolean insertar(Object clave, Object valor){
        Object busqueda = buscar(clave);
        if(busqueda==null){//El valor es valido ya que no esta en la lista.
            NodoHash nuevo = new NodoHash(clave,valor);
            if(nuevo!=null){//Tiene una dirección valida.
                if(fin==null){//vacia.
                    frente=nuevo;
                    fin=nuevo;
                } else{//ya tiene algo.
                    fin.setDirMemDer(nuevo);
                    fin=nuevo;
                }
                return true;
            } else{//Hubo un error o no hay espacio.
                return false;
            }
        }
        else{
            return false;
        }
    }
    /**
     * Este método imprime la lista.
     */
    public void imprimir() {
        NodoHash temp = frente;
        while(temp!=null){
            SalidaTerminal.consola("["+temp.getClave()+","+temp.getDato()+"]"+ " ->");
            temp=temp.getDirMemDer();
        }
        SalidaTerminal.consola("null");
    }

    /**
     * Este método imprime la lista.
     */
    public void imprimirClaves() {
        NodoHash temp = frente;
        while(temp!=null){
            SalidaTerminal.consola("["+temp.getClave() + "]"+ " ->");
            temp=temp.getDirMemDer();
        }
        SalidaTerminal.consola("null");
    }

    /**
     * Este método imprime la lista.
     */
    public void imprimirValores() {
        NodoHash temp = frente;
        while(temp!=null){
            SalidaTerminal.consola("[" + temp.getDato()+"]"+ " ->");
            temp=temp.getDirMemDer();
        }
        SalidaTerminal.consola("null");
    }
    /**
     * Método que elimina por medio de una clave.
     * @param clave Clave a buscar para eliminar.
     * @return Regresa el valor del objeto eliminado o null en caso de que no se pueda.
     */
    public Object eliminar(Object clave){
        if(!vacia()){
            NodoHash actual = frente;
            NodoHash atras = actual;
            Object contenido;
            while (actual!=null && !actual.getClave().toString().equalsIgnoreCase(clave.toString())){
                atras=actual;
                actual=actual.getDirMemDer();
            }
            if(actual==null){//No encontro nada.
                return null;
            } else{//Cuando encontro algo.
                contenido=actual.getDato();
                if(frente==fin){
                    frente=null;
                    fin=null;
                }
                else if(actual==fin){
                    atras.setDirMemDer(null);
                    fin=atras;
                }
                else if(actual==frente){
                    frente=frente.getDirMemDer();
                }
                else{
                    atras.setDirMemDer(actual.getDirMemDer());
                }
                return contenido;
            }
        }
        else{
            return null;
        }
    }
    /**
     * Método que elimina por medio de la busqueda de su valor.
     * @param valor Valor a buscar y eliminar.
     * @return Regresa el valor del nodo eliminado o null en caso de que no se haya eliminado.
     */
    public Object eliminarValor(Object valor){
        if(!vacia()){
            NodoHash actual = frente;
            NodoHash atras = actual;
            Object contenido;
            while (actual!=null && !actual.getDato().toString().equalsIgnoreCase(valor.toString())){
                atras=actual;
                actual=actual.getDirMemDer();
            }
            if(actual==null){//No encontro nada.
                return null;
            } else{//Cuando encontro algo.
                contenido=actual.getDato();
                if(frente==fin){
                    frente=null;
                    fin=null;
                }
                else if(actual==fin){
                    atras.setDirMemDer(null);
                    fin=atras;
                }
                else if(actual==frente){
                    frente=frente.getDirMemDer();
                }
                else{
                    atras.setDirMemDer(actual.getDirMemDer());
                }
                return contenido;
            }
        }
        else{
            return null;
        }
    }
    /**
     * Método que prueba si la lista esta vacia.
     * @return Regresa true en caso de que este vacia, false en caso contrario.
     */
    public boolean vacia() {
        if(frente==null){
            return true;
        } else{
            return false;
        }
    }
    /**
     * Substituye un valor.
     * @param clave Clave del valor a buscar.
     * @param nuevoValor Elemento con el que se reemplazará.
     * @return Regresa true en caso de que se realize de manera correcta, false
     *  en caso contrario.
     */
    public boolean substituir(Object clave, Object nuevoValor){
        NodoHash temp = frente;
        while(temp!=null && !temp.getClave().toString().equalsIgnoreCase(clave.toString())){
            temp=temp.getDirMemDer();
        }
        if(temp==null){//Esta vacia o no existe.
            return false;
        } else{//Si hay algo.
            temp.setDato(nuevoValor);
            return true;
        }
    }
    /**
     * Substituye un valor.
     * @param valor Valor del nodo a buscar.
     * @param nuevoValor Elemento con el que se reemplazará.
     * @return Regresa true en caso de que se realize de manera correcta, false
     *  en caso contrario.
     */
    public boolean substituirValor(Object valor, Object nuevoValor){
        NodoHash temp = frente;
        while(temp!=null && !temp.getDato().toString().equalsIgnoreCase(valor.toString())){
            temp=temp.getDirMemDer();
        }
        if(temp==null){//Esta vacia o no existe.
            return false;
        } else{//Si hay algo.
            temp.setDato(nuevoValor);
            return true;
        }
    }
    /**
     * Cuenta los elementos que hay en la lista.
     * @return Regresa el número de elementos que tiene la lista.
     */
    public int contarElementos() {
        if(vacia()==false){//Hay Elementos.
            inicializarIterador();
            int contador=0;
            while (hayNodoSiguiente()){
                Object contenido = obtenerSiguiente();
                contador++;
            }
            return contador;
        } else{
            return 0;
        }
    }
    /**
     * Método que inicializa el nodo actual iterador.
     */
    public void inicializarIterador(){
        nodoActualIterador = frente;
    }
    /**
     * Método que verifica si existe un nodo siguiente.
     * @return Regresa <b>true</b> en caso de que sea verdad y <b>false</b> en
     * caso contrario.
     */
    public boolean hayNodoSiguiente(){
        if(nodoActualIterador!=null){
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
            Object contenido = nodoActualIterador.getDato();
            nodoActualIterador=nodoActualIterador.getDirMemDer();
            return contenido;
        } else{
            return null;
        }
    }
    /**
     * Las claves y los valores los mete en arreglos y despues esos arreglos son agregados
     * a una lista ligada.
     * @return Regresa la lista con los arreglos, o en caso de que no haya datos que guardar
     * regresa null.
     */
    public ListaEncadenadaHash aArreglos(){
        int elementos = contarElementos();
        if(elementos>0){
            ListaEncadenadaHash lista = new ListaEncadenadaHash();
            ArregloDatos claves = new ArregloDatos(elementos);
            ArregloDatos valores = new ArregloDatos(elementos);
            NodoHash temp = frente;
            while(temp!=null){
                Object clave = temp.getClave();
                Object valor = temp.getDato();
                claves.agregar(clave);
                valores.agregar(valor);
                temp=temp.getDirMemDer();
            }
            lista.insertar("Claves",claves);
            lista.insertar("Valores",valores);
            return lista;
        } else{
            return null;
        }
    }

    public ListaEncadenadaHash aListas(){
        if(vacia()==false){
            ListaEncadenadaHash lista = new ListaEncadenadaHash();
            ListaEncadenada claves = new ListaEncadenada();
            ListaEncadenada valores = new ListaEncadenada();
            NodoHash temp = frente;
            while(temp!=null){
                Object clave = temp.getClave();
                Object valor = temp.getDato();
                claves.agregar(clave);
                valores.agregar(valor);
                temp=temp.getDirMemDer();
            }
            lista.insertar("Claves",claves);
            lista.insertar("Valores",valores);
            return lista;
        } else{
            return null;
        }
    }
    /**
     * Elimina el nodo que esta al inicio.
     * @return Regresa el nodo eliminado o null en caso de que no se elimine nada.
     */
    public Object eliminarInicio(){
        if(!vacia()){//Hay algo.
            Object contenido = frente.getDato();
            if(frente==fin){//unico.
                frente=null;
                fin=null;
            } else{//Hay varios.
                //El nuevo es el segundo.
                frente=frente.getDirMemDer();
            }
            return contenido;
        }
        else{//Esta vacia.
            return null;
        }
    }
    /**
     * Hace una matriz de 2 dimensiones con los valores de la lisa.
     * @return Regresa la matriz o null en caso externo.
     */
    public Tabla2D aMatriz2D(){
        int elementos = contarElementos();
        int fila=0;
        int colClave=0;
        int colValor=1;
        if(elementos>0){
            Tabla2D matriz = new Tabla2D(elementos,2);
            NodoHash temp = frente;
            while(temp!=null){
                Object clave = temp.getClave();
                Object valor = temp.getDato();
                matriz.asignarCelda(fila,colClave,clave);
                matriz.asignarCelda(fila,colValor,valor);
                fila++;
                temp=temp.getDirMemDer();
            }
            return matriz;
        } else{
            return null;
        }
    }


    /**
     * Metodo que vacia la lista hash
     */
    public void vaciar() {
        frente=null;
        fin=null;
    }



    /**
     * Metodo que cuenta la cantidad de elementos de la lista hash
     */
    public int cantidadElementos() {
        if(vacia()==false){//Hay Elementos.
            inicializarIterador();
            int contador=0;
            while (hayNodoSiguiente()){
                Object contenido = obtenerSiguiente();
                if(contenido!=null){
                    contador++;
                }
            }
            return contador;
        } else{
            return 0;
        }
    }

    /**
     * Metodo que agrega una nueva lista hash a la otra
     */// public boolean agregarLista(ListaEncadenadaHash listaagregar){ }




}
