package SeLab.Solution_2021_11_15;

import java.util.Scanner;

public class baekjoon8958 {
    public static final int ZERO = 0;
    public static final String REGEX = "";
    public static final String CORRECT = "O";
    public static final String WRONG = "X";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCaseNum = scanner.nextInt();
        int[] testCaseResult = new int[testCaseNum];
        for (int i = ZERO; i < testCaseNum; i++){
            String[] TestCase = scanner.next().split(REGEX);
            testCaseResult[i] = gradeTestCase(TestCase);
        }
        scanner.close();
        printResult(testCaseResult);
    }
    public static int gradeTestCase(String[] TestCase) {
        int score = ZERO, testCaseTotalScore = ZERO;
        for (String answer : TestCase){
            switch (answer) {
                case CORRECT: {
                    score++;
                    testCaseTotalScore += score;
                    break;
                }
                case WRONG: {
                    score = ZERO;
                }
            }
        }
        return testCaseTotalScore;
    }

    public void printResult(int[] testCaseResult) {
        for (int result : testCaseResult){
            System.out.println(result);
        }
    }

}
