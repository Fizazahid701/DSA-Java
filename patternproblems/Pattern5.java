package PattrenProblems;

public class Pattern5 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < (5 - i + 1); j++) {    // numberofrows - totalrows + 1
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
