import java.util.Scanner;

public class hhh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가위, 바위, 보 게임 만들기
        String bar[] = {"Scissors", "Rock", "Paper"};
        String playerInput = "";
        int result = 0;
        // 포인트 저장용
        int score = 0;
        // 승리 카운트
        int winCount = 0;

        // Quit입력 전까지 계속 실행이므로 무한 반복
        while (true) {
            // 사용자 입력
            System.out.print("Scissors, Rock, Paper 중 하나를 입력하세요: ");
            playerInput = sc.nextLine();

            // 사용자 가 Scissors, Rock, Paper 중에 입력했는지 확인
            result = switch (playerInput) {
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                case "Quit" -> 3;
                default -> -1;
            };
            // Quit 입력시
            if (result == 3) {
                System.out.println("프로그램 종료");
                break;
            }
            // Scissors, Rock, Paper 이외의 값을 입력했을시
            if (result == -1) {
                continue;
            }

            //컴퓨터 랜덤 선택 - 인덱스 번호로
            int comValue = (int) (Math.random() * 3);
            System.out.println(comValue);

            String endTxt = "";

            // 무승부
            if (result == comValue) {
                endTxt = "무승부";
                 winCount = 0;
                // 승리
            } else if ((result == 0 && comValue == 2) || (result == 1 && comValue == 0) ||
                    (result == 2 && comValue == 1)) {
                // 승리하면 점수 1점 증가
                winCount++;
                // 연속 승리시 점수 4점 증가 (승리 횟수 2회 이상일 경우)
                if (winCount >= 2) {
                    score = score + 4;
                } else {
                    score++;
                }
                endTxt = "승리";
            } else {
                // 패배하면 점수 1점 감소
                score--;
                // 패배하면 승리 카운트 초기화
                winCount = 0;
                endTxt ="패배";
            }
            // 출력!
            System.out.println(endTxt + "\tUser : " + playerInput + "\tComputer : " + bar[comValue] +
                    "\t현재 점수 : " + score);
            // 만약 점수가 7점이상이면 승리하며 게임 종료, -7점 이하이면 패배하고 게임 종료
            if (score >= 7) {
                endTxt = "축하합니다 게임을 종료합니다.";
                System.out.println(endTxt);
                break;
            } else if (score <= -7) {
                endTxt = "다음 기회에 게임 종료";
                System.out.println(endTxt);
                break;
            }
        }
    }
}
