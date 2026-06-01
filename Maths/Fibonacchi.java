import java.util.*;

class Fibonacci{
  
  static int fibb(int n){

    if(n == 0){
      return 0;
    }

    if(n == 1){
      return 1;
    }

    return fibb(n - 1) + fibb(n - 2);
  }

  public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Nummber :");
   int n = sc.nextInt();
   
   System.out.print("Fibonacchi Series :");
   for(int i = 0; i < n ; i++){

     System.out.print(fibb(i) + " ");

   }

  }


}