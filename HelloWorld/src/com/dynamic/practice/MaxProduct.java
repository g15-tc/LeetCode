package com.dynamic.practice;

public class MaxProduct {
	public int maxProduct(int[] nums) {
		int tempMax = nums[0];
		int max = nums[0];
		int tempMin = nums[0];
		int cur = nums[0];
		int result = max;

		if(nums.length == 0)
		{
			return 0;
		}

		for (int i = 1; i < nums.length; i++)
		{
			cur = nums[i];
			tempMax = Math.max(cur, Math.max(tempMax*cur, tempMin*cur));
			tempMin = Math.min(cur, Math.min(max*cur, tempMin*cur));
			max = tempMax;

			result = Math.max(result, max);    		
		}
		return result;
	}

	public int maxProductLength(int [] nums)
	{
        int res=0; //result
        int p=0,n=0,fn=-1;
        //p=count of positive numbers till current index from start or after any zero so far
        //n=count of negative numbers till current index from start or after any zero so far
        //fn=index of first negative number till current index from start or after any zero so far
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                //a zero can not be a part of any subarray and thus we break the count from here and reset the counting variables
                p=0;
                n=0;
                fn=-1;
                continue;
            }
            if(nums[i]>0){
                p++;
            }
            else{
                n++;
                if(n==1)
                    fn=i;     //keep track of the index of first occurence of a negative number from start or after any zero so far 
            }
            
            if(n%2==0){
                //if count of negative numbers is even, then length of current subarray is sum of positive and negative number counts
                res=Math.max(res,n+p);
            }
            else{
                //if count of negative numbers is odd, we must exclude the prefix of current array till first occurence of a negative number(denoted by fn)
                res=Math.max(res,i-fn);
            }
        }
        return res;
	}
}
