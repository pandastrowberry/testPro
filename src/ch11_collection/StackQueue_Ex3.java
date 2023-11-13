package ch11_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue_Ex3 {
	public static Stack<String> back = new Stack<String>();
	public static Stack<String> forward = new Stack<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		goURL("1. 네이트");
		goURL("2. 야후");
		goURL("3. 네이버");
		goURL("4. 다음");
		printStatus();
		goBack();
		System.out.println("= 뒤로가기 버튼을 누른 후=");
		printStatus();
		goBack();
		System.out.println("= 뒤로가기 버튼을 누른 후=");
		printStatus();
		goForward();
		System.out.println("= 앞으로 버튼을 누른 후=");
		printStatus();
		goURL("kic.com");
		System.out.println("= 새로운 주소로 이동 후=");
		printStatus();
	}
	
	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재화면은'" + back.peek() + "'입니다.");
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) 
			forward.clear();
	}
	
	public static void goBack() {
		if(!forward.empty())
			forward.push(back.pop());
	}
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	}
}
