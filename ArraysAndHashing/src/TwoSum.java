import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]), i};
            }
            else{
                hashMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        System.out.println(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
