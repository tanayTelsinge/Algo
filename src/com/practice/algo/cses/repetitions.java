
import java.util.Scanner;

public class repetitions {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int m = 1, c = 1;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) != s.charAt(i)) {
                c = 0;
            } 
            c++;
            m = Math.max(m, c);
        }
        System.out.println(m);
    }
}
