// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        // Dummy node to serve as the head of the sorted list
        ListNode dummy = new ListNode(0);
        ListNode current = head;

        while (current != null) {
            // Store the next node to process
            ListNode nextNode = current.next;

            // Find the correct position to insert the current node in the sorted list
            ListNode prev = dummy;
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }

            // Insert the current node into the sorted list
            current.next = prev.next;
            prev.next = current;

            // Move to the next node in the original list
            current = nextNode;
        }

        // The sorted list starts from the next of the dummy node
        return dummy.next;
    }

    // Helper function to convert an array to a linked list
    public ListNode arrayToList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper function to convert a linked list to an array
    public int[] listToArray(ListNode head) {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }

        int[] arr = new int[count];
        current = head;
        int index = 0;
        while (current != null) {
            arr[index++] = current.val;
            current = current.next;
        }
        return arr;
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        InsertionSortList sorter = new InsertionSortList();
        int[] input = {4, 2, 1, 3};
        ListNode head = sorter.arrayToList(input);
        ListNode sortedHead = sorter.insertionSortList(head);
        int[] sortedArray = sorter.listToArray(sortedHead);

        // Print the sorted array
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        // Output: 1 2 3 4
    }
}