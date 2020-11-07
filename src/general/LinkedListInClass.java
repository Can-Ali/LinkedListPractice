package general;

import java.util.NoSuchElementException;

public class LinkedListInClass {

    public class Node {
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
            this.next=null;
        }
    }
    public Node first;
    public Node last;
    public int size;
    public LinkedListInClass() {
        this.first=null;
        this.last=null;
        this.size=0;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void addLast(int item) {
        var node = new Node(item);
        System.out.println("adding item: "+item);
        if (isEmpty())
            first = last = node;
        else {
            last.next=node;
            last = node;
        }
        size++;
    }
    public void deleteLast(){
        if (isEmpty()) throw new NoSuchElementException();
        System.out.println("Deleting last :"+ last.value);
        if (first==last) first=last=null;
        else {
            var previous = first;
            var current= first;
            while (current.next !=null){
                previous=current;
                current=current.next;
            }
            previous.next=null;
            last=previous;
        }
    }
    public void printLinkedList() {
        if (isEmpty())
            throw new IllegalStateException();
        var current = first;
        while (current!= null) {
            System.out.println("Value :  "+current.value);
            current=current.next;
        }
    }

}
