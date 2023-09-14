/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaejercicio;

/**
 *
 * @author Victor
 */
public class Cola <T>{
    private int inicio;
    private int fin;
    private int max;
    private T[] cola;
    
    public Cola(int m){
        this.max = m-1;
        this.inicio = -1;
        this.fin = -1;
        cola = (T[]) new Object[m];
    }
    
    public void insertar(T a){
        if(fin < max){
            fin++;
        cola[fin] = a;
        if(fin == 0)
            inicio = 0;
        }
        else
            System.out.println("Desbordamiento");
    }
    
    public T remover(){
        T a = null;
        if(inicio != -1){
            a = cola[inicio];
            if(inicio == fin){
                inicio = -1;
                fin = -1;
            }else{
            inicio++;
            }
        }else{
            System.out.println("Subdesbordamiento");
        }
        return a;
    }
    
    public T verPrimero(){
    return cola[inicio];
    }
    
    public T verUltimo(){
    return cola[fin];
    }
    
    public void verCola(){
        for (int i = fin; i >= 0 ; i--) {
            System.out.println("Posicion "+(i+1)+" "+cola[i]+"\n");
        }
    }
}
