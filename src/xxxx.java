import java.util.Scanner;
public class xxxx {
    static void prtMatrix(float[][] argMatrix, int argNumOfStd) {

        if (argNumOfStd == 0) {
            System.out.println("입력된 학생 정보가 없습니다.");
            return;
        }

        for (int i = 0; i < argNumOfStd; i++) {
            for (int j = 0; j < argMatrix[i].length; j++) {
                System.out.print(argMatrix[i][j] + "");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        final int NUM_OF_STUDENTS = 3;
        final int NUM_OF_FIELDS = 6;
        int intputValue = 0;
        int numOfStudents = 0;


        Scanner s = new Scanner(System.in);

        // 3 X 6 Matrix
        float[][] stdMatrix = new float[NUM_OF_STUDENTS][NUM_OF_FIELDS];

        while (true) {

            //메뉴 출력
            while (true) {
                System.out.print("1. 학생 성적 입력\n");
                System.out.print("2. 입력된 학생 목록 출력\n");
                System.out.print("3. 학생 삭제하기\n");
                System.out.print("4. 종료\n");
                System.out.print("선택:  ");

                intputValue = s.nextInt();

                if (intputValue >= 1 && intputValue <= 4) {
                    break;
                } else {
                    System.out.print("잘못된 입력입니다,다시 선택해주세요");
                }
            }
            //4번은 종료
            if (intputValue == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            //menu에서 선택
            switch (intputValue) {

                case 1: {
                    //1번 선택 입력받기
                    System.out.print("학번을 입력하세요: ");
                    stdMatrix[numOfStudents][0] = s.nextFloat();

                    System.out.print("국어 성적: ");
                    stdMatrix[numOfStudents][1] = s.nextFloat();

                    System.out.print("영어 성적: ");
                    stdMatrix[numOfStudents][2] = s.nextFloat();

                    System.out.print("수학 성적: ");
                    stdMatrix[numOfStudents][3] = s.nextFloat();

                    System.out.print("입력이 완료되었습니다. ");

                    stdMatrix[numOfStudents][4] = stdMatrix[numOfStudents][1] + stdMatrix[numOfStudents][2] + stdMatrix[numOfStudents][3] ;
                    stdMatrix[numOfStudents][5] = stdMatrix[numOfStudents][4] / 3.0f;
                    numOfStudents++;
                    break;
                }
                //입력된 학생 목록 출력
                case 2:
                    prtMatrix(stdMatrix, numOfStudents);
                    break;
                case 3:
                    //학생 삭제하기

                    break;

                default:
                    System.out.println("재입력해주세요");
            }
        }
    }
}