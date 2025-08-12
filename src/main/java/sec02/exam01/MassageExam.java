package sec02.exam01;

import java.util.LinkedList;
import java.util.Queue;

public class MassageExam {
	public static void main(String[] args) {
		Queue<Massage> massageque = new LinkedList<Massage>();
		
		massageque.offer(new Massage("sendMail", "홍길동"));
		massageque.offer(new Massage("sendSNS", "신용권"));
		massageque.offer(new Massage("sendKaotalk", "홍두께"));
		
		while(!massageque.isEmpty()) {
			Massage massage = massageque.poll();
			switch(massage.command) {
				case "sendMail":
					System.out.println(massage.to + "에게 메일을 보냄");
					break;
				case "sendSNS":
					System.out.println(massage.to + "에게 SNS을 보냄");
					break;
				case "sendKaotalk":
					System.out.println(massage.to + "에게 카카오톡을 보냄");
					break;
			}
		}
	}
}
