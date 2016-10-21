/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.t03;

/**
 *
 * @author JESUS PARGA VELA
 * @param <T> Tipo de dato genérico
 */
public class nodeClass <T> {
    //Atributos
    private T data;
    private nodeClass next;
    
    //Constructor
    public nodeClass(T data){
        this.data = data;
        this.next = null;
    }
    //Métodos
    
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }
    public void setNext(nodeClass n){
        this.next = next;
    }
    public nodeClass getNext(){
        return this.next;
    }
}
