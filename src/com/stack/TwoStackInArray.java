package com.stack;

public class TwoStackInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		TwoStacks st = new TwoStacks(n);
		st.push1(1);
		st.push1(2);
		st.push2(5);
		st.push2(4);
		st.push2(3);
		st.printStack1();
		st.printStack2();
		st.pop1();
		st.printStack1();
		st.pop2();
		st.printStack2();
	}
	
}
class TwoStacks {
    int top1;
    int top2;
    int size;
    int arr[];;
    TwoStacks(int n) {
        top1= -1;
         top2 = n;
         size = n;
         arr = new int[n];
    }

    
    void push1(int x) {
        if(top1 < top2-1){
            top1++;
            arr[top1] = x;
        }else{
            return;
        }
        
    }

    
    void push2(int x) {
        if(top1 < top2-1){
            top2--;
            arr[top2] = x;
        }else{
            return;
        }
        
    }
    int pop1() {
        if(top1>-1){
            int result = arr[top1];
        top1--;
        return result;
        }else{
            return -1;
        }
    }

   
    int pop2() {
        if(top2 < size){
            int result = arr[top2];
        top2++;
        return result;
        }else{
            return -1;
        }
    }
    void printStack1() {
    	for(int i=top1; i>-1; i--) {
    		System.out.print(arr[i]+ " ");
    	}
    	System.out.println();
    }
    void printStack2() {
    	for(int i=top2; i<size; i++) {
    		System.out.print(arr[i]+ " ");
    	}
    	System.out.println();
    }
}
