package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
        /*int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2) / 2;
        System.out.println("A média entre " + n1 + " e " + n2 + " é " + media);*/
        
        /*int n = 5;
        int valor = 5 + ++n;
        System.out.println(valor);
        System.out.println(n);*/
        
        double aleatorio = Math.random();
        int n = (int) (5 + aleatorio * (10 - 5));
        System.out.println(n);
    }
    
}
