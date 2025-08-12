package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JAVA");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("객체수:" + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		
		for(int a = 0; a < list.size(); a++) {
			String str = list.get(a);
			System.out.println(a + ":" + str);
		}
		System.out.println();
		
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int a = 0; a < list.size(); a++) {
			String str = list.get(a);
			System.out.println(a + ":" + str);
		}
	}

}
