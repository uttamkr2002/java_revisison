package Confusion;

import javax.sound.sampled.SourceDataLine;

public class Constructorsss {
   int  age ;
   String name;
   String  gender;
   

//    intializing a default constructor
// If we not declare any constructor the compiler automicaly declare the constructor internally
// When this kind of constructor is called it returns the ### null value that is reference to newly created object 
// Constructors(){

// }

// }

// A no-argument constructor 
// When this kind of constructor is called it returns the value that is reference to newly created object


Constructorsss (){
age=15;
name= "sonu";
}

// Parametrized constructor
// it takes the value when an object is created
Constructorsss (name,age,gender){
    this.name=name;
    this.age=age;
    this.gender = gender

}
}

 class TestConstructors{
    public static void amin(String args[]){
    Constructorsss c1 = new Constructorsss();  // it go to the non argument constructor
    System.out.println(c1.age + c1.name);

    Constructorsss C2 = new Constructorsss ("uttam",15,"m");
    System.out.println(C2.age+C2.name+C2.gender);
}
}
