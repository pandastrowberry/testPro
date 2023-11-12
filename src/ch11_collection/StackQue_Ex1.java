package ch11_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQue_Ex1 {
		/*
		 * Stack 클래스 : LIFO
		 * 				Vector 클래스의 하위 클래스
		 *				void push(Object) : 객체를 stack에 저장 및 추가
		 * 				Object pop() : stack에서 객체를 꺼낸다/리턴/ stack에서 객체 제거
		 * 				Object peek() : stack에서 객체 조회
		 * Queue 인터페이스 : FIFO
		 * 				  LinkedList 클래스가 구현
		 * 				  void push(Object) : 객체를 stack에 저장 및 추가
		 * 				  Object pop() : Queue에서 객체를 꺼낸다/리턴/ Queue에서 객체 제거
		 * 				  Object peek() : Queue에서 객체 조회
		 * 
		 * LinkedList : Queue, List 인터페이스 모두 구현	 
		 * */
		
		String cars[] = {"소나타", "그랜저", "SM5", "K5"};
		Stack<String> stack = new Stack<String>() ;{
		for(String s : cars) {
			stack.push(s);
			System.out.println("===============");
			System.out.println("스택에 저장된 객체의 개수 : " + stack.size() + "->" + stack);
			System.out.println(stack.peek() + " : peek");
			System.out.println("스택에 저장된 객체의 개수 : " + stack.size() + "->" + stack);
			System.out.println(stack.pop() + " : stack");
			System.out.println("스택에 저장된 객체의 개수 : " + stack.size() + "->" + stack);
			
			Queue<String> queue = new LinkedList<String>();
			for (String s : cars) {
				queue.offer(s);
				System.out.println("큐에 저장된 객체의 개수 : " + queue.size() + "->" + queue);
				System.out.println(queue.offer() + " : offer");
				System.out.println("큐에 저장된 객체의 개수 : " + stack.size() + "->" + queue);
				System.out.println(queue.poll() + " : pull");
				System.out.println("스택에 저장된 객체의 개수 : " + stack.size() + "->" + queue);
			}
			
		}
	}
}
