package Strings;
import java.util.*;
public class Reverse_string {
    public static void main(String args[]){
    StringBuilder s= new StringBuilder( "this is javatpoint");
    int i=0,front=0,back=0;
    char first,last;
    int len = s.length();
    while(i<len/2){
        front =i;
        back=len -i-1; // -1 ?
        first=s.charAt(front);
        last=s.charAt(back);
        s.setCharAt(front,last);
        s.setCharAt(back, first);
      i++;

    }
    System.out.println(s);
}
}
