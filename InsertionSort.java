
import java.util.*;

class InsertionSort {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = ran.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the integer in array");
        for (int i = 0; i < n; i++) {
            arr[i] = ran.nextInt();
        }
        System.out.println("you have successfully entered Integer digit");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int p = j;
                    for (int k = p - 1; k >= 0; k--) {
                        if (arr[p] < arr[k]) {
                            int temp = arr[p];
                            arr[p] = arr[k];
                            arr[k] = temp;
                            p--;
                        }
                    }
                }
            }
        }
        System.out.println("Now I am gonna print the new array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
