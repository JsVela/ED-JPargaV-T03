/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.t03;

import java.util.Scanner;

/**
 *
 * @author JESUS PARGA VELA
 */
public class staticPalin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner ( System.in );
        System.out.println ( "Escriba una cadena de caracteres: " );
        String cad = s.nextLine ( );
        String cad2 = cad.toUpperCase ( );
        char [ ] exp = cad2.toCharArray ( );
        if ( Palin ( exp ) )
              System.out.println ( "es palíndromo" );
        else
              System.out.println ( "no es palíndromo" );

    }
    public static boolean Palin ( char [ ] exp ) {
        stackstatic s = new stackstatic ( 80 );
        boolean espalin = true;
        for ( int i = 0; i < exp.length; i++ ) // caracteres a la pila excepto espacios en blanco
            if ( exp [i] != ' ' )
                 s.Push ( exp [i] );
        for ( int i = 0; (i < exp.length) && espalin; i++ ) // trabajar con texto y pila
            if ( exp [i] != ' ' )
                if ( !s.Pop( ).equals ( exp [i] ) )
                    espalin = false;
        return espalin;
    }

    
}
