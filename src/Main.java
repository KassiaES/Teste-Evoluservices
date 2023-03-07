import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n \u001B[35m Hello Target! My name is Kassia \u001B[0m \n");

        // exercício 1
        TicoTeco.ticoTeco();

        // exercício 2
        String word;
        boolean response = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Exercício 2 - Palíndromo ");
        System.out.println("Digite uma palavra: ");
        word = scan.nextLine();
        response = Palindromo.isPalindrome(word);
        System.out.println(response);
        scan.close();


    }
}