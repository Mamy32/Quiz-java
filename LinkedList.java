public class LinkedList {
    private Node head;

    // Inner class Node representing each element in the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a new node at the end of the list
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to remove the first occurrence of a given value
    public void remove(int value) {
        if (head == null) return;
        if (head.data == value) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Method to find the middle element of the linked list
    public int findMiddle() {
        if (head == null) return -1;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    // Method to reverse the linked list in-place
    public void reverse() {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
