package com.company;

public class CustomArray {
    private final int[] arr;

    CustomArray(int size) {
        this.arr = new int[size];
        setArray();
    }

    private void setArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
    }

    public int arrayLength(){
        return arr.length;
    }

    public int elementAtIndex(int index){
        return arr[index];
    }


}
