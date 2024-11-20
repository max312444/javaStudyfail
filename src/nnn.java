import java.util.Scanner;

public class nnn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] bar = {'+', '-', '*'};
        int playerInput = 0;
        int count = 0;
        int groupCount = 0;
        int gameCount = 1;

        while (true) {
            // 사용자가 슬롯 머신 개수 지정 3~7
            System.out.print("슬롯 머신의 개수를 입력하세요 : ");
            playerInput = sc.nextInt();
            if (playerInput >= 3 && playerInput <= 7) {
                break;
            }
        }
        char[] slot = new char[playerInput];

//        System.out.println(slot);
        while (true) {
            groupCount = 0;
            // 연산자 랜덤 뽑아냄
            for (int i = 0 ; i < slot.length ; i++) {
                slot[i] = bar[(int) (Math.random() * 3)];
            }
            // 아무 값이나 입력
            System.out.print("아무 값이나 입력하세요 : ");
            sc.next();
            // 출력
            System.out.println(gameCount + "번째 게임");
            System.out.println("=================================================");
            for (char pos : slot) {
                System.out.print("\t" + pos);
            }
            System.out.println("\n=================================================");

            // 보너스 점수 판별
            // 3개 연속될 경우 먼저 판단. 3개 아니면 2개로 이동.
            // if문을 이렇게 쓴 이유 : 3개가 연속인지 확인하기 위해서 배열의 길이 - 2 미만의 인덱스를 i로 두고 검사를 한다.
            // 이렇게 하면 인덱스의 범위를 벗어나지 않고 3개 연속인지 검사할 수 있다.
            for (int i = 0 ; i < slot.length - 1 ; i++) {
                if (i < slot.length - 2 && slot[i] == slot[i + 1] && slot[i + 1] == slot[i + 2]) {
                    if (slot[i] == '+') {
                        groupCount += 3;
                    } else if (slot[i] == '-') {
                        groupCount -= 3;
                    } else if (slot[i] == '*') {
                        groupCount += 5;
                    }
                    i += 2;  // 확인한 인덱스들은 넘어감
                    // 2개 연속될 경우
                    // if문을 이렇게 쓴 이유 : 2개가 연속인지 확인하기 위해서 배열의 길이 - 1 을 해줘서 2개씩 묶어서 검사한다.
                    // 이렇게 하면 인덱스 범위를 벗어나지 않고 배열 끝까지 검사가 가능하다.
                } else if (slot[i] == slot[i + 1]) {
                    if (slot[i] == '+') {
                        groupCount++;
                    } else if (slot[i] == '-') {
                        groupCount--;
                    } else if (slot[i] == '*') {
                        groupCount += 2;
                    }
                }
            }
            count += groupCount;
            System.out.println("그룹 점수 : " + groupCount);
            System.out.println("현재 점수 : " + count);
            gameCount++;

            if (count >= 5 || count <= -5) {
                System.out.println("게임 종료");
                System.out.println("최종 점수 : " + count);
                break;
            }
        }
    }
}