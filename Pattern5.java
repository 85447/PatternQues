public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);

    }

    static void pattern5(int n) {
        //upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lowerhalf
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
