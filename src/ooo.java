import java.util.Scanner;

public class ooo {
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
            if (playerInput >= 3 && playerInput <= 10) {
                break;
            }
        }
        char[] slot = new char[playerInput];

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
            System.out.println("==================================");
            for (char pos : slot) {
                System.out.print("\t" + pos);
            }
            System.out.println("\n==================================");

            // 배열 내 연속된 문자 수 카운트 하기 위한 변수 생성
            int contiguousCount = 1;

            // 보너스 점수 판별
            // 마지막 인덱스 까지 검사하기 위해 범위 설정 변경 ((slot.lenght - 1) -> (slot.lenght))
            // 마지막 인덱스도 검사는 해여하니까 이렇게 설정
            for (int i = 0; i < slot.length ; i++) {
                // 같은 문자가 연속적으로 발생
                if (i < slot.length - 1 && slot[i] == slot[i + 1]) {
                    contiguousCount++; // 연속된 연산자 수
                } else {
                    // 연속된 문자 수 -> 2
                    if (contiguousCount == 2) {
                        switch (slot[i]) {
                            case '+':
                                groupCount += 1;
                                break;
                            case '-':
                                groupCount -= 1;
                                break;
                            case '*':
                                groupCount += 2;
                                break;
                        }
                        // 연속된 문자 수 -> 3
                    } else if (contiguousCount >= 3) {
                        switch (slot[i]) {
                            case '+':
                                groupCount += 3;
                                break;
                            case '-':
                                groupCount -= 3;
                                break;
                            case '*':
                                groupCount += 5;
                                break;
                        }
                    }
                    contiguousCount = 1;
                }
            }
            count += groupCount;
            System.out.println("그룹 점수 : " + groupCount);
            System.out.println("현재 점수 : " + count);
            gameCount++;

            if (count >= 5 || count <= -5) {
                if (count >= 5) {
                    System.out.println("승리! 최종 점수 : " + count);
                } else {
                    System.out.println("패배.. 최종 점수 : " + count);
                }
                break;
            }
        }
    }
}