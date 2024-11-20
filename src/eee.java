//import java.util.Scanner;
//
//public class eee {
//    public static void main(String[] args) {
//        // 키보드로부터 정수 N개를 입력 받아, N개의 int형 원소를 가지는 1차원 배열을 작성하시오.
//        // 단, N 값은 1이상 10이하이며, 이외 값이 입력 될 경우 재입력 실시
//
//        // 생성된 N 개의 원소에 정수 값을 입력하는 구문을 작성하시오.
//        // 만약 N이 3이면 1번째 : 3, 2번쨰 : 7, 3번째 : 10 -> [3, 7, 10]
//
//        // 입력된 원소 값을 출력하는 구문을 작성하시오
//
//
//        Scanner sc = new Scanner(System.in); // while 문 안에 넣지 말기. 넣으면 반복 할 때 마다 메모리를 할당해서 안좋음
//        int nValue; // 지역변수이기 때문에 while 문이나 for 문 안에 있으면 해당 반복이 끝나면 변수는 사라진다.
//
//        // 조건이 맞을 때 까지 재입력
//        while (true) {
//            System.out.print("1이상 10이하의 정수를 입력하세요: ");
//            nValue = sc.nextInt();
//            // 1이상 10 이하인지 확인
//            if (1 <= nValue && nValue <= 10) {
//                break;
//            } else {
//                System.out.println("범위 내의 정수를 입력해 주세요");
//            }
//        }
//        // 조건이 맞다면 배열 생성 - 입력한 정수 길이 만큼
//        int nArray[] = new int[nValue]; // 지역변수이기 때문에 while 문이나 for 문 안에 있으면 해당 반복이 끝나면 변수는 사라진다.
//        // 생성된 N 개의 배열의 원소의 정수 값 입력
//        for (int i = 0 ; i < nArray.length ; i++){
//            System.out.print(i + "번 원소 값을 입력하세요: ");
//            nArray[i] = sc.nextInt();
//        }
//        int max = nArray[0], min = nArray[0], sum = 0, j = 0;
//        float avg;
//        // 입력된 원소 값을 출력하는 구문 작성
//        for ( ; j < nArray.length ; j++) {
//            System.out.print(j + ", ");
//
//            sum += j;
//            // 배열 내 원소 최대값 최소값 구하기
//            if (max < j) {
//                max = j;
//            }
//
//            if (min > j) {
//                min = j;
//            }
//            // 원소 전체 합
//
//        }
//        System.out.println("원소 전체 합 : " + sum);
//        // 원소 평균
//        avg = ((float)sum) / nArray.length;
//        System.out.printf("원소 평균 %.2f: ", avg);
//    }
//}
//
import java.util.Scanner;

public class eee {
    public static void main(String[] args) {


        // Task 1
        // 정수 N을 입력 받는다
        // 만약 N 값이 N > 10 또는 N < 1 재입력
        Scanner sc = new Scanner(System.in);

        int inputValue = 0;

        while(true){
            inputValue = sc.nextInt();

            // 탈출 조건 : N 값이 1이상 10이하이면
            if(inputValue >= 1 && inputValue <= 10){
                int bar[] = new int[inputValue];
                break;
            }
        }

//         Task 2
//         N개의 int형 원소를 가지는 1차원 배열 생성
        int bar[] = new int[inputValue];

        // 키보드로부터 정수 N을 입력 받아,
        // N개의 int형 원소를 가지는 1차원 배열을 작성하시오.
        // 단 N 값은 1이상 10이하이며, 이외 값이 입력 될 경우 재입력 실시

        // 생성된 N 개의 원소에 정수 값을 입력하는 구문을 작성하시오.
        // 만약 N 3이면
        // 1번째 : 3
        // 2번째 : 7
        // 3번째 : 10
        // -> [3, 7, 10]
        for(int i = 0 ; i < bar.length ; i++) {
            System.out.print(i +"번째 : ");
            bar[i] = sc.nextInt();
        }

        // 입력된 원소 값을 출력하는 구문을 작성하시오
        // 출력 : 3, 7, 10
        for(int value : bar) {
            System.out.print(value + ",");
        }

        // 배열 내 전체 원소 중 최대값과 최소값을 출력하고,
        // 평균 값을 출력하라.
        // [3, 10, 100, 0]
        // 최대값 : 100, 최소값 : 0
        // 평균값 : (3 + 10 + 100 + 0)/4
        int minValue = bar[0];
        int maxValue = bar[0];
        int sum = 0;

        for(int value : bar){
            // 최대값
            if (value > maxValue) {
                maxValue = value;
            }

            // 최소값
            if (value < minValue) {
                minValue = value;
            }

            // 누적값
            sum += value;
        }

        // 평균 계산
        float avg = ((float)sum) / bar.length;

        // 출력
        System.out.println("최대값 : " + maxValue);
        System.out.println("최소값 : " + minValue);
        System.out.printf("평균 : %.2f", avg);


    }
}
