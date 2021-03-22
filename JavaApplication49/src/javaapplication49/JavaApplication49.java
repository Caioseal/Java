package javaapplication49;
import javax.swing.JOptionPane;

public class JavaApplication49 {

    public static void main(String[] args) {
        int numero, soma = 0, pares = 0, impares = 0, grandes = 0, media = 0, contador =-1;
        
        do {
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número (Valor 0 interrompe)"));
        soma += numero;
        contador++;
        
        if (numero % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
        if (numero > 100) {
            grandes++;
        }
    } while (numero != 0);
        media = soma / contador;
        JOptionPane.showMessageDialog(null, "<html>Total de valores: " + contador + "<br>Total de Pares: " + pares + "<br>"
                + "<br>Total de Ímpares: " + impares + "<br>Acima de 100: " + grandes + "<br> Média dos valores: " + media);
    }
}