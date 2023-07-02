import java.util.Scanner;

class method 
{
  int a, b;
  
Scanner sc = new Scanner (System.in);
  
void max () 
  {
    
System.out.println ("enter a,b value:");
    
a = sc.nextInt ();
    
b = sc.nextInt ();
    
if (a > b)
      
      {
	
System.out.println ("a is the maximom");
      
}
    
    else
      
      {
	
System.out.println ("b is the maximum");
      
}
  
 
}

 
}


public class exam 
{
  
public static void main (String[]args) 
  {
    
method m1 = new method ();
    
m1.max ();

} 
}
