import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] answer = solution(arr);
    }

    public static int[] solution(int[] arr) {
        int minValue = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                index = i;
            }
        }
        List<Integer> collector = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            collector.add(arr[i]);
        }
        if (collector.size() == 0) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            int[] answer = new int[collector.size()];

            for (int i = 0; i < collector.size(); i++) {
                answer[i] = collector.get(i);
            }
            return answer;
        }
    }
}
