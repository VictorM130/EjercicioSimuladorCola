/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaejercicio;

/**
 *
 * @author Victor
 */
public class colaCircular <T>{

    private int inicio;
    private int fin;
    private int max;
    private T[] colaCir;
    
    public colaCircular(int m){
        this.max = m-1;
        this.inicio = -1;
        this.fin = -1;
        colaCir = (T[]) new Object[m];
    }
    
    public void insertar(T a){
        if((fin == max && inicio == 0) || (fin+1 == inicio)){
            System.out.println("Desbordamiento");
        }else{
            if(fin == max)
                fin = 0;
            else
                fin++;
        colaCir[fin] = a;
        if(inicio == -1)
            inicio = 0;
        }
    }
    
    public T remover(){
        T a = null;
        if(inicio == -1){        
            System.out.println("Subdesbordamiento");
        }else{    
            a = colaCir[inicio];
            if(inicio == fin){
                inicio = -1;
                fin = -1;
            }else if(inicio == max){
            inicio = 0;
            }else{
                inicio++;
            }
        }
        return a;
    }
    
    public T verPrimero(){
    return colaCir[inicio];
    }
    
    public T verUltimo(){
    return colaCir[fin];
    }  
}
