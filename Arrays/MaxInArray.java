import java.util.*;

class MaxInArray{

  static int maxValues(int [] nums,int n){

    int Max = nums[0];

    for(int i = 1 ; i < n; i++){

        if(nums[i] > Max){
           Max = nums[i];
        }
    }

    return Max;
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

  System.out.print("Maximum in the Array : " + maxValues(nums,n));

  }
}