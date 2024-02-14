package Stacks;

public class Stack2 {
    
    // Make a Node class
    public class Node{
        int data;
        Node next ;

        // constructor
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // head pe hi Insertion & Deletion Operation Perform ho raha hai
     
    static Node head = null;
    // static Node tail = null;
    // static int count =0;
    static Node top = null;

    // is Empty Operation

    public Boolean IsEmpty(){
        return top == null;
    }

    // push Operation
    public void push(int data){
    
        Node newNode = new Node(data);
        if(head == null){
            head = top = newNode;
            return;
        }

         newNode.next = head;
          head = newNode;
    }

    // pop operation
    public int pop(){

        if( IsEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    // push at bottom

 
   


    public static void main(String args[]){
        Stack2 s = new Stack2();

        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.IsEmpty()){
            System.out.println(s.pop());
        }

      
    }

}
