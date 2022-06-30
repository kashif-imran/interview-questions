package linkedlist;

public class MyLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    /*
     1. Initialize three pointers prev as NULL, curr as head and next as NULL.
     2. Iterate through the linked list. In loop, do following.
        Before changing next of current, (Most important step)
        store next node
        next = curr->next

         Now change next of current
         This is where actual reversing happens
            curr->next = prev

         Move prev and curr one step forward
                    prev = curr
         curr = next
    */

    // 1 -> 2 -> 3 -> null
    Node reverseIterative(Node node) {
       Node prev = null;
       Node curr = node; // 1
       Node next = null;

       while (curr != null) {
           next = curr.next;  //next = 2
           curr.next = prev; // null <- 1
           prev = curr; // 1
           curr = next; // 2          
       }
       //Iteration 1:  null <-1 2 ->3->null   next = 2, curr.next = null, prev=1, curr=2
        //Iteration 2: null <- 1 <- 2 3->null next = 3, curr.next = 1, prev= 2, curr = 3 
        //Iteration 3: null <- 1 <-2 <-3      next = null, curr.next=2, prev=3, curr = null
       node = prev;
       return node;
    }

    void printList(Node node) {
        while(node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);

        System.out.println("The given list is:");
        list.printList(head);
        head = list.reverseIterative(head);
        System.out.println("");
        System.out.println("Reverse linked list is");
        list.printList(head);
    }
}
