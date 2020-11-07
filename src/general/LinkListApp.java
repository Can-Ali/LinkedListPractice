package general;

public class LinkListApp {

    public static void main(String[] args) {

        var myLinkedList= new LinkedListInClass();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.printLinkedList();
        System.out.println();
        myLinkedList.deleteLast();
        System.out.println();
        myLinkedList.printLinkedList();

    }

}
