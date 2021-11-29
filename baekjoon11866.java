
import java.util.*;

/* 백준 11866번 문제 (요세푸스 문제 0) 풀이
 *  https://www.acmicpc.net/problem/11866
 * */
public class baekjoon11866 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Queue<Integer> permutation = new LinkedList<>();
    offerPermutation(permutation, scanner.nextInt());
    printJosephusPermutation(permutation, scanner.nextInt());
    scanner.close();
  }

  public static void offerPermutation(Queue<Integer> queue, int peopleNumber) {
    for (int i = 1; i <= peopleNumber; i++) {
      queue.offer(i);
    }
  }

  public static void printJosephusPermutation(Queue<Integer> queue, int order) {
    System.out.print("<");
    while (!queue.isEmpty()) {
      for (int i = 1; i <= order - 1; i++) {
        queue.offer(queue.poll());
      }
      System.out.print(queue.poll() + getIdentifier(queue));
    }
  }

  public static String getIdentifier(Queue<Integer> queue) {
    if (queue.isEmpty()) {
      return ">";
    }
    return ", ";
  }

}
