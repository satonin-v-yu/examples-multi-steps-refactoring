package existingRefactorings.replaceTempWithQuery;

public class ReplaceTempWithQuery {
    public static void doCalculate(int a, int b) {
        int avg = (a + b) / 2;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        doCalculate(1, 0);
    }
}
