/**
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package add.digits;

/**
 * The <code> Solution </code>
 *
 * Given num = 38, the process is like:
 * 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 *
 * @author Balicanta.Yao
 * @version 1.0, Created at 2016/2/25.
 */
public class Solution {

    public int addDigits(int num) {

        String digitalStr = String.valueOf(num);
        int numberOfDigits = digitalStr.length();

        if(numberOfDigits > 1) {
            int sum = 0;
            for(int i = 0 ; i < numberOfDigits; i++){
                char digitalChar = digitalStr.charAt(i);
                sum += digitalChar - 48;
            }
            return addDigits(sum);
        } else {
            return num;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.addDigits(10);
        System.out.println(i);
    }
}
