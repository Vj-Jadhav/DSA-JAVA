import java.util.*;

class CheckArraySorted{

  static boolean isSorted(int [] nums, int n){

    for(int i = 1; i < n; i++){

      if(nums[i] < nums[i - 1]){

        return false;
      }
    }

    return true;
  }

  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size : ");
    int n = sc.nextInt();
    int [] nums = new int[n];
    System.out.println("Enter the Number : ");
    for(int i = 0; i < n ; i++){

      nums[i] = sc.nextInt();
    }
   if(isSorted(nums,n)){
    System.out.print("The given array is sorted ");
   }else{
    System.out.print("The given array is not sorted ");
   }
  }
}