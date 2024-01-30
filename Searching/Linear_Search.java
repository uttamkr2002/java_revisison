
public class Linear_Search {

    public static int Liner_Sear(int a[], int key){

        for(int i=0;i<a.length;i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        int a[] = {1,2,3,4,5};
        int key = 2;
        System.out.println(Liner_Sear(a,key));
    }
}
