
import java.util.Scanner;

/* 백준 1550번 문제 (16진수) 풀이
 *  https://www.acmicpc.net/problem/1550
 * */
public class baekjoon1550 {

  public final static int HEXADECIMAL = 16;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int outPutNumber = hexadecimalToDecimal(scanner.next());
    scanner.close();
    System.out.println(outPutNumber);
  }

  public static int hexadecimalToDecimal(String inputNumber) {
    return Integer.parseInt(inputNumber, HEXADECIMAL);
  }
}
