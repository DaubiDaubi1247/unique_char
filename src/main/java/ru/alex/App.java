package ru.alex;

import java.util.Arrays;

public class App
{
    public static void main( String[] args ){
        int[] intArr = new int[] {1,1,2,3,3,1};

        System.out.println(Arrays.toString(removeDuplicate(intArr)));
    }

    private static int[] removeDuplicate(int[] intArr) {
        return Arrays.stream(intArr)
                .distinct()
                .toArray();
    }


}
