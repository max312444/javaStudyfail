import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // 도서관 이용 판별기
        System.out.print("사용자의 나이를 입력해주세요: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 0) {
            if (age <= 12) {
                // grade = "어린이"
                System.out.println("어린이 이용권을 사용할 수 있습니다.");
            } else if (age <= 18) {
                // grade = "청소년"
                System.out.println("청소년 이용권을 사용할 수 있습니다.");
            } else {
                // grade = "성인"
                System.out.println("성인 이용권을 사용할 수 있습니다.");
            }
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}