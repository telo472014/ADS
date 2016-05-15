package recursivo;

public class MenorVetor {

    public static void main(String[] args) {
        
        int N=10, menor;
        int vet[] = new int [N];
       
        
        vet[0]=10;
        vet[1]=5;
        vet[2]=1;
        vet[3]=9;
        vet[4]=7;
        vet[5]=3;
        vet[6]=12;
        vet[7]=2;
        vet[8]=6;
        vet[9]=8;
        
        menor=vet[0];
        
        menor(vet, N-1, menor);
        
        
        
    }
    
    //Esse método retorna menor elemento de um vetor
    static int menor(int []vet, int n, int menor){
        
        if(n>=1){
            if(vet[n]<menor ){
                menor=vet[n];
            }
            menor(vet, n-1, menor);
            return menor;
            
        }
        else{
            System.out.println("Retorno menor valor: "+menor);
            return menor;
        }
    }
    
    
    
    
}
