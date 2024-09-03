package com.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashMap<Integer, Integer> hm = new HashMap<>(); hm.put(10, 5); hm.put(3, 2);
		 * hm.put(5, 9); System.out.println(hm.entrySet()); List<Map.Entry<Integer,
		 * Integer>> list = new ArrayList<>(hm.entrySet()); System.out.println(list);
		 * list.sort((a,b)->{ if(b.getValue().equals(a.getValue())) return
		 * Integer.compare( b.getValue(), a.getValue()); else return
		 * Integer.compare(a.getValue(), b.getValue()); }); System.out.println(list);
		 */
		int[] A1 = {15, 47, 59, 326, 124, 5, 623, 128, 483, 153, 125, 232, 154, 555, 656, 485, 659, 32, 125, 326, 324, 96, 565, 154};
		int [] A2 = {20, 47, 20, 5, 125, 154, 555, 32, 324};
		int[] ans = sortA1ByA2(A1, A1.length, A2, A2.length);
		displayArray(ans);
		
	}
	
	public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Your code here
        int [] ans = new int[N];
        HashMap<Integer, Integer> hm1 = new LinkedHashMap<Integer, Integer>();
        for(int i=0; i<N; i++){
            hm1.put(A1[i], hm1.getOrDefault(A1[i], 0)+1);
        }
        int k=0;
        for(int i=0; i<M; i++){
            if(!hm1.containsKey(A2[i])) {
            	continue;
            }
            int freq= hm1.get(A2[i]);
            for(int j=0; j<freq; j++){
                ans[k++] = A2[i];
            }
            hm1.remove(A2[i]);
        }
        System.out.println(hm1);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm1.entrySet());
        list.sort((a, b) -> {
        	return Integer.compare(a.getKey(), b.getKey());
        });
        for(Map.Entry<Integer, Integer> entry: list){
        	System.out.println(entry.getValue());
            for(int i=0; i< entry.getValue(); i++) {
            	ans[k++] = entry.getKey();
            }
        }
        return ans;
    }
	public static void displayArray(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
