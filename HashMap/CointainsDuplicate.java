import java.util.*;
class ContainsDuplicate{
 
 static boolean isDuplicate(int[] arr, int n){

  HashSet<Integer> hs = new HashSet<>();

  for(int num : arr){

    if(hs.contains(num)){
      return true;
    }

      hs.add(num);
    

  }
  return false;

 }


  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter size : ");
  int n = sc.nextInt();

  int [] arr = new int[n];
 System.out.print("Enter Elements : ");
  for(int i = 0; i < n; i++){

    arr[i] = sc.nextInt();
  }
 
  System.out.print(isDuplicate(arr,n));
}

}