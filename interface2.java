import java.util.*;
import java.lang.*;
import java.io.*;
interface A
{
	int a=2,b=3;
 public void sum();
}
interface B
{
	int c=3,d=2;
 public void sub();
}
class N implements A,B
{
	
  public void sum()
  {
   System.out.println(a+b);
  }
  public void sub()
  {
   System.out.println(c-d);
  }
 }

 class C 
 {
   public static void main(String []args)
   {
     N a= new N();
     a.sub();
     a.sum();
    }
  }
