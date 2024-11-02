public class MyMath {

    public static int findMax(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    public static int findMin(int a, int b, int c, int d) {
        return Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static double calcAvg(int a, int b, int c, int d) {
        return (double)(a + b + c + d) / 4;
    }

    public static long factorial(int n) {
        if (n < 0)
            return -1;
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}
