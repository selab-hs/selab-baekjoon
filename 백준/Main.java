import java.util.*;
//https://www.acmicpc.net/problem/1005
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Building> buildingMap = new HashMap<>();

    public static void main(String[] args) {
        //기본 세팅
        Scanner scanner = new Scanner(System.in);
        int chance = Integer.parseInt(scanner.nextLine());
        String[] cases = scanner.nextLine().split(" ");
        String[] buildTime = scanner.nextLine().split(" ");
        for (int i = 0; i < Integer.parseInt(cases[0]); i++) {
            String[] requires = scanner.nextLine().split(" ");
            buildingMap.get(Integer.parseInt(requires[1])).addRequires(Integer.parseInt(requires[0]));
        }
        for (int i = 1; i < Integer.parseInt(cases[i]); i++) {
            buildingMap.put(i, new Building(Integer.parseInt(buildTime[i])));
        }
        int finalBuild = Integer.parseInt(scanner.nextLine());

        //로직
        calculate(finalBuild);
    }

    private static void calculate(int finalBuild) {
        int answer = buildingMap.get(1).getBuildTime();
    }
}

class Building {
    private final Set require = new HashSet();
    private final int buildTime;

    public Building(int buildTime) {
        this.buildTime = buildTime;
    }

    public void addRequires(int number) {
        if (!require.contains(number)) {
            require.add(number);
        }
    }

    public Set getRequire() {
        return require;
    }

    public int getBuildTime() {
        return buildTime;
    }
}