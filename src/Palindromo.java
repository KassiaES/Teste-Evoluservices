/**
 * 2- Um palíndromo é uma palavra que pode ser lida da esquerda para a direita e vice-versa.
    Escreva uma função que verifica se a palavra dada é um palíndromo.
    Caracteres em caixa alta devem ser ignorados.
    Por exemplo, isPalindrome("Deleveled") deve retornar True, já que é um palíndromo por ser possível ser lido nos dois sentidos.
    Utilize o esqueleto a seguir para implementar seu código:

    public boolean isPalindrome(String s) { // Seu código}
 *
 */

public class Palindromo {

    public static boolean isPalindrome(String s) {

        boolean response = false;

        char[] charArray = s.toCharArray();
        int count = charArray.length-1;

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == charArray[count]) {
                response = true;
            } else response = false;

            count--;
        }

        return response;
    }

}