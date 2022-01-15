
package estructuraslineales;


import entradasalida.SalidaTerminal;
import estructuraslineales.registros.Nodo;
import herramientas.comunes.TipoOrden;
import recursos.Comparador;

/**
 * TDA que representa una lista encadenada ordenada.
 * @author Daniel Alejandro Morales Castillo
 */
public class ListaEncadenadaOrdenada implements ListaDatos{
    protected Nodo frente;
    protected Nodo fin;
    protected TipoOrden orden;
    /**
     * Cosntructor de la clase ListaEncadenadaOrdenada.
     * @param orden Criterio de orden con el que la lista se pone
     */
    public ListaEncadenadaOrdenada(TipoOrden orden){
        frente=null;
        fin=null;
        this.orden=orden;
    }

    /**
     * Metodo para ver si está llena
     *
     */

    public boolean llena() {
        Nodo nodoPrueba = new Nodo("Prueba");
        if(nodoPrueba!=null){
            return false;
        } else{
            return true;
        }
    }
    /**
     * KMetodo para ver si la lista esta vacia
     */
    @Override
    public boolean vacia() {
        if(frente==null){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Inserta al final de la lista un elemento proporcionado.
     * @param elemento Es el dato que se desea agregar a la lista.
     * @return Regresa un 1 en caso de que se agregue el elemento, o -1 en caso contrario.
     */
    @Override
    public int agregar(Object elemento){
        Nodo nuevoNodo=new Nodo(elemento); //1
        if(nuevoNodo!=null){ //si hay espacio
            if(vacia()==true){ //a
                frente=nuevoNodo;//2
                fin=nuevoNodo;
            }else{ //b y c
                fin.setDirMemDer(nuevoNodo);//2
                fin=nuevoNodo;//3
            }
            return 1;
        }else{ //no hay espacio
            return -1;
        }
    }

    /**
     * Metodo para agregar elemento de forma ordenada.
     * @param elemento Es el dato que se desea agregar a la lista.
     *
     */

    @Override
    public boolean agregarOrdenado(Object elemento) {
        if(orden.getOrden()==1){//Es ascendente
            Nodo nodo = new Nodo(elemento);
            if(nodo!=null){//Existe espacio para agregar.
                if(fin==null){//Esta vacia
                    frente=nodo;
                    fin=nodo;
                    return true;
                }
                else{//Existe algo en la lista.
                    Nodo auxiliar = frente;
                    if(buscar(elemento)==null){//No se encuentra en la lista.
                        if(Comparador.comparar(nodo.getDato(),auxiliar.getDato())==1){//El nodo es el grande.
                            nodo.setDirMemDer(frente);
                            frente=nodo;
                        }
                        else if(Comparador.comparar(nodo.getDato(),fin.getDato())==-1){//El nodo es el más pequeño.
                            fin.setDirMemDer(nodo);
                            fin=nodo;
                        }
                        else{
                            while(Comparador.comparar(nodo.getDato(),auxiliar.getDirMemDer().getDato())==-1){
                                auxiliar=auxiliar.getDirMemDer();
                            }
                            nodo.setDirMemDer(auxiliar.getDirMemDer());
                            auxiliar.setDirMemDer(nodo);
                        }
                        return true;
                    }
                    else{//El valor ya esta en la lista
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
        else{//Es descendente
            Nodo nodo = new Nodo(elemento);
            if(nodo!=null){//Existe espacio para agregar.
                if(fin==null){//Esta vacia
                    frente=nodo;
                    fin=nodo;
                    return true;
                }
                else{//Existe algo en la lista.
                    Nodo auxiliar = frente;
                    if(buscar(elemento)==null){//No se encuentra en la lista.
                        if(Comparador.comparar(nodo.getDato(),auxiliar.getDato())==1){//El nodo es el grande.
                            nodo.setDirMemDer(frente);
                            frente=nodo;
                        }
                        else if(Comparador.comparar(nodo.getDato(),fin.getDato())==-1){//El nodo es el más pequeño.
                            fin.setDirMemDer(nodo);
                            fin=nodo;
                        }
                        else{
                            while(Comparador.comparar(nodo.getDato(),auxiliar.getDirMemDer().getDato())==-1){
                                auxiliar=auxiliar.getDirMemDer();
                            }
                            nodo.setDirMemDer(auxiliar.getDirMemDer());
                            auxiliar.setDirMemDer(nodo);
                        }
                        return true;
                    }
                    else{//El valor ya esta en la lista
                        return false;
                    }
                }
            }
            else{
                return false;
            }
        }
    }



    /**
     * Metodo para imprimir de manera inversa
     *
     */
    @Override
    public void imprimirOrdenInverso() {
        Nodo temp = frente;
        String cadena="";
        while(temp!=null){
            cadena = temp.getDato() + "<-"+ cadena;
            temp=temp.getDirMemDer();
        }
        SalidaTerminal.consola("null"+"<-"+cadena);
    }

    /**
     * Metodo para busacr un elemento en la lista
     * @param elemento es el elemento que se buscará
     */

    @Override
    public Object buscar(Object elemento) {
        Nodo temp = frente;
        while(temp!=null && !temp.getDato().toString().equalsIgnoreCase(elemento.toString())){
            temp=temp.getDirMemDer();
        }
        if(temp==null){//Esta vacia o no existe.
            return null;
        } else{//Si hay algo.
            return temp.getDato();
        }
    }


    /**
     * Metodo para eliinar un elemento de la lista
     *
     */

    @Override
    public Object eliminar(Object elemento) {
        if(buscar(elemento)!=null){//El valor se encuentra en la lista.
            Nodo temp = frente;
            if(frente==fin){//Es el único.
                frente=null;
                fin=null;
                return temp.getDato();
            } else{//Hay varios
                if(temp.getDato().toString().equalsIgnoreCase(elemento.toString())){//Es el primero.
                    frente=temp.getDirMemDer();
                    return temp.getDato();
                }
                else if(fin.getDato().toString().equalsIgnoreCase(elemento.toString())){//Es el ultimo.
                    while(temp.getDirMemDer()!=fin){
                        temp=temp.getDirMemDer();
                    }
                    temp.setDirMemDer(null);
                    fin=temp;
                    return temp.getDato();
                }
                else{//Esta en medio.
                    while(!temp.getDirMemDer().getDato().toString().equalsIgnoreCase(elemento.toString())){
                        temp=temp.getDirMemDer();
                    }
                    Nodo valorABorrar = temp.getDirMemDer();
                    temp.setDirMemDer(valorABorrar.getDirMemDer());
                    return valorABorrar.getDato();
                }
            }
        }
        else{//La lista esta vacia o el valor no esta en la lista.
            return null;
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

    @Override
    public Object eliminar() {
        return null;
    }

    /**
     * Cuenta los elementos que hay en la lista iguales al argumento
     * @return Regresa el número de elementos que tiene la lista.
     */
    @Override
    public void vaciar() {
        frente=null;
        fin=null;
    }

    @Override
    public boolean agregarLista(ArregloDatos listaDatos2) {
        return false;
    }

    @Override
    public void invertir() {

    }

    @Override
    public int contar(Object elemento) {
        return 0;
    }

    @Override
    public void rellenar(Object elemento, int cantidad) {

    }

    @Override
    public Object clonar() {
        return null;
    }

    @Override
    public boolean cambiarOrdenado(Object elementoViejo, Object elementoNuevo, int numVeces) {
        return false;
    }

    @Override
    public void rellenar(Object elemento) {

    }

    @Override
    public boolean insertar(int indice, Object elemento) {
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

    /**
     * Metodo para imporimir de manera natural
     */

    @Override
    public void imprimir() {
        Nodo temp = frente;
        while(temp!=null){
            SalidaTerminal.consola(temp.getDato()+ " ->");
            temp=temp.getDirMemDer();
        }
        SalidaTerminal.consola("null");
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
            }
            else{//Hay varios.
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
     * Elimina el nodo que esta al inicio.
     * @return Regresa el nodo eliminado o null en caso de que no se elimine nada.
     */
    public Object eliminarFin(){
        if(!vacia()){//Hay algo.
            Object contenido = fin.getDato();
            if(frente==fin){//unico.
                frente=null;
                fin=null;
            }
            else{//Hay varios.
                //El nuevo es el segundo.
                fin=fin.getDirMemDer();
            }
            return contenido;
        }
        else{//Esta vacia.
            return null;
        }
    }







}
