import java.util.*;

class CheckPalindrome{

  static boolean isPalindrome(int n){
  int original = n;
  int rev = 0;
  while(n != 0){

    int digit = n % 10;
    rev = rev * 10 + digit;
    n= n/10;
 
  }
  return rev == original;
}

  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the Number :");
  int n = sc.nextInt();
  

  if(isPalindrome(n)){

    System.out.print("Given Number is Palindrome :");

  }else{

    System.out.print("Given Number is not Palindrome :");
  }

  }
}