package ch11_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Ex3 {
	static HashMap<String, Map<String, String>> phoneBook = new HashMap<>();
	//PhoneBook : key groupName - value Map<name, tel>
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-3333");
		addPhoneNo("친구", "김자바", "010-333-3333");
		addPhoneNo("회사", "김대리", "010-444-4444");
		addPhoneNo("회사", "김대리", "010-555-5555");
		addPhoneNo("회사", "박대리", "010-666-6666");
		addPhoneNo("회사", "이과장", "010-777-7777");
		addPhoneNo("세탁", "010-888-8888");
		System.out.println(phoneBook);
		printList();
	}
 	
	public static void printList() {
		//phoneBook.keySet(), phoneBook.entrySet()
		Set<String> phoneKey = phoneBook.keySet();
		for (String groupName : phoneKey) {
			System.out.println("*" + groupName + "*");
			Map<String, String> subMap = phoneBook.get(groupName);
			for (String tel : subMap.keySet()) {
				System.out.println(subMap.get(tel) + " : " + tel);
			}
			
			//System.out.println("======================");
			
			/*
			 * for (Entry<String, String> en : subMap.entrySet()) {
			 * System.out.println(en.getValue() + " : " + en.getKey()); }
			 */
			}
		
		System.out.println("======================");
		
		for (Entry<String, Map<String, String>> eg : phoneBook.entrySet()) {
			System.out.println("*" + eg.getKey() + "*");
			Map<String, String> subMap = eg.getValue();
			for (String tel : subMap.keySet()) {
				System.out.println(subMap.get(tel) + " : " + tel);
			}
			
			System.out.println("======================");
			
			/*
			 * for (Entry<String, String> en : subMap.entrySet()) {
			 * System.out.println(en.getValue() + " : " + en.getKey()); }
			 */		
			}
		
		
		//System.out.println("======================");
		
		Set<Entry<String, Map<String, String>>> eset = phoneBook.entrySet();
		for (String groupName : phoneKey) {
			System.out.println("*" + groupName + "*");
			Map<String, String> subMap = phoneBook.get(groupName);
			for (String tel : subMap.keySet()) {
				System.out.println(subMap.get(tel) + " : " + tel);
			}
		}
		
	}
	
 	public static void addPhoneNo(String groupName, String name, String tel) { //오버로딩
 		addGroup(groupName);
 		HashMap<String, String> group = (HashMap)phoneBook.get(groupName);
 		group.put(tel, name);
 	}
 	
 	public static void addPhoneNo(String name, String tel) {
 		addPhoneNo("기타", name, tel);
 	}
 	
 	public static void addGroup(String groupName) {
 		if(!phoneBook.containsKey(groupName))
 			phoneBook.put(groupName, new HashMap<String, String>());
 	}
}