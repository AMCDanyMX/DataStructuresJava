package registros.pintores;

import java.util.Date;

/**
 * Clase que representa un objeto de tipo Pintor.
 * @author Daniel Alejandro Morales Castillo
 */
public class Pintor{
    private String nombre;
    private int edad;
    private String sexo;
    private String rfc;
    private String nivelEducativo;


    public Pintor(String nombre, int edad, String sexo, String rfc, String nivelEducativo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.rfc = rfc;
        this.nivelEducativo = nivelEducativo;
    }

    /**
     * @return Regresa el nombre.
     */
    public String getNombre() {

        return nombre;
    }

    /**
     * @return Regresa la edad.
     */
    public int getEdad() {

        return edad;
    }

    /**
     * @return Regresa el sexo.
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * @return Regresa el rfc
     */
    public String getRfc() {
        return rfc;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    @Override
    public String toString(){
        return nombre;
    }
}
