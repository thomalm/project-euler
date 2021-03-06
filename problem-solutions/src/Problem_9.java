/**
 * Problem 9: Special Pythagorean triplet
 * <p>
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a^2 + b^2 = c^2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 * <p>
 * Created by thomasalm on 21/05/15.
 */
public class Problem_9 {

    final static int PRODUCT = 1000;

    public static void main(String[] args) {
        findSpecialPythagoreanTriplet(PRODUCT);
    }

    private static void findSpecialPythagoreanTriplet(int N){
        for (int a = 1; a < N; a++) {
            for (int b = a + 1; b <= N; b++) {
                int c = N - b - a;
                if (isPythagoreanTriplet(a, b, c)) {
                    System.out.println(a + " " + b + " " + c);
                    return;
                }
            }
        }
    }

    private static boolean isPythagoreanTriplet(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

}
