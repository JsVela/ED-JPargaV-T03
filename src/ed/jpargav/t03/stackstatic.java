/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.t03;

/**
 *
 * @author JESUS PARGA VELA
 */
public class stackstatic <T> {
    protected Object [ ] info;
    protected int top;

    public stackstatic ( int tam ) {
        info = new Object[tam];
        top  = -1;
    }

    public boolean IsEmpty ( ) {
         return top == -1;
    }

    public void Push ( T x ) {
        if ( top+1 < info.length )
            info[++top] = x;
    }
    
    public Object Pop ( ) {
        if ( IsEmpty ( ) )
            return null;
        return info[top--];
    }
    

}
