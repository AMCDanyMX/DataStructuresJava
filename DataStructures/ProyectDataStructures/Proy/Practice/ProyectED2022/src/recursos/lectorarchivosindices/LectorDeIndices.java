package recursos.lectorarchivosindices;
import estructurasnolineales.ArbolBBIndice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * Clase que lee posiciones especificas de un archivo.
 * @author Daniel Alejandro Morales Castillo
 */
public class LectorDeIndices{
    /**
     * Método que lee un archivo e introduce posiciones a un árbol.
     * @throws IOException errores.
     * @return
     */
    public static ArbolBBIndice lectorPosiciones() throws IOException{
        boolean finArchivo = false;
        ArbolBBIndice arbol = new ArbolBBIndice();
        RandomAccessFile archivo = null;
        try {
            archivo = new RandomAccessFile("E:\\Programacion\\EstructurasDatos2021ED\\archivosbd\\categories_tab.csv", "r");
            System.out.println("El tamaño es: " + archivo.length());
            String cad="";
            while(true) {
                System.out.print("Pos" +archivo.getFilePointer());
                cad = archivo.readLine();
                if (cad==null) break;
                arbol.agregarnodo(33,archivo.getFilePointer());
                System.out.println("-"+cad);
            }
        } catch (FileNotFoundException fe) {
            System.out.println("No se encontro el archivo");
        }
        System.out.println("\n");
        archivo.seek(9071);
        System.out.println(archivo.readLine());
        System.out.println("\n");
        archivo.close();
        return arbol;
    }
}


































