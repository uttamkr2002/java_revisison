package Strings;
import java.util.*;
public class Palindrome_java {

  public static void main(String [] args){
    String name="jatin";
    int i=0;
    int len = name.length();
    boolean isPali=true;
    System.out.println(len);
    while(i<len/2){
        if(name.charAt(i)!=name.charAt(len-1-i)){
            
          isPali=false;
        
        }i++;
       
    }

    if(isPali){
        System.out.println("is palindrome");
    }
    else{
        System.out.println("false");
    }
  }  
}
