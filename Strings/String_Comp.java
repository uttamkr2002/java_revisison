package Strings;
import java.util.*;
public class String_Comp {
   public static void main(String []args){
    
//    comparing can be done by three function
// 1. string name . equalsto(String name);
// 2. s1 == s2
// 3. S1,compareto(s2);


// lets try equaloperator
String s1="uttan";
String s2 = "uttam";
String name = new String( "uttam");
String s3= "UTTAM";
System.out.println("its time for equalto");
System.out.println(s1.equals(s2));// returns true 
System.out.println(s1.equals(name));// returns false as new object created

// equalsIgnoreCase if uttam is compared with UTTam  returns true


System.out.println(s1.equalsIgnoreCase(s3));// returns true



System.out.println(" now its a time of == ");
// == operator
System.out.println(s1==s2);// true (both refer to same object)
System.out.println(s1==name);// false (both refers to different object)
System.out.println(s1==s3);//false
System.out.println(s2==s3);// false




// // s1 == s2 : The method returns 0.
// s1 > s2 : The method returns a positive value.
// s1 < s2 : The method returns a negative value.

System.out.println(s1.compareTo(s2));
//System.out.println(s1.compareTO(s3));
System.out.println(s1.compareTo(name));
} 
}

