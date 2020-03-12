package com.sleep.codewars;

public class Main {
    public static void main(String[] args) {
        //0 1 2 3 4
        int i = transformPosition(3, -7);
        System.out.println(i);
    }

    private static int transformPosition(int currentPosition, int offset) {
        final int itemCount = getItemCount();
        final int realPosition = (currentPosition + offset) % itemCount;
        if (realPosition >= 0) return realPosition;
        return itemCount + realPosition;
    }

    private static int getItemCount(){return 5;}
}
