package ru.alex;

import java.util.Arrays;

public class App
{
    public static void main( String[] args ){
        int[] intArr = new int[] {1,1,2,3,1};

        System.out.println(Arrays.toString(removeDuplicates(intArr)));
    }

    public static int[] removeDuplicates(int[] nums) {
        int [] uniqueNums = new int[nums.length];
        int countUnique = 0;

        for (int num : nums) {
            if (!contains(uniqueNums, num)) {
                uniqueNums[countUnique] = num;
                countUnique++;
            }
        }

        int[] resultUniqueNums = new int[countUnique];
        System.arraycopy(uniqueNums, 0, resultUniqueNums, 0, countUnique);

        return resultUniqueNums;
    }

    public static boolean contains(int[] uniqueNums, int num) {
        for (int i : uniqueNums) {
            if (i == num) {
                return true;
            }
        }

        return false;
    }


}
