/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colaejercicio;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class ColaEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        colaCircular caja = new colaCircular(4);
        Cliente c;
        int opc = 0;
        Scanner s = new Scanner(System.in);
        
        Cliente c1 = new Cliente("Armando Mendoza",5);
        Cliente c2 = new Cliente("Javier Hernandez",10);
        Cliente c3 = new Cliente("Anita Manola",13);
        Cliente c4 = new Cliente("Andrea Lagos",38);
        Cliente c5 = new Cliente("Sergio Mendis",2);
        Cliente c6 = new Cliente("Javier Sosa",6);
        Cliente c7 = new Cliente("Karina Alvarez",1);
        
        System.out.println("Cliente 1 ingresa a la cola.");
        caja.insertar(c1);
        System.out.println("Primero de la cola\n "+ caja.verPrimero());
        System.out.println("Ultimo de la cola\n "+caja.verUltimo());
        System.out.println("\n-------------------------------------------------------------\n");
        
        System.out.println("Cliente 2 ingresa a la cola.");
        caja.insertar(c2);
        System.out.println("Primero de la cola\n "+ caja.verPrimero());
        System.out.println("Ultimo de la cola\n "+caja.verUltimo());
        System.out.println("\n-------------------------------------------------------------\n");
        
        System.out.println("Cliente 3 ingresa a la cola.");
        caja.insertar(c3);
        System.out.println("Primero de la cola\n "+ caja.verPrimero());
        System.out.println("Ultimo de la cola\n "+caja.verUltimo());
        System.out.println("\n-------------------------------------------------------------\n");
        
        System.out.println("Cliente 4 ingresa a la cola.");
        caja.insertar(c4);
        System.out.println("Primero de la cola\n "+ caja.verPrimero());
        System.out.println("Ultimo de la cola\n "+caja.verUltimo());
        System.out.println("\n-------------------------------------------------------------\n");
        
        System.out.println("Cliente 5 intenta ingresar a la cola.");
        caja.insertar(c5);
        System.out.println("Primero de la cola\n "+ caja.verPrimero());
        System.out.println("Ultimo de la cola\n "+caja.verUltimo());
        System.out.println("\n-------------------------------------------------------------\n");
        
        System.out.println("Cliente 1 es atendido\n");
        caja.remover();
        System.out.println("Primero de la cola\n "+ caja.verPrimero());
        System.out.println("Ultimo de la cola\n "+caja.verUltimo());
        System.out.println("\n-------------------------------------------------------------\n");
        
        System.out.println("Cliente 2 es atendido\n");
        caja.remover();
        System.out.println("Primero de la cola\n "+ caja.verPrimero());
        System.out.println("Ultimo de la cola\n "+caja.verUltimo());
        System.out.println("\n-------------------------------------------------------------\n");
        
        System.out.println("Cliente 3 es atendido\n");
        caja.remover();
        System.out.println("Primero de la cola\n "+ caja.verPrimero());
        System.out.println("Ultimo de la cola\n "+caja.verUltimo());
        System.out.println("\n-------------------------------------------------------------\n");
        
        System.out.println("Cliente 5 ingresa a la cola\n");
        caja.insertar(c5);
        System.out.println("Primero de la cola\n "+ caja.verPrimero());
        System.out.println("Ultimo de la cola\n "+caja.verUltimo());
        System.out.println("\n-------------------------------------------------------------\n");
        
        System.out.println("Cliente 6 ingresa a la cola\n");
        caja.insertar(c6);
        System.out.println("Primero de la cola\n "+ caja.verPrimero());
        System.out.println("Ultimo de la cola\n "+caja.verUltimo());        
        System.out.println("\n-------------------------------------------------------------\n");
        
        System.out.println("Cliente 7 ingresa a la cola\n");
        caja.insertar(c7);
        System.out.println("Primero de la cola\n "+ caja.verPrimero());
        System.out.println("Ultimo de la cola\n "+caja.verUltimo());
        
        /*
        //Con menu interactivo
        while(opc != 4){
            System.out.println("Opciones\n1)Formar al cliente\n2)Atender cliente\n3)Ver fila\n4)Salir");
            switch(opc){
                case 1:
                    
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                default:
                    break;
            
            }
        
        }*/
    }
    
}
