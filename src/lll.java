import java.util.Scanner;

public class lll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // L3
        // 문제는 동일, 출력값 변경
        // 예) M : 3, N : 3
        //    *
        //  *   *
        //    *
        int mValue = 0;
        int nValue = 0;

        while (true) {
            // 입력 조건 확인
            System.out.print("가로열을 입력해주세요 : ");
            mValue = sc.nextInt();
            System.out.print("가로열을 입력해주세요 : ");
            nValue = sc.nextInt();

            if (mValue > 0 && nValue > 0 ) {
                break;
            }
        }
        // Matrix 생성
        for (int row = 0, reverseRowIndex = nValue - 1 ; row < mValue ; row++, reverseRowIndex--) {
            for (int col = 0 ; col < nValue ; col++) {
                if( col == row || col == reverseRowIndex) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
//                 공백이 생기는 패턴을 보니 가로, 세로의 인덱스가 같을 때
//                if (row == col) {
//                    System.out.print("   ");
//                    // 그리고 가로, 세로 인덱스의 합이 Matrix의 길이와 같을 때 공백이 생긴다.
//                } else if ((row + col) == (mValue - 1)) {
//                    System.out.print("   ");
//                } else {
//                    System.out.print(" * ");
//                }
            }
            System.out.println();
        }
    }
}
