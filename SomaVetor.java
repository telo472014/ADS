package recursivo;

public class SomaVetor {

    
    public static void main(String[] args) {
        int N = 5, t=0;
        int []a= new int [N];
        
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        
        
        soma(a, N-1,t);
        
        
    }
    
    static int soma(int[]a, int n, int t){
        
        if(n>=0){
            t+=a[n];
            soma(a, n-1, t);
        }
        System.out.println(t);
        return t;
        
    }
    
    
}
