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
//        // 2
//        int[] myIntArray = {1,2,3,2}; // -->  should 6 (8)    mid:2  --> 2
//        System.out.println(findDuplicate(myIntArray));
//
//        int[] myIntArray12 = {1,2,1,1}; // -->  should 6 (8)    mid:2  --> 2
//        System.out.println(findDuplicate(myIntArray12));
//
//        // 4 (-3)
//        int[] myIntArray2 = {4,2,3,1,4};// --> should 10 (14)  mid:3  --> 4
//
//        int[] myIntArray21 = {3,3,3,1,2};// --> should 10 (12) mid:3 --> 3
//        System.out.println(findDuplicate(myIntArray2));
//
//        // 1 (+3)
//        int[] myIntArray3 = {3,3,1,2,3,5}; // --> should 15 (20) mid:3 --> 5
//        System.out.println(findDuplicate(myIntArray3));
//
//        int[] myIntArray5 = {1,2,5,1,4,1}; // ---> should 15 (14) mid:3 -- > 1
//        System.out.println(findDuplicate(myIntArray5));

//        int[] myIntArray4 = {2,1,2,3,2,5}; // ---> should 15 (15) mid:3 --> 2
//        System.out.println(findDuplicate(myIntArray4));

        int[] myIntArray7 = {2,5,9,6,9,3,8,9,7,1}; // ---> should 15 (16) mid 31
        System.out.println(findDuplicate(myIntArray7));
    }
}
