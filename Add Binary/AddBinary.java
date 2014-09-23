public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = a.length()-1, j = b.length()-1; i >= 0 || j >= 0; i--, j--) {
            // '1' - '0' = 1
            // '0' - '0' = 0
            int ai = i >= 0 ? a.charAt(i)-'0' : 0;
            int bj = j >= 0 ? b.charAt(j)-'0' : 0;
            int val = (ai + bj + carry) % 2;
            carry = (ai + bj + carry) / 2;
            sb.insert(0, val);
        }
        if (carry == 1) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }
}