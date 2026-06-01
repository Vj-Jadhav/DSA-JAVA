import java.util.*;

class SecondLargest{
 static int secondLargest(int [] nums ,int n){
  
  int largest = -1;
  int secondlargest = -1;

  for(int i = 0 ; i < n; i++){

    if(nums[i] > largest){ 
      largest = nums[i];
    }

  }

  for(int i = 0; i < n; i++){
    
    if(nums[i] != largest && nums[i] > secondlargest){
      secondlargest = nums[i];
    }
     
  }

  return secondlargest;
  
  }

  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of Array : ");
    int n = sc.nextInt();
    int [] nums = new int[n];
    
    System.out.print("Enter the Numbers : ");
    for(int i = 0; i < n; i++){
      nums[i] = sc.nextInt();
    }

    System.out.print("Second Largest Number is : " + secondLargest(nums , n));
  }
}