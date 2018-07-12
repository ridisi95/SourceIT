package HW8AndHW11;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

	private int capacity;
	Map<Integer, Node> map = null;
	Node head;
	Node tail;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new HashMap();
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}

	public int get(int key) {
		if (!map.containsKey(key))
			return -1;
		moveToFront(map.get(key));
		return map.get(key).val;

	}

	public void put(int key, int value) {
		if (capacity == 0)
			return;
		if (map.containsKey(key)) {
			map.get(key).val = value;
			moveToFront(map.get(key));
		} else {
			freeSpace();
			Node n = new Node(key, value);
			map.put(key, n);
			addToTail(n);
		}
	}

	private void freeSpace() {
		if (map.size() == capacity) {
			Node toRemove = head.next;
			map.remove(head.next.key);
			Node next = toRemove.next;
			head.next = next;
			next.prev = head;
		}
	}

	private void moveToFront(Node newNode) {
		Node prev = newNode.prev;
		Node next = newNode.next;
		prev.next = next;
		next.prev = prev;
		addToTail(newNode);
	}

	private void addToTail(Node newNode) {
		Node prev = tail.prev;
		prev.next = newNode;
		newNode.prev = prev;
		tail.prev = newNode;
		newNode.next = tail;

	}

	class Node {
		int key;
		int val;
		Node prev;
		Node next;

		public Node(int key, int val) {
			this.key = key;
			this.val = val;
		}

		public Node() {
		}
	}


	public static void main(String[] args) {

		LRUCache lruCahe = new LRUCache(2);

		lruCahe.put(1, 10);
		lruCahe.put(2, 20);
		lruCahe.put(3, 30);

		System.out.println(lruCahe.get(2));

	}
}
