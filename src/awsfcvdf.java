import java.util.Scanner;

public class awsfcvdf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] bar = {'+', '-', '*'};
        int count = 0;
        int groupCount = 0;
        int gameCount = 1;
        int playInput = 0;
        // 슬롯머신 개수 3~7개 사용자가 입력
        while (true) {
            System.out.print("슬롯 머신 개수를 입력해주세요 : ");
            playInput = sc.nextInt();
            if (playInput >= 3 && playInput <= 7) {
                break;
            } else {
                System.out.println("잘못된 입력입니다 다시 입력해주세요.");
            }
        }
        char[] selected = new char[playInput];
        // 슬롯 머신 생성
        while (true) {
            groupCount = 0;
            System.out.println(gameCount + "번째 게임");
            gameCount++;
            System.out.print("아무 값이나 입력하세요: ");
            sc.next();

            for (int i = 0; i < selected.length; i++) {
                // 선택된 3개의 연산자를 1차원 Array에 저장
                selected[i] = bar[(int) (Math.random() * 3)];
            }
            System.out.println("=================================");
            for (char pos : selected) {
                System.out.print("\t" + pos);
            }
            System.out.println("\n=================================");

            int countChar = 0;
            char selectedChar = 0;

            for (int i = 0; i < selected.length - 2; i++) {
                if (selected[i] == selected[i + 1] && selected[i + 1] == selected[i + 2]) {
                    // 연속 세 개
                    if (selected[i] == '+') {
                        groupCount += 3;
                    } else if (selected[i] == '-') {
                        groupCount += -3;
                    } else if (selected[i] == '*') {
                        groupCount += 5;
                    }
                    i += 2;
                } else if (selected[i] == selected[i + 1]) {
                    // 연속 두 개
                    if (selected[i] == '+') {
                        groupCount += 1;
                    } else if (selected[i] == '-') {
                        groupCount += -1;
                    } else if (selected[i] == '*') {
                        groupCount += 2;
                    }
                }
            }
            count += groupCount;
            System.out.println("그룹 점수 : " + groupCount);
            System.out.println("현재 점수는 : " + count);
            if (count >= 5 || count <= -5) {
                String msg = (count >= 5) ? "승리, 보너스 포인트 : " : "패배, 보너스 포인트 : ";
                System.out.println(msg + count);
                break;
            }
        }
    }
}

