package Confusion.What_Compiler_does_when_no_constructor_is_declared;

public class Circle {
      int  radius;



    //   What is Constructor?
//   a constructor is a unique method that is used to initialize a newly created object

// What is default constructor?
// a default constructor is created by compiler when there is no constructor declared ,** it returns the null value if no reference variable is declared



    // ###  if no constructor is created the compiler creates a default constructor 
    // for eg:-

    // Circle(){  
//    ****   This constructor is not created by user it is created by compiler    ####
    // }

// }

// public class TestCircle(){
    public static void main(String args[]){
    Circle c1 = new Circle(); // object is created    ** a constructor call returns a value that is reference to a newly created object

    c1.radius = 40;    // reference variable decleared  ** Reference variable is used to point object/value

    System.out.println(c1.radius);
    }
}
