/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaordenamiento3cm1;

import algoritmos.Burbuja;
import algoritmos.BurbujaOptimizado;

import java.util.ArrayList;
import Interfaz.RecibeOrdenamiento;
import herramientas.Comparador;
import java.util.Random;



public class AAOrdenamiento3CM1 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        //double [] datos = new double[]{6,5,3,1,8,7,2,4};
//        double [] datos =herramientas.Datos.generarDatosAleatorios(50000, 100);
//        
//        //double [] datos2 = new double[]{8,7,6,5,4,3,2,1};
//        double [] datos3 = datos.clone();
//        Burbuja b1 = new Burbuja();
//        b1.ordenar(datos);
//        System.out.println();
//        BurbujaOptimizado b2 = new BurbujaOptimizado();
//        b2.ordenar(datos3);
//        System.out.println();
//        
//        Grafica G = new Grafica("Grafica tiempo","tiempo","iteraciones");
//        G.agregarSerie(b1.getTiempos(),"Burbuja Normal");
//        G.agregarSerie(b2.getTiempos(),"Burbuja Optimizada");
//        G.creaYmuestraGrafica();
//        
//        System.out.println();
//    }
    
        public static void main(String[] args) {

        ArrayList<RecibeOrdenamiento> algoritmos = new ArrayList<>();
        algoritmos.add(new Burbuja());
        algoritmos.add(new BurbujaOptimizado());
        
        Comparador comparador = new Comparador(algoritmos, 1000, 10);
        comparador.compararAlgoritmos();
    }
        
        public static double[] generarDatosAleatorios(int n, int limite){
            
        double[] datos = new double[n];
        Random ran = new Random();
        
        for (int x=0; x < n ; x++){
           datos[x] = ran.nextInt(limite);
        }
        
        return datos;
        }
         
}
