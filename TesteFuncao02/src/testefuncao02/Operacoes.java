package testefuncao02;
public class Operacoes {
    public static String contador(int a, int b) {
        String contador = "";
        for (int c = a; c <= b; c++) {
            contador += c + " ";
        }
        return contador;
    }
}
