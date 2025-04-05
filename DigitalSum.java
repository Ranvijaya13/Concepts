
import java.util.Scanner;

class Sum {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        int num = ran.nextInt();
        int sum = 0;

        while (num > 10) {
            sum = 0;
            while (num != 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            num = sum;
        }
        System.out.print(sum);
    }
}
