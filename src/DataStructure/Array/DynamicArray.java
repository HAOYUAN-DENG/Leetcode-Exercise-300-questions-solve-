package DataStructure.Array;

import java.util.Iterator;
import java.util.function.Consumer;

public class DynamicArray  {

    private int size=0; // 逻辑大小 Logic capacity -- real size, 1,2,3,,,etc
    private int capacity=8;// 容量 //
    private int[] array = {}; //new int[capacity];


    public void addLast(int element) {
        checkAndGrowCapacity();
        array[size] = element;
        size++;
    }

    public void add(int index, int element) {
        checkAndGrowCapacity();

        // Append element logic
        if (index >= 0 && index < size) {
            System.arraycopy(array, index, array, index+1, size-index);
            array[index] = element;
            size++;
        } else if (index == size) {// 同等 allLast 情况  same as addLast method logic
            array[size] = element;
            size++;
        }



    }

    private void checkAndGrowCapacity() {
        // capacity check
        if (size == 0){
            array = new int[capacity];
        }

        // Capacity check, if array is full then increase capacity ---> size = capacity
        if (size == capacity){
            // increase
            int halfVolume = capacity >> 1;
            capacity = capacity + halfVolume;
            int[]newArray = new int[capacity];
            System.arraycopy(array,0,newArray,0,size);
            array = newArray;

        }
    }


    public int get(int index) {
        return array[index];
    }

    public void foreach(Consumer<Integer> consumer){
        for (int i = 0; i < size; i++) {
           // System.out.println(i);
            consumer.accept(array[i]);

        }
    }


    public int remove(int index){
        int removedElement = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        size--;
        return removedElement;
    }



}
