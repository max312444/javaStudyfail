import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char inputChar = scanner.next().charAt(0);

        // 대문자는 소문자로, 소문자는 대문자로 변환
        if (inputChar >= 'A' && inputChar <= 'Z') {
            // 대문자 -> 소문자
            char convertedChar = (char) (inputChar + 32);
            System.out.println(convertedChar);
        } else {
            char convertedChar = (char) (inputChar - 32);
            System.out.println(convertedChar);
        }
        scanner.close();
    }
}