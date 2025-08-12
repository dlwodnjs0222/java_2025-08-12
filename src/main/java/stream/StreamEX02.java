package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	
	public String getName() {
		return name;
	}


	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
}

public class StreamEX02 {
	public static void main(String[] args) {
		List<Student> list1 = new ArrayList<>();
		list1.add(new Student("홍길동", 83));
		list1.add(new Student("엄준식", 54));
		list1.add(new Student("김하나", 72));
		
		List<Student> list2 = Arrays.asList(new Student("홍길동", 83), 
				new Student("엄준식", 54), 
				new Student("김하나", 72));
//		for(Student stu : list2) {
//			System.out.println(stu);
//		}
		
		list2.stream().forEach(n -> System.out.println(n));
		
		double avg = list2.stream().mapToInt(Student :: getScore).
				average().getAsDouble();
		System.out.println(avg);
	}

}
