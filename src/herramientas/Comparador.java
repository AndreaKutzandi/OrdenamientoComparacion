/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;


import Interfaz.Grafica;
import java.util.ArrayList;
import org.jfree.data.xy.XYDataItem;

import Interfaz.RecibeOrdenamiento;


public class Comparador {
    private ArrayList<RecibeOrdenamiento> algoritmos;
    private int iteraciones;
    private int factorCrecimiento;

    public Comparador(ArrayList<RecibeOrdenamiento> algoritmos, int iteraciones, int factorCrecimiento) {
        this.algoritmos = algoritmos;
        this.iteraciones = iteraciones;
        this.factorCrecimiento = factorCrecimiento;
    }
    
    public void compararAlgoritmos(){
    
        
        Grafica grafica = new Grafica("Comparacion","tiempo","datos comparados");
        for (int x=0; x<this.algoritmos.size();x++)
            grafica.agrearSerie("serie"+x);
              
        for (int i=0; i < this.iteraciones;i++ ){

            double datos[] = aaordenamiento3cm1.AAOrdenamiento3CM1.generarDatosAleatorios(this.factorCrecimiento*(i+1), 100);
 
            int a = 0;
            for (int alg=0; alg < this.algoritmos.size();alg++){
                this.algoritmos.get(alg).ordenar(datos.clone());
                double tiempo =  this.algoritmos.get(alg).getTiempo_total();
                grafica.agregarDatoASerie("serie"+alg,new XYDataItem(i, tiempo));
                a++;
            }
        
        }
        grafica.creaYmuestraGrafica();
    }
}
