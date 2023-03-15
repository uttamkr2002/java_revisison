package SEARCHING;

public class binary {
    public static void binaryed(int a[],int key, int start, int end){
        while(start>=end){
            int middle= (end -start)/2;
            if(a[middle]==key){
                System.out.println(middle);
            }
            else if(a[middle]>key){
                end= middle-1;
                binaryed(a,key,start,end);
            }
            else if(a[middle]<key){
               start = middle+1;
               binaryed(a,key,start,end);
            }
        }
        if(start>end){
            System.out.println("element not found");
        }
    }



    public static void main(String args []){
        int a[]={1,2,3,4,5};
        int key =3;
        int last = a.length-1;
        binaryed(a, key, 0, last);
    }
}
