package LinkedList;

public class Rec_search {


    public class Node{
        int data;
        Node next;
        public Node( int data){
       this.data = data;
       this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static Node temp;

   public void add_first(int data){
    Node newnode = new Node(data);
       if(head == null){
        head = tail = newnode;
        return ;
       }
       newnode.next = head;
       head = newnode;
   }


   public int helper(Node head , int key){
    if(head == null ){
        return -1;
    }
    if(head.data == key){
        return 0;
    }
   int idx = helper(head.next,key);
   if(idx == -1){
    return -1;
   }
   return idx+1;


   }

   public int recursearch(int key){
    return helper(head,key);
   }




   public void reverse(){
    Node curr= tail = head;
    Node next=null;
    Node prev=null;
    while(curr != null){
       next = curr.next;
        curr.next = prev;
        prev=curr; 
        curr = next;
     }
    head = prev;

   }


   public int count(){
    temp = head;
    int count =0;
    while(temp.next != null){
        temp = temp.next;
        count++;
    }
    return count;
   }

   public void  remove_n_end(int n){
    temp = head;
    Node  prev= null;
    int count = 0;
    //temp = head;
    //int count =0;
    while(temp.next != null){
        temp = temp.next;
        count++;
    }
    int i=0;
    while(i < count-n){
        prev=temp;
        temp = temp.next; 
        i++;
    }
    prev.next = temp.next;
   }





//    Is Palindrome
public Node findmid(Node head){
Node slow,fast;
slow=fast=head;
while(fast == null && fast.next == null){
    slow= slow.next;// 1 steps
    fast = fast.next.next;// 2 steps

}
return slow;

}

public boolean isPali(){
    
    if(head==null || head.next!=null){
        return true;
    }

    // step1 find middle node
    Node midNode = findmid(head);

    // step 2 reverse 2nd half

    Node prev = null;
    Node curr = midNode;// middle node act as head
    Node next = null;
    while(curr != null){
        next=curr.next;
        curr.next = prev;
        prev=curr;
        curr = next;
    }
    Node right = prev;//right half head
    Node left = head;

    // Step 3: check the left half and right half
       while(right != null){
        if(left.data != right.data){
            return false;
        }
        left=left.next;
        right = right.next;
       }

       return true;
}



// Detect cycle 
//Floyds Cycle Algorithm
 
public static boolean isCycle(){
    Node slow=head;
    Node fast=head;

    // condition for odd & even
    while(fast != null && fast.next != null){
        slow=slow.next; // +1
        fast = fast.next.next; // +2
        if(slow == fast){
            return true;
        }
            }
            return false;
}










   public   void print(){
    temp = head;
    if(head == null){
        System.out.println("empty");
    }
    while(temp!=null){
        System.out.print(temp.data+" -->");
        temp=temp.next;
    }
    System.out.println();
   }
  public static void main(String [] args){
    Rec_search ll = new Rec_search();
    ll.add_first(1);
    ll.add_first(2);
    ll.add_first(3);
    ll.add_first(4);
    ll.add_first(5);
    ll.print();
   // ll.reverse();
   // ll.print();

   // ll.remove_n_end(2);
    //ll.print();
      // System.out.println(              ll.recursearch(3));
     ll.isPali();
 
    }  
}
