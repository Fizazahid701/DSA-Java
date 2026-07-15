package PattrenProblems;

public class Pattern17 {

    public static void main(String[] args) {

        int n = 4;
        int space = 2 * n - 2;

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }

            //star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < n) {
                space -= 2;
            } else {
                space += 2;
            }
        }
    }

}
