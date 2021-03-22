package programapernas;
import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de pernas: ");
        int pernas = teclado.nextInt();
        String tipo = "";
        
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aracnídeo";
                break;
            default:
                tipo = "Extraterrestre";
        }
        System.out.println("O animal que você digitou tem " + pernas + " pernas e é um " + tipo);
    }
    
}
