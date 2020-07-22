import java.io.FileNotFoundException;
import java.io.IOException;

public class StringRev {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        
        String str = "my name is gayatri";
        System.out.println("Original String: " + str);
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);
        
        reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " + reverseStr);

      
        reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);

    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static String reverseRecursively(String str) {

        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
}