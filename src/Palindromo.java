import java.util.Scanner;

public class Palindromo {

    public static boolean isPalindrome(String word) {

        boolean response = false;

        char[] charArray = word.toCharArray();
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