package Functions;

public class test1 {
    
    // Find factorial

    public static int Factorial(int n){
        int fact=1;

       for(int i=n;i>1;i--){
          fact *= i;
       }
       return fact;

    }

    // Find Bionomial Coefficient
    // Check If the number is prime or not
    // Check Prime optimised
    // Prime in Range
    // Binary to decimal
    // Decimal to Binary
    // Check whether the number is Palindrome or not



    public static void main(String args[]){
      System.out.println(  Factorial(5));
    }

}
