package Collection.List.LinkedList;
class Node {
    int data;  
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null; 
    }
}
class LinkedList {
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
        }
    }

    public void printList() {
        Node current = head; 
        while (current != null) {
            System.out.print(current.data + " -> "); 
            current = current.next; 
        }
        System.out.println("null"); 
    }
}

public class Singly_Linked_List {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); 

        list.add(10);  
        list.add(20);
        list.add(30);

        list.printList();  
    }  
}
