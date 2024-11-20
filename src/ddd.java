import java.util.Scanner;

public class ddd {
    public static void main(String[] args) {
        // 사용자의 정보 입력받음 나이, 이벤트 코드(E1~E3), 원하는 날짜(1 ~ 30)
        // E1 = 만 18세이상 예약 가능
        // E2 = 모든 연령대가 예약 가능, 날짜는 짝수일만 예약 가능
        // E3 = 만 16세 이상만 예약 가능, 7의 배수인 날짜만 예약 가능
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt(); // 나이
        sc.nextLine();

        System.out.print("예약하려는 이벤트 코드를 입력하세요 : ");
        String eventCode = sc.nextLine(); // 이벤트 코드

        System.out.print("원하는 예약 날짜를 입력하세요 : ");
        int Date = sc.nextInt(); // 예약 날짜

    switch (eventCode) {
        case "E1":
            if (age >= 18) {
                System.out.println("예약이 완료되었습니다!");
            } else {
                System.out.println("나이 제한으로 인해 예약할 수 없습니다.");
            }
            break;
        case "E2":
            if (Date % 2 == 0) {
                System.out.println("예약이 완료되었습니다!");
            } else {
                System.out.println("선택하신 날짜에는 예약할 수 없습니다.");
            }
            break;
        case "E3":
            if (Date % 7 != 0) {
                System.out.println("선택하신 날짜에는 예약할 수 없습니다.");
                return;
            } else if (age < 16) {
                System.out.println("나이 제한으로 인해 예약할 수 없습니다.");
                return;
            } else {
                System.out.println("예약이 완료되었습니다!");
            }
            break;

            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }
}
