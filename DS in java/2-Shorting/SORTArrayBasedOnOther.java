//sorting brr based on arr
//To solve this problem, we want to sort both arrays (arr and brr) based on the values in arr. The goal is to
//use a custom comparator and rearrange the elements of brr according to the changes made to arr.
import java.util.*;

// Class to represent a pair of elements from arr and brr
class Pair {
    int arrVal;
    int brrVal;

    Pair(int arrVal, int brrVal) {
        this.arrVal = arrVal;
        this.brrVal = brrVal;
    }
}

// Comparator to sort pairs based on arr values
class PairComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair p1, Pair p2) {
        return Integer.compare(p1.arrVal, p2.arrVal);
    }
}

public class SortArrays {

    public static void sortBasedOnArr(int[] arr, int[] brr) {
        int n = arr.length;

        // Create an array of Pair objects
        Pair[] pairs = new Pair[n];

        // Populate the pairs array
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(arr[i], brr[i]);
        }

        // Sort the pairs array based on the arrVal
        Arrays.sort(pairs, new PairComparator());

        // Unpack the sorted pairs back into arr and brr
        for (int i = 0; i < n; i++) {
            arr[i] = pairs[i].arrVal;
            brr[i] = pairs[i].brrVal;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 2, 8};
        int[] brr = {1, 7, 4, 2, 9};

        // Sort brr based on arr
        sortBasedOnArr(arr, brr);

        // Print the sorted arrays
        System.out.println("Sorted arr: " + Arrays.toString(arr));
        System.out.println("Sorted brr: " + Arrays.toString(brr));
    }
}
