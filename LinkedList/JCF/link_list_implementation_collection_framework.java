package LinkedList.JCF;
import java.util.LinkedList;
public class link_list_implementation_collection_framework {
    public static void main(String [] args){
    LinkedList<Integer> link = new LinkedList<>();
    
    // add operation
    link.addLast(1);
    link.addFirst(2);

    link.add(2);
    link.add(1);
    link.add(3);
    link.add(6);
    link.add(9);
    link.add(3,0);

    // remove
    link.remove();
    link.removeFirst();
    link.removeLast();
    System.out.println(link);
}


}