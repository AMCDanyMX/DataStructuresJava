package estructurasnolineales;

import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;
import estructuraslineales.ArregloOrden;
import estructuraslineales.VectorDatos;

public class ArregloDatosProfe implements VectorDatos {
    protected int CAPACIDAD;
    protected int tope;
    protected Object lote[];

    public ArregloDatosProfe(int capacidad){
        CAPACIDAD=capacidad;
        lote=new Object[CAPACIDAD];
        tope=-1;
    }


    public boolean vacia(){
        if(tope==-1){
            return true;
        }else{
            return false;
        }
    }


    public boolean lleno(){
        if(tope== (CAPACIDAD - 1)){
            return true;
        }else{
            return false;
        }
    }


    public int agregar(Object elemento){
        if(lleno()==false){  //no esta llena la lista
            tope=tope+1;
            lote[tope]=elemento;
            return tope;
        }else{   //esta llena la lista
            return -1;
        }
    }

    @Override
    public boolean agregarOrdenado(Object elemento) {
        return false;
    }

    public void imprimir(){
        for(int posicion=0;posicion<=tope;posicion++){
            SalidaTerminal.consola(lote[posicion]+"\n");
        }
    }

    public void imprimirOrdenInverso(){
        for(int posicion=tope;posicion>=0;posicion--){
            SalidaTerminal.consola(lote[posicion]+"\n");
        }
    }

    public Object buscar(Object elemento){
        int posicion=0;
        while(posicion<=tope && !elemento.toString().equalsIgnoreCase(lote[posicion].toString())){
            posicion++;
        }
        if (posicion > tope) { //significa que no lo encontro
            return null;
        }else{
            return posicion;
        }
    }

    public Object eliminar(Object elemento){
        Integer posicion=(Integer)buscar(elemento);
        if(posicion!=null){ //si esta
            Object elementoBorrado=lote[posicion];
            tope= tope -1;
            for (int movs=posicion; movs<=tope;movs++){
                lote[movs]=lote[movs+1];
            }
            return elementoBorrado;
        }else{ //no esta
            return  null;
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

    public int capacidad(){
        return CAPACIDAD;
    }

    public int cantidadElementos(){
        return tope+1;
    }

    protected boolean enLimites(int indice){
        if(indice>=0 && indice<=tope){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object obtener(int indice){
        if(enLimites(indice)){
            return lote[indice];
        }else{
            return null;
        }
    }

    @Override
    public Object eliminar() {
        if (vacia()==false){
            Object contenidoBorrado=lote[tope];
            tope = tope -1;
            return contenidoBorrado;
        }else{
            return null;
        }
    }

    @Override
    public void vaciar() {

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

    public Object verTope(){
        if (vacia()==false){
            return lote[tope];
        }else{
            return null;
        }
    }

    @Override
    public void rellenar(Object elemento, int cantidad){
        int maximo=(cantidad>CAPACIDAD ? CAPACIDAD : cantidad );
        for(int pos=0;pos<maximo;pos++){
            agregar(elemento);
        }
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

    @Override
    public boolean cambiar(int indice, Object elemento){
        if (indice>=0 && indice<=CAPACIDAD){
            lote[indice]=elemento;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean cambiarArregloDatos(ArregloDatos indicesBusqueda, ArregloDatos elementosNuevos) {
        return false;
    }

    @Override
    public Object eliminar(int indice) {
        return null;
    }
}