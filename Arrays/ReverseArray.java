import java.util.*;

class ReverseArray{

static int[] reveredArray(int [] nums, int n){

  int i = 0;
  int j = n - 1;

  while(i < j){

    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
    j--;
    i++;
  }
  return nums;
}
  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the Size : ");
  int n = sc.nextInt();
  int[] nums = new int[n];
  
  System.out.print("Before Reversed : ");
  for(int i = 0; i < n; i++){

    nums[i] = sc.nextInt();
    
  }

  reveredArray(nums, n);
  System.out.print("After Reversed : ");
  for(int i = 0; i < n; i++){

    System.out.print( nums[i] + " ");
  }

  }
}