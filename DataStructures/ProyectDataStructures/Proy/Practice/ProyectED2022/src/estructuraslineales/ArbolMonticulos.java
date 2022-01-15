package estructuraslineales;
import estructuraslineales.registros.NodoDoble;
import estructurasnolineales.ABB;
import herramientas.comunes.TipoOrden;
import herramientas.generales.Utilerias;

public class ArbolMonticulos extends ABB {
    private final TipoOrden orden;
    /**
     * Constructor de la clase ArbolMonticulos
     * @param orden El orden con el quen se guiará la cola.
     */
    public ArbolMonticulos(TipoOrden orden){
        this.orden=orden;
    }

    public boolean agregarMonticulo(Object elemento){
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
            return agregarMonticulo(raiz, elemento);
        }
    }

    private boolean agregarMonticulo(NodoDoble subRaiz, Object elemento){
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
                return agregarMonticulo(subRaiz.getDirMemDer(), elemento);
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
                return agregarMonticulo(subRaiz.getDirMemIzq(), elemento);
            }
        }else {
            //Igual a la información de la subRaiz, no lo insertamos
            return false;
        }
    }


    













}
