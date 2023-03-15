package Strings;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class String_conversion_viceversa {
    public static void main(String args[]){
     char h[]={'h','e','l','l','o'};
     String s = new String (h);
     String v= String.valueOf(h);
     String s2 = String.copyValueOf(h);
     System.out.println(v);
     System.out.println(s);
     System.out.println(s2);
     StringBuilder s1= new StringBuilder();
     for(char w:h){
        s1.append(w);
     }
      System.out.println(s1);
    }
}
