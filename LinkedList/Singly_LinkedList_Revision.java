package LinkedList;
import java.util.*;
public class Singly_LinkedList_Revision {
    


    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static Node temp;



    public void add(int data){
        Node newnode = new Node(data);
        if(head ==null){
            head=tail = newnode;
        }
        newnode.next=head;
        head = newnode;
    }

    public void add_last(int data){
        Node newnode = new Node(data);
        if(head == null){
            add(data);
        }
        tail.next =newnode;
        newnode = tail;
    }


    public void add_at_index(int index, int data){
        Node prev = null;
        temp = head;
        int count =0;
        Node newnode = new Node(data);
        while(count < index ){
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = newnode;
        newnode.next = temp;
        
    }

    public void print(){
        temp = head;
        while(temp != null){
            System.out.print(temp.data+" "+" -->");
            temp = temp.next;
        }
        System.out.println( );
    }




        public static void main(String args[]){
            Singly_LinkedList_Revision ll = new Singly_LinkedList_Revision();
            ll. add(5);
            ll. add(3);
            ll. add(2);
            ll. add(1);
            ll.add_last(4);
            ll.print();
            ll.add_at_index(2, 9);
            ll.print();
        }
    }

