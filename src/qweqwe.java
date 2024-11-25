import java.util.Scanner;

public class qweqwe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[][] studentScore = new float[3][6];

        System.out.print("학번을 입력하세요 : ");
        int studentId = sc.nextInt();
        System.out.print("국어 성적 : ");
        int korea = sc.nextInt();
        System.out.print("영어 성적 : ");
        int english = sc.nextInt();
        System.out.print("수학 성적 : ");
        int math = sc.nextInt();
        System.out.println("입력이 완료되었습니다.");

        int sum = korea + english + math;
        float avg = sum / 3;
        System.out.println(sum);
        System.out.println(avg);
        studentScore[0] = new float[]{studentId, korea, english, math, sum, avg};
        for (int i = 0 ; i < studentScore[0].length ; i++) {
            System.out.print(studentScore[0][i] + " ");
        }
    }
}