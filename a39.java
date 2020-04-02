import java.util.Scanner;

public class a39
{
  public static void main( String[] args )
  {
    Scanner input = new Scanner(System.in);
    
    
    int num1;
    int num2;
    
   
    System.out.println( "Enter the first Number:");
    num1 = input.nextInt();
    
    System.out.println( "Enter the second Number:");
    num2 = input.nextInt();
    
    for ( int i = num1; i <= num2; i++ ) {
       
       int rmd = i % 2;
       
       if ( rmd != 0 ) {
         System.out.println(i);
       }
       
       
    }
  }
}

