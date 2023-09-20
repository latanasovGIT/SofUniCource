import java.util.Scanner;

public class Ex05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfLetters = Integer.parseInt(scanner.nextLine());
        int offset = 0;
        String word = "";

        for (int i = 0; i < numOfLetters; i++) {
            int digit = Integer.parseInt(scanner.nextLine());
            int mainDigit = digit % 10;
            offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }
            int digitLenght = String.valueOf(digit).length();
            int letterIndex = offset + digitLenght - 1;
            int ASCIIcode = 97 + letterIndex;
            char ch = (char) ASCIIcode;
            if (digit == 0) {
                word = word + " ";
            } else {
                word += ch;
            }
        }
        System.out.println(word);
    }
}
