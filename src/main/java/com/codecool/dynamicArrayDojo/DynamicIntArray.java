package com.codecool.dynamicArrayDojo;

import java.util.Arrays;

// put your code here!
public class DynamicIntArray {

    private int[] intArray = new int[0];


    public DynamicIntArray() {

    }

    public DynamicIntArray(int length) {
        this.intArray = new int[length];
    }


    public void add(int newElement) {
        int[] updatedArray = new int[intArray.length + 1];
        for (int i = 0; i < intArray.length; i++) {
            updatedArray[i] = intArray[i];
        }

        updatedArray[intArray.length] = newElement;

        intArray = updatedArray;
    }

    public void remove(int elementToRemove) {
        int[] updatedArray = new int[intArray.length - 1];
        int elementToRemoveFound = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == elementToRemove) {
                elementToRemoveFound++;
            }
            else {
                updatedArray[i - elementToRemoveFound] = intArray[i];
            }
        }
        intArray = updatedArray;
    }

    public void insert(int position, int value) {
        int[] updatedArray = new int[intArray.length + 1];

        if (position > intArray.length - 1) {
            position = intArray.length;
        }

        for (int i = 0; i < position; i++) {
            updatedArray[i] = intArray[i];
        }
        updatedArray[position] = value;
        for (int i = position; i < intArray.length; i++) {
            updatedArray[i + 1] = intArray[i];
        }

        intArray = updatedArray;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < intArray.length; i++) {
            result += " " + intArray[i];
        }

        return result;
    }

}
