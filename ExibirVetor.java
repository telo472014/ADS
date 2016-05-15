package recursivo;

public class ExibirVetor {

    public static void main(String[] args) {
        
       int N = 6;
       
       // Vetor criado com N elementos
       int a[] = new int [N];
        
        a[0]=2;
        a[1]=5;
        a[2]=9;
        a[3]=3;
        a[4]=7;
        a[5]=4;
        
        exibir(a, N-1);
    }
    
    //Método que retorna a exibição de todos os elementos na ordem em que foram inseridos 
    static void exibir(int vet[], int n){
        if(n>=0){
            exibir(vet,n-1);
            System.out.println(vet[n]);
        }
    }
    
}
