package twenty_two;

import java.util.Random;

public class TrainTicket implements Ticket {
	public String from;// ʼ����
	public String to;// Ŀ�ĵ�
	public String bunk;// ��λ
	public int price;

	public TrainTicket(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}

	@Override
	public void showTicketInfo(String bunk) {
		price = new Random().nextInt(300);
		System.out.println("���� �� " + from + " �� " + to + " �� " + bunk
				+ " ��Ʊ���۸�" + price);
	}

}
