import java.util.HashSet;

public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.hasDuplicate(new int[]{1,1,2,3,4}));
    }
}
