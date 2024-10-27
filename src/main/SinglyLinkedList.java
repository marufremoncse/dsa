package main;

public class SinglyLinkedList {
	ListNode head;

	private static class ListNode {
		int data;
		ListNode next;

		public ListNode(int data) {
			this.data = data;
			next = null;
		}
	}

	private static void printNodes(ListNode node) {

		while (node != null) {
			System.out.print(node.data + " -> ");
			node = node.next;
		}
		System.out.println();
	}

	private static void countNodes(ListNode node) {
		int count = 0;
		while (node != null) {
			count++;
			node = node.next;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

		singlyLinkedList.head = new ListNode(10);
		ListNode second = new ListNode(12);
		ListNode third = new ListNode(1);
		ListNode forth = new ListNode(8);

		singlyLinkedList.head.next = second;
		second.next = third;
		third.next = forth;

		printNodes(singlyLinkedList.head);
		countNodes(singlyLinkedList.head);
	}
}
