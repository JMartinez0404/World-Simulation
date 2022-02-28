package com.welcome;

public class Support {
    public static int[] intRange(int start, int end) {
        int[] rangeArray = new int[(end-start)];
            for (int i = 0; i < end - start; i++)
                rangeArray[i] = start + i;

        return rangeArray;
    }

    public static int[] intRange(int start, int end, int step) {
        int[] rangeArray = new int[(end-start)/step];

        for (int i = 0; i < (end-start)/step; i++)
            rangeArray[i] = start + (step * i);

        return rangeArray;
    }
}
