import java.util.Arrays;

public class ppp {
    public static void main(String[] args) {
        // 이때 두 항은 서로 차원이 일치해야 한다.
        int foo[][] = new int[3][];
        System.out.println(foo[0]);

        foo[0] = new int[20];
        foo[1] = new int[40];

        int[][] pos = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        System.out.println(Arrays.toString(foo[0]));
        System.out.println(pos[0][0]);
    }
}