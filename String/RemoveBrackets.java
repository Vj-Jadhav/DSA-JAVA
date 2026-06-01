import java.util.*;

class RemoveBrackets{

  static String rovemoBrackets(String str){

    int s = str.length();

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < s; i++){

      if(str.charAt(i) != '(' && str.charAt(i) != ')'){
         sb.append(str.charAt(i));
      }
    }

    return sb.toString();
  }

  public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the String : ");
   String str = sc.nextLine();

   System.out.print("After Removed Brackets " + rovemoBrackets(str));

  }
}