package algo.permutationandcombination;
import java.util.ArrayList;
// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

public class AllPossiblePermutation {
    
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        boolean[] used = new boolean[nums.length];
        generatePermutations(new ArrayList<>(), nums, used);
    }

    public static void generatePermutations(ArrayList<Integer> p, int[] up, boolean[] used) {
        if(p.size() == up.length) {
            System.out.print(p + " ");
            return;
        }

        for(int i = 0; i < up.length; i++) {
            if(used[i]) {
                continue;
            }
            used[i] = true;
            int num = up[i];
            p.add(num);
            generatePermutations(p, up, used);
            p.remove(p.size() - 1);
            used[i] = false;
        }
    }
}
