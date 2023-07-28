package AdvanchedLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack {
    private Object[] array;

    public Stack() {
    }

    public Stack(Object[] array) {
        this.array = array.clone();
    }

    public void setArray(Object[] array) {
        this.array = array.clone();
    }

    public Object[] getArray() {
        return array;
    }

    public void push(Object obj) {
        Object[] newArray = new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[newArray.length - 1] = obj;
        array = newArray;
    }

    public Object pop() {
        Object temp = array[array.length - 1];
        Object[] newArray = new Object[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, newArray.length);
        array = newArray;
        return temp;
    }

    public Object peek() {
        return array[array.length - 1];
    }

    @Override
    public String toString() {
        return "Stack{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
