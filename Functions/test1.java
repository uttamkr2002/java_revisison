package Functions;

public class test1 {
    
    // Find factorial

    public static int Factorial(int n){
         int fact=1; // Never Intialize with zero

       for(int i=n;i>1;i--){
          fact *= i;
       }
       return fact;

    }

    // Factorial Using Recursive Approach

    public static int Rec_Fact(int n){

        // base case
        if(n<=2){
            return n;
        }

        return n*Rec_Fact(n-1);
    }

    // Find Bionomial Coefficient


    // Iterartive Approach
    public static int NCR(int n, int r){  // Parameter 
     
        return Factorial(n)/(Factorial(r)*Factorial(n-r));
    }


    // Check If the number is prime or not

    public static boolean Check(int n){

        Boolean isPrime = false;

        if(n==0){
            return false;
        }

        if( n==1 || n==2){
            isPrime = true;
        }

        for(int i=3;i<n-1;i++){
            if(n%i == 0){
                return false;
            }
            isPrime =  true;
        }
        return isPrime;
    }

    // Check Prime optimised
   public static boolean optiPrime( int n){

    Boolean isPrime = false;

        if(n==0){
            return false;
        }

        if( n==1 || n==2){
            isPrime = true;
        }


    for(int i=2;i<Math.sqrt(n);i++){
        if(n%i == 0){
            return false;
        }
        isPrime = true;
    }
        return isPrime;
   }


    // Prime in Range

    public static void InRangePrime(int l , int u){

        for(int i=l;i<=u;i++){
           if( Check(i)){
            System.out.println(i);
           }
        }
    }

    // Binary to decimal
      
    public static void Bin_Dec(int n){
           int i=0;
           int dec =0;
        while(n != 0 ){
            dec += n%10 * Math.pow(2,i);
            n = n/10;          
        }
        System.out.println(dec);
    }

    // Decimal to Binary

    public static void Dec_to_Bin(int n){
          int res =0;
          int i=0;
          int bin =0;
        while (n != 0){
            res = n%2 ;
            bin += res *(int)(Math.pow(10, i));
            n = n/2;
            i++;
        }
        System.out.println(bin);
    }
    // Check whether the number is Palindrome or not

    public static boolean CheckPali(int n){
        int rev =0;
        int i=0;
        int temp =n;

        while(temp != 0){
            rev += temp%10* ((int) Math.pow(10, i));
            i++;
            temp= temp/10;
        }
        System.out.println("The rev will be "+ rev  + "The n will be" + n);
        if(rev == n){
            return true;
        }
        return false;

    }
    // RTeverse the digit



    public static void main(String args[]){
    //   System.out.println(  Factorial(5));
    //   System.out.println(Rec_Fact(5));
    //   System.out.println(NCR(5, 2));
    // System.out.println(optiPrime(5));
    // InRangePrime(1, 10);
    Bin_Dec(1011);
    Dec_to_Bin(11);

    System.out.println(CheckPali(101));
    // System.out.println("Hi");
    }

}
