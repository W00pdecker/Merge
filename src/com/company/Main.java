package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static int[] array = {5, 2, 4, 6, 1, 3, 2, 6};
    public static int[] temp = Arrays.copyOf(array, array.length);

    public static void main(String[] args) {


        Sort(array, 1, 8);

        System.out.println(Arrays.toString(array));


    }

    public static void Sort(int[] array, int firstIndex, int lastIndex) {
        if (firstIndex < lastIndex) {
            int q = (firstIndex + lastIndex) / 2;
            Sort(array, firstIndex, q);
            Sort(array, q + 1, lastIndex);
            Merge(array, firstIndex, q, lastIndex);
            System.out.println(1);
        }
    }

    public static void Merge(int[] array, int l, int q, int r) {
        int n1 = q - l + 1;
        int n2 = r - q;



        int L[] = new int[n1];
        int R[] = new int[n2];


        for (int i = 0; i < n1; i++)
            L[i] = array[l + i - 1];
        for (int j = 0; j < n2; j++)
            R[j] = array[q + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k - 1] = L[i];
                i++;
            } else {
                array[k - 1] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k-1] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k-1] = R[j];
            j++;
            k++;
        }




        }
    }
