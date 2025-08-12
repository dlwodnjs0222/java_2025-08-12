package sec02.exam01;

import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		Stack<Coin> coinbox = new Stack<Coin>();
		
		coinbox.add(new Coin(100));
		coinbox.add(new Coin(50));
		coinbox.add(new Coin(500));
		coinbox.add(new Coin(10));
		
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("꺼낸 동전:" + coin.getValue() + "원");
		}
	}

}
