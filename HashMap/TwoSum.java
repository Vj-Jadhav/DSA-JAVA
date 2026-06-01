import java.util.*;

class TwoSum{

  static int [] twoSum(int [] arr, int n , int target){

    HashMap<Integer,Integer> hm = new HashMap<>();

    for(int i = 0; i < n ; i++){

      int complement = target - arr[i];

      if(hm.containsKey(complement)){

        return new int[]{hm.get(complement),i};
      }else{

        hm.put(arr[i],i);
      }
    }
    return new int[]{-1,-1};
  }

  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter size : ");
  int n = sc.nextInt();

  int [] arr = new int[n];
  System.out.print("Enter Elements : ");
  for(int i = 0; i < n ; i++){

    arr[i] = sc.nextInt();
  }
  System.out.print("Enter Target : ");
  int target = sc.nextInt();

  int [] result = twoSum(arr,n,target);

 for(int i = 0; i < result.length; i++){
   
   System.out.print(result[i] + " ");
 }
  }
}