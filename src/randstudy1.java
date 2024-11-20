import java.util.Scanner;

public class randstudy1 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // 사용자로부터 Scissors, Rack, Paper
            // - 예시 : Scissors, Rock, Paper 중 하나를 입력 하세요.
            String playerInput = "";
            String SciRockPaper[] = {"Scissors", "Rock", "Paper"};
            int result = 0;

            while (true) {
                // 사용자로부터 Scissors, Rack, Paper
                // - 예시 : Scissors, Rock, Paper 중 하나를 입력 하세요.
                System.out.print("Scissors, Rock, Paper 중 하나를 입력 하세요 : ");
                playerInput = sc.nextLine();


                // 사용자 입력 숫자로 변경
                result = switch (playerInput) {
                    case "Scissors" -> 0;
                    case "Rock" -> 1;
                    case "Paper" -> 2;
                    case "Quit" -> 3;
                    // 이외의 값들은 전부 -1로 지정
                    default -> {
                        yield -1;
                    }
                };

                // "quit"를 입력하면 프로그램 종료 -> break
                if (result == 3) {
                    System.out.println("프로그램 종료.");
                    break;
                }

                // - Scissors, Rock, Paper 이외의 값이 입력 될 경우
                // 잘못된 입력 -> 재입력 -> continue
                if (result == -1) {
                    //  "잘못된 입력 값 입니다, Scissors, Rock, Paper 중 하나를 입력 하세요."
                    System.out.println("잘못된 입력 값 입니다");
                    continue;
                }
//            System.out.println("사용자 입력 : " + result);

                // 컴퓨터가 난수를 이용해서, 가위-바위-보 중 하나 선택
                int computerInput = (int) (Math.random() * 3);
//            System.out.println(computerInput);

                // 결과 출력 및 게임 재시작
                // - 예1) 승리 : 사용자 - 가위, 컴퓨터 - 보
                // - 예2) 패배 : 사용자 - 가위, 컴퓨터 - 바위
                // - 예3) 무승부 : 사용자 - 가위, 컴퓨터 - 가위
                if (computerInput == result) {
                    System.out.println("무승부 : " + "사용자 : " + playerInput + ", " + "컴퓨터 : " + SciRockPaper[computerInput]);
                } else if ((result == 0 && computerInput == 2) || (result == 1 && computerInput == 0) ||
                        (result == 2 && computerInput == 1)) {
                    System.out.println("승리 : " + "사용자 : " + playerInput + ", " + "컴퓨터 : " + SciRockPaper[computerInput]);
                } else {
                    System.out.println("패배 : " + "사용자 : " + playerInput + ", " + "컴퓨터 : " + SciRockPaper[computerInput]);
                }
            }
        }
    }