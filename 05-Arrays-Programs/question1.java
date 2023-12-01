// 1.Build Array from Permutation

public class question1{
     public static void main(String[] args) {
      int[] nums = {5,0,1,2,3,4} ; 
      int[] ans = new int [nums.length];
      
      for(int i=0;i<nums.length;i++){
        ans[i] = nums[nums[i]];
      }
    // if you are submitting in the leetcode then don't forget to return ;
     }
}