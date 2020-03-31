import java.util.Scanner;

public class a24
{
  public static void main( String[] args )
  {
    Scanner input = new Scanner(System.in);
    
    
    int num1;
    int num2;
    int num3;
    int product;
   
    System.out.println( "Enter the first Number:");
    num1 = input.nextInt();
    
    System.out.println( "Enter the second Number:");
    num2 = input.nextInt();
    
    System.out.println( "Enter the third Number:");
    num3 = input.nextInt();
    
    product = num1 * num2 * num3;
    
    System.out.println( "The Product is " + product);
  
  }
}

