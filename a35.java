import java.util.Scanner;

public class a35
{
  public static void main( String[] args )
  {
    Scanner input = new Scanner(System.in);
    
    
    int num1;
   
    System.out.println( "Enter a Number:");
    num1 = input.nextInt();
    
    if (num1 >= 100) {
      System.out.println( "Your number is a big number. " );
    }
    else {
      System.out.println( "Your number is a small number. " );
    }
  }
}

