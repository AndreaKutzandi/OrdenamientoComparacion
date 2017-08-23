
package algoritmos;
import Interfaz.RecibeOrdenamiento;
import java.util.ArrayList;

public class BurbujaOptimizado implements RecibeOrdenamiento{
    
    private double tiempo_inicial;
    private double tiempo_final;
    private double tiempo_total;
    private int intercambios;
    private int comparaciones;
    private double tiempoIteraciones;
     private ArrayList<Double> tiempos;

    public double getTiempoIteraciones() {
        return tiempoIteraciones;
    }
    public void setTiempoIteraciones(double tiempoIteraciones) {
        this.tiempoIteraciones = tiempoIteraciones;
    }
    public double getTiempo_inicial() {
        return tiempo_inicial;
    }
    public void setTiempo_inicial(double tiempo_inicial) {
        this.tiempo_inicial = tiempo_inicial;
    }

    public double getTiempo_final() {
        return tiempo_final;
    }

    public void setTiempo_final(double tiempo_final) {
        this.tiempo_final = tiempo_final;
    }

    public double getTiempo_total() {
        return tiempo_total;
    }

    public void setTiempo_total(double tiempo_total) {
        this.tiempo_total = tiempo_total;
    }

    public int getIntercambios() {
        return intercambios;
    }

    public void setIntercambios(int intercambios) {
        this.intercambios = intercambios;
    }

    public int getComparaciones() {
        return comparaciones;
    }

    public void setComparaciones(int comparaciones) {
        this.comparaciones = comparaciones;
    }

    public ArrayList<Double> getTiempos() {
        return tiempos;
    }

    public void setTiempos(ArrayList<Double> tiempos) {
        this.tiempos = tiempos;
    }
    
    
    public BurbujaOptimizado(){
        this.tiempo_inicial = 0;
        this.tiempo_final = 0;
        this.tiempo_total = 0;
        this.comparaciones = 0;
        this.intercambios = 0;
        tiempos = new ArrayList<>();
        this.tiempoIteraciones = 0;
    }
    
    public void ordenar(double []arreglo){
           
        double aux;
        ArrayList<Double> tiempos =new ArrayList();
        
          this.tiempo_inicial = System.currentTimeMillis();
          for(int i = 0; i < arreglo.length - 1; i++)
            {
            for(int j = 0; j < arreglo.length - i - 1; j++)
                 { 
                   this.setComparaciones(this.getComparaciones() +1);
                           
                if (arreglo[j] > arreglo[j + 1])
                {
                    double tmp = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = tmp;
                    this.setIntercambios(this.getIntercambios() +1);
                }
            }
            this.setTiempoIteraciones(System.currentTimeMillis()); 
            this.tiempos.add(tiempoIteraciones); //guardar el tiempo
        }
          //ya termino 
          this.tiempo_final = System.currentTimeMillis();
          this.tiempo_total = this.tiempo_final - this.tiempo_inicial;
          this.getTiempos().add(getTiempo_total());
    
    }
      
}
