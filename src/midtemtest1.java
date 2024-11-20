import java.util.Scanner;

public class midtemtest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM_OF_ITEMS = 3;
        // 세가지 연산자 ('+', '-', '*')를 포함 하는 char type 1차원 배열을 생성
        char[] items = {'+' ,'-' ,'*'};
        char[] selected = new char[NUM_OF_ITEMS];
        int bounsPoints = 0;
        int gameCount = 1;

        while (true) {
            System.out.println(gameCount + "번째 게임");
            // 사용자로부터 아무키나 입력
            System.out.print("아무키나 입력 하세요 : ");
            sc.next();

            // 랜덤하게 아이템 3개를 선택하여 1차원 배열에 저장
            for(int i = 0 ; i < selected.length ; i++) {
                // char[] items = {'+' ,'-' ,'*'} 중 하나 선택해서 저장
                selected[i] = items[(int) (Math.random() * NUM_OF_ITEMS)];
            }
            System.out.println("=============================");
            for(char itme : selected) {
                System.out.print("\t" + itme);
            }
            System.out.println("\n=============================");

            // 연속된 문자 저장용 변수 생성
            char selectedItem = 0;
            // 연속된 문자 카운트
            int conCharCount = 0;

            // 포인트 점수 계산
            for (int i = 0 ; i < selected.length - 1 ; i++) {
                if (selected[i] == selected[i + 1]) {
                    conCharCount++;
                    // 연속된 문자 종류 저장
                    selectedItem = selected[i];
                }
            }
            // A. 연속된 문자가 2개
            if (conCharCount == 1) {
                bounsPoints += (selectedItem == '+') ? 1 :
                               (selectedItem == '-') ? -1 :
                               (selectedItem == '*') ? 2 : 0 ;
                // B. 연속된 문자가 3개
            } else if (conCharCount == 2) {
                    bounsPoints += (selectedItem == '+') ? 3 :
                                   (selectedItem == '-') ? -3 :
                                   (selectedItem == '*') ? 5 : 0 ;
            }
            System.out.println("현재 점수 : " + bounsPoints);

            // 게임 종료 여부 판별
            if (bounsPoints >= 5 || bounsPoints <= -5) {
                String msg = (bounsPoints >= 5) ? "승리, 보너스 포인트 : " : "패배, 보너스 포인트 : ";
                System.out.println(msg + bounsPoints);
                break;
            }
            gameCount++;

        }
        // 무작위로 연산자 3개 뽑아냄

        // 2, 3개가 붙어서 나오면 콤보 점수 부여
        // + 2개 1점 추가. - 2개 1점 감소. * 2개 2점 추가
        // + 3개 3점 추가. - 3개 3점 감소. * 3개 5점 추가

        // 게임 종료 조건 : 점수가 5점 이상 or -5점 이하
        // 라운드 시작마다 게임 횟수 출력, 아무 값이나 입력하면 시작
        // 매 라운드가 끝나면 점수 출력

    }
}

