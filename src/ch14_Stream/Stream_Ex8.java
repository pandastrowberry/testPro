package ch14_Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stream_Ex8 {
	public static void main(String[] args) throws FileNotFoundException {
		//Stream<Product>
		Scanner sc;
		String carname = "아반테";
		int con = 1;
		sc = new Scanner(new File("src/ch14_Stream/product.txt"));
		sc.tokens().map(s -> new Product(s)).filter(s -> s.getCarname().equals(carname) &&s.getCon() == con).forEach(s -> System.out.println(s));
	}
}
class Product {
	int mon;
	int con;
	String carname;
	int qty;
	String remark;

	public Product(String line) {
		String[] str = line.split(",");
		this.mon = Integer.parseInt(str[0]);
		this.con = Integer.parseInt(str[1]);
		this.carname = str[2];
		this.qty = Integer.parseInt(str[3]);
		if (str.length == 5)
			this.remark = str[4];
		else
			this.remark = "";
	}

	public int getMon() {
		return mon;
	}

	public void setMon(int mon) {
		this.mon = mon;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}