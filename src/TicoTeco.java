import java.util.Scanner;

public class TicoTeco {

    public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);
            String entrada;

            System.out.println("Digite uma palavra: ");
            entrada = leitor.nextLine();

            char[] charArray = entrada.toCharArray();

            for (int i=charArray.length; i > 0; i--) {
                System.out.print(charArray[i-1]);
            }
            leitor.close();




    }
}
