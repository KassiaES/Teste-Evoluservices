import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n \u001B[35m Hello Target! My name is Kassia");


        String word;
        boolean response = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        word = scan.nextLine();
       response = Palindromo.isPalindrome(word);

        System.out.println(response);

       scan.close();
    }
}