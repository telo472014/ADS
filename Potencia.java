package recursivo;

public class Potencia {

    public static void main(String[] args) {
        
        int x = 2, n = 6, aux=x;
        
        //Exibi x elevado a n
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
