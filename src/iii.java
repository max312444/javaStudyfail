import java.util.Scanner;

public class iii {
    public static void main(String[] args) {

        // 가위 바위 보 게임 구현
        // 사용자로부터 "Scissors, Pock, Paper"를 입력
        // 컴퓨터는 "Scissors, Pock, Paper" 중 하나를 랜덤하게 선택
        Scanner sc = new Scanner(System.in);
        String bar[] = {"Scissors", "Pock", "Paper"};
        String player = "";
        int result = 0;
        // 보너스 점수 카운트
        int score = 0;
        // 연승 카운트
        int winCount = 0;

        // 게임은 무한 반복
        while (true) {
            // 사용자 입력
            System.out.print("Scissors, Pock, Paper 중 하나를 입력하세요: ");
            player = sc.next();
            // 입력 내용 판별
            result = switch (player){
                case "Scissors" -> 0;
                case "Rock" -> 1;
                case "Paper" -> 2;
                case "Exit" -> 3;
                default -> -1;
            };
            // 다른거 입력시 재입력
            if (result == -1) {
                System.out.println("다시입력하세요");
                continue;
            }

            // "Exit" 입력시 게임 종료
            if (result == 3) {
                System.out.println("게임 종료!");
                break;
            }
            // 컴퓨터 입력으로 랜덤 인덱스를 받음 - bar Array의 원소가 3개 이니 * 3 해주었음
            int comChoice = (int) (Math.random() * 3) ;
            // 출력 문을 간단히 하기 위한 msg 변수 생성
            String msg = "";

            // 결과 판별
            // 무승부
            if (result == comChoice) {
                // 연승이 끊어 졌으므로 연승 카운트 초기화
                winCount = 0;
                msg = "무승부";
                // 승리
            } else if ((result == 0 && comChoice == 2) || (result == 1 && comChoice == 0)
                    || (result == 2 && comChoice == 1)) {
                winCount += 1;
                // 만약 연승 카운트가 2 이상이면 보너스 점수 3점으로 추가
                if (winCount >= 2) {
                    score += 3;
                    // 아니면 1점 추가
                } else {
                    score += 1;
                }
//                score += (winCount > 1)? 3:1; // 삼항 연산자를 이용하여 연승중이면 +3 아니면 +1을 되게 만든다.
                msg = "승리";
                // 그 외의 값들은 패배
            } else {
                winCount = 0;
                score -= 1;
                msg = "패배";
            }
            // 최종 출력
            // 만약 보너스 점수가 7점이상 또는 -7점이하 이면 종료
//            if (score >= 7) {
//                System.out.println("사용자 승리 : " + " 보너스 점수 : " + score);
//            } else if (score <= -7) {
//                System.out.println("사용자 패배 : " + " 보너스 점수 : " + score);
//            }
            // 삼항 연산자를 사용하여 7점이상 그리고 -7점이하 일때 게임 종료 구문 출력
            if (score >= 7 || score <= -7) {
                String msg2 = (score >= 7) ? "게임 승리" : "게임 패배";
                System.out.println(msg2 + "보너스 점수 : " + score);
            }

            System.out.println(msg + " 보너스 점수 : " + score + " - 사용자 : " + player + " 컴퓨터 : " + bar[comChoice]);
        }

        // 결과 값 출력:
        // 예1) 승리 - 사용자 : 가위, 컴퓨터 : 보
        // 예2) 패배 - 사용자 : 가위, 컴퓨터 : 바위
        // 예3) 무승부 - 사용자 : 가위, 컴퓨터 : 가위

        // "Exit"를 입력하기 전까지 계속해서 게임 실행
        // 보너스 점수 구현
        // 사용자 승리시 +1 패배시 -1
        // 연속 승리시 + 3
        //  - 매 게임 결과 출력시 보너스 점수도 표시
        // 보너스 점수가 7점이상 또는 -7점이하 이면 종료
        //  - 사용자 승리 : 보너스 점수 XX점
        //  - 사용자 패배 : 보너스 점수 XX점


        // 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
        // 예) M : 3, N : 2
        //    *  *
        //    *  *
        //    *  *
        // 예외처리 : M과 N이 0 또는 음의 정수인 경우 재입력

        // L2
        // 문제는 동일, 출력 값 변경
        // 예) M : 3, N : 3
        //       *  *
        //    *     *
        //    *  *
        // 예외처리 : M과 N이 0 또는 음의 정수인 경우 재입력
    }
}