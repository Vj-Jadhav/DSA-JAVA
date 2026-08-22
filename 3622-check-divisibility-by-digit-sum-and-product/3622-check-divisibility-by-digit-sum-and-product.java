class Solution {
    public boolean checkDivisibility(int n) {
        
        int sum = 0;

        int prod = 1;

        int temp = n;

        while(temp > 0){

            int digit = temp%10;
             temp = temp/10;

            sum += digit ;

            prod *= digit;

        }
        
            if(n%(sum + prod) == 0){

                return true;
            }
        return false;
    }
}