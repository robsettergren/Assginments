import java.util.Scanner;

public class a27
{
  public static void main( String[] args )
  {
    Scanner s = new Scanner(System.in);
    
    
    double num1;
    double num2;
    
   
    System.out.println( "Enter the first Number:");
    num1 = s.nextDouble();
    
    System.out.println( "Enter the second Number:");
    num2 = s.nextDouble();
    
  
    
    System.out.println( "Is 1st number greater than the second number?" + ( num1 >= num2 ));
  
  }
}

