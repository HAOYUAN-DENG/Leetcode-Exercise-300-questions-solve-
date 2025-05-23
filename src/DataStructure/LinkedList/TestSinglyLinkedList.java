package DataStructure.LinkedList;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestSinglyLinkedList {

    @Test
    public void test1(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);


        // assertArrayEquals(new int[]{4,3,2,1}, list.loop().stream().mapToInt(Integer::intValue).toArray());
        list.loop();
    }

    @Test
    public void test2(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        //  list.loop2(value-> System.out.println(value));
    }

    @Test
    public void test3(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);


        list.loop();
        Assertions.assertIterableEquals(List.of(1,2,3,4),list);

    }

    @Test
    public void test4(){
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.loop();
        System.out.println();
        list.get(2);

    }


}
