package sortingAlgorithms;

import java.util.ArrayList;

//===Time Complexity==== 
//1) Worst Case: O(n²)
//2) Average Case: O(n²)
//3) Best Case: O(n²) (Normal Bubble Sort)
//Optimized : O(n)
//===Space Complexity====
// O(1)
public class MergeSort {

    public static void mergeSort(int[] arr, int low, int high) {

        //base case
        if (low >= high) {
            return;
        }

        // divide array
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {

            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;

            } else {
                temp.add(arr[right]);
                right++;

            }

        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;

        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;

        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);

        }

    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 25, 20, 56, 9};
        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
