package sortingAlgorithms;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = n - 1; i >= 1; i--) {
            count++;

            int didswap = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;

                    didswap = 1;
                }

            }

            if (didswap == 0) {
                break;

            }

        }

        System.out.println("cont: " + count);
    }

    public static void main(String[] args) {

        int[] arr = {13, 46, 25, 20, 56, 9};
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
