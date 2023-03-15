package Strings;

public class Immutables {
   public class void main(String args[]){


    // String are immutable means it cannot be modified
    // eg: a="uttam"   a.concat("kumar")  there will be two string in heap memory
    // 

    String name="Uttam";
     name.concat("kumar");
     System.out.println(name);// it prints uttam as s is point to uttam in heap

    //  lets point the s to new created object uttam kumar


    name=name.concat("kumar");// uttam kumar will be printed
   } 
}



