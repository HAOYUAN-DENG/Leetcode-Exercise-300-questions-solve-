package DataStructure.Array;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class TestDynamicArray {

    @Test
    public  void test1(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.add(2,5);

        for (int i=0; i<5; i++ ){
            System.out.println(dynamicArray.get(i));
        }

    }

    @Test
    public  void test2(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);

        dynamicArray.foreach(element -> System.out.println(element) );
    }

    @Test
    @DisplayName("Test Remove")
    public void test3(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addLast(1);
        dynamicArray.addLast(2);
        dynamicArray.addLast(3);
        dynamicArray.addLast(4);
        dynamicArray.addLast(5);

        int removed = dynamicArray.remove(2);
        assertEquals(3, removed);
        System.out.println("--------------");



        dynamicArray.foreach(element -> System.out.println(element));
    }

    @Test
    @DisplayName("Test increase volume")
    public void test4(){
        DynamicArray dynamicArray = new DynamicArray();
        for (int i = 0; i < 9; i++) {
            dynamicArray.addLast(i+1);
        }

        dynamicArray.foreach(element -> System.out.println(element));

    }

}
