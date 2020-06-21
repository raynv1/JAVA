import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends singer{
	void fly(){
		System.out.println("I am flying");
	}
}
class singer extends Animal
{void sing(){
        System.out.println("I am singing");
    }
}

public class inheritenceexample{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	
   }
}
