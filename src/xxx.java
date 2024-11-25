import java.util.Scanner;

public class xxx {
    //         학생 목록 출력 함수
        static void prtMatrix(float[][] argMatrix, int numbers) {
            if (numbers == 0) {
                System.out.println("입력된 학생 정보가 없습니다.");
                return;
            }
            for (int i = 0 ; i < numbers ; i++) {
                for (int j = 0 ; j < argMatrix[i].length ; j++) {
                    System.out.print(argMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자에게 메뉴를 출력하여 입력에 따라 다양한 동작을 수행하는 프로그램 작성
        // 프로그램은 종료 명령을 받을 때 까지 반복 실행
        // 학생 성적 순서대로 넣기 위한 카운트
        int count = 0;
        int userInput = 0;
        final int NUM_OF_ROW = 3;
        final int NUM_OF_COL = 6;

        // 학생 성적 저장용 배열
        float[][] studentScore = new float[NUM_OF_ROW][NUM_OF_COL];

        while (true) {
            // 메뉴 출력
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 종료");
            // 사용자 입력
            System.out.print("선택 : ");
            userInput = sc.nextInt();

            // 종료
            if (userInput == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (userInput) {
                // 학생 성적 입력
                case 1:
                    System.out.print("학번을 입력하세요 : ");
                    studentScore[count][0] = sc.nextFloat();
                    // 입력된 학번의 성적을 차례로 입력 - 배열에 저장 (배열의 자료형은 float형이다.)
                    // 합계와 평균 계산하여 해당 필드에 저장
                    System.out.print("국어 성적 : ");
                    studentScore[count][1] = sc.nextFloat();
                    System.out.print("영어 성적 : ");
                    studentScore[count][2] = sc.nextFloat();
                    System.out.print("수학 성적 : ");
                    studentScore[count][3] = sc.nextFloat();
                    System.out.println("입력이 완료되었습니다.\n");
                    // 합계
                    studentScore[count][4] = studentScore[count][1] + studentScore[count][2] + studentScore[count][3] ;
                    // 평균
                    studentScore[count][5] = studentScore[count][4] / 3.0f;
                    count++;
                    break;
                // 입력된 학생 목록 출력
                case 2:
                    prtMatrix(studentScore, count);
                    break;

                // 학생 삭제하기
                case 3:
                    // 현재 입력된 학생들의 목록을 출력
                    // 삭제할 학생의 학번을 입력받음
                    System.out.print("삭제할 학생의 학번을 입력하세요 : ");
                    int deletId = sc.nextInt();
                    // 학번 존재 시 : 해당 학생 데이터 삭제하고 "삭제가 완료되었습니다." 출력
                    // 학번 미존재 시 : "해당 학번이 존재하지 않습니다. 다시 입력해주세요." 출력 후 재입력받음
                    // 사용자가 -1 입력시 삭제 메뉴 종료
                    if (deletId == -1) {
                        System.out.println("삭제 메뉴 종료");
                        break;
                    }
                    // 삭제 완료 후 업데이트된 목록 출력
                    prtMatrix(studentScore, count);
                    break;

                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요");
            }
        }
    }
}