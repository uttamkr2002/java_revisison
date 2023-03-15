package Arrai;

public class Print_dupli {
    public static void main(String []args){
        int a[]={1, 2, 3, 4, 2, 7, 8, 8, 3};



        // code for finding duplicate
        for(int i=0;i<a.length-1;i++){
           for(int j=i+1;j<a.length;j++){
            if(a[i]==a[j])
            System.out.println(a[i]);
           }
        }



        // code for printing element at even position

       System.out.println("printing element at even pos");
        for(int i=1;i<a.length;i=i+2){
            System.out.println(a[i]);
        }


    }
}
