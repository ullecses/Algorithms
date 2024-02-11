import java.util.Scanner;
public class Units2 {
    private static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(combinations(n, k));
    }

    public static int combinations(int n, int k) {
        int[] currentRow = new int[k + 1];
        int[] previousRow = new int[k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    currentRow[j] = 1;
                } else {
                    currentRow[j] = (previousRow[j - 1] + previousRow[j]) % MOD;
                }
            }

            int[] temp = previousRow;
            previousRow = currentRow;
            currentRow = temp;
        }

        return previousRow[k];
    }
}
