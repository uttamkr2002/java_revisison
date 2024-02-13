package LinkList;

public class test2 {
    

    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // few global access variable
    public static Node head = null;
    public static Node tail = null;
    public static int count =0;


    // Adding element
    public void AddElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            count++;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void Print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
    }


    // To detect whether the li9nklist has cycle or not 

    public Node isCycle(Node head){       
    
    // Steps
    Node fast = head;
    Node slow = head;

    // Initialize slow and fast pointer
    while(fast != null && fast.next != null){    
    // If fast == slow ; it means that the linklist has loop
    slow = slow.next;
    fast = fast.next.next;
    if(fast == slow){
        return fast;
    }
    
    }
    return head;
    }


    // To Remove the cycle
    public void RemoveCycle(Node head){

    Node fast = isCycle(head);
    Node slow = head;
    // Leave the fast Node there only
    // Initialize the slow node as head
    Node pre = null;
    while(fast != null && fast.next != null){
    pre = fast;
    // Now run the loop until fast == slow
   
   slow = slow.next;
   fast = fast.next;

   if(fast == slow){
       
    break;
   }
       // fast & Slow moves 1 steps

    // We also have to take pre variable and update it after each step of fast
    }
    pre.next = null;
    // pre.next = null ; hence the loop is removed

    }

    public static void main(String args[]){
        test2 link = new test2();
        link.AddElement(1);
        link.AddElement(2);
        link.AddElement(3);
        link.AddElement(4);
        link.AddElement(5);

        head.next.next.next.next.next = head.next.next;

        // link.Print(head);
        System.out.println(link.isCycle(head).data);
        link.RemoveCycle(head);
        link.Print(head);


    }
}
