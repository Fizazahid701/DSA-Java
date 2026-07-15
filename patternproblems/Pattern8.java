package PattrenProblems;

public class Pattern8 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j < 2 * 5 - (2 * i + 1); j++) {
                System.out.print("*");
            }
            //Space
            for (int j = 10; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
