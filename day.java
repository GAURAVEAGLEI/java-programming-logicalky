import java.util.Scanner;

 
class day
{
  
public static void main (String args[])
  {
    
Scanner sc = new Scanner (System.in);
    
int day;
    
System.out.println ("enter the no");
    
day = sc.nextInt ();
    
 
if (day == 0)
      {
	
System.out.println ("Sunday");
      
}
    else if (day == 1)
      {
	
System.out.println ("Monday");
      
}
    else if (day == 2)
      {
	
System.out.println ("Tuesday");
      
}
    else if (day == 3)
      {
	
System.out.println ("Wednesday");
      
}
    else if (day == 4)
      {
	
System.out.println ("Tursday");
      
}
    else if (day == 5)
      {
	
System.out.println ("Friday");
      
}
    else if (day == 6)
      {
	
System.out.println ("Saturday");
      
}
    else
      {
	
System.out.println ("no week");
      
}
  
}

}
