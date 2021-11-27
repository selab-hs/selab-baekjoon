import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1110 {
    public final static String[][] CHESSBOARD = new String[8][8];
    public final static int ZERO = 0;
    public final static String REGEX = "";
    public final static int BOARDSIZE = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = ZERO; i < BOARDSIZE; i++){
            CHESSBOARD[i] = divideTheSpace(scanner.next(), CHESSBOARD, i);
        }
        System.out.println(onTheWhiteBoard(CHESSBOARD));
    }

    public static String[] divideTheSpace(String col, String[][] CHESSBOARD, int i) {
        for (int j = ZERO; j < BOARDSIZE; j++){
            String[] str = col.split(REGEX);
            CHESSBOARD[i][j] = str[j];
        }
        return CHESSBOARD[i];
    }

    public static int onTheWhiteBoard(String[][] CHESSBOARD) {
        int pieceOnTheWhiteBoard = ZERO;
        for (int i = ZERO; i < BOARDSIZE; i++){
            for (int j = ZERO; j < BOARDSIZE; j++){
                if (((isEven(i) && isEven(j)) || (isOdd(i) && isOdd(j))) &&  isF(CHESSBOARD[i][j])) {
                    pieceOnTheWhiteBoard++;
                }
            }
        }
        return pieceOnTheWhiteBoard;
    }
    public static boolean isEven(int num) {
        return num % 2 == ZERO;
    }

    public static boolean isOdd(int num) {
        return num % 2 != ZERO;
    }

    public static boolean isF(String piece) {
        return piece.equals("F");
    }
}