package Linked_List2;

public class test1 {
    
//  creating a class Node

public class Node{

    int data;
    Node next;

   

    public  Node(int data){
        this.data = data;
        this.next = null;
    }
}

public static Node Head = null;
public static Node Tail = null;
public static int Count;


// Prints the LinkList
public void Prints(){
    Node temp = Head;
    while(temp != null){
        System.out.print(temp.data+"--> ");
        temp = temp.next;
    }

}

// Add Element at First

public void Add_AtFirst(int data){

    // Creating a Node
    Node newNode = new Node(data);

    // if there is no element
    if(Head == null){
          
        Head = Tail = newNode;
        return;
    }
    // if there is Element
    newNode.next = Head;
    Head =  newNode;

}

// Add an Elemnt at Last

public void Add_AtLast()



        public static void main(String args[]){
     
        test1 linklist = new test1();

        // Add the element to this linklist
        linklist.Add_AtFirst(1);
        linklist.Add_AtFirst(2);
        linklist.Add_AtFirst(3);
        linklist.Add_AtFirst(4);
        linklist.Add_AtFirst(5);
        linklist.Prints();

    }
}
