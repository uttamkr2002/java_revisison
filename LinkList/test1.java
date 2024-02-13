package LinkList;

public class test1 {

    // creating a class 
  public class Node{
    int data;
    Node next;

    // constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }
  }

  public static Node head = null;
  public static Node tail = null;
  public static int count =0;

//   Adding node at first

public void Print(Node head){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+"-->");
        temp = temp.next;
    }
}

public void Add_AtFirst(int data){

    Node newNode = new Node(data);

    if(head ==null){
        head = tail = newNode;
        count++;
        return;
    }

    newNode.next = head;
    head = newNode;
    count++;
}

// aDD element at Index

public void Add_At_Index(int data,int index){

    Node newNode = new Node( data);

    // check whether the index is greator than count variable
    if(index > count){
        System.out.println("Index is Greator than Size of Link List");
        return;
    }
    if(index == 0){
        Add_AtFirst(data);
        return;
    }
    if(index == count){
        Add_AtLast(data);
        return;
    }
    Node pre = null;
    Node temp = head;

    for(int i=0;i<index;i++){
        pre = temp;
        temp = temp.next;
    }

    pre.next = newNode;
    newNode.next = temp;
    count++;

}


// Add Element at Last

public void Add_AtLast(int data){

    Node newNode = new Node(data);

    tail.next = newNode;
    tail = newNode;
    count++;
}
   

// Remove Element



public int RemoveFirst(){
          
    if(head == null){
        System.out.println("No Element is there is LinkList");
        return -1;
    }

      int e = head.data;
      head = head.next;
      count--;
      return e;
}

public int Remove_AtIndex(int index){

    if(index == 0){
        RemoveFirst();
    }
    else if(index == count){
        RemoveLast();
    }
    else if(index > count){
        System.out.println("Index is Greator than Six=ze of LinkList");
        return -1;
    }
    Node pre = null;
    Node temp = head;
    for(int i=0;i<index;i++){
        pre = temp;
        temp = temp.next;
    }
    int e = temp.data;
    pre.next = temp.next;
    count--;
    return e;
}

public int RemoveLast(){
    Node pre = null;
    Node temp = head;

    while (temp.next != null){
        pre = temp;
        temp = temp.next;
    }
    int e = temp.data;
   pre.next = null;
   count--;
   return e;

}


public void Reverse(){
    Node pre = null;
    Node cur = head;
    Node nex = head;

    while( cur != null){
        nex = cur.next;
        cur.next = pre;
        pre = cur;
        cur = nex;
    }
    head = pre ;   // ** I always Forget this
}


// Now we are finds nth node from

public int Find_nth(int data){
    System.out.println("Hi, We are Inside this cODE");
    Node temp = head;
    int i=0;
    while(temp != null){
        i++;
          if(temp.data == data){
            System.out.println("We found the data at Index");
            return count-i;
          }
          temp = temp.next;
    }
    System.out.println("There is No such data present");
    return -1;
}


public int delete_fromEnd(int ind){

   int  ind1 = count -(ind+1);
   
   int ind2 =  count -( ind+2);
   System.out.println("The value that is passed as Argument ="+ind +"The value that is ind1 from start="+ind1+ "The value that is Index 2 from staret="+ind2);
   Node pre = null;
   Node temp = head;

   for(int i=0;i<ind1;i++){
    pre = temp;
    temp = temp.next;
   }
   int e = temp.data;
   pre.next = temp.next;
return e;

}

public Node Return_Mid(){
    // Steps to find mid point
// 1> Take two Pointer slow(Moves 1 step) and fast(Moves 2 Step) 
Node slow = head;
Node fast = head;

// 2> Loop will run until fast != null for even case && fast.next != null for odd case
while(fast != null && fast.next != null){
    slow = slow.next;
    fast = fast.next.next;
}
return slow;
// when we will return slow pointer it will give the middle node
}


// CXheck Whether the Linklist Isn Palindrome
public Boolean Checkif(){

System.out.println("Now WE are printing the linklist");
Print(head);
// Steps
// Find the Mid Point
Node Right = Return_Mid();

// Reverse the linklist from Mid
Node cur = Right;
Node pre = null;
Node fut = Right;
while(cur != null){
    fut = cur.next;
    cur.next = pre;
    pre = cur;
    cur = fut;
}
pre = Right;

// Now we are Printing the reverse LinkList

System.out.println("Reversed");
Print(Right);
// Now LinkList is Finally reversed

// Checking if the Linklist is Palindrome
Node temp = head;
    Node temp_r = Right;
while(temp_r.next != null){
    
  
         if(temp.data != temp_r.data){
            return false;
         }
         temp = temp.next;
         temp_r= temp_r.next;
    }
    return true;

}


    public static void main(String args[]){

        test1 link = new test1();
        link.Add_AtFirst(1);
        link.Add_AtFirst(2);
        link.Add_AtFirst(3);
        link.Add_AtFirst(4);
        link.Add_AtFirst(5);
        link.Print(head);
        System.out.println(" ");
        System.out.println(count);

        link.Add_At_Index(9,3);
        link.Print(head);
        System.out.println(" ");
        link.Add_At_Index(0,0);
        System.out.println(" ");
        link.Print(head);
        link.Add_At_Index(10, 15);
        System.out.println(" ");
        link.Print(head);
        link.Add_AtLast(15);
        System.out.println("");
        link.Print(head);
        System.out.println("Now we are trying to Remove First");
        System.out.println(link.RemoveFirst());
        link.Print(head);
        System.out.println("Now we are trying to remove at Index");
        System.out.println(link.Remove_AtIndex(2));
        link.Print(head);
        System.out.println(" ");
        System.out.println("Now we are trying to remove at last");
        System.out.println(link.RemoveLast());
        link.Print(head);
        System.out.println("We are Reversing");
         link.Reverse();
         link.Print(head);

        //  find the nth node from end
        System.out.println("The size of tha LinkList is :"+count);

        System.out.println(link.Find_nth(4));

        // delete the node from end

        System.out.println(link.delete_fromEnd(1));
          link.Print(head);


        //   check whether the linklist is Palindrome
        System.out.println(link.Checkif());

        

    }
}
