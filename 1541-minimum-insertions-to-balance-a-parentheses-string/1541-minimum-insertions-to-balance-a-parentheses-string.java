
class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int open = 0;
        int result = 0;
        int i = 0;

        while (i < n) {

            if (s.charAt(i) == '(') {
                open++;
                i++;
            } else {

                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    i += 2;
                } else {
                    result++;
                    i++;
                }

                if (open > 0) {
                    open--;
                } else {
                    result++;
                }
            }
        }

        return result + 2 * open;
    }
}
