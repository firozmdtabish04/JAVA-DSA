class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;  
    }
}

public class insertAtBeginning {
    // Function for insert at beginning
    public static Node insertBeg(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;

    }

    // Print Linked list
    public static void printLlist(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        System.out.println("Before Insert: ");
        printLlist(head);
        head = insertBeg(head, 5);
        System.out.println("After insert: ");
        printLlist(head);

    }
}
