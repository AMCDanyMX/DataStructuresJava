/**
 *
 * @author Daniel Alejandro Morales Castillo
 */
package pruebas;

import archivosaudio.AudioFileRecord;

public class PruebaAudio{
    public static void main(String args[]){
        AudioFileRecord audioFile = new AudioFileRecord("E:\\Programacion\\archivo.wav");
        audioFile.leerAudio();
        audioFile.EscribirAudio();
        audioFile.bajarVolumen(3);
        audioFile.subirVolumen(7);
    }
}
