import java.util.*;
public class input{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        boolean b = sc.nextBoolean();
        System.out.println("enter the value of c");
        String c= sc.next();
        System.out.println("enter the value of d lines");
        String d= sc.nextLine();
        System.out.println("enter the value of e float");
        float e= sc.nextFloat();



        System.out.println(a+" "+b+" "+c+" "+d+" "+e);
    }
}