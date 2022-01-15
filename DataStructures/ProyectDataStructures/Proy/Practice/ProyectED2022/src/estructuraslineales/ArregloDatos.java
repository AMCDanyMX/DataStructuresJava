/**
 * Clase ArregloDatos
 * @author Daniel Alejandro Morales Castillo
 * @version 2.0
 */

package estructuraslineales;

import entradasalida.SalidaTerminal;

public class ArregloDatos implements VectorDatos{
    protected int CAPACIDAD;
    protected int tope;
    protected Object lote[];
    //lista2
    protected Object listaDatos2;

    public ArregloDatos(int capacidad){
        CAPACIDAD=capacidad;
        lote=new Object[CAPACIDAD];
        tope=-1;
    }


    @Override
    public boolean vacia(){
        if(tope==-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean lleno(){
        if(tope== (CAPACIDAD - 1)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int agregar(Object elemento){
        if(lleno()==false){  //esta llena la lista
            tope=tope+1;
            lote[tope]=elemento;
            return tope;
        }else{   //no esta llena la lista
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
    /**
     * Elimina un elemento.
     * @param elemento el elemento que se va a eliminar
     * @return Regresa el elemento borrado
     */
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

    /**
     *@return regresa la capacidad del arreglo
     */
    public int capacidad() {
        return CAPACIDAD;
    }

    /**
     *Metodo que regresa la cantidad de elementos del arreglo
     * @return la cantidad de elementos del arreglo.
     */
    public int cantidadElementos(){
        return tope+1;
    }


    public boolean enLimites(int indice){
        if(indice>=0 && indice <=tope){
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
    public boolean esIgual(Object listaDatos2){
        boolean control=true;
        for (Object o : lote) {
            if (o != listaDatos2) {
                control = false;
                break;
            }
        }
        return control;
    }


    public boolean cambiar(Object elementoviejo, Object elementonuevo, int numVeces) {
        boolean cambiado=false;
        for(int i=0; i<=numVeces; i++){
            Integer posicion= (Integer)buscar(elementoviejo);
            if(posicion!=null){
                lote[posicion]=elementonuevo;
                cambiado=true;
            }

        }
        return cambiado;
    }

    @Override
    public boolean cambiar(int indice, Object elemento) {
        if(indice>=0 && indice<=tope){
            lote[indice]=elemento;
            return true;
        }
        return false;
    }

    @Override
    public boolean cambiarArregloDatos(ArregloDatos indicesBusqueda, ArregloDatos elementosNuevos) {

        return false;
    }

    @Override
    public ArregloDatos buscarValores(Object elemento) {
        int ocurrencias = 0;
        for(int i=0; i<=tope; i++){
            if(elemento.toString().equalsIgnoreCase(lote[i].toString())){
                ocurrencias++;
            }
        }
        ArregloDatos arreglo = new ArregloDatos(ocurrencias);
        for(int posicion=0; posicion<=tope; posicion++){
            if(elemento.toString().equalsIgnoreCase(lote[posicion].toString())){
                arreglo.agregar(posicion);
            }
        }
        return arreglo;
    }

    @Override
    public Object eliminar(int indice) {
        Integer posicion=(Integer)buscar(indice);
        if(posicion!=null){  //si lo encontro
            Object elementoBorrado=lote[posicion];
            tope = tope - 1;
            for(int mov=posicion; mov <= tope; mov++){
                lote[mov]=lote[mov+1];
            }
            return elementoBorrado;
        }else{ //no lo encontro
            return null;
        }
    }

    @Override
    public Object eliminar() {
        Object elementoRegresar;
        elementoRegresar = lote[tope];
        return elementoRegresar;

    }

    @Override
    public void vaciar() {
        tope=-1;
    }

    /**
     * Agrega la lista 2 al arreglo 1
     * @param listaDatos2 Es el arreglo del cual se agregaran los elementos.
     */
    @Override
    public boolean agregarLista(ArregloDatos listaDatos2) {
        if(lleno()==false){
            if(listaDatos2.vacia()){
                return false;
            }else{
                int vacios = CAPACIDAD-(tope-1);
                for(int i=0; i<vacios && listaDatos2.obtener(i)!=null;i++){
                    tope++;
                    lote[tope]=listaDatos2.obtener(i);
                }
                return true;
            }

        }else{
            return false;
        }
    }

    @Override
    public void invertir() {
        if(vacia()==false){
            int aux = tope;
            Object variable1;
            Object variable2;

            for(int i=0; i<= (tope)/2; i++){
                variable1=lote[i];
                variable2=lote[aux];
                lote[i]=variable2;
                lote[aux]=variable1;
                aux--;
            }
        }
    }

    @Override
    public int contar(Object elemento) {
        if(vacia()){
            return 0;
        }else{
            int contar = 0;
            for(int posicion =0; posicion<=tope; posicion++){
                if(elemento.toString().equalsIgnoreCase(lote[posicion].toString())){
                    contar++;
                }
            }
            return contar;
        }
    }


    public boolean eliminarLista(Object listaDatos2) {
        return false;
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
        for(int i=0; i<tope; i++){
            listaDatos2 = lote[i];
        }
        return listaDatos2;
    }


    public Object subLista(int indiceInicial, int indiceFinal) {
        return null;
    }

    public Object redimensionar(int maximo) {
        return null;
    }




    //Metodos añadidos práctica 4

    @Override
    public boolean cambiarOrdenado(Object elementoViejo, Object elementoNuevo, int numVeces) {
        boolean cambiado=false;
        for(int i=0; i<=numVeces; i++){
            Integer posicion= (Integer)buscar(elementoViejo);
            if(posicion!=null){
                lote[posicion]=elementoNuevo;
                cambiado=true;
            }

        }
        return cambiado;
    }


    @Override
    public void rellenar(Object elemento) {
        agregar(elemento);
    }


    /**
     * Establece un valor en la posición que le porporcionamos.
     * @param indice Es la posición donde queremos poner el valor.
     * @param elemento Es objeto que queremos establecer.
     * @return Regresa verdadero en caso de que si se inserte, en el caso
     * contrario regresa false.
     */
    public boolean insertar(int indice, Object elemento){
        if (indice>=0 && indice<=tope){
            lote[indice]=elemento;
            return true;
        }
        return false;
    }

    /**
     * Copia el contenido del arreglo 2 al arreglo 1.
     * @param listaDatos2 Es el arreglo del cual se copiaran los elementos.
     * @return Regresa true si se copio correctamente, y false en caso
     * contrario.
     */
    public boolean copiarLista(ArregloOrden listaDatos2){
        if(CAPACIDAD==listaDatos2.capacidad()){
            vaciar();
            for(int contador=0;contador<=listaDatos2.tope;contador++){
                lote[contador]=listaDatos2.lote[contador];
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean agregarLista(ArregloOrden listaDatos2) { //lista de datos 2 es de tipo Arreglo orden
        if(lleno()==false){
            if(listaDatos2.vacia()){
                return false;
            }
            else{
                int vacios=CAPACIDAD-(tope+1);
                for (int contador=0;contador<vacios && listaDatos2.obtener(contador)!=null;contador++){
                    tope++;
                    lote[tope]=listaDatos2.obtener(contador);
                }
                return true;
            }
        }
        else{
            return false;
        }
    }

    /**
     * Pasa todos los datos que contiene el parametro a nuestro arreglo.
     * @param buffer Es el arreglo con datos que recibimos.
     * @return Regresa true si se completo la tarea correctamente, false en caso
     * contrario.
     */
    public boolean guardarBuffer(double[] buffer){
        if(vacia()==true){
            int vacios=CAPACIDAD;
            for (int contador=0;contador<vacios;contador++){
                agregar(buffer[contador]);

            }
            return true;
        }
        else{
            SalidaTerminal.consola("El arreglo datos no esta vacio no se puede agregar ");
            return false;
        }
    }
    /**
     * Crea una copia de nuestro arreglo datos.
     * @return Regresa una copia de datos[].
     */
    public Object[] leerArreglo(){
        Object[] copia;
        copia= new Object[CAPACIDAD];
        if(vacia()==false){
            int espacios=CAPACIDAD;
            for (int contador=0;contador<espacios;contador++){
                copia[contador]=lote[contador];

            }
            return copia;
        }
        else{
            return null;
        }
    }

    public Object verTope(){
        if (vacia()==false){
            return lote[tope];
        }else{
            return null;
        }
    }


    //Metodos version 2 de recursión practica 23
    public void imprimirInversoRR(){
        for(int contador=tope;contador>=0;contador--){
            SalidaTerminal.consola(lote[contador]+"\n");
        }
    }
    /**
     * Imprime el Arreglo de manera recursiva comenzando desde el tope inverso.
     */
    private void imprimirRR(int pos){
        if(pos>=0){
            SalidaTerminal.consola(lote[pos]+"\n");
            imprimirRR(pos-1);
        }
    }

    /**
     * Imprime el Arreglo de manera recursiva comenzando desde el tope.
     */
    public void imprimirRRecursivo(){
        imprimirRR(tope);
    }

    /**
     * Busca de manera recursiva un elemento en el arreglo.
     * @param elemento Valor a buscar.
     * @return Regresa la posición del valor en caso de que lo encuentre, regresa
     * null en caso contrario.
     */
    public Object buscarRR(Object elemento){
        return buscarRR(elemento,0);
    }
    /**
     * Busca de manera recursiva un elemento en el arreglo.
     * @param elemento elemento a buscar.
     * @return Regresa la posición del valor en caso de que lo encuentre, regresa
     * null en caso contrario.
     */
    private Object buscarRR(Object elemento, int pos){
        if(pos>tope){
            return null;
        }else{
            if(elemento.toString().equalsIgnoreCase(lote[pos].toString())){
                return pos;
            }else{
                return buscarRR(elemento,pos+1);
            }
        }
    }

    /**
     * Método que elimina un objeto del arreglo de manera recursiva.
     * @param elemento elemento a eliminar.
     * @return Regresa el valor eliminado o null en caso de que no se elimine.
     */
    public Object eliminarRR(Object elemento){
        Integer pos = (Integer)buscarRR(elemento);
        if(pos!=null){
            Object contenido = lote[pos];
            tope=tope-1;
            recorrerRR(pos);
            return contenido;
        }else{
            return null;
        }
    }

    /**
     * Cuando un objeto es eliminado este método se encarga de recorrer los elementos
     * para darle estructura al arreglo.
     * @param pos Posición de donde se comienza a recorrer.
     */
    private void recorrerRR(int pos){
        if(pos<=tope){
            lote[pos]=lote[pos+1];
            recorrerRR(pos+1);
        }
    }

    /**
     * Cuenta cuantas veces esta el valor en la lista.
     * @param elemento elemetno a contar.
     * @param pos Posición inicial.
     * @param repetidos repetidos encontrados.
     * @return Regresa las ocurrencias encontradas.
     */
    private int contarRepetidosRR(Object elemento,int pos, int repetidos){
        if(pos<=tope){
            if(elemento.toString().equalsIgnoreCase(lote[pos].toString())){
                return contarRepetidosRR(elemento,pos+1,repetidos+1);
            }
            else{
                return contarRepetidosRR(elemento,pos+1,repetidos);
            }
        }
        return repetidos;
    }

    /**
     * Cuentas cuantas veces esta un elemento en un arreglo.
     * @param elemento elemetno a contar.
     * @return Regresa el número de veces que se encontró el valor.
     */
    public int contarRR(Object elemento){
        if(vacia()==false){
            return contarRepetidosRR(elemento,0,0);
        }
        else{
            return 0;
        }
    }
    /**
     * Busca datos iguales al valor y regresa un arreglo de cuantas veces estan.
     * @param elemento elemento a buscar.
     * @return Regresa un arreglo con las posiciónes o null en caso contrario.
     */
    public ArregloDatos buscarValoresRecursivo(Object elemento){
        int ocurrencias = contarRepetidosRR(elemento,0,0);
        if(ocurrencias >0){
            ArregloDatos arreglo = new ArregloDatos(ocurrencias);
            ArregloDatos arreglo2 = buscarValoresRecursivo(elemento);
            return arreglo2;
        }
        else{
            return null;
        }
    }

    /**
     * Invierte un arreglo de manera recursiva.
     * @param pos Posición inicial.
     * @param elTope Valor central.
     * @param auxiliar Valor que ayuda como auxiliar.
     */
    private void invertirRR(int pos, int elTope, int auxiliar){
        if(pos<=elTope){
            Object valor1=lote[pos];
            Object valor2=lote[auxiliar];
            lote[pos]=valor2;
            lote[auxiliar]=valor1;
            invertirRR(pos+1,elTope,auxiliar-1);

        }
    }

    /**
     * Método que invierte de manera recursiva.
     */
    public void invertirRR(){
        if(vacia()==false){
            int auxiliar = tope;
            invertirRR(0,tope/2,auxiliar);
        }
    }


    /**
     * Imprime un arreglo de manera recursiva.
     * @param pos Posición inicial.
     */
    private void imprimirRecursivo(int pos){
        if(pos<=tope){
            SalidaTerminal.consola(lote[pos]+"\n");
            imprimirRecursivo(pos+1);
        }
    }
    /**
     * Imprime un arreglo de manera recursiva.
     */

    public void imprimirRecursivo(){
        imprimirRecursivo(0);
    }

    public void inicializar(Object elemento){
        for(int contador=0; contador<tope;contador++){
            cambiar(contador,elemento);
        }
    }

    /**
     * Pasa un arreglo a una lista ligada.
     * @param pos Posición inicial.
     * @param lista Lista a llenar.
     * @return Regresa la lista con los elementos del arreglo.
     */
    private ListaEncadenada arregloAListaRR(int pos, ListaEncadenada lista){
        if(pos<=tope){
            lista.agregar(lote[pos]);
            return arregloAListaRR(pos+1,lista);
        }
        else{
            return lista;
        }
    }

    public ListaEncadenada arregloAListaRR(){
        ListaEncadenada lista = new ListaEncadenada();
        return arregloAListaRR(0,lista);
    }



}
