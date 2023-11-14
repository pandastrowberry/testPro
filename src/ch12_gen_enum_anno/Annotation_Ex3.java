package ch12_gen_enum_anno;

import java.util.ArrayList;

public class Annotation_Ex3 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		NewClass nc = new NewClass();
		nc.oldField = 10;
		System.out.println(nc.getOldField());
		@SuppressWarnings("unchecked")
		ArrayList<NewClass> list = new ArrayList();
		list.add(nc);
	}
}

class NewClass {
	int newField;
	int getNewField() {
		return newField;
	}
	@Deprecated
	int oldField;
	@Deprecated
	int getOldField() {
		return oldField;
	}
}