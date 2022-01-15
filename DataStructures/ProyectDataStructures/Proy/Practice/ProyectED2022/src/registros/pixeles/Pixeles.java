/**
 * Clase que sirve para leer una imagen y manipular sus pixeles.
 * @author Daniel Alejandro Morales Castillo
 */

package registros.pixeles;
import estructuraslineales.Tabla2D;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pixeles {
    BufferedImage imagen;
    int w;
    int h;
    BufferedImage imagen2;
    Tabla2D matriz;
    private double grados;
    public static final int FLIP_VERTICAL = 1;
    public static final int FLIP_HORIZONTAL = -1;


    /** */
    /**
     * @param direccion ruta
     *                  metodo constructor de Pixeles
     */
    public Pixeles(String direccion) throws IOException {
        this.imagen = ImageIO.read(new File(direccion));
        w = imagen.getWidth();
        h = imagen.getHeight();
        imagen2 = new BufferedImage(w, h,BufferedImage.TYPE_INT_RGB);
        matriz = new Tabla2D(w,h);
    }

    /**
     * Metodo para guardar en matriz
     */
    public void guardarImagenEnMatriz(){
        for ( int filas=0;filas<matriz.getFilas();filas++){
            for( int columnas=0;columnas<matriz.getColumnas();columnas++){
                matriz.asignarCelda(filas,columnas,imagen.getRGB(filas,columnas));
            }
        }
    }
    /**
     * Extrae alfa de un pixel.
     * @param fila Fila de la imagen.
     * @param columna Columna de la imagen
     * @return Regresa el alfa del RGB.
     */
    public int extraerAlfa(int fila, int columna){
        int alfa;
        int pixel=imagen.getRGB(fila,columna);
        Color color = new Color(pixel);
        return color.getAlpha();
    }
    /**
     * Extrae Red de un pixel.
     * @param fila Fila de la imagen.
     * @param columna Columna de la imagen
     * @return Regresa el red del RGB.
     */
    public int extraerR(int fila, int columna){
        int pixel=imagen.getRGB(fila,columna);
        Color color = new Color(pixel);
        return color.getRed();
    }
    /**
     * Extrae Green de un pixel.
     * @param fila Fila de la imagen.
     * @param columna Columna de la imagen
     * @return Regresa el Green del RGB.
     */
    public int extraerG(int fila, int columna){
        int pixel=imagen.getRGB(fila,columna);
        Color color = new Color(pixel);
        return color.getGreen();
    }
    /**
     * Extrae Blue de un pixel.
     * @param fila Fila de la imagen.
     * @param columna Columna de la imagen
     * @return Regresa el Blue del RGB.
     */
    public int extraerB(int fila, int columna){
        int pixel=imagen.getRGB(fila,columna);
        Color color = new Color(pixel);
        return color.getBlue();
    }
    /**
     * Este método pasa una imagen a su escala de grises.
     * @return Regresa la imagen modificada.
     */
    public BufferedImage escalaDeGrises(){
        //Variables que almacenarán los píxeles
        int mediaPixel,colorRGB;
        //Recorremos la imagen píxel a píxel
        for ( int filas=0;filas<matriz.getFilas();filas++){
            for( int columnas=0;columnas<matriz.getColumnas();columnas++){
                //Almacenamos el color del píxel
                Integer pixel=(Integer)matriz.obtenerCelda(filas, columnas);
                Color elemento = new Color(pixel);
                //Calculamos la media de los tres canales (rojo, verde, azul)
                mediaPixel=(int)((elemento.getRed()+elemento.getGreen()+elemento.getBlue())/3);
                //Cambiamos a formato sRGB
                colorRGB=(mediaPixel << 16) | (mediaPixel << 8) | mediaPixel;
                //Asignamos el nuevo valor al BufferedImage
                imagen2.setRGB(filas, columnas, colorRGB);
            }
        }
        //Retornamos la imagen
        return imagen2;
    }
    /**
     * Hacer transpuesta a matriz
     * @return Regresa la imagen cambiada.
     */
    public BufferedImage hacerTranspuesta(){
        matriz.aplicarTanspuesta();
        BufferedImage imagen3 = new BufferedImage(matriz.getFilas(), matriz.getColumnas(),BufferedImage.TYPE_INT_RGB);
        for ( int filas=0;filas<matriz.getFilas();filas++){
            for( int columnas=0;columnas<matriz.getColumnas();columnas++){
                Integer pixel=(Integer)matriz.obtenerElementoCelda(filas, columnas);
                imagen3.setRGB(filas, columnas, pixel);
            }

        }
        return imagen3;
    }

    /**
     * Este método cambia la imagen tanto a vertical como horizontal, usando una constaynte para cada una
     * @return el flip de la imagen
     * @param imagen es la imagen a voltear
     * @param direction la direccion a donde ira, H o V
     */
    public BufferedImage invertir(BufferedImage imagen, int direction) {
        int w = imagen.getWidth();// Obtenga el ancho de la imagen.
        int h = imagen.getHeight();// Obtenga la altura de la imagen.
        BufferedImage flipear = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);

        for (int y=0; y< h; y++){
            for (int x=0; x< w; x++){
                switch (direction){
                    case FLIP_HORIZONTAL:
                        flipear.setRGB((w-1)-x,y,imagen.getRGB(x,y));
                        break;
                    case FLIP_VERTICAL:
                        flipear.setRGB(x,(h-1)-y,imagen.getRGB(x,y));
                        break;
                }
            }
        }
        return flipear;
    }

    /**
     * Método que cambia el brillo de una imagen.
     * @param imagen Imagen a modificar.
     * @param brillo Brillo a subir/bajar.
     * @return Regresa la imagen modificada.
     */
    public BufferedImage brillo(BufferedImage imagen,int brillo){
        for ( int filas=0;filas<matriz.getFilas();filas++){
            for( int columnas=0;columnas<matriz.getColumnas();columnas++){
                int color=imagen.getRGB(filas, columnas);
                color=color+brillo;
                imagen.setRGB(filas,columnas,color);
            }
        }
        return imagen;
    }

    /** */
    /**
     * Rotar la imagen al ángulo especificado
     *
     * @param imagen de destino de imagen protegida
     * ángulo de rotación de grado @param
     * @return
     */
    public static BufferedImage rotar(BufferedImage imagen,int grados) {
        int w = imagen.getWidth();// Obtenga el ancho de la imagen.
        int h = imagen.getHeight();// Obtenga la altura de la imagen.
        int type = imagen.getColorModel().getTransparency();// Obtener transparencia de la imagen.
        BufferedImage img;// Imagen vacía.
        Graphics2D graphics2d;// Pincel vacío.
        (graphics2d = (img = new BufferedImage(w, h, type)).createGraphics()).setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2d.rotate(Math.toRadians(grados), w / 2, h / 2);// Rotación, grado es un número entero, grado, como 90 grados verticales.
        graphics2d.drawImage(imagen, 0, 0, null);// Desde la imagen de imagen de búfer a img, 0,0 son las coordenadas de img.
        graphics2d.dispose();
        return img;// Devuelve la imagen
    }

    //Metodo Daniel Alejandro
    //Agrega un texto a imagen

    /** */
    /**
     * Rotar la imagen al ángulo especificado
     *
     * @param imagen de destino de imagen
     * @return la imagen con un texto encima
     */
    public BufferedImage agregarTexto(BufferedImage imagen) throws IOException {
        int w = imagen.getWidth();// Obtenga el ancho de la imagen.
        int h = imagen.getHeight();// Obtenga la altura de la imagen.
        BufferedImage imagentexto = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        Graphics g;
        g = imagentexto.getGraphics();
        g.setFont(g.getFont().deriveFont(100f));
        g.drawString("Clase de ED", 500, 500);
        g.dispose();
        return imagentexto;
    }
}

//Ejemplo de codigo de la prac brindado por el Profesor Aldonso


//import javax.imageio.ImageIO;
  //      import java.awt.*;
    //    import java.awt.image.BufferedImage;
      //  import java.io.ByteArrayOutputStream;
        //import java.io.File;
        //import java.io.FileInputStream;
        //import java.io.IOException;
        //…..
        //BufferedImage imagen = ImageIO.read(new File("src/avefenix.jpg"));
        //int w = imagen.getWidth();
        //int h = imagen.getHeight();
        //BufferedImage imagen2 = new BufferedImage(w, h,
        //BufferedImage.TYPE_INT_RGB);
        //.código .......
        //int pixel = imagen.getRGB(i, j);
        //codigo ....
        //imagen.setRGB(i, j, colorInt);
        //código ...
        //ImageIO.write(imagen2, "JPG", new File("src/espejo.jpg"));
//codigo ...
