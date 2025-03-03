public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List:");
        list.printList();

        // Removing element 3 from the list
        list.remove(3);
        System.out.println("After Removing 3:");
        list.printList();

        // Finding and displaying the middle element
        System.out.println("Middle Element: " + list.findMiddle());

        // Reversing the linked list
        list.reverse();
        System.out.println("Reversed List:");
        list.printList();
    }
}
