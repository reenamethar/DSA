package com.stack;

import java.util.Stack;

public class CelebrityProblem {
/*
 * A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people.  A square matrix mat is used to represent people at the party such that if an element of row i and column j is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party, if the celebrity does not exist, return -1.
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int celebrity(int mat[][]) {
        // code here
        Stack<Integer> st = new Stack<Integer>();
        int n = mat.length;
        for(int i=0; i<n; i++){
            st.push(i);
        }
        while(st.size()>1){
            int a = st.pop();
            int b = st.pop();
            if(mat[a][b]== 1){
                st.push(b);
            }else{
                st.push(a);
            }
        }
        
        if(st.isEmpty()){
            return -1;
        }
        int candidate = st.pop();
        for(int i=0; i<n; i++){
            if(i != candidate){
                if(mat[candidate][i] == 1 || mat[i][candidate] ==0){
                    return -1;
                }
            }
        }
        return candidate;
    }

}
