import java.util.*;

class CheckPalindrome{

  static boolean isPalindrome(String str){

    int s = str.length();
    int i = 0;
    int j = s - 1;

    while(i < j){

      if(str.charAt(i) != str.charAt(j)){
        
        return false;
      }
      i++;
      j--;
    }

    return true;
  }

  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the String :");
  String str = sc.nextLine();

  if(isPalindrome(str)){

    System.out.print("The given String is Palindrome");
  }else{

    System.out.print("The given String is not Palindrome");
  }
  }
}