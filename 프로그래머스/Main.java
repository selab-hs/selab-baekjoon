import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "1 2 3 4";
        System.out.println(solution(str));
    }

    static String solution(String s) {
        String[] arr = s.split(" ");

        List<Integer> collector = new LinkedList<>();

        for (String str : arr) {
            collector.add(Integer.parseInt(str));
        }

        collector.sort(Comparator.naturalOrder());

        return "" + collector.get(0) + " " + collector.get(collector.size() - 1);
    }
}
