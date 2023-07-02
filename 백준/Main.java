import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int r1 = Integer.parseInt(stringTokenizer.nextToken());

            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            int r2 = Integer.parseInt(stringTokenizer.nextToken());

            double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

            if (d == 0) {
                // 중심이 같을때
                // 반지름이 같은 경우 (두 원이 완전히 겹침)
                if (r1 == r2) {
                    stringBuilder.append(-1 + "\n");
                }
                // 반지름이 다른경우 (원 안에 원)
                else {
                    stringBuilder.append(0 + "\n");
                }
            }
            // 중심이 다를때
            else {
                // 두 교점
                if (Math.abs(r1 - r2) < d && d < r1 + r2) {
                    stringBuilder.append(2 + "\n");
                }
                // 한 교점 (내접, 외접)
                else if (d == r1 + r2 || Math.abs(r1 - r2) == d) {
                    stringBuilder.append(1 + "\n");
                }
                // 접하지 않을때
                else {
                    stringBuilder.append(0 + "\n");
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
