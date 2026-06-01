import java.util.*;

class MoveAllZeroesToEnd{

  static int[] movedZeroes(int [] nums, int n){
  
  int j = 0;

   for(int i = 0; i < n; i++){

    if(nums[i] != 0){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        j++;
    }
    
   }

  return nums;
       
  }

  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the size : ");
  int n = sc.nextInt();
  int [] nums = new int[n];
 System.out.print("Zeroes Before Moved : ");
  for(int i = 0; i < n; i++){
      
      nums[i] = sc.nextInt();

  }

  movedZeroes(nums,n);
  System.out.print("After Moved Zeroes : ");
  for(int i = 0; i < n; i++){

    System.out.print( nums[i] + " ");
  }
   
  }
}