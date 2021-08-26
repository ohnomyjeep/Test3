package com.max.idea;

public class Main {
    public static void main(String[] args) {
        int[] myList = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for(int b = 0; b < myList.length; b++) {
            if (myList[b] % 3 == 0) {
                System.out.println(myList[b]);
            }
        }
    }
}
