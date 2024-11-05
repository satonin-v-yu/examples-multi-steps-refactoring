package existingRefactorings.replaceTempWithQuery;

public class ReplaceTempWithQuerySideEffects {
    public static void main(int a, int b) {
        int avg = average(a, b);
        assert a + b == avg * 2;
        System.out.println(avg);
    }

    private static int average(int a, int b) {
        System.out.println("average of " + a + " and " + b);
        return (a + b) / 2;
    }

    public static void main(String[] args) {
        main(1, 0);
    }

}
