package SEARCHING;

public class linearsearch {
   public static void linear (int a[],int key){
    for(int i=0;i<a.length;i++){
        if(a[i] == key)
            System.out.println("the index at which the key is availabl is :" +i);
            }
   }
   
   public static void main(String args[]){
    int a[]= {1,2,3,4,5};
    int key =2;
  linear(a,key);
   }
}
