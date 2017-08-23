/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

//import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.util.ArrayList;
import org.jfree.data.xy.XYDataItem;

/**
 *
 * @author andrea
 */
public class Grafica {
    // grafica
    private JFreeChart graficax;
    // coleccion de series
    private XYSeriesCollection series;
    private String nombre,ComparacionesX,TiempoY;

    public Grafica(String nombre,String ty,String tx) {
     this.graficax = null;
     this.series = new XYSeriesCollection();
     this.nombre = nombre;
     this.ComparacionesX = tx;
     this.TiempoY = ty;
    }
    
    public void agrearSerie(String nombre){
     XYSeries serie = new XYSeries(nombre);
     this.series.addSeries(serie);
    }
    public void agregarDatoASerie(String nombre, XYDataItem dato){
       this.series.getSeries(nombre).add(dato);
    }

    public void agregarSerie (ArrayList<Double> datosSerie, String nombreSerie){
       // instanciamos la serie
        XYSeries serie = new XYSeries(nombreSerie);
        // recorrer los datos para agregarlos a la serie
        for (int x = 0 ; x < datosSerie.size();x++){
        serie.add(x, datosSerie.get(x));
      }
     // agregamos al serie a la coleccion de series
     this.series.addSeries(serie);
    }
    
    public void creaYmuestraGrafica(){
    
        this.graficax = ChartFactory.createXYLineChart(nombre, ComparacionesX, TiempoY, series);
        
        // utilizar un panel especial dentro de jfreechart
        ChartFrame panel = new ChartFrame("grafica",graficax);
        panel.pack();
        panel.setVisible(true);
    }   

}
