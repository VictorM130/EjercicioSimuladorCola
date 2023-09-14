/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colaejercicio;

/**
 *
 * @author Victor
 */
public class Cliente {
    private String cliente;
    private int numArti;

    public Cliente(String cliente, int numArti) {
        this.cliente = cliente;
        this.numArti = numArti;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumArti() {
        return this.numArti;
    }

    public void setNumArti(int numArti) {
        this.numArti = numArti;
    }
    
    @Override
    public String toString(){   
        return "Nombre del cliente: " + this.cliente +"\nCantidad de Articulos: "+this.numArti+"\n";
    }
}
