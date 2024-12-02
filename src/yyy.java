import java.util.Scanner;

public class yyy {
    static void prtMatrix(float[][] argMatrix, int numbers) {
        String[] printPart = {"학번", "국어", "영어", "수학", "합계", "평균"};
        if (numbers == 0) {
            System.out.println("입력된 학생 정보가 없습니다.");
            return;
        }
        for (int i = 0 ; i < numbers ; i++) {
            for (int j = 0 ; j < argMatrix[i].length ; j++) {
                System.out.print(printPart[j] + "" +
                        "" +
                        "" +
                        "" +
                        ": " + argMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 초기 배열 크기 3행 6열
        int NUM_OF_ROW = 3;
        final int NUM_OF_COL = 6;
        // 학생수 카운트
        int studentCount = 0;
        int userInput = 0;
        String usedID = "";
        // 학생 성적 저장용 배열 생성
        float[][] studentScore = new float[NUM_OF_ROW][NUM_OF_COL];

        while (true) {
            // 메뉴 출력
            System.out.println("=============================");
            System.out.println("메뉴");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 입력된 학생 목록 출력");
            System.out.println("3. 학생 삭제하기");
            System.out.println("4. 종료");
            System.out.println("=============================");

            while (true) {
                System.out.print("선택 : ");
                userInput = sc.nextInt();
                if (userInput > 0 && userInput < 5) {
                    break;
                } else {
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                }
            }
            if (userInput == 4) {
                System.out.println("프로그램 종료");
                break;
            }
            // 배열 크기를 늘릴 때 전에 있던 데이터 저장용 배열 생성
            float[][] chageSize = new float[NUM_OF_ROW][NUM_OF_COL];

            switch (userInput) {
                // 학생 성적 입력
                case 1:
                    if (studentCount > studentScore.length - 1) {
                        for (int i = 0 ; i < studentScore.length ; i++) {
                            for (int j = 0; j < studentScore[i].length; j++) {
                                chageSize[i][j] = studentScore[i][j];
                            }
                        }
                        studentScore = new float[NUM_OF_ROW * 2][NUM_OF_COL];
                        System.out.println("배열이 확장되었습니다. 새로운 크기: " + NUM_OF_ROW);
                        for (int i = 0 ; i < chageSize.length ; i++) {
                            for (int j = 0; j < chageSize[i].length; j++) {
                                studentScore[i][j] = chageSize[i][j];
                            }
                        }
                    }
                    System.out.print("학번을 입력하세요 : ");
                    studentScore[studentCount][0] = sc.nextFloat();
                    for (int i = 0 ; i < studentScore.length ; i++) {
                        if (studentScore[i][0] == studentScore[studentCount][0]) {
                            System.out.println("중복된 학번입니다.");
                            System.out.print("덮어쓰기를 희망합니까? (Y: 덮어쓰기 진행, q: 메뉴로 돌아가기): ");
                            usedID = sc.nextLine();
                            if (usedID == "Y") {
                                for (int k = 0 ; k < studentScore.length ; k++) {
                                    for (int j = 0; j < studentScore[i].length; j++) {
                                        chageSize[k][j] = studentScore[k][j];
                                    }
                                }
                            } else if (usedID == "q") {
                                System.out.println("입력이 취소되었습니다. 메뉴로 돌아갑니다.");
                                break;
                            }
                        }
                    }
                    // 입력된 학번의 성적을 차례로 입력 - 배열에 저장 (배열의 자료형은 float형이다.)
                    // 합계와 평균 계산하여 해당 필드에 저장
                    System.out.print("국어 성적 : ");
                    studentScore[studentCount][1] = sc.nextFloat();
                    System.out.print("영어 성적 : ");
                    studentScore[studentCount][2] = sc.nextFloat();
                    System.out.print("수학 성적 : ");
                    studentScore[studentCount][3] = sc.nextFloat();
                    System.out.println("입력이 완료되었습니다.\n");
                    // 합계
                    studentScore[studentCount][4] = studentScore[studentCount][1] + studentScore[studentCount][2] + studentScore[studentCount][3] ;
                    // 평균
                    studentScore[studentCount][5] = studentScore[studentCount][4] / 3.0f;
                    studentCount++;
                    break;
                // 입력된 학생 목록 출력
                case 2:
                    prtMatrix(studentScore, studentCount);
                    break;
                // 학생 삭제하기
                case 3:
                    // 행렬의 행 개수 저장
                    int totalRows = studentScore.length;
                    // 삭제할 인덱스 저장
                    int removeIndex = 0;
                    // 현재 입력된 학생들의 목록을 출력
                    // 삭제할 학생의 학번을 입력받음
                    System.out.print("삭제할 학생의 학번을 입력하세요(-1 입력시 삭제 메뉴 종료) : ");
                    int deletId = sc.nextInt();
                    // 학번 존재 시 : 해당 학생 데이터 삭제하고 "삭제가 완료되었습니다." 출력
                    // 학번 미존재 시 : "해당 학번이 존재하지 않습니다. 다시 입력해주세요." 출력 후 재입력받음
                    // 사용자가 -1 입력시 삭제 메뉴 종료
                    if (deletId == -1) {
                        System.out.println("삭제 메뉴 종료");
                        break;
                    }
                    // 입력한 학번의 인덱스 찾기
                    for (int i = 0 ; i < totalRows ; i++) {
                        if (deletId == (int) studentScore[i][0]) {
                            removeIndex = i;
                            break;
                        }
                    }
                    // 삭제한 행 뒤의 행들을 위로 이동시킴
                    for (int i = removeIndex ; i < totalRows - 1; i++) {
                        for (int j = 0; j < studentScore[i].length; j++) {
                            studentScore[i][j] = studentScore[i + 1][j];
                        }
                    }
                    // 마지막 행을 0으로 초기화
                    for (int j = 0; j < studentScore[totalRows - 1].length; j++) {
                        studentScore[totalRows - 1][j] = 0;
                    }
                    // 삭제 완료 후 업데이트된 목록 출력
                    System.out.println("삭제가 완료되었습니다.");
                    prtMatrix(studentScore, studentCount);
                    studentCount--;
                    break;

                default:
                    System.out.println("Something went wrong");
                    break;
            }

        }
    }
}