package Arrai;

public class Copy_from_arrai {
 public static void main(String [] args){
    char copyfrom[]={'a','b','c','d','e','f'};
    char copyto[]=new char[3];
    System.arraycopy(copyfrom ,2,copyto,0,3 );
    System.out.println(String.valueOf(copyto));

 }   
}
