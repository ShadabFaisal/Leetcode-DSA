package StackAndQueue;

import java.util.Arrays;

public class LeetCode622MyCircularQueue {

	int[] q;
	int front = 0, rear = 0, size = 0;

	public LeetCode622MyCircularQueue(int k) {
		q = new int[k];
		Arrays.fill(q, -1);
	}

	public boolean enQueue(int value) {
		if (isFull())
			return false;
		if (isEmpty()) {
			rear = front = 0;
			q[rear] = value;
			size++;
			return true;
		}

		rear++;
		size++;
		rear = rear % q.length;
		q[rear] = value;
		return true;
	}

	public boolean deQueue() {
		if (isEmpty()) {
			return false;
		}
		q[front] = -1;
		size--;
		front++;
		front = front % q.length;
		return true;
	}

	public int Front() {
		return q[front];
	}

	public int Rear() {
		return q[rear];
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == q.length;
	}

	public static void main(String[] args) {
		LeetCode622MyCircularQueue cq=new LeetCode622MyCircularQueue(5);
		System.out.println(cq.enQueue(12));
		System.out.println(cq.enQueue(12));
		System.out.println(cq.enQueue(12));
		System.out.println(cq.enQueue(12));
		System.out.println(cq.enQueue(12));
		System.out.println(cq.enQueue(12));
		
		System.out.println(cq.Rear());
		System.out.println(cq.isEmpty());
		

	}

}
