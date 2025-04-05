
import java.util.*;

class FindDivident {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        int n = ran.nextInt();
        int m = ran.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = ran.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = ran.nextInt();
        }
        EvenlyDivide(arr1, arr2);
    }

    static void EvenlyDivide(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        List<Integer> myList = new ArrayList<>();
        for (int i = arr1[0]; i <= arr1[n - 1]; i++) {
            for (int j = arr1[0]; j <= arr1[n - 1]; j++) {
                int num = i * j;
                if (!myList.contains(num)) {
                    myList.add(num);
                }
            }
        }
        int l = myList.size();
        int count = 0, k = 0;
        for (int i = 0; i < l; i++) {
            count = 0;
            for (int j = 0; j < m; j++) {
                if (arr2[j] % myList.get(i) == 0) {
                    count = count + 1;
                    if (count == (m) && j == (m - 1)) {
                        k++;
                    }
                }
            }
        }
        System.out.print(k);
    }
}
