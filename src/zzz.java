public class zzz {
    public static void main(String[] args) {
        char bar[][] = new char[4][];

        bar[0] = new char[5];
        bar[1] = new char[3];
        bar[2] = new char[1];
        bar[3] = new char[4];

        bar[0][0] = 'h';
        bar[0][1] = 'e';
        bar[0][2] = 'l';
        bar[0][3] = 'l';
        bar[0][4] = 'o';

        bar[1][0] = 'h';
        bar[1][1] = 'o';
        bar[1][2] = 'w';

        bar[2][0] = 'a';

        bar[3][0] = 't';
        bar[3][1] = 'o';
        bar[3][2] = 'p';
        bar[3][3] = 's';

//        for (int i = 0 ; i < bar.length; i++) {
//            for (int j = 0 ; j < bar[i].length ; j++) {
//                System.out.print(bar[i][j]);
//            }
//        System.out.println();
//        }

        for(char[] value : bar) { // 배열 내부를 도는데 2차원 배열이기 때문에
            // char을 붙이면 bar의 참조 변수를 가르키기 때문에 주소값들을 출력해 낼것이고, char[]를 하면 해당 주소의 배열 내부를 돌게 된다.
            // 배열 내 원소값을 저장할 변수를 선언
            // 자바에서 char형 1차원 배열의 경우 배열내 원소를 한번에 출력하고 종료한다.
            System.out.println(value);
        }
    }
}