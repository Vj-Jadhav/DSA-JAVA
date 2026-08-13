class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i : nums){

            hm.put(i,hm.getOrDefault(i,0) + 1);
        }

       for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {

            if(entry.getValue() == 2) {

            list.add(entry.getKey());

    }
}  
        return list;
    }
}