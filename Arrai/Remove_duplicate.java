package Arrai;

public class Remove_duplicate {
    public static void main(String [] args){
        int arr[]={10,20,20,30,30,40,50,50};
        int temp[]=new int [arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
         if(arr[i]!=arr[i+1]){
            temp[j++]=arr[i];
         }
        }
        // not added last elemrnt
        temp[j++]=arr[arr.length-1];

        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
