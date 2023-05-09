import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int length = word.length();
        for (int i = 0; i < (length / 2);) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                System.out.println("ne Palindrom");
                break;
            } else {
                System.out.println("Palindrom");
                break;
            }
        }

    }
}
