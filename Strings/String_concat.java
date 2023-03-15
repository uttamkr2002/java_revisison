package Strings;
import java.util.*;
public class String_concat {
    public static void main(String args[]){
        String s1="uttam";
         s1 = s1+"Kumar";
         System.out.println(s1);

        //  this is how jvm understand s1+"kumar"
         String name= (new StringBuilder()).append("uttam").append("kumar").toString();
         System.out.println(name);

        //  before string it treats as integer and after that it treats as string
         String u= 10+10+"uttam"+10+10;
         System.out.println(u);

        //using method called concat();
        // String f="uttam";
        // String l="kumar";
        //  String fl=f.concat(l);
        // System.out.println(fl);  


        StringBuilder f1 = new StringBuilder("ahjam");
        StringBuilder f2= new  StringBuilder("Rabah");
        StringBuilder full=f1.append(f2);
        System.out.println(full);
        System.out.println(full.toString());



        // String concatination using format method 
        String f="uttam";
        String l="kumar";
        String sf = String.format("%s%s",f,l);
        System.out.println(sf);

    }
}
