/**
 * TDA que representa una galeria de arte y las actividades que se realizan.
 * @author Daniel Alejandro Morales Castillo
 */
package registros.pintores;

import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;
import estructurasnolineales.Tabla3D;


public class GaleriaArte{
    protected Tabla3D actividadesDesarrolladas;
    protected  ArregloDatos pintores;
    protected  ArregloDatos anios;
    protected  ArregloDatos semanasAct;
    protected String nombre;
    /**
     * Contructor del TDA GaleriaArte.
     * @param nombre Nombre de la galeria.
     * @param tamPintores Tamaño del arreglo pintores.
     * @param tamAnios Tamaño del arreglo anios.
     * @param tamSemanas Tamaño del arreglo semanas.
     */
    public GaleriaArte(String nombre, int tamPintores, int tamAnios, int tamSemanas){
        this.nombre=nombre;
        actividadesDesarrolladas= new Tabla3D(tamPintores,tamAnios,tamSemanas);
        pintores = new ArregloDatos(tamPintores);
        anios = new ArregloDatos(tamAnios);
        semanasAct = new ArregloDatos(tamSemanas);
    }

    /**
     * Agrega un nuevo pintor.
     * @param pintorNuevo Pintor a agregar.
     * @return Regresa true si se agrega correctamente, false en caso contrario.
     */
    public int agregarPintor(Pintor pintorNuevo){
        return pintores.agregar(pintorNuevo);
    }
    /**
     * Agreaga un nuevo anio.
     * @param nomAnio en que año fue
     * @return Regresa true si se agrega correctamente, false en caso contrario.
     */
    public int agregarAnio(String nomAnio){
        return anios.agregar(nomAnio);
    }
    /**
     * Agrega una semana con su actividad.
     * @param semana la semana
     * @return Regresa true si se agrega correctamente, false en caso contrario.
     */
    public int agregarSemana(String semana){
        return semanasAct.agregar(semana);
    }
    /**
     * Sirve para agregar una actividad.
     * @param actividad Actividad a agregar.
     * @param nomPintor nombre del pintor.
     * @param nomAnio el anio.
     * @param semana la semana
     * @return Regresa true en caso de que se realice correctamente, false en caso contrario.
     */
    public boolean agregarActividad(ActividadPintor actividad, String nomPintor, String nomAnio, String semana){
        Integer posPintor;
        Integer posAnio;
        Integer posSemana;
        posPintor=(Integer)pintores.buscar(nomPintor);
        posAnio=(Integer)anios.buscar(nomAnio);
        posSemana=(Integer)semanasAct.buscar(semana);
        if(posPintor!=null && posAnio!=null && posSemana!=null){
            return actividadesDesarrolladas.asignarCelda(posPintor.intValue(),
                    posAnio.intValue(),posSemana.intValue(),actividad);
        } else{
            return false;
        }
    }
    /**
     * Este método obtiene los pintores que realizaron act
     * durante un anio.
     * @param anio en el que se desea buscar.
     * @return Regresa un arreglo en el cual estan los pintores con actividades iguales
     * durante un anio.
     */
    public ArregloDatos pintorActividadesAnio(String anio){
        ArregloDatos actividadesIguales=new ArregloDatos(pintores.capacidad());
        Integer posicionAnio=(Integer)anios.buscar(anio);
        boolean condicion;
        for(int pintor=0;pintor<pintores.cantidadElementos();pintor++){
            condicion=true;
            for(int semana=0;semana<semanasAct.cantidadElementos()-1;semana++){
                if(!(actividadesDesarrolladas.obtenerCelda(pintor, posicionAnio, semana).equals
                        (actividadesDesarrolladas.obtenerCelda(pintor, posicionAnio, semana+1)))){
                    condicion=false;
                    break;
                }
            }
            if(condicion){
                actividadesIguales.agregar(pintores.obtener(pintor));
            }
        }
        return actividadesIguales;
    }
    /**
     * Obtiene el anio qcon menos artes
     * @param anio anio a buscar
     * @return Regresa el anio.
     */
    public Object anioConMenosArtes(String anio){
        int contador=0;
        int contadorPasado;
        int auxiliar=0;
        int anioSinArte=0;
        for(int posPintor=0;posPintor<pintores.cantidadElementos();posPintor++){
            for(int posAnio=0;posAnio<anios.cantidadElementos();posAnio++){
                contadorPasado=contador;
                contador=0;
                for(int posSemana=0;posSemana<semanasAct.cantidadElementos();posSemana++){
                    if("pintar".equals(actividadesDesarrolladas.obtenerCelda(posPintor, posAnio, posSemana).toString()))
                        contador++;
                }
                auxiliar=contadorPasado;
                if(auxiliar>contador){
                    auxiliar=contador;
                    anioSinArte=posAnio;
                }
            }
        }
        return anios.obtener(anioSinArte);
    }

    /**
     * Obtiene el anio que mas hubo viaje.
     * @param nombrePintor Nombre del pintor.
     * @return Regresa el anio.
     */
    public Object anioMasViaje(String nombrePintor){
        Integer posPintor=(Integer)pintores.buscar(nombrePintor);
        int contador=0;
        int auxiliar=0;
        int anio=0;
        if(posPintor==null){
            return null;
        }
        else{
            for(int posAnios=0;posAnios<anios.cantidadElementos();posAnios++){
                contador=0;
                for(int posSemanas=0;posSemanas<semanasAct.cantidadElementos();posSemanas++){
                    if(actividadesDesarrolladas.obtenerCelda(posPintor, posAnios, posSemanas).equals("viajar")){
                        contador++;
                    }
                }
                if(auxiliar<contador){
                    auxiliar=contador;
                    anio=posAnios;
                }

            }
        }
        return anios.obtener(anio);
    }

    //Sacar rebanadas de la metriz 3D
    public void imprimir(){
        actividadesDesarrolladas.imprimir();
    }

    public void imprimirPintores(){
        pintores.imprimir();
    }
}