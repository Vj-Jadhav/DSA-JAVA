import java.util.*;

class EvenNumber{

  static boolean isEven(int n){  

       if(n % 2 == 0){

        return true;
   }

   return false;
  }

  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int n = sc.nextInt();
    
   if(true){

      System.out.print( "Given number is Even " + isEven(n));
   }else{
       System.out.print( "Given number is Odd " + isEven(n));
   }

  
  }
}