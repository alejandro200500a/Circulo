/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

/**
 *
 * @author VIAC
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radio=5;
        int diametro=4;
        
    Circunferencia cr =  new Circunferencia(radio,diametro);
    System.out.println(cr.toString());
    }
}
