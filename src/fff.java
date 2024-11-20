import java.util.Scanner;

public class fff {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 키보드로부터 정수 N을 입력 받아
        // N 개의 int형 원소를 가지는 1차원 배열을 생성하라.
        // 만약 N 값이 0이하 또는 10 초과일 경우 재입력
        int bar = 0;
        while (true) {
            System.out.print("0이상 10 이하 정수를 입력하세요 : ");
            bar = sc.nextInt();
            if (0 <= bar && bar <= 10) {
                break;
            }
        }
        int foo[] = new int[bar];
        // 생성된 1차원 배열에 사용자로 부터 값을 입력 받아 배열에 순차적으로 저장하라.
        // 예) 사용자 1 -> bar[0] = 1
        // 만약 음의 정수 또는 0이 입력 될 경우 재입력
        for (int i = 0 ; i < foo.length ; i++) {
            System.out.print("음과 0이 아닌 정수를 입력해주세요: ");
                while (true) {
                    int inputValue = sc.nextInt();
                    if (inputValue > 0) {
                        foo[i] = inputValue;
                        break;
                    } else {
                        System.out.println("다시해용");
                    }
                }
            }
        // 현재 1차원 배열에 입력된 값을 역순으로 출력하라.
        // 예) 3, 10, 20 -> 출력 : 20, 10, 3
//        for (int j = 0 ; j < foo.length ; j++) {
//            System.out.print(foo[(foo.length - j - 1)] + " ");
//        }
        for (int j = foo.length - 1 ; j >= 0 ; j--) {
            System.out.print(foo[j] + " ");
        }
    }
}