package structural.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> boards = Arrays.asList(2,3,1,1,1,1,1 );
//        int max = 0, min = Integer.MIN_VALUE;
//        for(int e : boards){
//            max += e;
//            min = Math.max(min, e);
//        }
//        System.out.println(bs(boards, 5, min, max));
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));

    }

    public static int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int l = 0, r = 0, freq = 0, max = 0;

        while(r < n){
            if(nums[r] == 0) freq++;
            if(freq > k){
                if(nums[l] == 0) freq--;
                l++;
            }
            if(freq <=k){
                max = Math.max(max, r-l+1);
            }
            r++;
        }
        return max;
    }
    public static int bs(List<Integer> boards, int k, int l, int r){

        int ans = -1;
        while(l<=r){
            int mid = l + (r-l)/2;

            int painters = 0, currTime = 0, i = 0;
            while(i<boards.size()){
                if(boards.get(i) + currTime <= mid){
                    currTime += boards.get(i);
                    i++;
                }
                else{
                    painters++;
                    currTime = 0;
                }
            }
            if(currTime > 0)
                painters++;


            if(painters > k){
                l = mid+1;
            }
            else{
                ans = mid;
                r = mid-1;
            }
        }
        return ans;
    }
}
