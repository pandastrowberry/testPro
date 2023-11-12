package ch11_collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * TreeSet
		 * Set > SortedSet > 구현 클래스
		 * Set : 중복x : 동등 객체 equals(), hashCode()
		 * SortedSet : 정렬됨
		 * 
		 * => 사용자정의 크래스는 반드시 Comparable 인터페이스를 구현한 클래스만 TreeSet 요소에 저장 가능
		 * 
		 * 정렬 관련 인터페이스  
		 * - Comparator : 기본 정렬 방식을 추가로 변경할 때 사용 
		 * - Comparable : 기본 정렬 방식 지정시 사용
		 * */
		SortedSet<String> set = new TreeSet<>();
		//set.iterator(); Collection에 있는지
		set = new TreeSet<> (new Descending());
		set = new TreeSet<> (Comparator.reverseOrder());
		String from = "bat";
		String to = "d";
		set.add("abc");set.add("alien");set.add("bat");set.add("azz");
	    set.add("car");set.add("Car");set.add("disc");set.add("dance");
	    System.out.println(set);  
	    System.out.println("from : " + from + ", to : " + to);
	    //System.out.println(set.subSet(from, to));
	    System.out.println(set.subSet(to, from));
	    System.out.println("from : " + from + ", to : " + "zzzz");
	    //System.out.println(set.subSet(from, to + "zzzz"));
	    System.out.println(set.subSet(to + "zzzz", from ));
	}
}

class Descending implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2) * -1;
	}
}
