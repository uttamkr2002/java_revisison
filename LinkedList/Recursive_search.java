package LinkedList;

public class Recursive_search {
    

    public class Node{
        int data;
        Node next;
        public Node(int data){
        this.data = data;
        this.next = null;
        }
    }

     public static Node temp;
     public static Node tail;
     public static Node head;

    

    public void add_first(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
        }
        newnode.next = head;
        head = newnode;
    }


    public void add(int data){
        Node newnode = new Node(data);
        if(head ==null){
            head=tail = newnode;
        }
        newnode.next=head;
        head = newnode;
    }

    // public void add_last(int data){
    //     Node newnode = new Node(data);
    //     tail.next=newnode;
    //     tail= newnode;
    // }


    public int  helper(Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
        return 0;
        }

        int idx =helper( head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }


   public int Recur_search(int key){
        return helper(head, key);
   }



    public void print(){
        if(head == null){
            System.out.println("linklist is empty");
        }
        temp = head;
         while(temp != null){
            System.out.print(temp.data+" -->");
            temp=temp.next;
         }
    }

    public void print_(){
        temp = head;
        while(temp != null){
            System.out.print(temp.data+" "+" -->");
            temp = temp.next;
        }
        System.out.println( );
    }



    public static void main(String args[]){
        Recursive_search  rr= new Recursive_search();
        rr.add(1);
        rr.add(2);
        rr.add(3);
        rr.add(4);
        rr.print_();

    }
}


