package Stacks;
import java.util.*;

public class Stack3 {

    // Push at Bottom

    public static void Push_At_Bottom(Stack<Integer>s, int data){

        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int e = s.pop(); 
        Push_At_Bottom(s, data);
        s.push(e);
    }
   
    
    public static void main(String args[]){

        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
       Push_At_Bottom(s,4);
       System.out.println(s);

        
    }
}
