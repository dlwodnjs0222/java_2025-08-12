package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.stream.Stream;

public class StreamEX01 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("홍길동");
		list1.add("엄준식");
		list1.add("김하나");
		
		List<String> list2 = Arrays.asList("홍길동", "엄준식", "김하나");
//		for(String name : list2) {
//			System.out.println(name);
//		}
//		
//		Stream<String> stream = list2.stream();
		list2.stream().forEach(n -> System.out.println(n));
	}

}
