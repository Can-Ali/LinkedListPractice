package week02_linkedList;

public class LinkedListApp {
    public static void main(String[] args) {
        var myLinkedList= new MyLinkedList();
        for(int j=1; j<=10;j++) myLinkedList.addLast(j);
        System.out.println("Initial Linked List");
        myLinkedList.printLinkedList();
        //System.out.println("Linked List after reverse in one pass");
        //myLinkedList.reverse();
        //myLinkedList.printLinkedList();
        //System.out.println(myLinkedList.getKthFromTheEnd(5));
        myLinkedList.printMiddle();
    }
}