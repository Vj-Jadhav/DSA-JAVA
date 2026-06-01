import java.util.*;

class CheckArmStrong{
  
static boolean isArmStrong(int n){
    int sum = 0;
    int original = n;
    while(n != 0){
    int digit = n % 10;
    n = n/10;
    sum += digit * digit * digit;
   }
   return sum == original;
  } 

  public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter ther Number :");
   int n = sc.nextInt();

   if(isArmStrong(n)){
    System.out.print("The Number is ArmStrong");
   }else{
    System.out.print("The Number is Not ArmStrong");
   }
  }
}