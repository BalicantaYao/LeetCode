/**
 * Copyright (c) Lab317, Inc All Rights Reserved.
 */
package find.duplicated;

/**
 * The <code> FindDuplicateNumber </code>
 *
 * @author Balicanta.Yao
 * @version 1.0, Created at 2015/11/17.
 */
public class Solution {

    public static int findDuplicate(int[] nums) {

        // Get medium number from array size;
        int compareBase = (1 + (nums.length - 1))/2 ;

        // Decision it's left bias tree or right bias tree
        int bias = 0;
        for(int i = 0; i < nums.length;i++){
            if(compareBase < nums[i]){
                bias++;
            } else if(compareBase > nums[i]){
                bias--;
            }
        }

        // Find the repeated number
        // if it's right bias tree and increase to compare
        // else decrease to compare
        while(true){
            int repeatedCount = 0;
            for(int i = 0 ; i < nums.length;i++){
                if(compareBase == nums[i]){
                    repeatedCount++;
                    if(repeatedCount > 1){
                        return nums[i];
                    }
                }
            }
            if(bias > 0 ){
                compareBase++;
            } else {
                compareBase--;
            }
        }
    }

    public static void main (String args[]){

        int[] testFixture = {2,5,9,6,9,3,8,9,7,1}; // ---> should 15 (16) mid 31
        System.out.println(findDuplicate(testFixture));
    }
}
