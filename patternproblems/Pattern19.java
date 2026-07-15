package patternproblems;

public class Pattern19 {

    public static void main(String[] args) {
        int n = 5;
        int initialSpace = 0;

        for (int i1 = 0; i < n; i++) {
            //spces
            for (int j = 1; j <= n - i1; j++) {
                System.out.print("*");
            }
            //stars
            for (int j = 0; j <= initialSpace; j++) {
                System.out.print(" ");
            }
            //spaces
            for (int j = 1; j <= n - i1; j++) {
                System.out.print("*");
            }
            initialSpace += 2;
            System.out.println();
        }

        int iniSpace = 8;
        for (int i = 0; i <= n; i++) {

            //spces
            for (int j = 1; j <= i1; j++) {
                System.out.print("*");
            }
            //stars
            for (int j = 0; j <= initialSpace; j++) {
                System.out.print(" ");
            }
            //spaces
            for (int j = 1; j <= i1; j++) {
                System.out.print("*");
            }

            initialSpace -= 2;
            System.out.println();
        }
    }
}
