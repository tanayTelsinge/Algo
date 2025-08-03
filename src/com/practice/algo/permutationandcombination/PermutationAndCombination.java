package algo.permutationandcombination;

public class PermutationAndCombination {

    public static long permute(int n, int r) {
        if(r > n) return 0;
        return factorial(n) / factorial(n - r);
    }

    
    public static long combine(int n, int r) {
        if(r > n) return 0;
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
        
    private static int factorial(int num) {
        int fact = 1;
        if(num == 0 || num == 1) return fact;
        for(int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    } 
        
        
    public static void main(String[] args) {
        //calculates value of nCr and nPr, not all permutation ways.
        System.out.println(permute(3, 3));
        System.out.println(combine(3, 2));
    }
    
}
