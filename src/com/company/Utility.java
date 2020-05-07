package com.company;

public class Utility {
    public static double alpha(int k, int N)
    {
        if (k == 0)
            return Math.sqrt((double) 1 / (double) N);
        else
            return Math.sqrt((double) 2 / (double) N);
    }
}
