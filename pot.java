/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rec2;

/**
 *
 * @author a1502573
 * Implemente, de forma recursiva, uma função int pot(int x, int n) que, dados dois números inteiros x e n,
 * calcula o valor de x^n
 */
public class pot {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 2, n = 6, aux=x;
        pot(x, n-1, aux);
        
    }
    
    static void pot(int x, int n, int aux){
        
        if(n>=1){
            x*=aux;
            pot(x, n-1, aux);
            
        }
        System.out.println(x);
    }
    
}
