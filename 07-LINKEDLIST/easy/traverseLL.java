
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class traverseLL {
    public static void traverse(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null"); 
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        traverse(head);
    }
}
