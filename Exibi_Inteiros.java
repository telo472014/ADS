package recursivo;

public class Exibi_Inteiros {

    public static void main(String[] args) {
        
        int n=5;
        
        //Exibir elementos em ordem crescente de 1 à n.
        
        exibir(n-1);
        
        
    }
    
    static void exibir(int n){
        if(n>=0){
            /*Para exibir em ordem inversa os números inteiros de n a 1, basta inverter 
             as linhas exibir e System.out.print(n+1) */
            exibir(n-1);
            System.out.println(n+1);
        }
    }
    
}
