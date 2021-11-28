//https://www.acmicpc.net/problem/1550
import java.util.Scanner;

public class baekjoon1550 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int outPutNumber = hexadecimalToDecimal(scanner.next());
        System.out.println(outPutNumber);
    }
    public static int hexadecimalToDecimal (String inputNumber) {
       return Integer.parseInt(inputNumber,16);
    }
}
