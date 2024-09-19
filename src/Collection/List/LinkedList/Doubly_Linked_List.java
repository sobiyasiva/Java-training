package Collection.List.LinkedList;
class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList {
    Node head; 
    public void add(int data) {
        Node newNode = new Node(data); 

        if (head == null) {  
            head = newNode;
        } else {
            Node current = head;  
            while (current.next != null) {  
                current = current.next;
            }
            current.next = newNode;  
            newNode.prev = current;  
        }
    }
    public void printForward() {
        Node current = head;  
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next; 
        }
        System.out.println("null");
    }
    public void printBackward() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;  
        }
        System.out.println("null");
    }
}

public class Doubly_Linked_List {
     public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();  

        list.add(10);  
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List printed forward:");
        list.printForward();  

        System.out.println("List printed backward:");
        list.printBackward(); 
    }
}
