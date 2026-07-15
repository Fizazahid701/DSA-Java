package patternproblems;

public class SolidRectangle {

    public static void main(String[] args) {

        int r = 5;
        int c = 4;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
