package striver_array_hard;

import java.util.ArrayList;
import java.util.List;

public class Count_Inversion_Opti {

    int count = 0;

    public void merge(int[] arr, int low, int mid, int high) {
        List<Integer> temp = new ArrayList<>();

        int right = mid + 1;
        int left = low;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
                count += (mid - left + 1);
            }
        }

        while (left <= mid) temp.add(arr[left++]);

        while (right <= high) temp.add(arr[right++]);
        
        for (int i = low; i <= high; i++) arr[i] = temp.get(i - low);
    }

    public void merge_core(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;

        merge_core(arr, low, mid);
        merge_core(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public int countInversions(int[] arr, int n) {
        count = 0;
        merge_core(arr, 0, n - 1);
        return count;
    }

    public static void main(String[] args) {
        Count_Inversion_Opti obj = new Count_Inversion_Opti();

        int[] arr = {5, 3, 2, 4, 1};

        int count = obj.countInversions(arr, arr.length);

        System.out.println("Inversion count: " + count);
    }
}