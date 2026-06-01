import java.util.*;
class InvertedHalfPyramid{

  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter size : ");
  int n = sc.nextInt();

  for(int i = 0 ; i < n ; i++){
    
    for(int j = n; j > i; j--){
       
       System.out.print("*" + " ");
    }
    System.out.println();
  }

  }
}