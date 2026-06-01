import java.util.*;

class FactorialNumber{
  
  static int fact(int n){
    int fact = 1;

    for(int i = n; i > 0; i--){
       fact = fact * i;
    }

    return fact;
  }

  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n = sc.nextInt();
    
    System.out.print("Factorial of " + n + " is :" + fact(n));
  }
}