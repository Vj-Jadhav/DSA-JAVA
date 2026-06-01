import java.util.*;

class RemoveAllVowels{

  static boolean isVowel(char ch){

    ch = Character.toLowerCase(ch);

    return ch == 'a' ||ch == 'i' ||ch == 'o' ||ch =='e'||ch =='u'; 
  }

  static String romovedVowel(String str){
    int n = str.length();
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < n; i++){
      if(!isVowel(str.charAt(i))){
         sb.append(str.charAt(i));
      }
    }

    return sb.toString();
  }

  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the String : ");
  String str = sc.nextLine();
  System.out.print("After Removed Vowels : " + romovedVowel(str));

  }
}