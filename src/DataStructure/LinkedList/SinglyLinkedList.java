package DataStructure.LinkedList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

// Linked list class
public class SinglyLinkedList implements Iterable<Integer> { //整体
    Node head = null;// 头节点第一个index[0]



    /*
     * Node class
     * */
    private static class Node {


        public Node(int value, Node nextR) {
            this.value = value;
            this.nextR = nextR;
        }

        //  What a node contains ?
        int value;
        Node nextR; // reference to the next
    }

    // What we can do now, what function we have?
    // Function class

    // Extend LinkedList
    public  void addFirst (int value){
        //CASE 1:　the list　is empty, the list is currently empty (head == null)
        if(head == null){
            // Create a single node whose nextR is null,
            // and make head point to it.
            head = new Node(value,null);

            // Case 2: the list already has ≥1 nodes
        }else {
            // Create a new node whose nextR points to the
            // current head (i.e. the old first node),
            // then update head to this new node.

            var second_Node = new Node(value, head); // 2st Node, point to the head, because head  hold the reference of the 1st node, tricky
            head = second_Node;
            // done
        }

    }


    // Loop through the LinkedList
    public void loop(){
        // how ?
        // 1. Creat pointer
        Node p;
        // 2. pointer should point to where at first ?　
        p = head; // the head
        // 3. A while loop will walk through the whole linkedList
        while (p != null){ // make sure every time we still have one more node to point
            System.out.println(p.value); // show node value
            // then move next
            p = p.nextR;
            // done
        }

    }

    private Node findLast(){
        Node p;
        // 1. use for loo to go through linkedlist, how ?
        for(p = head; p.nextR != null; p = p.nextR){ // we make pointer p, keep going as long as the next node exists，
            // if p reach the second-to-last node, p.nextR is the last Node, which
            // is the Node we want to find, then p = p.nextR, moving one more step further,
            // now p is the last Node, and apparently p.nextR right now becomes null, Loop terminated
            continue;
        }
        return p; // right now the p is the last node
    }

    public void addLast(int value){
        Node last;
        last = findLast();

        if (last == null){
            addFirst(value);
            return;
        }

        // 2. we make sure reference part inside last Node points to the newly added Node
        last.nextR = new Node(value, null);
        // done
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<>() {
            private Node current = head; // start from head

            // if current is not null, means we still have next Node element

            // if we’re currently on a real node (gpt)
            @Override
            public boolean hasNext() {
                return current != null;
            }

            // retrieve the current node's value, then push 'current' to the next node position

            // returns the node’s value and moves to the next node (gpt)
            @Override
            public Integer next() {
                int value = current.value;
                current = current.nextR;// push to next
                return value;
            }


        };

    }

    // Get !! node value according to index
    // we first return the node we found based on its index, why? step by step
    private Node findNode(int index){
        int i = 0;
        Node p;

        for (p = head; p != null; p = p.nextR, i++){
            if (index == i){
                return p;
            }else {
                continue;
            }
        }
        // if   not found the index after the for loop
        return null;
    }

    // return Node value
    public int get(int index){
        Node node = findNode(index);
        if(node == null){
            throw new IllegalArgumentException(String.format("Index [%d] is too big", index));
        }
        System.out.println(node.value);
        return node.value;
    }



}
