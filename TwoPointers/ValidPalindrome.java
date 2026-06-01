import java.util.*;

class ValidPalindrome{

  static boolean isValid(String s){
    int i = 0;
    int j = s.length() - 1;
      while(i < j){

        while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
            i++;
        }

        
        while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
            j--;
        }

        if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)) ){
            return false;
        }
        i++;
        j--;
      }
    return true;
    
  }

  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the String : ");
  String s = sc.nextLine();
  
  System.out.print(isValid(s));
  }
}