package streamQuiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamQuiz01 {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> filered = number.stream().
				filter(n -> n % 2 == 0).collect(Collectors.toList());
		filered.stream().forEach(x -> System.out.println(x));
	}

}
