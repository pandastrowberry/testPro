package ch11_collection;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ExCollection05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		Scanner scan = new Scanner(new File("src/ch11_colletion/product.txt"));
		while(scan.hasNext()) {
			String line = scan.next();
			Product p = new Product(line);
			tlist.add(p);
			System.out.println(p);
		}
		
		System.out.println("1) 월별 리스트");
		Iterator<Product> it = tlist.iterator();
		Map<Integer, List<Product>> map1 = new HashMap<>();
		while(it.hasNext()) {
			Product p = it.next();
			if(!map1.containsKey(p.mon))
				map1.put(p.mon, new ArrayList());
		}
		System.out.println(map1.keySet());
		for (Integer m : map1.keySet()) {
			System.out.println(m + "월=========");
			for (Product p : map1.get(m)) {
				System.out.println(p);
			}
		}
	}
}

class Product {
	int mon, con, qty;
	String carname;
	String remark;
	public Product(String line) {
		String[] str = line.split(" ");
		this.mon = Integer.parseInt(str[0]);
		this.con = Integer.parseInt(str[1]);
		this.carname = str[2];
		this.qty = Integer.parseInt(str[3]);
		if(str.length == 5);
		this.remark = str[4];
		else
		
	
	}
}
