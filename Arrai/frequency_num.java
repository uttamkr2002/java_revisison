package Arrai;

public class frequency_num {
    public static void main(String args[]){
//         int a[]= new int []{1,2,8,3,2,2,2,5,1};
//         int visited=-1;
//         int f[]=new int [a.length];


//         for(int i=0;i<a.length;i++){
//             int count =1;
//             for(int j=i+1;j<a.length;i++){
//           if(a[i]==a[j]){
//             count++;
//             f[j]=visited;
//           }
//         }
//         if(f[i]!=visited)
//           f[i]=count;     
//     }

//     for( int i=0;i<f.length;i++){
//       if(f[i]!=visited){
//         System.out.println(f[i]);
//       }
//     }
// }
// }


int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
//Array fr will store frequencies of element  
int [] fr = new int [arr.length];  
int visited = -1;  
for(int i = 0; i < arr.length; i++){  
    int count = 1;  
    for(int j = i+1; j < arr.length; j++){  
        if(arr[i] == arr[j]){  
            count++;  
            //To avoid counting same element again  
            fr[j] = visited;  
        }  
    }  
    if(fr[i] != visited)  
        fr[i] = count;  
}  

//Displays the frequency of each element present in array  
System.out.println("---------------------------------------");  
System.out.println(" Element | Frequency");  
System.out.println("---------------------------------------");  
for(int i = 0; i < fr.length; i++){  
    if(fr[i] != visited)  
        System.out.println("    " + arr[i] + "    |    " + fr[i]);  
}  
System.out.println("----------------------------------------");  
}}  
