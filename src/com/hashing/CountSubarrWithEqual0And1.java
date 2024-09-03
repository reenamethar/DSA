package com.hashing;

import java.util.HashMap;

public class CountSubarrWithEqual0And1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        int prefixSum=0;
        int res=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            prefixSum += arr[i];
            if(prefixSum==0){
                res++;
            }
            if(map.containsKey(prefixSum)){
                res += map.get(prefixSum);
                map.put(prefixSum, map.get(prefixSum)+1);
            }
            else{
                map.put(prefixSum, 1);
            }
        }
        
        return res;
    }

}
