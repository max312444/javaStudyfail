import java.util.Scanner;

public class mmm {
    public static void main(String[] args) {
        // 세가지 연산자('+', '-', '*')를 포함하는 char형 1차원 배열 생성
        Scanner sc = new Scanner(System.in);

        final int foo = 3;
        char[] bar = {'+', '-', '*'};
        char[] selected = new char[foo];
        int count = 0;
        int gameCount = 1;
        // 사용자로부터 아무값이나 입력 받음
        while (true) {
            System.out.println(gameCount + "번째 게임");
            System.out.print("아무값이나 입력하세요: ");
            sc.next();
            // 각 라운드에서 게임 실행하면 랜덤으로 문자중 선택
            for (int i = 0; i < selected.length; i++) {
                // 선택된 3개의 연산자를 1차원 Array에 저
                selected[i] = bar[(int) (Math.random() * 3)];
            }
            System.out.println("=============================");
            for (char pos : selected) {
                System.out.print("\t" + pos);
            }
            System.out.println("\n=============================");

            int countChar = 0;
            char selectedChar = 0;

            for (int i = 0; i < selected.length - 1; i++) {
                if (selected[i] == selected[i + 1]) {
                    countChar++;
                    selectedChar = selected[i];
                }
            }
            System.out.println(selectedChar);
            if (countChar == 1) {
                count += (selectedChar == '+') ? 1 :
                        (selectedChar == '-') ? -1 :
                                (selectedChar == '*') ? 2 : 0;
            } else if (countChar == 2) {
                count += (selectedChar == '+') ? 3 :
                        (selectedChar == '-') ? -3 :
                                (selectedChar == '*') ? 5 : 0;
            }
            System.out.println("현재 점수는 : " + count);
            if (count >= 5 || count <= -5) {
                String msg = (count >= 5) ? "승리, 보너스 포인트 : " : "패배, 보너스 포인트 : ";
                System.out.println(msg + count);
                break;
            }
            gameCount++;
        }

        // 연속해서 같은 연산자가 나오면 콤보 점수가 부여됨
        // 2개,3개 연속 보너스 점수 부여
        // 5점 이상 -5점 이하이면 게임 종료
        // 게임 횟수 출력
        // 매 라운드가 끝나면 현재 점수를 출력
    }
}