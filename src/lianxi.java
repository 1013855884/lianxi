import sun.print.SunMinMaxPage;

import java.util.Arrays;
import java.util.jar.JarEntry;
/*
*给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，
* 返回它将会被按顺序插入的位置。
你可以假设数组中无重复元素。
 *  */
public class lianxi {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        Solution solution = new Solution();
        int index =solution.searchInsert(arr,0);
        System.out.println(index);
    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int index =  1;
        int []num = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target ){
                index =  i;
                return index;
            }
            else {
                for (int i1 = 0; i1 < nums.length; i1++) {
                    num[i] = nums [i];
                }
                num[nums.length]=target;
            }
        }
        Arrays.sort(num);
        for (int j = 0; j < num.length; j++) {
            if(num[j] == target){
                index = j;
                break;
            }
        }
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(nums));
        return index;
    }
}