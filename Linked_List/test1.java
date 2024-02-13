package Linked_List;

public class test1 {

    public static class Node{

        // two variable local
        int data;
        Node next;

        // local method
         
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    
    }

    public static Node head = null;
    public static Node tail = null;
    public static int count =0;


    // Now we are doing add operation

    // addFirst - O(1)

    public void Add_First(int data){
        Node newNode = new Node(data);
// Step 1 = create new node
        if(head == null){
            head = tail = newNode ;
            // count++;  
            return; // ##         
        }
        newNode.next = head;
        head = newNode;
        // count++;       
    }
    // Add at Index O(n);

    public int Count(){
        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;            
        }
        return count;
    }

    public void Add_At_Index(int data, int index){

        // if index is 0
        if(index == 0){
            Add_First(data);
            return;
        }
        // if index is last
        if(index == count-1){
           Add_at_Last(data);
           return;
        }
        System.out.println("Successfully came here");
        // if index is at middle
        Node temp = head;
        Node pre = null;
        for(int i=0;i<index;i++){
          pre = temp;     
          temp = temp.next;
          i++;       
          
        }
        System.out.println("Succesfully after the iteration");
        Node newNode = new Node(data);
        System.out.println(temp.data);
        System.out.println(pre.data);
         newNode.next = temp;
         pre.next = newNode;
}
    // Add at last O(1);
    public  void  Add_at_Last(int data){

        Node newNode = new Node(data);
        // Node temp = tail;
        tail.next = newNode;
        tail = newNode;
    }   

    // Print Operation - O(n)
    public void Print(){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // Remove()
    // Remove_First();

    public  int Remove_First(){
       Node temp = head;
        head = head.next;
        return temp.data;
    }

    // Remove_at_Index();
    public void Remove_at_Index(int index){
        Node temp = head;
        // Node pre = null;
       for(int i=0;i<index;i++){
            // pre = temp;
            temp = temp.next;
       }

       
    }
    // Remove_at_Last();

    public  void Remove_at_last(){

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        tail = temp;

    }

    public static void main(String args[]){

        // creating a object of type test1
        test1 ll = new test1();

        // Now we will create methods

        // add
        ll.Add_First(1);
        ll.Add_First(2);
        ll.Add_First(3);
        ll.Add_First(4);
        ll.Add_First(5);
        ll.Print();
        System.out.println("Now we are Adding at Middle");

        ll.Add_At_Index(9, 3);
        ll.Add_at_Last(8);
        ll.Print();
        System.out.println("Come down the Print");
        System.out.println(ll.Count());
        // remove
       ll. Remove_at_last();
        System.out.println("After Removing at Last");
        ll.Print();
        ll.Remove_at_Index(3);
        System.out.println("After Removing at Middle");
        ll.Print();
        System.out.println("Remove at First");
        ll.Remove_First();
        ll.Print();
        // print
        // Search

    }
}
