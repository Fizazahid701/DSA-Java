package PattrenProblems;

public class Pattern14 {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

}
