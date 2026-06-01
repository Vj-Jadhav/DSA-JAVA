import java.util.*;

class MinInArray{

  static int minValues(int [] nums,int n){

    int Min = nums[0];

    for(int i = 1 ; i < n; i++){

        if(nums[i] < Min){
           Min = nums[i];
        }
    }

    return Min;
  }

  public static void main(String [] args){
  
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter Size of Array : ");
  int n = sc.nextInt();

  int[] nums = new int[n];
  System.out.println("Enter the numbers : ");
  for(int i = 0; i < n; i++){
    nums[i] = sc.nextInt();
  }

  System.out.print("Minimum in the Array : " + minValues(nums,n));

  }
}