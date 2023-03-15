package Strings;

public class Methodsin_java {
   public static void main(String args[]){
    String name ="Uttam Kumar ia a Boy , Uttam ";
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name.trim());
    System.out.println(name.startsWith("u"));
    System.out.println(name.endsWith("Boy"));
    

    System.out.println(name.startsWith("Uttam"));
    System.out.println(name.endsWith(" a Boy"));


    System.out.println(name.replace("Uttam", "Sonu"));
   } 
}
