import java.util.Scanner;

public class jjj {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
        // 예) M : 3, N : 2
        //    *  *
        //    *  *
        //    *  *
        // 예외처리 : M과 N이 0 또는 음의 정수인 경우 재입력
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        // L2
        // 문제는 동일, 출력 값 변경
        // 예) M : 3, N : 3
        //       *  *
        //    *     *
        //    *  *
        // 예외처리 : M과 N이 0 또는 음의 정수인 경우 재입력
        sc.close();
    }
}
