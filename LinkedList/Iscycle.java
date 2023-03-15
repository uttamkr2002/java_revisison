package LinkedList;

public class Iscycle {

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // is cycle
    public static boolean iscycle(Node head){
       Node slow = head; 
       Node fast = head; 
    //    condition for odd and even
    while(fast != null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow==fast){
            return true;
        }
    }
    return false;
    }



    // Remove  a loop in cycle

    public static void Remove_loop(Node head){
     
        // Step1: to detect the loop
        Boolean isCycle=false;
        Node slow=head;
        Node fast=head;

        while(fast != null&& fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                isCycle = true;
                break;
            }
        }

        // Step 2: find the previous node at which the cycle is detected
         slow = head;
         Node prev = null;
         while(slow != fast){
            prev = fast;
            slow = slow.next;//1 step
            fast= fast.next;//1step
                  
        }

        // step 3: set prev.next to null
        prev.next=null;

    }
    
    public static Node head;
    public static Node tail;
    public static void main(String [] args){
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node (3);
        head.next.next.next = head;
        System.out.println(iscycle(head));

    }

} 
