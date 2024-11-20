import java.util.Scanner;

public class kkk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mValue = 0;
        int nValue = 0;

        while (true) {
            // 사용자로부터 M, N 정수 입력
            System.out.print("가로열을 입력하세요 : ");
            mValue = sc.nextInt();
            System.out.print("세로열을 입력하세요 : ");
            nValue = sc.nextInt();

            if (mValue > 0 && nValue > 0) {
                break;
            }
//            if (mValue < 1 || nValue < 1) {
//                System.out.println("잘못된 입력입니다. 다시 입력하세요");
//                continue;
//            } else {
//                break;
//            }
        }

        // Matrix 생성
        for (int i = 0; i < mValue; i++) { // 가로열 생성
            for (int j = 0; j < nValue; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        //사용자로부터 M, N 정수를 입력 받아, M X N Matrix 출력
        // 예) M = 3, N = 2
        //  *  *
        //  *  *
        //  *  *
        // 예외 처리 : M과 N이 0 또는 음의 정수인 경우, 재입력

        System.out.println("--------------------------------------");

        for (int i = 0; i < mValue; i++) {
            for (int j = 0; j < nValue; j++) {
                if (i == j) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

        // L2
        // 문제는 동일, 출력값 변경
        // 예) M = 3, N = 3
        //     *  *
        //  *     *
        //  *  *
        // 예외 처리 : M과 N이 0 또는 음의 정수인 경우, 재입력
    }
}