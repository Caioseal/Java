package resoluçãosistema;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçãoSistema {

    public static void main(String[] args) {
        Toolkit ferramenta = Toolkit.getDefaultToolkit();
        Dimension dimensão = ferramenta.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + dimensão.width + " X " + dimensão.height);
    }
}
