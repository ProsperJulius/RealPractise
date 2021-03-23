package Realtime;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int []nums, int n){
        int size=nums.length;
        if(size+1/2<n)return false;
        int count=0;
        for(int i=0;i<size;i++){
            if(nums[i]==0){
                int next=(i==size-1?0:nums[i+1]);
                int prev=(i==0?prev=0:nums[i-1]);
                if(next==0 && prev==0)count++;
            }

        }
        return count>=n;
    }
}
