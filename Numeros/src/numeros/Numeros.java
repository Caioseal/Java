package numeros;
import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        int n, s = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Deseja continuar? [S/N] ");
            resposta = teclado.next();
        } while (resposta.equals("S"));
        System.out.println("A soma dos valores digitados é: " + s);
    }
    
}
