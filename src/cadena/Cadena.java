/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadena;

/**
 *
 * @author jordi
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom;
        nom="Jordi";
        System.out.println("El nom "+nom+" té " +nom.length()+" caràcters \n");
        System.out.println("El nom "+nom+" té la lletra 'i' en la posició "+nom.indexOf("i")+"\n");
        System.out.println("Comença per: "+nom.substring(0,3));
        System.out.println("Acaba per: "+nom.substring(4));
        
        
        // TODO code application logic here
    }
    
}
