
import java.util.*;

public class Example {

    public static void main(String args[]) {
        Scanner ran = new Scanner(System.in);
        int n = ran.nextInt();
        ArrayList<Integer> myList = new ArrayList<>();
        int L = ran.nextInt();
        int num = 0;
        for (int i = 0; i < L; i++) {
            num = ran.nextInt();
            myList.add(num);
        }
        CheckPosition(myList, n, L);
    }

    public static void CheckPosition(List<Integer> myList, int n, int L) {
        if (L > 0) {
            if (myList.get(L - 1) == n) {
                System.out.print("Yes");
            } else {
                L--;
                CheckPosition(myList, n, L);
            }
        } else {
            System.out.println("NO");
        }
    }
}
