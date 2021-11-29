
import java.util.Scanner;

/* 백준 1152번 (단어의 개수) 풀이
 * https://www.acmicpc.net/problem/1152
 * */
public class beakjoon1152 {

  public final static String REGEX = " ";
  public final static int INIT_RANGE = 0;
  public final static int REMOVE_SPACES = 1;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] string = (scanner.nextLine()).split(REGEX);
    scanner.close();
    System.out.println(countWord(string, INIT_RANGE));
  }

  public static int countWord(String[] string, int numberOfCharacters) {
    for (String word : string) {
      if (word.isEmpty()) {
        numberOfCharacters = string.length - REMOVE_SPACES;
      }
    }
    return numberOfCharacters;
  }

}
