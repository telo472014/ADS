package recursivo;

public class Soma {

    public static void main(String[] args) {
        int n = 5, x=n;
        
        soma(n-1, x);
        
    }
    
    
    //Exibi a soma de todos os elementos de 1 a n
    static void soma(int m, int s){
        
        if(m>=1){
            s+=m;
            soma(m-1, s);
        }
        
        System.out.println(s);
        
    }
    
    
}
