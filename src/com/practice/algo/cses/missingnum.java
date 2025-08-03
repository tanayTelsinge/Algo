
import java.util.Scanner;

public class missingnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long total = sc.nextLong();
        long n = total;
        long sum = 0;
        while(n-- > 1) {
            sum += sc.nextLong();
        }

        long totalsum = (total * (total + 1)) / 2;
        long missingnum = totalsum - sum;
        System.out.println(missingnum);
    }
}
