package sorting;

//time complexity of this alogirithm is O(n)^2
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            //find min
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;

                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
