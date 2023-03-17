package Confusion.Reference_VARIABLE__REference_type;

public class Test {

    // Reference variable is used to point reference object/value
//       Syntax:  ClassName objectRefVar

// **Reference variable which contain reference to other object
//  A class is a Reference type   ***
  int id;
  int dat;



// Compiler generate a default constructor
}


// Yaha pe public karte hai toh kyu error aata hai?????   ***Romi bhaiya

//the public type samplytest must be defined in its own filejava(16777541)
 
class SamplyTest {
    public static void main(){
    Test test1;  // a object reference variable "test1" with reference type "Test"
    test1 = new Test(); // object is cretaed

    // These two lines can be combined and made in one line
    // Test test1= new Test()   ** both are same


    System.out.println(test1.id+" "+test1.dat);  
    // pata nahi answer me 40 aa raha hai kya pata kaha se??? ****

    }
}