package LinkedList;

import java.util.concurrent.RecursiveAction;

public class Singly_Linkedlist {
    

    public  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this .next = null;
        }
    }
   
    public static Node head;
    public static Node tail;
    public static Node temp;


    public void addFirst(int data){
        // step1: create new object
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2: newnode.next = head
        newNode.next = head;

        // step 3- head = newnode
        head = newNode;

    }



    public void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            addFirst(data);
        }
        else{
            tail.next = newnode;
            tail=newnode;

        }
    }


    public void add(int index, int data){
        Node prev;
        // step1 :- create a node
        Node newnode = new Node(data);
        temp = head;
        int count =0;
        while(temp!=null){
           count++;
           prev = temp;
           temp = temp.next;
            if(count == index){
              prev.next = newnode;
              newnode.next = temp;
            }
        }
    }


    public void remove_first(){
        if(head == null){
            System.out.println("LinkList is empty");
        }
        else{
        head= head.next;
    } 
    }



    public void remove_last(){
        temp= head;
        while(temp.next!=null){
            temp = temp.next;
        }
        //System.out.println(temp);

        temp.next =null ;
    }

// 1,2,3,4,,5 index2
    public void remove_at_index(int index){
        Node prev=null;
   temp = head;
   int count =0;
   while(count < index){
    prev=temp;
    temp =temp.next;
    count++;
   }
   prev.next= temp.next;
    }


 public int Iterative( int key){
    temp = head;
    int count=0;
    while(temp != null){

        if(temp.data == key){
            return count;
        }
      temp = temp.next;
      count ++;
    }
    return -1;
 }



public static int  Recursive(int key, int count, Node temp){
    // temp = head;
    if(temp.data == key){
        return count;
    }
    if
    
    count =count+1;
    temp =temp.next;
    Recursive(key, count,temp);
   return count;
}






    public void print(){

        if(head == null){
            System.out.println("Linklist is empty");
        }
        temp = head;
        while(temp != null){
            System.out.print(temp.data+" -->");
            temp = temp.next;
        }
        System.out.println();
    }






    public static void main(String args[]){
    Singly_Linkedlist ll = new Singly_Linkedlist();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addLast(4);
    ll.addLast(5);
    ll.addLast(3);
    ll.addLast(37);
    ll.addLast(35);
    //ll.print();

    ll.add(1,9);
    ll.print();

//    System.out.println( ll.Iterative(3));
//    System.out.println( ll.Iterative(10));

//     ll.remove_first();
//     ll.print();
//     ll.remove_last();
//     ll.print();
//     ll.remove_at_index(2);
//     ll.print();
    

// System.out.println(Recursive(3,0,head)); 


 }
}
