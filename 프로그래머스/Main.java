import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        List<Integer> collector = new LinkedList<>();

        for (int value : arr) {
            if (value % divisor == 0) {
                collector.add(value);
            }
        }
        if (collector.size() == 0) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            collector.sort(Comparator.naturalOrder());

            int[] answer = new int[collector.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = collector.get(i);
            }
        }
    }
}
