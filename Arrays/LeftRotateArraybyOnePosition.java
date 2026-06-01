import java.util.*;

class LeftRotateArraybyOnePosition{

static int[] leftRotateArrayByOnePosition(int [] nums, int n){

  int temp = nums[0];

  for(int i = 0; i < n - 1; i++){

    nums[i] = nums[i + 1];
  }

  nums[n - 1] = temp;

  return nums;
}
  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter size :");
  int n = sc.nextInt();
  int [] nums = new int[n];
  System.out.print("Before :");
  for(int i = 0; i < n; i++){
    nums[i] = sc.nextInt();
  }

  leftRotateArrayByOnePosition(nums, n);

  System.out.print("After :");
  for(int i = 0 ;i < n; i++){
    System.out.print(nums[i] + " ");
  }
  }
}