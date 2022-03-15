import java.util.*;
public class Permutation
{  
    public static void permutationUtil(List<Integer> nums, int i, int numsSize, List<List<Integer>> answer){
        if(i == numsSize){
            answer.add(new ArrayList<Integer>(nums));
            return;
        }
        for(int j = i; j < numsSize; j++){
            Collections.swap(nums, i, j);
            permutationUtil(nums, i+1, numsSize, answer);
            Collections.swap(nums, i, j);
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        int numsSize = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<numsSize;i++)
            list.add(nums[i]);
        permutationUtil(list, 0, numsSize, answer);
        return answer;
    }
    public static void main(String[] args)
    {
     int nums[] = {1,2,3};
     System.out.println(permute(nums));
    }
}