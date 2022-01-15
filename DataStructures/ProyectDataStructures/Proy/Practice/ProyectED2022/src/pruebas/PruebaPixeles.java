/**
 * Clase que sirve para probar
 * @author Daniel Alejandro Morales Castillo
 */
package pruebas;

import registros.pixeles.Pixeles;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class PruebaPixeles {
    public static void main(String args[]) throws IOException {
        Pixeles pixeles = new Pixeles("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\obiwanvsanakin.jpg");
        pixeles.guardarImagenEnMatriz();
        BufferedImage grises = pixeles.escalaDeGrises();
        ImageIO.write(grises, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\grises.jpg"));

        BufferedImage vertical = pixeles.invertir(grises,Pixeles.FLIP_VERTICAL);
        ImageIO.write(vertical, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\vertical.jpg"));

        BufferedImage horizontal = pixeles.invertir(grises,Pixeles.FLIP_HORIZONTAL);
        ImageIO.write(horizontal, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\horizontal.jpg"));

        BufferedImage transpuesta = pixeles.hacerTranspuesta();
        ImageIO.write(transpuesta, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\transpuesta.jpg"));
        BufferedImage brilloMenos100 = pixeles.brillo(grises, -100);
        ImageIO.write(brilloMenos100, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\brillo-100.jpg"));
        BufferedImage brilloMenos500 = pixeles.brillo(grises, -500);
        ImageIO.write(brilloMenos500, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\brillo-500.jpg"));
        BufferedImage brilloMenos1500 = pixeles.brillo(grises, -1500);
        ImageIO.write(brilloMenos1500, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\brillo-1500.jpg"));
        BufferedImage brilloMas400 = pixeles.brillo(grises, 400);
        ImageIO.write(brilloMas400, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\brillo+400.jpg"));
        BufferedImage brillomas2000 = pixeles.brillo(grises, 2000);
        ImageIO.write(brillomas2000, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\brillo+2000.jpg"));

        BufferedImage rotarimagen = pixeles.rotar(grises, 90);
        ImageIO.write(rotarimagen, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\rotar90.jpg"));
        BufferedImage rotarimagen180 = pixeles.rotar(grises, 180);
        ImageIO.write(rotarimagen180, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\rotar180.jpg"));
        BufferedImage rotarimagen270 = pixeles.rotar(grises, 270);
        ImageIO.write(rotarimagen270, "jpg", new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\rotar270.jpg"));

        ImageIO.read(new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\obiwanvsanakin.jpg"));
        BufferedImage imagentexto = pixeles.agregarTexto(grises);
        ImageIO.write(imagentexto,"jpg",new File("E:\\Programacion\\EstructurasDatos2021ED\\Imagenes\\ImagenesPrac10ED\\escribirimagen.jpg"));

    }
}
