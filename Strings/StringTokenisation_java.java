package Strings;
import java.util.*;
public class StringTokenisation_java {
   public static void main(String args []){
     StringTokenizer sentense= new StringTokenizer("uttam is a good boy");
     System.out.println("total counr of tokens:"+ sentense.countTokens());
     while(sentense.hasMoreTokens()){
        System.out.println(sentense.nextToken());
     }
   } 
}
