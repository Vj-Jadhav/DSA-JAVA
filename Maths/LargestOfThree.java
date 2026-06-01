import java.util.*;

class LargestOfThree{

  static int largestThree(int n1,int n2,int n3){
  
  if(n1 >= n2 && n1 >= n3){

    return n1;
  }else if(n2 >= n1 && n2 >= n3){

    return n2;
  }
   return n3;
  } 

  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Num1 : ");
  int n1 = sc.nextInt();

  System.out.print("Enter Num2 : ");
  int n2 = sc.nextInt();

  System.out.print("Enter Num3 : ");
  int n3 = sc.nextInt();

  System.out.print("Largest Number Among Three is : " + largestThree(n1,n2,n3));
  }
}