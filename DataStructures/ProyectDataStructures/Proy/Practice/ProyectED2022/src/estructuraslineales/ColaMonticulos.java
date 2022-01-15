package estructuraslineales;
import herramientas.comunes.TipoOrden;
import herramientas.comunes.Monticulos;

/**
 * Clase que representa un TDA de tipo Cola monticulos
 * @author Daniel Alejandro Morales Castillo
 */
public class ColaMonticulos extends ArregloCola{
    protected TipoOrden orden;
    /**
     * Constructor de la clase ColaDePrioridad.
     * @param tam Tamaño que tendrá la cola.
     * @param orden El orden con el quen se guiará la cola.
     */
    public ColaMonticulos(int tam,TipoOrden orden){
        super(tam);
        this.orden=orden;
    }
    /**
     * Este método agrega y acomoda el elemento agregado.
     * @param objeto Elemento a encolar.
     * @return Regresa <b>true</b> en caso de que se encole de manera correcta, <b>false</b>
     * en caso contrario.
     */

    //encolar
    public boolean ponerEnCola(Monticulos objeto){
        boolean seAgrega = poner(objeto);
        if(seAgrega==true){
            acomodar();
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Este método procesa (borra) un elemento de la cola de prioridad.
     * @return Regresa el objeto si es que le elimino de forma correcta,
     * en caso contrario regrea null.
     */
    //desencolar
    public Monticulos borrar(){
        if(!vacio()){
            Monticulos seBorra = (Monticulos) quitar();
            acomodarBorrado();
            return seBorra;
        }
        else{
            return null;
        }
    }
    /**
     * Método que trabaja en colaboración con encolar, acomoda la pila en forma de
     * árbol binario segun el orden que tenga la pila.
     * @return Regresa <b>true</b> en caso de que se acomode de manera correcta, <b>false</b>
     * en caso contrario.
     */
    public boolean acomodar(){
        if(orden.getOrden()==1){
            int indice=fin;
            double padreBruto= (indice-1)/2;
            double padreRedondeado = Math.floor(padreBruto);
            int padre=(int) (padreRedondeado);
            if(indice>0 && padre>=0){
                Monticulos obj1=(Monticulos) lote[indice];
                Monticulos obj2=(Monticulos) lote[padre];
                Monticulos auxiliar;
                while(obj1.getPrioridad()>obj2.getPrioridad()){
                    auxiliar=(Monticulos) lote[padre];
                    lote[padre]=(Monticulos)lote[indice];
                    lote[indice]=auxiliar;
                    indice=padre;
                    padreBruto= (indice-1)/2;
                    padreRedondeado = Math.floor(padreBruto);
                    padre=(int) (padreRedondeado);
                    if(indice>0 && padre>=0 && indice>padre){
                        obj1=(Monticulos) lote[indice];
                        obj2=(Monticulos) lote[padre];
                    } else{
                        break;
                    }
                }
                return true;
            } else{
                return false;
            }
        }
        else{
            int indice=fin;
            double padreBruto= (indice-1)/2;
            double padreRedondeado = Math.floor(padreBruto);
            int padre=(int) (padreRedondeado);
            if(indice>0 && padre>=0){
                Monticulos obj1=(Monticulos) lote[indice];
                Monticulos obj2=(Monticulos) lote[padre];
                Monticulos auxiliar;
                while(obj1.getPrioridad()<obj2.getPrioridad()){
                    auxiliar=(Monticulos) lote[padre];
                    lote[padre]=(Monticulos)lote[indice];
                    lote[indice]=auxiliar;
                    indice=padre;
                    padreBruto= (indice-1)/2;
                    padreRedondeado = Math.floor(padreBruto);
                    padre=(int) (padreRedondeado);
                    if(indice>0 && padre>=0 && indice>padre){
                        obj1=(Monticulos) lote[indice];
                        obj2=(Monticulos) lote[padre];
                    }
                    else{
                        break;
                    }
                }
                return true;
            }
            else{
                return false;
            }
        }
    }
    /**
     * Acomoda la de cola despues de que se raliza un borrado.
     * @return Regresa true en caso de que se realize algun cambio, false en caso
     * contrario.
     */
    public boolean acomodarBorrado(){
        if(orden.getOrden()==1){
            int quitado=frente-1;
            if(vacio()==false){
                int hijoIzquierdo=(2*quitado)+1;
                int hijoDerecho=(2*quitado)+2;
                Object izq =lote[hijoIzquierdo];
                Object der =lote[hijoDerecho];
                if(izq!=null && der!=null){
                    int mayor=0;
                    Monticulos izquierdo=(Monticulos) lote[hijoIzquierdo];
                    Monticulos derecho=(Monticulos) lote[hijoDerecho];
                    if(izquierdo.getPrioridad()>derecho.getPrioridad()){
                        mayor=-1;
                    } else{
                        mayor=1;
                    }
                    if(mayor==1){
                        lote[hijoIzquierdo]=derecho;
                        lote[hijoDerecho]=izquierdo;
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else if(izq!=null && der==null){
                    return false;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            int quitado=frente-1;
            if(vacio()==false){
                int hijoIzquierdo=(2*quitado)+1;
                int hijoDerecho=(2*quitado)+2;
                Object izq =lote[hijoIzquierdo];
                Object der =lote[hijoDerecho];
                if(izq!=null && der!=null){
                    int mayor=0;
                    Monticulos izquierdo=(Monticulos) lote[hijoIzquierdo];
                    Monticulos derecho=(Monticulos) lote[hijoDerecho];
                    if(izquierdo.getPrioridad()>derecho.getPrioridad()){
                        mayor=-1;
                    }
                    else{
                        mayor=1;
                    }
                    if(mayor==1){
                        return false;
                    }
                    else{
                        lote[hijoIzquierdo]=derecho;
                        lote[hijoDerecho]=izquierdo;
                        return true;
                    }
                }
                else if(izq!=null && der==null){
                    return false;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
    }


}