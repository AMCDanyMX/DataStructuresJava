package estructuraslineales;

import entradasalida.SalidaTerminal;
import estructuraslineales.registros.Nodo;
import estructuraslineales.registros.NodoDoble;

/**
 *
 * @author Daniel Alejandro Morales Castillo
 * @version 2.0
 *
 */

public class ListaEncadenada implements ListaDatos {
    protected Nodo frente;
    protected Nodo fin;
    protected Nodo iterador;
    protected Nodo nodoActualDelIterador;


    public ListaEncadenada(){
        frente=null;
        fin=null;
    }

    @Override
    public boolean vacia(){
        if(frente==null){
            return true;
        }else{
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

    @Override
    public boolean agregarOrdenado(Object elemento) {
        return false;
    }

    /**
     * Inserta al inicio de la lista un elemento proporcionado.
     * @param elemento Es el dato que se desea agregar a la lista.
     * @return Regresa un 1 en caso de que se agregue el elemento, o -1 en caso contrario.
     */
    public int agregarInicio(Object elemento){
        Nodo nuevoNodo=new Nodo(elemento); //1
        if(nuevoNodo!=null){ //si hay espacio
            if(vacia()==true){ //a
                frente=nuevoNodo;//2
                fin=nuevoNodo;
            }else{  //b
                nuevoNodo.setDirMemDer(frente);//2
                frente=nuevoNodo;//3
            }
            return 1;
        }else{ //no hay espacio
            return -1;
        }
    }

    @Override
    public void imprimir(){
        Nodo temp=frente;
        while(temp!=null){
            SalidaTerminal.consola(temp.getDato()+ " -> ");
            temp=temp.getDirMemDer();
        }
        SalidaTerminal.consola("null");
    }

    /**
     * Metodo de impresion de forma inversa
     */
    @Override
    public void imprimirOrdenInverso(){
        Nodo temp = fin;
        while(temp!=null){
            SalidaTerminal.consola(temp.getDato()+ " <- ");
            temp= temp.getDirMemDer();
        }
        SalidaTerminal.consola("null");

    }

    /**
     * Inserta al inicio de la lista un elemento proporcionado.
     * @param elemento Es el dato que se desea buscar
     * @return regresa el dato encontrado
     */

    @Override
    public Object buscar(Object elemento){
        Nodo encontrado=frente;

        while (encontrado!=null && !encontrado.getDato().toString().equalsIgnoreCase(elemento.toString())){
            encontrado=encontrado.getDirMemDer();
        }
        if (encontrado==null){ //no esta
            return null;
        }else{ //si esta
            return encontrado.getDato();
        }
    }

    @Override
    public Object eliminar(Object elemento){
        if(vacia()==true){ //no hay datos, a
            return null;
        }else{ //si hay datos
            Nodo anterior=frente;
            Nodo encontrado=frente;
            while(encontrado!=null && !encontrado.toString().equalsIgnoreCase(elemento.toString())){
                anterior=encontrado;
                encontrado=encontrado.getDirMemDer();
            }
            if(encontrado==null){//no esta, f
                return null;
            }else{ //si esta, pero en algun lado
                Object datoEliminado=encontrado.getDato(); //1
                if(frente==fin){ //b, unico
                    frente=null;//2
                    fin=null;
                }else if(encontrado==frente){ //frente, c
                    frente=frente.getDirMemDer(); //2
                }else if(encontrado==fin){ //final, d
                    anterior.setDirMemDer(null);//2
                    fin=anterior; //3
                }else{ //esta en medio, e
                    Nodo posterior=encontrado.getDirMemDer(); //2
                    anterior.setDirMemDer(posterior);//3
                }
                return datoEliminado;
            }
        }
    }

    @Override
    public ArregloDatos buscarValores(Object elemento) {
        return null;
    }

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
    public Object eliminar(){
        Object datoEliminado=null;

        if(vacia()==true){ //a, esta vacia
            return null;
        }else{ //hay algo
            datoEliminado = fin.getDato();//1
            if(frente==fin) { //b, único
                //datoEliminado = fin.getDato();//1
                frente=null;//2
                fin=null;//2
            }else{ //c, varios elementos
                //datoEliminado = fin.getDato();//1
                //buscar el penultimo
                Nodo penultimo=frente;
                while (penultimo.getDirMemDer()!=fin) {
                    penultimo = penultimo.getDirMemDer();  //i=i+1
                }
                fin=penultimo;//2
                fin.setDirMemDer(null);//3
            }
            return datoEliminado;
        } //
    }

    @Override
    public boolean agregarLista(ArregloDatos listaDatos2) {
        return false;
    }

    @Override
    public int contar(Object elemento) {
        return 0;
    }


    /**
     * Método que verifica si existe un nodo siguiente.
     * @return Regresa <b>true</b> en caso de que sea verdad y <b>false</b> en
     * caso contrario.
     */
    public boolean hayNodoDespues(){
        if(nodoActualDelIterador!=null){
            return true;
        }else{
            return false;
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

    /**
     * Metodo que inicia un iterador
     *
     */
    public void inicializarIterador(){
        iterador=frente;
    }
    /**
     * Pqueño metodo para ver si hay elementos
     */
    public boolean hayElementos(){
        if (iterador==null){
            return false;
        }else{
            return true;
        }
    }
    /**
     * Metodo que obtiene un elemento
     * @return el elemento extraido
     */
    public Object obtenerElemento(){
        if(hayElementos()==true){
            Object elementoExtraido=iterador.getDato();
            iterador=iterador.getDirMemDer();
            return elementoExtraido;
        }else{ //no hay elementos
            return null;
        }
    }

    /**
     * Pasa de una lista a un arreglo y retornaa ese arreglo
     * @param arreglo Arreglo a llenar.
     * @param nodo Nodo de inicio.
     * @return Regresa el arreglo.
     */
    public ArregloDatos listaAArreglo(ArregloDatos arreglo, Nodo nodo) {
        if (nodo != null) {
            arreglo.agregar(nodo.getDato());
            return listaAArreglo(arreglo, nodo.getDirMemDer());
        } else {
            return arreglo;
        }
    }

    /**
     * Pasa de una lista a un arreglo y retornaa ese arreglo
     * @param arreglo Arreglo a llenar.
     * @param nodo Nodo de inicio.
     * @return Regresa el arreglo.
     */
    public ArregloDatos aArreglo(ArregloDatos arreglo, Nodo nodo) {
        while (nodo!=null){
            arreglo.agregar(nodo.getDato());

            if(listaAArreglo(arreglo,nodo.getDirMemDer()) != arreglo){
                return listaAArreglo(arreglo, nodo.getDirMemDer());
            }else{
                return null;
            }
        }
        return arreglo;
    }

    /**
     * Método que obtiene el contenido del nodo actual y se cambia al siguiente nodo.
     * @return Regresa el contenido del nodo actual y null en caso de que no haya un
     * nodo siguiente.
     */
    public Object obtenerSiguiente(){
        if(hayNodoDespues()){
            Object contenido = nodoActualDelIterador.getDato();
            nodoActualDelIterador=nodoActualDelIterador.getDirMemDer();
            return contenido;
        } else{
            return null;
        }
    }

    /**
     * Obtiene el primero nodo.
     * @return Regresa el primer nodo.
     */
    public Nodo getFrente(){
        return frente;
    }


    /**
     * Cuenta los elementos que hay en la lista.
     * @return Regresa el número de elementos que tiene la lista.
     */
    public int contarElementos() {
        if(vacia()==false){//Hay Elementos.
            inicializarIterador();
            int contador=0;
            while (hayNodoDespues()){
                Object contenido = obtenerSiguiente();
                contador++;
            }
            return contador;
        } else{
            return 0;
        }
    }

    /**
     * Hace una matriz de 2 dimensiones con los valores de la lisa.
     * @return Regresa la matriz o null en caso externo.
     */
    public Tabla2D aMatriz2D(){
        int elementos = contarElementos();
        int fila=0;
        int colValor=1;
        if(elementos>0){
            Tabla2D matriz = new Tabla2D(elementos,2);
            Nodo temp = frente;
            while(temp!=null){
                matriz.asignarCelda(fila,colValor,temp);
                matriz.asignarCelda(fila,colValor,temp);
                fila++;
                temp=temp.getDirMemDer();
            }
            return matriz;
        } else{
            return null;
        }
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

    /**
     * sustituye un valor.
     * @param cantidad cantidad de nodos a meter
     * @param valor Elemento con el que se ppondra
     */
    @Override
    public void rellenar(Object valor, int cantidad) {
        if(vacia()==false){
            Nodo nodo = frente;
            int contador = 1;
            while(nodo!=null && contador <= cantidad){
                nodo.setDato(valor);
                nodo=nodo.getDirMemDer();
                contador++;
            }
        }
    }

    /**
     * Cuenta los elementos que hay en la lista iguales al argumento
     * @return Regresa el número de elementos que tiene la lista.
     */
    public int contarElementosIguales(Object elemento) {
        if(vacia()==false){//Hay Elementos.
            inicializarIterador();
            int contador=0;
            while (hayNodoDespues()){
                Object contenido = obtenerSiguiente();
                if(contenido == elemento){
                    contador++;
                }
            }
            return contador;
        } else{
            return 0;
        }
    }

    /**
     * Substituye un valor por uno nuevo y las veces que vayas a ponerlo
     * @param elementoViejo Valor del nodo a buscar.
     * @param elementoNuevo Elemento con el que se reemplazará.
     * @param numveces las veces que se pondra el valor
     * @return Regresa true en caso de que se realize de manera correcta, false
     *  en caso contrario.
     */
    public boolean cambiar(Object elementoViejo, Object elementoNuevo, int numveces){
        Nodo temp = frente;
        while(temp!=null && !temp.getDato().toString().equalsIgnoreCase(elementoViejo.toString())){
            temp=temp.getDirMemDer();
        }
        if(temp==null){//Esta vacia o no existe.
            return false;
        } else{//Si hay algo.
            temp.setDato(elementoNuevo);
            return true;
        }
    }


    /**
     * Obtenemos un elemento por su indice
     * @param indice indice del nodo a buscar.
     * @return Regresa el nodo de esa posicion
     */
    public Object obtener(int indice){
        if(vacia()==false){
            Nodo nodo = frente;
            int contador = 0;
            while(nodo!=null && contador <= indice){
                nodo=nodo.getDirMemDer();
                contador++;
            }
            if(contador==indice){
                return nodo;
            }
        }
        return null;
    }

    /**
     * sustituye un valor.
     * @param indice indice del nodo a buscar.
     * @param elemento Elemento con el que se reemplazará.
     * @return Regresa true en caso de que se realize de manera correcta, false
     *  en caso contrario.
     */
    public boolean cambiar(int indice, Object elemento){
        Nodo temp = frente;
        int elementos = contarElementos();
        inicializarIterador();
        int contador=0;

        while(temp!=null && contador == indice){
            temp=temp.getDirMemDer();
            contador++;
        }
        if(temp==null){//Esta vacia o no existe.
            return false;
        } else{//Si hay algo.
            temp.setDato(elemento);
            return true;
        }
    }

    /**
     * Metodo que invierte una lista
     */
    @Override
    public void invertir() {
        if(vacia()==false) {
            int elementos = contarElementos();
            int aux = elementos;
            Object variable1;
            Object variable2;

            for(int i=0; i<= (elementos)/2; i++){
                variable1=i;
                variable2=aux;
                i=aux;
                aux=i;
                aux--;
            }
        }
    }

    @Override
    public boolean esIgual(Object listaDatos2){
        boolean control=true;
        Nodo temp = fin;
        while(temp!=null){
            if (temp != listaDatos2) {
                control = false;
                break;
            }
        }
        return control;
    }


    //MNetodos de recursion practica 23

    private Object buscarRecursivo(Nodo nodo, Object valor){
        if(nodo==null){
            return null;
        }
        else{
            if(nodo.getDato().toString().equalsIgnoreCase(valor.toString())){
                return nodo.getDato();
            }
            else{
                nodo=nodo.getDirMemDer();
                return buscarRecursivo(nodo,valor);
            }
        }
    }
    public Object buscarRecursivo(Object valor){
        Nodo temp = frente;
        return buscarRecursivo(temp,valor);
    }

    /**
     * Elimina de manera reecursiva un objeto de la lista.
     * @param valor Valor a eliminar.
     * @param atras Valor de atras al actual.
     * @param actual Valor actual.
     * @return Regresa el valor del eliminado o null en caso de que no se haya eliminado.
     */
    private Object eliminarRecursivo(Object valor, Nodo atras, Nodo actual){
        if(actual==null){
            return null;
        } else{
            if(actual.getDato().toString().equalsIgnoreCase(valor.toString())){
                return atras;
            }
            else{
                atras=actual;
                actual=actual.getDirMemDer();
                return eliminarRecursivo(valor,atras,actual);
            }
        }
    }
    /**
     * Elimina de manera recursiva un objeto de la lista.
     * @param valor Valor a eliminar.
     * @return Regresa el valor eliminado o null en caso de que no se elimine.
     */
    public Object eliminarRecursivo(Object valor){
        if(vacia()==false){
            Nodo act = frente;
            Nodo atr = act;
            Nodo atras = (Nodo)eliminarRecursivo(valor,atr,act);
            if(atras.getDirMemDer()==null){
                return null;
            }else{
                Nodo actual = atras.getDirMemDer();
                Object contenido=actual.getDato();
                if(frente==fin){
                    frente=null;
                    fin=null;
                }
                else if(actual==fin){
                    atras.setDirMemDer(null);
                    fin=atras;
                } else if(actual==frente){
                    frente=frente.getDirMemDer();
                }
                else{
                    atras.setDirMemDer(actual.getDirMemDer());
                }
                return contenido;
            }
        }else{
            return null;
        }
    }


    /**
     * Elimina el tope de la lista de manera recursiva.
     * @param penultimo Valor que esta antes del ultimo.
     * @return Regresa el penultimo.
     */
    private Object eliminarTopeRecursivo(Nodo penultimo){
        if(penultimo.getDirMemDer()==fin){
            return penultimo;
        } else{
            return eliminarTopeRecursivo(penultimo=penultimo.getDirMemDer());
        }
    }
    /**
     * Elimina el tope de manera recursiva.
     * @return Regresa el valor del tope.
     */
    public Object eliminarTopeRecursivo(){
        if(!vacia()){//Hay algo.
            Object contenido = fin.getDato();
            if(frente == fin){//Único
                frente=null;
                fin=null;
            }
            else{//Más de uno.
                Nodo penultimo = (Nodo)eliminarTopeRecursivo(frente);
                penultimo.setDirMemDer(null);
                fin=penultimo;
            }
            return contenido;
        } else{//No hay nada.
            return null;
        }
    }


    /**
     * Imprime de manera recursiva.
     * @param nodo Nodo inicial.
     */
    private void imprimirRecursivo(Nodo nodo){
        if(nodo!=null){
            SalidaTerminal.consola(nodo.getDato()+ " ->");
            imprimirRecursivo(nodo.getDirMemDer());
        }
    }

    /**
     * Cuenta de manera recursiva cuantos elementos hay en la lista.
     * @param nodo Nodo para iniciar.
     * @param valor capacidad.
     * @return Regresa la capacidad.
     */
    private int contarRecursivo(Nodo nodo,int valor){
        if(nodo!=null){
            return contarRecursivo(nodo.getDirMemDer(),valor+1);
        }
        else{
            return valor;
        }
    }

    public int contarRecursivo(){
        Nodo nodo = frente;
        return contarRecursivo(nodo, 0);
    }

    /**
     * Imprime de manera recursiva.
     */
    public void imprimirRecursivo(){
        Nodo temp = frente;
        imprimirRecursivo(temp);
        SalidaTerminal.consola("null");
    }

    public Object regresarFin(){
        if(vacia()==false){ //que si haya algo
            return fin.getDato();
        }else{   //no hay nada
            return null;
        }
    }

    public Object regresarFrente(){
        if(vacia()==false){ //que si haya algo
            return frente.getDato();
        }else{   //no hay nada
            return null;
        }
    }


}



