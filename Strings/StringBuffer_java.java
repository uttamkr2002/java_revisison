package Strings;

public class StringBuffer_java {
  public static void main(String args[]){
    StringBuffer fname = new StringBuffer("uttam");
    StringBuffer lname = new StringBuffer("kumar");
    fname.append(lname);
    System.out.println(fname);

    // insert at pos 
    System.out.println(fname.insert(0,"Er" ));
    System.out.println(fname.delete(7, fname.length()));
    System.out.println(fname.replace(0, 2, "CeLL"));
     System.out.println(fname.reverse());
  }  
}
