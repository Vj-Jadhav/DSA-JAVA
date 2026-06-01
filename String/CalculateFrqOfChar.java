import java.util.*;

class CalculateFrqOfChar{

   static HashMap<Character, Integer> frequencyCount(String str) {

        HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : str.toCharArray()) {

            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        return hm;

   }

  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the String : ");
  String str = sc.nextLine();

        HashMap<Character, Integer> result = frequencyCount(str);

        System.out.println("Frequency of characters : ");

        for (char ch : result.keySet()) {
            System.out.println(ch + " -> " + result.get(ch));
        }
  }
}