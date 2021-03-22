package programaidade;
import java.time.LocalDate;
import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano de nascimento: ");
        int nascimento = teclado.nextInt();
        int idade = LocalDate.now().getYear() - nascimento;
        if (idade > 18) {
            System.out.println("MAIOR");
        } else {
            System.out.println("MENOR");
        }
    } 
}
