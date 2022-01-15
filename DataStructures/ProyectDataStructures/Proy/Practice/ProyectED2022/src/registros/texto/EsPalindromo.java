package registros.texto;

/**
 *Clase EsPalindromo que dice si una palabra es palindromo
 * @author Daniel Alejandro Morales Castillo
 */

public class EsPalindromo {
    public boolean espalindromo(String cadena){
        boolean valor=true;
        int i,ind;
        String cadena2="";
        //quitamos los espacios
        for (int x=0; x < cadena.length(); x++) {
            if (cadena.charAt(x) != ' ' )
                cadena2 += cadena.charAt(x);
        }
        //volvemos a asignar variables
        cadena=cadena2;
        ind=cadena.length();
        //comparamos cadenas
        for (i= 0 ;i < (cadena.length()); i++){
            if (cadena.substring(i, i+1).equals(cadena.substring(ind - 1, ind)) == false ) {
                //si una sola letra no corresponde no es un palindromo por tanto
                // sale del ciclo con valor false
                valor=false;
                break;
            }
            ind--;
        }
        return valor;
    }
}
