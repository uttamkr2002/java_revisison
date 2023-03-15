package Strings;

public class String_int_viceversa {
   public static void main(String args[]){
    String s="200";
    String y="100";
    // using function      Integer.parseInt(string)
    int i= Integer.parseInt(s);
    System.out.println(i+i);
    System.out.println(s+i);

    // using function  Integer.valueOf(string)

    int n = Integer.valueOf(y);
    System.out.println(n);


    // how to convert int to String

    int a=10;
    // String.valueOf
    String m= String .valueOf(a);
    //  Integer.toString()
    String w= String.valueOf(a);
    String z =String.format("%d", a);
    System.out.println(m+" "+w+" "+z);
   } 
}
