package Stacks;

import java.util.*;

public class Stack1 {
   
   
    // Stack has Mainly three opreation
    // push , pop , peek,isEmpty
  

     // Implementing using ArrayList
     static ArrayList<Integer> A = new ArrayList<>();

     public boolean isEmpty(){
        return A.size() == 0;
     }
    //  int top =0;
     public void push(int data){
       A.add( data);
     }

     public int pop(){
         
       int e = A.get(A.size() -1);
       A.remove(A.size()-1);
       return e;
     }

     public int peek(){
        return A.get(A.size()-1);
     }
      

   

   public static void main(String args[]){

    Stack1 s = new Stack1();
    s.push(1);
    s.push(2);
    s.push(3);

    System.out.println("hI"  );
    while(!s.isEmpty()){
        System.out.println(s.pop());
    }
       System.out.println();
   }
     


}
