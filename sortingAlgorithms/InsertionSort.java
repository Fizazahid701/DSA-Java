package sortingAlgorithms;

public class InsertionSort {

    public static void InsertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int j = i;
            int didSwap = 0;

            while (j > 0 && arr[j - 1] > arr[j]) {

                //swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j--;

                didSwap = 1;

            }

            if (didSwap == 0) {
                break;

            }

        }

    }

    public static void main(String[] args) {

        int[] arr = {13, 46, 25, 20, 56, 9};
        InsertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
