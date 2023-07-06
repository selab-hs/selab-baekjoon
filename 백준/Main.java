import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chance = scanner.nextInt();
        int[][] cases = new int[chance][2];
        for (int i = 0; i < chance; i++) {
            cases[i][0] = scanner.nextInt();
            cases[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < chance; i++) {
            int floor = cases[i][0];
            int roomNumber = cases[i][1];

            int[][] dy = new int[floor + 1][roomNumber + 1];
            for (int j = 1; j < roomNumber + 1; j++) {
                dy[0][j] = j;
            }

            for (int aFloor = 1; aFloor <= floor; aFloor++) {
                for (int aRoomNumber = 1; aRoomNumber <= roomNumber; aRoomNumber++) {
                    int sum = 0;
                    for (int sumIndex = 1;sumIndex<=aRoomNumber;sumIndex++){
                        sum += dy[aFloor-1][sumIndex];
                    }
                    dy[aFloor][aRoomNumber] = sum;
                }
            }
            System.out.println(dy[floor][roomNumber]);
        }
    }
}