// Ejemplo Grafica Lineal
package pruebas;

import estructuraslineales.ListaEncadenadaDoble;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GraficaDatos{

    public static void main(String[] args) {

        XYSeries series = new XYSeries("Producto A");

        // Introduccion de datos de muestra de la poblacion
        series.add(4.138, 8);
        series.add(4.138, 6);
        series.add(4.368, 8.8);
        series.add(4.519, 7);
        series.add(4.628, 17.9);
        series.add(4.652, 10.5);
        series.add(4.88, 10.2);
        series.add(4.903, 11.8);
        series.add(4.906, 13.8);
        series.add(4.926, 14.6);
        series.add(4.963, 21.9);
        series.add(4.973, 16.1);
        series.add(5, 7.4);
        series.add(5.012, 15.3);
        series.add(5.019, 14.4);
        series.add(5.036, 9.7);
        series.add(5.093, 9);
        series.add(5.155, 16.3);


        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Correlación entre costo de las casas y número de habitaciones/ Gráfica lineal", // Título
                "No. De habitaciones", // Etiqueta Coordenada X
                "Costo de casas en miles de dólares", // Etiqueta Coordenada Y
                dataset, // Datos
                PlotOrientation.VERTICAL,
                true,
                false,
                false
        );

        // Mostramos la grafica en pantalla
        ChartFrame frame = new ChartFrame("Ejemplo Grafica Lineal", chart);
        frame.pack();
        frame.setVisible(true);

    }

}