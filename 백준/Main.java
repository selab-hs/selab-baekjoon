import java.util.Scanner;
///https://www.acmicpc.net/board/view/118398
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int cases = scanner.nextInt();

        int[] dy = new int[cases + 1];
        dy[0] = -1;
        dy[1] = -1;
        dy[2] = -1;
        dy[3] = 1;
        dy[4] = -1;
        dy[5] = 1;

        for (int i = 6; i < cases + 1; i++) {
            dy[i] = Math.min(vaildation(dy[i - 5] )+ 1, vaildation(dy[i - 3]) + 1);
        }


        System.out.println(dy[cases]);
    }

    private static int vaildation(int value) {
        if (value == -1) {
            return Integer.MAX_VALUE;

        }
        return value;
    }
}