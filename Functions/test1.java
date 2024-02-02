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
    // Prime in Range
    // Binary to decimal
    // Decimal to Binary
    // Check whether the number is Palindrome or not



    public static void main(String args[]){
    //   System.out.println(  Factorial(5));
    //   System.out.println(Rec_Fact(5));
    //   System.out.println(NCR(5, 2));
    System.out.println(Check(6));
    }

}
