import java.util.Scanner;

public class ccc {
    public static void main(String[] args) {
        // 삼각형 판별기
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("두 변의 합이 다른 한 변 보다 작거나 같아서 삼각형을 만들 수 없습니다");
            return;
        }
        if (a == b && a == c) {
            System.out.println("정삼각형입니다.");
        } else if (a == b || b == c || c == a) {
            System.out.println("이등변 삼각형힙니다.");
        } else {
            System.out.println("부등변 삼각형힙니다.");
        }
    }
}
