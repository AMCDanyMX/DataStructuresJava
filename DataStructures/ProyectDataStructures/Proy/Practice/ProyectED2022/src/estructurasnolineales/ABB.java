package estructurasnolineales;

import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloCola;
import estructuraslineales.ArregloPila;
import estructuraslineales.ListaPila;
import estructuraslineales.registros.NodoDoble;
import herramientas.generales.Utilerias;

public class ABB extends ArbolBinario{

    public boolean agregar(Object elemento){
        if(raiz==null){ // no hay nada en el árbol
            NodoDoble nuevoNodo=new NodoDoble(elemento);
            if(nuevoNodo!=null){ //si hay espacio
                raiz=nuevoNodo;
                return true;
            }else{ //se asume que no hay espacio
                raiz=null;
                return false;
            }
        }else{ //ya hay algo en el árbol
            return agregar(raiz, elemento);
        }
    }

    private boolean agregar(NodoDoble subRaiz, Object elemento){
        //Verificar que el elemento proporcionado sea

        if(Utilerias.compararObjetos(elemento,subRaiz.getDato())>0){ //elemento > subRaiz.dato
            //Mayor a la información de la subRaiz
            if(subRaiz.getDirMemDer()==null){ // no tiene hijo derecho, ahí le toca insertarse a elemento
                NodoDoble nuevoNodo=new NodoDoble(elemento);
                if (nuevoNodo!=null){ //si hay espacio
                    subRaiz.setDirMemDer(nuevoNodo);
                    return true;
                }else{ //no hay espacio
                    return false;
                }
            }else{ //ya tiene un hijo derecho esta subRaiz, nos dirigimos hacia esa Rama,
                return agregar(subRaiz.getDirMemDer(), elemento);
            }
        } else if(Utilerias.compararObjetos(elemento,subRaiz.getDato())<0){ //elemento < subRaiz.dato
            // Menor a la información de la subRaiz
            if(subRaiz.getDirMemIzq()==null){ // no tiene hijo izquierdo, ahí le toca insertarse a elemento
                NodoDoble nuevoNodo=new NodoDoble(elemento);
                if (nuevoNodo!=null){ //si hay espacio
                    subRaiz.setDirMemIzq(nuevoNodo);
                    return true;
                }else{ //no hay espacio
                    return false;
                }
            }else{ //ya tiene un hijo izquiedo esta subRaiz, nos dirigimos hacia esa Rama,
                return agregar(subRaiz.getDirMemIzq(), elemento);
            }
        }else {
            //Igual a la información de la subRaiz, no lo insertamos
            return false;
        }
    }

    public Object buscar(Object elemento){
        return buscar(raiz,elemento);
    }

    private Object buscar(NodoDoble subRaiz, Object elemento){
        if(subRaiz!=null){ //estamos en un nodo con algún contenido
            if(Utilerias.compararObjetos(elemento,subRaiz.getDato())>0){ //elemento>subRaiz
                return buscar(subRaiz.getDirMemDer(), elemento);
            } else if(Utilerias.compararObjetos(elemento, subRaiz.getDato())<0){ //elemento<subRaiz
                return buscar(subRaiz.getDirMemIzq(), elemento);
            }else{ //elemento=subRaiz, lo encontré
                return subRaiz.getDato();
            }
        }else{ //estamos en un nodo que apunta a null
            //no está el elemento
            return null;
        }
    }

    /**
     * Elimina un elemento del árbol binario de busqueda.
     * @param info Valor a eliminar.
     */
    public void eliminar(Object info){
        eliminar(raiz,raiz,info);
    }
    /**
     * Elimina un elemento del árbol binario de búsqueda.
     * @param apnodo Nodo actual.
     * @param anterior Nodo anterior.
     * @param info Valor a eliminar.
     */
    public void eliminar(NodoDoble apnodo,NodoDoble anterior,Object info){
        if(apnodo!=null){
            if(Utilerias.compararObjetos(info,apnodo.getDato())==-1){
                eliminar(apnodo.getDirMemIzq(),apnodo,info);
            } else{
                if(Utilerias.compararObjetos(info,apnodo.getDato())==1){
                    eliminar(apnodo.getDirMemDer(),apnodo,info);
                } else{
                    if(apnodo.getDirMemIzq()!=null && apnodo.getDirMemDer()!=null){
                        NodoDoble aux = apnodo.getDirMemIzq();
                        Boolean bo = false;
                        NodoDoble aux1 = aux;
                        while(aux.getDirMemDer()!=null){
                            aux1 = aux;
                            aux=aux.getDirMemDer();
                            bo=true;
                        }
                        apnodo.setDato(aux.getDato());
                        if(bo==true){
                            aux1.setDirMemDer(aux.getDirMemIzq());
                        }
                        else{
                            apnodo.setDirMemIzq(aux.getDirMemIzq());
                        }
                    }
                    else{
                        NodoDoble otro = apnodo;
                        if(otro.getDirMemDer()==null){
                            if(otro.getDirMemIzq()!=null){
                                otro=apnodo.getDirMemIzq();
                                if(anterior!=null){
                                    if(Utilerias.compararObjetos(info,anterior.getDato())==-1){
                                        anterior.setDirMemIzq(otro);
                                    } else{
                                        anterior.setDirMemDer(otro);
                                    }
                                }
                                else{
                                    raiz=otro;
                                }
                            }
                            else{
                                if(anterior==null){
                                    raiz=null;
                                }
                                else{
                                    if(Utilerias.compararObjetos(info,anterior.getDato())==-1){
                                        anterior.setDirMemIzq(null);
                                    } else{
                                        anterior.setDirMemDer(null);
                                    }
                                }
                            }
                        }
                        else{
                            if(otro.getDirMemIzq()==null){
                                otro=apnodo.getDirMemDer();
                                if(anterior!=null){
                                    if(Utilerias.compararObjetos(info,anterior.getDato())==-1){
                                        anterior.setDirMemIzq(otro);
                                    }
                                    else{
                                        anterior.setDirMemDer(otro);
                                    }
                                }
                                else{
                                    raiz=otro;
                                }
                            }
                        }
                    }
                }
            }
        }
        else{
            SalidaTerminal.consola("El dato no esta en el árbol");
        }
    }

    //Metodo de recorrdido de anchura o amplitud del algoritmo 1 mostrado en el documento
    /**
     * Realiza un recorrido de amplitud haciendo uso de una cola.
     * @param tam Tamaño de la cola.
     */
    public void recorridoAnchuraCola(int tam){
        ArregloCola cola = new ArregloCola(tam);
        cola.poner(raiz);
        while(cola.vacio()==false){
            NodoDoble actual = (NodoDoble)cola.quitar();
            SalidaTerminal.consola(actual.getDato().toString()+" ");
            if(actual.getDirMemIzq()!=null){
                cola.poner(actual.getDirMemIzq());
            }
            if(actual.getDirMemDer()!=null){
                cola.poner(actual.getDirMemDer());
            }
        }
    }
    /**
     * Hace un recorrido al arbol pero ahora utilizando una pila.
     *
     */
    public void recorridoAnchuraPila(){
        ListaPila pila = new ListaPila();
        pila.agregar(raiz);
        while(pila.vacia()==false){
            NodoDoble actual = (NodoDoble)pila.quitar();
            SalidaTerminal.consola(actual.getDato().toString()+" ");
            if(actual.getDirMemIzq()!=null){
                pila.agregar(actual.getDirMemIzq());
            }
            if(actual.getDirMemDer()!=null){
                pila.agregar(actual.getDirMemDer());
            }
        }
    }




}
